package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.activity.PolicyBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jzvd.JZVideoPlayerStandard;


public class ActivityReyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;


    private List<PolicyBean> mList;
    private Context mContext;


    public ActivityReyclerAdapter(List<PolicyBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder holder;
        View inflate;
        if (ONE_ITEM == viewType) {
            inflate = inflater.inflate(R.layout.item_activit_one, parent, false);
            holder = new ViewHolderOne(inflate);
        } else {
            inflate = inflater.inflate(R.layout.item_activity_two, parent, false);
            holder = new ViewHolderTwo(inflate);
        }
        inflate.setOnClickListener(this);
        return holder;
    }

    //holder因为是多布局所以我这个holder有多个实例
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        PolicyBean data = mList.get(position);
        if (holder instanceof ViewHolderOne) {
            ((ViewHolderOne) holder).itemActivitOneData.setText(TimeUtils.strToDateLong(data.getCreate_date()));
            ((ViewHolderOne) holder).itemActivitOneIsLikeNumText.setText(data.getUp_num()+ "");
            ((ViewHolderOne) holder).itemActivitOneCommentNumText.setText(data.getComments() + "");
            //餐馆类别
            ((ViewHolderOne) holder).itemActivitOneSeeNumText.setText(data.getBrowse() + "");
            ((ViewHolderOne) holder).itemActivitOneName.setText(data.getTitle());
            if (data.getGive_default().equals("0") ) {
                ((ViewHolderOne) holder).itemActivitOneStaut.setText("未开始");
            } else if (data.getGive_default().equals("1")) {
                ((ViewHolderOne) holder).itemActivitOneStaut.setText("进行中");
            } else {
                ((ViewHolderOne) holder).itemActivitOneStaut.setText("已结束");
                ((ViewHolderOne) holder).itemActivitOneStaut.setBackgroundResource(R.drawable.weijinxin);
            }
            if (data.getText_type() == 1) {
                ((ViewHolderOne) holder).itemActivitOneType.setText("惠民");
            } else if (data.getText_type() == 2) {
                ((ViewHolderOne) holder).itemActivitOneType.setText("演出");
            } else if (data.getText_type() == 3) {
                ((ViewHolderOne) holder).itemActivitOneType.setText("社区");
            } else if (data.getText_type() == 4) {
                ((ViewHolderOne) holder).itemActivitOneType.setText("亲子");
            } else if (data.getText_type() == 5) {
                ((ViewHolderOne) holder).itemActivitOneType.setText("历史");
            }
            Glide.with(mContext).load(data.getImage()).into(((ViewHolderOne) holder).itemActivitOneImage);
        } else if (holder instanceof ViewHolderTwo) {

            Glide.with(mContext).load(data.getImage()).into(((ViewHolderTwo) holder).itemActivityTwoImage);
            if (data.getVideourl().equals("")) {
                Glide.with(mContext).load(data.getImage()).into(((ViewHolderTwo) holder).itemActivityTwoImage);
            } else {
                ((ViewHolderTwo) holder).itemActivityTwoImage.setVisibility(View.GONE);
                ((ViewHolderTwo) holder).itemActivityTwoJZVideo
                        .setUp(data.getVideourl(), JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
                ((ViewHolderTwo) holder).itemActivityTwoJZVideo.thumbImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                Glide.with(mContext).load(data.getVideo_backurl()).into(((ViewHolderTwo) holder).itemActivityTwoJZVideo.thumbImageView);
            }
            if (data.getVideourl() != null) {
                ((ViewHolderTwo) holder).itemActivityTwoJZVideo
                        .setUp(data.getVideourl(), JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
                ((ViewHolderTwo) holder).itemActivityTwoJZVideo.thumbImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                Glide.with(mContext).load(data.getVideo_backurl()).into(((ViewHolderTwo) holder).itemActivityTwoJZVideo.thumbImageView);
            } else {
                Glide.with(mContext).load(data.getImage()).into(((ViewHolderTwo) holder).itemActivityTwoImage);
            }


            ((ViewHolderTwo) holder).itemActivityTwoData.setText(TimeUtils.strToDateLong(data.getCreate_date()));
            ((ViewHolderTwo) holder).itemActivityTwoIsLikeNumText.setText(data.getUp_num()+ "");
            ((ViewHolderTwo) holder).itemActivityTwoCommentNumText.setText(data.getComments() + "");

            //餐馆类别
            ((ViewHolderTwo) holder).itemActivityTwoSeeNumText.setText(data.getBrowse() + "");
            ((ViewHolderTwo) holder).itemActivityTwoName.setText(data.getTitle());
            if (data.getGive_default().equals("0")) {
                ((ViewHolderTwo) holder).itemActivityTwoStaut.setText("未开始");
            } else if (data.getGive_default().equals("1")) {
                ((ViewHolderTwo) holder).itemActivityTwoStaut.setText("进行中");

            } else {
                ((ViewHolderTwo) holder).itemActivityTwoStaut.setText("已结束");
                ((ViewHolderTwo) holder).itemActivityTwoStaut.setBackgroundResource(R.drawable.weijinxin);
            }
            if (data.getText_type() == 1) {
                ((ViewHolderTwo) holder).itemActivityTwoType.setText("惠民");
            } else if (data.getText_type() == 2) {
                ((ViewHolderTwo) holder).itemActivityTwoType.setText("演出");
            } else if (data.getText_type() == 3) {
                ((ViewHolderTwo) holder).itemActivityTwoType.setText("社区");
            } else if (data.getText_type() == 4) {
                ((ViewHolderTwo) holder).itemActivityTwoType.setText("亲子");
            } else if (data.getText_type() == 5) {
                ((ViewHolderTwo) holder).itemActivityTwoType.setText("历史");
            }

        }

    }


    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 1) {
            return ONE_ITEM;
        } else if (position % 2 == 0) {
            return TWO_ITEM;
        } else {
            return 0;
        }
    }

    @Override
    public int getItemCount() {
        return mList.isEmpty() ? 0 : mList.size();
    }


    class ViewHolderOne extends RecyclerView.ViewHolder {
        @BindView(R.id.item_activit_oneType)
        TextView itemActivitOneType;
        @BindView(R.id.item_activit_oneName)
        TextView itemActivitOneName;
        @BindView(R.id.item_activit_oneStaut)
        TextView itemActivitOneStaut;
        @BindView(R.id.item_activit_OneImage)
        ImageView itemActivitOneImage;
        @BindView(R.id.item_activit_oneData)
        TextView itemActivitOneData;
        @BindView(R.id.item_activit_oneIsLikeImage)
        ImageView itemActivitOneIsLikeImage;
        @BindView(R.id.item_activit_oneIsLikeNumText)
        TextView itemActivitOneIsLikeNumText;
        @BindView(R.id.item_activit_oneIsLikeButton)
        AutoLinearLayout itemActivitOneIsLikeButton;
        @BindView(R.id.item_activit_oneCommentImage)
        ImageView itemActivitOneCommentImage;
        @BindView(R.id.item_activit_oneCommentNumText)
        TextView itemActivitOneCommentNumText;
        @BindView(R.id.item_activit_oneCommentButton)
        AutoLinearLayout itemActivitOneCommentButton;
        @BindView(R.id.item_activit_oneSeeNumText)
        TextView itemActivitOneSeeNumText;

        public ViewHolderOne(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder {
        @BindView(R.id.item_activity_twoImage)
        ImageView itemActivityTwoImage;
        @BindView(R.id.item_activity_twoType)
        TextView itemActivityTwoType;
        @BindView(R.id.item_activity_twoName)
        TextView itemActivityTwoName;
        @BindView(R.id.item_activity_twoStaut)
        TextView itemActivityTwoStaut;
        @BindView(R.id.item_activity_twoJZVideo)
        JZVideoPlayerStandard itemActivityTwoJZVideo;
        @BindView(R.id.item_activity_twoData)
        TextView itemActivityTwoData;
        @BindView(R.id.item_activity_twoIsLikeImage)
        ImageView itemActivityTwoIsLikeImage;
        @BindView(R.id.item_activity_twoIsLikeNumText)
        TextView itemActivityTwoIsLikeNumText;
        @BindView(R.id.item_activity_twoIsLikeButton)
        AutoLinearLayout itemActivityTwoIsLikeButton;
        @BindView(R.id.item_activity_twoCommentImage)
        ImageView itemActivityTwoCommentImage;
        @BindView(R.id.item_activity_twoCommentNumText)
        TextView itemActivityTwoCommentNumText;
        @BindView(R.id.item_activity_twoCommentButton)
        AutoLinearLayout itemActivityTwoCommentButton;
        @BindView(R.id.item_activity_twoSeeNumText)
        TextView itemActivityTwoSeeNumText;

        public ViewHolderTwo(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }

    }


    public interface OnClickItem {
        void setClick(View v, int position);
    }

    private OnClickItem item;

    @Override
    public void onClick(View v) {
        if (item != null) {
            item.setClick(v, (int) v.getTag());
        }
    }

    public void setOnClick(OnClickItem item) {
        this.item = item;
    }

}
