package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.CoordinateConverter;
import com.amap.api.location.DPoint;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class LocalcuisineBCRecyAdapter extends RecyclerView.Adapter<LocalcuisineBCRecyAdapter.Holder> implements View.OnClickListener {


    private List<RestaurantPageBean.DataBean.BichiBean> list;
    private Context context;
    private RecyclerViewOnCLickListener myCLick;

    public LocalcuisineBCRecyAdapter(List<RestaurantPageBean.DataBean.BichiBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_dfmsbichirecy, parent, false);
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
    public void onBindViewHolder(@NonNull final Holder holder, int position) {
        holder.itemView.setTag(position);
        RestaurantPageBean.DataBean.BichiBean data = list.get(position);
        holder.itemDfmsbichiAddressText.setText(data.getCity() + "-" + data.getArea());
        holder.itemDfmsbichiCommentText.setText(data.getComment_num() + "");
        if (data.getStarClass() == 1) {
            holder.itemDfmsbichiStartOne.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartTwo.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartThree.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartFour.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartFive.setVisibility(View.INVISIBLE);
        } else if (data.getStarClass() == 2) {
            holder.itemDfmsbichiStartOne.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartTwo.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartThree.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartFour.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartFive.setVisibility(View.INVISIBLE);
        } else if (data.getStarClass() == 3) {
            holder.itemDfmsbichiStartOne.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartTwo.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartThree.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartFour.setVisibility(View.INVISIBLE);
            holder.itemDfmsbichiStartFive.setVisibility(View.INVISIBLE);
        } else if (data.getStarClass() == 4) {
            holder.itemDfmsbichiStartOne.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartTwo.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartThree.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartFour.setVisibility(View.VISIBLE);
        } else if (data.getStarClass() == 5) {
            holder.itemDfmsbichiStartOne.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartTwo.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartThree.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartFour.setVisibility(View.VISIBLE);
            holder.itemDfmsbichiStartFive.setVisibility(View.VISIBLE);
        }
        String latitude = (String) SPUtils.get(context, SPKey.LATITUDE, "");
        String longitude = (String) SPUtils.get(context, SPKey.LONGITUDE, "");
        DPoint userPoint = new DPoint(Double.parseDouble(latitude), Double.parseDouble(longitude));
        DPoint dPoint = new DPoint(Double.parseDouble(data.getLatitude()), Double.parseDouble(data.getLongitude()));
        float distance = CoordinateConverter.calculateLineDistance(userPoint, dPoint);

        long round = Math.round(((distance / 100d) / 10f));
        holder.itemDfmsbichiDistance.setText((int) round + "Km");
        //评论
        holder.itemDfmsbichiCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.itemDfmsbichiNameText.setText(data.getRestaurantName());
        Glide.with(context).load(data.getRestaurantImg()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemDfmsbichiImage);
        holder.itemDfmsbichiPriceText.setText(data.getAverageConsumption() + "元/人");
        //餐馆类别
        holder.itemDfmsbichiTypeText.setText(data.getRestaurantType());
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_dfmsbichiImage)
        ImageView itemDfmsbichiImage;
        @BindView(R.id.item_dfmsbichiNameText)
        TextView itemDfmsbichiNameText;
        @BindView(R.id.item_dfmsbichiStartOne)
        ImageView itemDfmsbichiStartOne;
        @BindView(R.id.item_dfmsbichiStartTwo)
        ImageView itemDfmsbichiStartTwo;
        @BindView(R.id.item_dfmsbichiStartThree)
        ImageView itemDfmsbichiStartThree;
        @BindView(R.id.item_dfmsbichiStartFour)
        ImageView itemDfmsbichiStartFour;
        @BindView(R.id.item_dfmsbichiStartFive)
        ImageView itemDfmsbichiStartFive;
        @BindView(R.id.item_dfmsbichiTypeText)
        TextView itemDfmsbichiTypeText;
        @BindView(R.id.item_dfmsbichiKStartOne)
        ImageView itemDfmsbichiKStartOne;
        @BindView(R.id.item_dfmsbichiKStartTwo)
        ImageView itemDfmsbichiKStartTwo;
        @BindView(R.id.item_dfmsbichiKStartThree)
        ImageView itemDfmsbichiKStartThree;
        @BindView(R.id.item_dfmsbichiKStartFour)
        ImageView itemDfmsbichiKStartFour;
        @BindView(R.id.item_dfmsbichiKStartFive)
        ImageView itemDfmsbichiKStartFive;
        @BindView(R.id.item_dfmsbichiAddressText)
        TextView itemDfmsbichiAddressText;
        @BindView(R.id.item_dfmsbichiPriceText)
        TextView itemDfmsbichiPriceText;
        @BindView(R.id.item_dfmsbichiCommentText)
        TextView itemDfmsbichiCommentText;
        @BindView(R.id.item_dfmsbichiCommentButton)
        AutoLinearLayout itemDfmsbichiCommentButton;
        @BindView(R.id.item_dfmsbichiDistance)
        TextView itemDfmsbichiDistance;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
