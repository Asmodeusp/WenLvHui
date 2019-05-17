package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.utils.GlideUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jzvd.JZVideoPlayerStandard;


public class LocalcuisineTSRecyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;
    private List<RestaurantPageBean.DataBean.TeseBean> mList;
    private Context mContext;


    public LocalcuisineTSRecyAdapter(List<RestaurantPageBean.DataBean.TeseBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder holder;
        View inflate;
        if (ONE_ITEM == viewType) {
            inflate = inflater.inflate(R.layout.item_localcuisinerecy_vido, parent, false);
            holder = new ViewHolderOne(inflate);
        } else {
            inflate = inflater.inflate(R.layout.item_localcuisinerecy_image, parent, false);
            holder = new ViewHolderTwo(inflate);
        }
        inflate.setOnClickListener(this);
        return holder;
    }

    //holder因为是多布局所以我这个holder有多个实例
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RestaurantPageBean.DataBean.TeseBean data = mList.get(position);
        if (holder instanceof ViewHolderOne &&ONE_ITEM == data.getType()) {
            ((ViewHolderOne) holder).itemLocalcuisinerecyVidAddressText.setText(data.getCity() + "-" + data.getArea());
            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoCommentText.setText(data.getComment_num() + "");
            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoFoodPriceText.setText(data.getAverageConsumption() + "元/人");
            //餐馆类别
//            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoFoodTypeText.setText(data.get());
            GlideUtils.loadCircleImage(data.getRestaurantImg(), ((ViewHolderOne) holder).itemLocalcuisinerecyVidoHeadImage, new GlideUtils.ImageLoadListener<String, GlideDrawable>() {
                @Override
                public void onLoadingComplete(String uri, ImageView view, GlideDrawable resource) {

                }
                @Override
                public void onLoadingError(String source, Exception e) {

                }
            });
            //设置星星数
            if (data.getStarClass() == 1) {
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartTwo.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartThree.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 2) {
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartThree.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 3) {
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 4) {
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFour.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 5) {
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFour.setVisibility(View.VISIBLE);
                ((ViewHolderOne) holder).itemLocalcuisinerecyVidoStartFive.setVisibility(View.VISIBLE);
            }
            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoNameText.setText(data.getRestaurantName());
            ArrayList<RestaurantPageBean.DataBean.TeseBean.FoodListBean> foodListBeans = new ArrayList<>();
            for (RestaurantPageBean.DataBean.TeseBean.FoodListBean foodListBean : data.getFoodList()) {
                if (foodListBean.getImgOrVideo() == 2) {
                    foodListBeans.add(foodListBean);
                }
            }

            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoVido
                    .setUp(foodListBeans.get(0).getVideoUrl()
                            , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);

            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoVido.thumbImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(mContext).load(foodListBeans.get(0).getImgUrl()).into(((ViewHolderOne) holder).itemLocalcuisinerecyVidoVido.thumbImageView);
        } else if (holder instanceof ViewHolderTwo) {
            ((ViewHolderTwo) holder).itemLocalcuisinerecyImageAddressText.setText(data.getCity() + "-" + data.getArea());
            ((ViewHolderTwo) holder).itemLocalcuisinerecyImageCommentText.setText(data.getComment_num() + "");
            ((ViewHolderTwo) holder).itemLocalcuisinerecyImageFoodPriceText.setText(data.getAverageConsumption() + "元/人");
            //餐馆类别
//            ((ViewHolderOne) holder).itemLocalcuisinerecyVidoFoodTypeText.setText(data.get());
            GlideUtils.loadCircleImage(data.getRestaurantImg(), ((ViewHolderTwo) holder).itemLocalcuisinerecyImageHeadImage, new GlideUtils.ImageLoadListener<String, GlideDrawable>() {
                @Override
                public void onLoadingComplete(String uri, ImageView view, GlideDrawable resource) {

                }
                @Override
                public void onLoadingError(String source, Exception e) {

                }
            });
            //设置星星数
            if (data.getStarClass() == 1) {
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartTwo.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartThree.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 2) {
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartThree.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 3) {
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFour.setVisibility(View.INVISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFive.setVisibility(View.INVISIBLE);
            } else if (data.getStarClass() == 4) {
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFour.setVisibility(View.VISIBLE);
            } else if (data.getStarClass() == 5) {
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartOne.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartTwo.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartThree.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFour.setVisibility(View.VISIBLE);
                ((ViewHolderTwo) holder).itemLocalcuisinerecyImageStartFive.setVisibility(View.VISIBLE);
            }
            ((ViewHolderTwo) holder).itemLocalcuisinerecyImageNameText.setText(data.getRestaurantName());
            ArrayList<RestaurantPageBean.DataBean.TeseBean.FoodListBean> foodListBeans = new ArrayList<>();
            for (RestaurantPageBean.DataBean.TeseBean.FoodListBean foodListBean : data.getFoodList()) {
                if (foodListBean.getImgOrVideo() == 2) {
                    foodListBeans.add(foodListBean);
                }

            }
            ((ViewHolderTwo) holder).itemLocalcuisinerecyImageFoodRecy.setLayoutManager(new LinearLayoutManager(mContext));
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
        @BindView(R.id.item_localcuisinerecy_vidoHeadImage)
        ImageView itemLocalcuisinerecyVidoHeadImage;
        @BindView(R.id.item_localcuisinerecy_vidoNameText)
        TextView itemLocalcuisinerecyVidoNameText;
        @BindView(R.id.item_localcuisinerecy_vidoStartOne)
        ImageView itemLocalcuisinerecyVidoStartOne;
        @BindView(R.id.item_localcuisinerecy_vidoStartTwo)
        ImageView itemLocalcuisinerecyVidoStartTwo;
        @BindView(R.id.item_localcuisinerecy_vidoStartThree)
        ImageView itemLocalcuisinerecyVidoStartThree;
        @BindView(R.id.item_localcuisinerecy_vidoStartFour)
        ImageView itemLocalcuisinerecyVidoStartFour;
        @BindView(R.id.item_localcuisinerecy_vidoStartFive)
        ImageView itemLocalcuisinerecyVidoStartFive;
        @BindView(R.id.item_localcuisinerecy_vidoKStartOne)
        ImageView itemLocalcuisinerecyVidoKStartOne;
        @BindView(R.id.item_localcuisinerecy_vidoKStartTwo)
        ImageView itemLocalcuisinerecyVidoKStartTwo;
        @BindView(R.id.item_localcuisinerecy_vidoKStartThree)
        ImageView itemLocalcuisinerecyVidoKStartThree;
        @BindView(R.id.item_localcuisinerecy_vidoKStartFour)
        ImageView itemLocalcuisinerecyVidoKStartFour;
        @BindView(R.id.item_localcuisinerecy_vidoKStartFive)
        ImageView itemLocalcuisinerecyVidoKStartFive;
        @BindView(R.id.item_localcuisinerecy_vidoVido)
        JZVideoPlayerStandard itemLocalcuisinerecyVidoVido;
        @BindView(R.id.item_localcuisinerecy_vidoFoodTypeText)
        TextView itemLocalcuisinerecyVidoFoodTypeText;
        @BindView(R.id.item_localcuisinerecy_vidoFoodPriceText)
        TextView itemLocalcuisinerecyVidoFoodPriceText;
        @BindView(R.id.item_localcuisinerecy_vidoCommentText)
        TextView itemLocalcuisinerecyVidoCommentText;
        @BindView(R.id.item_localcuisinerecy_vidoCommentButton)
        AutoLinearLayout itemLocalcuisinerecyVidoCommentButton;
        @BindView(R.id.item_localcuisinerecy_vidAddressText)
        TextView itemLocalcuisinerecyVidAddressText;

        public ViewHolderOne(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder {
        @BindView(R.id.item_localcuisinerecy_imageHeadImage)
        ImageView itemLocalcuisinerecyImageHeadImage;
        @BindView(R.id.item_localcuisinerecy_imageNameText)
        TextView itemLocalcuisinerecyImageNameText;
        @BindView(R.id.item_localcuisinerecy_imageStartOne)
        ImageView itemLocalcuisinerecyImageStartOne;
        @BindView(R.id.item_localcuisinerecy_imageStartTwo)
        ImageView itemLocalcuisinerecyImageStartTwo;
        @BindView(R.id.item_localcuisinerecy_imageStartThree)
        ImageView itemLocalcuisinerecyImageStartThree;
        @BindView(R.id.item_localcuisinerecy_imageStartFour)
        ImageView itemLocalcuisinerecyImageStartFour;
        @BindView(R.id.item_localcuisinerecy_imageStartFive)
        ImageView itemLocalcuisinerecyImageStartFive;
        @BindView(R.id.item_localcuisinerecy_imageKStartOne)
        ImageView itemLocalcuisinerecyImageKStartOne;
        @BindView(R.id.item_localcuisinerecy_imageKStartTwo)
        ImageView itemLocalcuisinerecyImageKStartTwo;
        @BindView(R.id.item_localcuisinerecy_imageKStartThree)
        ImageView itemLocalcuisinerecyImageKStartThree;
        @BindView(R.id.item_localcuisinerecy_imageKStartFour)
        ImageView itemLocalcuisinerecyImageKStartFour;
        @BindView(R.id.item_localcuisinerecy_imageKStartFive)
        ImageView itemLocalcuisinerecyImageKStartFive;
        @BindView(R.id.item_localcuisinerecy_imageFootRecy)
        RecyclerView itemLocalcuisinerecyImageFoodRecy;
        @BindView(R.id.item_localcuisinerecy_imageFoodTypeText)
        TextView itemLocalcuisinerecyImageFoodTypeText;
        @BindView(R.id.item_localcuisinerecy_imageFoodPriceText)
        TextView itemLocalcuisinerecyImageFoodPriceText;
        @BindView(R.id.item_localcuisinerecy_imageCommentText)
        TextView itemLocalcuisinerecyImageCommentText;
        @BindView(R.id.item_localcuisinerecy_imageCommentButton)
        AutoLinearLayout itemLocalcuisinerecyImageCommentButton;
        @BindView(R.id.item_localcuisinerecy_imageAddressText)
        TextView itemLocalcuisinerecyImageAddressText;

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
















