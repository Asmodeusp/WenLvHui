package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsTBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcXmggListPresenterImp;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WlzcXmggListAdapter extends RecyclerView.Adapter<WlzcXmggListAdapter.Holder> implements View.OnClickListener {


    private List<NewsTBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;



     SendISlike sendISlike;



    WlzcXmggListPresenterImp presenter;

    public WlzcXmggListAdapter(List<NewsTBean> newsBeans, WlzcXmggListPresenterImp presenter) {
        this.list = newsBeans;
        this.presenter = presenter;
    }

    public WlzcXmggListAdapter(List<NewsBean> newsBeans) {

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlzc_xmggrecy, parent, false);
        Holder holder = new Holder(inflate);
        inflate.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onClick(View v) {
        if (myCLick != null) {
            myCLick.myClick(v, (int) v.getTag());
        }
    }


    public interface RecyclerViewOnCLickListener {
        void myClick(View view, int position);
    }
    public interface SendISlike {
        void sendLike( int dataId);
    }
    public void getSendISlike(SendISlike iSlike) {
        sendISlike =iSlike;

    }
    public void setRecyclerViewOnCLickListener(RecyclerViewOnCLickListener myCLick) {
        this.myCLick = myCLick;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final NewsTBean data = list.get(position);
        final Integer userId = (Integer) SPUtils.get(context, SPKey.USER_ID, 0);
        holder.itmeWlzcXmggrecyCommentNumText.setText(data.getCommens() + "");
        holder.itmeWlzcXmggrecyfenlieText.setText(data.getTitle_type());
        holder.itmeWlzcXmggrecyTitleText.setText(data.getTitle() + "");
        holder.itmeWlzcXmggrecyDataText.setText(TimeUtils.strToDateLong(data.getCreate_date()));
        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getLikes() + "");
        holder.itmeWlzcXmggrecySeeNumText.setText(data.getBrowse() + "");
        holder.itmeWlzcXmggrecyFromText.setText(data.getSource() + "");
        holder.itemView.setTag(position);
        if (data.getIslike() == 0) {
            isLike = false;
        } else {
            isLike = true;
        }
        //设置喜欢图片
        if (isLike) {
            holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itmeWlzcXmggrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getLikes() + "");
                        sendISlike.sendLike(data.getId());
                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        isLike = false;
                    } else {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getLikes() - 1 + "");
                        sendISlike.sendLike(data.getId());
                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        isLike = true;
                    }

                }
            });
        } else {
            holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itmeWlzcXmggrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getLikes() + "");
                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        sendISlike.sendLike(data.getId());
                        isLike = false;
                    } else {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getLikes() + 1 + "");
                        sendISlike.sendLike(data.getId());
                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        isLike = true;
                    }

                }
            });
        }
        //点击评论
        holder.itmeWlzcXmggrecyCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.itme_wlzc_xmggrecyfenlieText)
        TextView itmeWlzcXmggrecyfenlieText;
        @BindView(R.id.itme_wlzc_xmggrecyTitleText)
        TextView itmeWlzcXmggrecyTitleText;
        @BindView(R.id.itme_wlzc_xmggrecyDataText)
        TextView itmeWlzcXmggrecyDataText;
        @BindView(R.id.itme_wlzc_xmggrecyFromText)
        TextView itmeWlzcXmggrecyFromText;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeImage)
        ImageView itmeWlzcXmggrecyIsLikeImage;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeNumText)
        TextView itmeWlzcXmggrecyIsLikeNumText;
        @BindView(R.id.itme_wlzc_xmggrecyCommentImage)
        ImageView itmeWlzcXmggrecyCommentImage;
        @BindView(R.id.itme_wlzc_xmggrecyCommentNumText)
        TextView itmeWlzcXmggrecyCommentNumText;
        @BindView(R.id.itme_wlzc_xmggrecyCommentButton)
        AutoLinearLayout itmeWlzcXmggrecyCommentButton;
        @BindView(R.id.itme_wlzc_xmggrecySeeNumText)
        TextView itmeWlzcXmggrecySeeNumText;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeButton)
        AutoLinearLayout itmeWlzcXmggrecyIsLikeButton;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }
}
