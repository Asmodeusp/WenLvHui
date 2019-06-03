package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
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
import io.reactivex.annotations.NonNull;


public class Wlzc_zxdtListAdapter extends RecyclerView.Adapter<Wlzc_zxdtListAdapter.Holder> implements View.OnClickListener {

    private List<NewsTBean> list;
    private Context context;
    private boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;
    WlzcXmggListPresenterImp presenter;


    public Wlzc_zxdtListAdapter(List<NewsTBean> newsBeans, WlzcXmggListPresenterImp presenter) {
        this.list = newsBeans;
        this.presenter =presenter;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlzc_zxdtrecy, parent, false);
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

    @Override
    public void onBindViewHolder(final Holder holder, int position) {

        final NewsTBean data = list.get(position);
        holder.itemWlzcZxdtrecyfenlieText.setText(data.getTitle_type());
        holder.itemWlzcZxdtrecyCommentNumText.setText(data.getCommens() + "");
        final Integer userId = (Integer) SPUtils.get(context, SPKey.USER_ID, 0);
        holder.itemWlzcZxdtrecyTitleText.setText(data.getTitle() + "");

        holder.itemWlzcZxdtrecyDataText.setText(TimeUtils.strToDateLong(data.getCreate_date()));
        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getLikes() + "");
        holder.itemWlzcZxdtrecySeeNumText.setText(data.getBrowse() + "");
        holder.itemWlzcZxdtrecyFromText.setText(data.getSource() + "");
        holder.itemView.setTag(position);
        Glide.with(context).load(data.getImage()).error(R.mipmap.icon).into(holder.itemWlzcZxdtrecyImage);
        if (data.getIslike() == 0) {
            isLike = false;
        } else {
            isLike = true;
        }
        //设置喜欢图片
        if (isLike) {
            holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itemWlzcZxdtrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getLikes()+ "");

                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        isLike = false;
                    } else {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getLikes()-1 + "");

                        presenter.iSlike(userId + "", "2", data.getId() + "");
                        isLike = true;
                    }

                }
            });
        } else {
            holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itemWlzcZxdtrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getLikes() + "");
                        presenter.iSlike(userId+"","2",data.getId()+"");

                        isLike = false;
                    } else {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getLikes() +1+ "");

                        presenter.iSlike(userId+"","2",data.getId()+"");
                        isLike = true;
                    }

                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_wlzc_zxdtrecyfenlieText)
        TextView itemWlzcZxdtrecyfenlieText;
        @BindView(R.id.item_wlzc_zxdtrecyTitleText)
        TextView itemWlzcZxdtrecyTitleText;
        @BindView(R.id.item_wlzc_zxdtrecyDataText)
        TextView itemWlzcZxdtrecyDataText;
        @BindView(R.id.item_wlzc_zxdtrecyFromText)
        TextView itemWlzcZxdtrecyFromText;
        @BindView(R.id.item_wlzc_zxdtrecyContentText)
        TextView itemWlzcZxdtrecyContentText;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeImage)
        ImageView itemWlzcZxdtrecyIsLikeImage;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeNumText)
        TextView itemWlzcZxdtrecyIsLikeNumText;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeButton)
        AutoLinearLayout itemWlzcZxdtrecyIsLikeButton;
        @BindView(R.id.item_wlzc_zxdtrecyCommentImage)
        ImageView itemWlzcZxdtrecyCommentImage;
        @BindView(R.id.item_wlzc_zxdtrecyCommentNumText)
        TextView itemWlzcZxdtrecyCommentNumText;
        @BindView(R.id.item_wlzc_zxdtrecyCommentButton)
        AutoLinearLayout itemWlzcZxdtrecyCommentButton;
        @BindView(R.id.item_wlzc_zxdtrecySeeNumText)
        TextView itemWlzcZxdtrecySeeNumText;
        @BindView(R.id.item_wlzc_zxdtrecyImage)
        ImageView itemWlzcZxdtrecyImage;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }
}
