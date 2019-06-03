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
import com.sugang.wenlvhui.presenter.home.wlzc.WlzePagePresenter;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Wlzc_zcjdListAdapter extends RecyclerView.Adapter<Wlzc_zcjdListAdapter.Holder> implements View.OnClickListener {

    private List<NewsTBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;
    WlzcXmggListPresenterImp presenter;
    private String s;


    public Wlzc_zcjdListAdapter(List<NewsTBean> newsBeans, WlzcXmggListPresenterImp presenter) {
        this.list = newsBeans;
        this.presenter = presenter;
    }

    public Wlzc_zcjdListAdapter(List<NewsTBean> newsBeans, String s) {
        this.list = newsBeans;
        this.s = s;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlzc_zcjdrecy, parent, false);
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

    public void setRecyclerViewOnCLickListener(RecyclerViewOnCLickListener myCLick) {
        this.myCLick = myCLick;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int position) {
        final NewsTBean data = list.get(position);
        holder.itemWlzeZcjdfenlieText.setText(data.getTitle_type());
        holder.itemWlzeZcjdCommentNumText.setText(data.getCommens() + "");
        final Integer userId = (Integer) SPUtils.get(context, SPKey.USER_ID, 0);
        holder.itemWlzeZcjdTitleText.setText(data.getTitle() + "");
        holder.itemWlzeZcjdDataText.setText(TimeUtils.strToDateLong(data.getCreate_date()));
        if (s.equals("s")) {
            holder.itemWlzeZcjdIsLikeNumText.setVisibility(View.GONE);
            holder.itemWlzeZcjdSeeNumText.setVisibility(View.GONE);
            holder.itemWlzeZcjdFromText.setVisibility(View.GONE);
            holder.itemWlzeZcjdIsLikeImage.setVisibility(View.GONE);
            holder.itemWlzeZcjdIsLikeButton.setVisibility(View.GONE);
        } else {
            holder.itemWlzeZcjdIsLikeNumText.setText(data.getLikes() + "");
            holder.itemWlzeZcjdSeeNumText.setText(data.getBrowse() + "");
            holder.itemWlzeZcjdFromText.setText(data.getSource() + "");
            holder.itemView.setTag(position);
            if (data.getIslike() == 0) {

                isLike = false;
            } else {
                isLike = true;
            }
            //设置喜欢图片
            if (isLike) {
                holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan);
                //喜欢点击事件
                holder.itemWlzeZcjdIsLikeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isLike) {
                            holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan);
                            holder.itemWlzeZcjdIsLikeNumText.setText(data.getLikes() + "");

                            presenter.iSlike(userId + "", "2", data.getId() + "");
                            isLike = false;
                        } else {
                            holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                            holder.itemWlzeZcjdIsLikeNumText.setText(data.getLikes() - 1 + "");

                            presenter.iSlike(userId + "", "2", data.getId() + "");
                            isLike = true;
                        }

                    }
                });
            } else {
                holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                //喜欢点击事件
                holder.itemWlzeZcjdIsLikeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isLike) {
                            holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                            holder.itemWlzeZcjdIsLikeNumText.setText(data.getLikes() + "");
                            presenter.iSlike(userId + "", "2", data.getId() + "");

                            isLike = false;
                        } else {
                            holder.itemWlzeZcjdIsLikeImage.setImageResource(R.mipmap.dianzan);
                            holder.itemWlzeZcjdIsLikeNumText.setText(data.getLikes() + 1 + "");

                            presenter.iSlike(userId + "", "2", data.getId() + "");
                            isLike = true;
                        }

                    }
                });
            }
        }
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_wlze_zcjdfenlieText)
        TextView itemWlzeZcjdfenlieText;
        @BindView(R.id.item_wlze_zcjdTitleText)
        TextView itemWlzeZcjdTitleText;
        @BindView(R.id.item_wlze_zcjdDataText)
        TextView itemWlzeZcjdDataText;
        @BindView(R.id.item_wlze_zcjdFromText)
        TextView itemWlzeZcjdFromText;
        @BindView(R.id.item_wlze_zcjdIsLikeImage)
        ImageView itemWlzeZcjdIsLikeImage;
        @BindView(R.id.item_wlze_zcjdIsLikeNumText)
        TextView itemWlzeZcjdIsLikeNumText;
        @BindView(R.id.item_wlze_zcjdIsLikeButton)
        AutoLinearLayout itemWlzeZcjdIsLikeButton;
        @BindView(R.id.item_wlze_zcjdCommentImage)
        ImageView itemWlzeZcjdCommentImage;
        @BindView(R.id.item_wlze_zcjdCommentNumText)
        TextView itemWlzeZcjdCommentNumText;
        @BindView(R.id.item_wlze_zcjdCommentButton)
        AutoLinearLayout itemWlzeZcjdCommentButton;
        @BindView(R.id.item_wlze_zcjdSeeNumText)
        TextView itemWlzeZcjdSeeNumText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
