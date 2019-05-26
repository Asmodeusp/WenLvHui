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
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.model.bean.home.wllx.BrigadesBean;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxPageBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class TravelRouteJINPINRecyAdapter extends RecyclerView.Adapter<TravelRouteJINPINRecyAdapter.Holder> implements View.OnClickListener {

    private List<BrigadesBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public TravelRouteJINPINRecyAdapter(List<BrigadesBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wllxpage, parent, false);
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
       BrigadesBean data = list.get(position);
        holder.itemWllxpageText.setText(data.getName());
        Glide.with(context).load(data.getImg()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemWllxpageImage);
//        holder.itemWllxpageDateText.setText(TimeUtils.getBirthdatyData(data.getCreateDate()));
//        if (data.getRecommendClass() == 1) {
//            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartTwo.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartThree.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
//        } else if (data.getRecommendClass() == 2) {
//            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartThree.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
//        } else if (data.getRecommendClass() == 3) {
//            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
//            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
//        } else if (data.getRecommendClass() == 4) {
//            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartFour.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
//        } else if (data.getRecommendClass() == 5) {
//            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartFour.setVisibility(View.VISIBLE);
//            holder.itemHstjZxzrBookStartFive.setVisibility(View.VISIBLE);
//        }
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_wllxpageImage)
        ImageView itemWllxpageImage;
        @BindView(R.id.item_wllxpageText)
        TextView itemWllxpageText;
        @BindView(R.id.item_wllxpageStartOne)
        ImageView itemWllxpageStartOne;
        @BindView(R.id.item_wllxpageStartTwo)
        ImageView itemWllxpageStartTwo;
        @BindView(R.id.item_wllxpageStartThree)
        ImageView itemWllxpageStartThree;
        @BindView(R.id.item_wllxpageStartFour)
        ImageView itemWllxpageStartFour;
        @BindView(R.id.item_wllxpageStartFive)
        ImageView itemWllxpageStartFive;
        @BindView(R.id.item_wllxpageKStartOne)
        ImageView itemWllxpageKStartOne;
        @BindView(R.id.item_wllxpageKStartTwo)
        ImageView itemWllxpageKStartTwo;
        @BindView(R.id.item_wllxpageKStartThree)
        ImageView itemWllxpageKStartThree;
        @BindView(R.id.item_wllxpageKStartFour)
        ImageView itemWllxpageKStartFour;
        @BindView(R.id.item_wllxpageKStartFive)
        ImageView itemWllxpageKStartFive;
        @BindView(R.id.kk)
        AutoRelativeLayout kk;
        @BindView(R.id.item_wllxpage_DateText)
        TextView itemWllxpageDateText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
