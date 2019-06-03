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
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class RestaurantDetalisAdapter extends RecyclerView.Adapter<RestaurantDetalisAdapter.Holder> implements View.OnClickListener {


    private List<RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean> list;
    private Context context;
    private RecyclerViewOnCLickListener myCLick;

    public RestaurantDetalisAdapter(List<RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_dfms_detalisrect, parent, false);
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
        RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean data = list.get(position);
        holder.itemDfmsDetalisrectName.setText(data.getFoodName());
        holder.itemDfmsDetalisrectParice.setText(data.getFoodPrice()+"");
        holder.itemDfmsDetalisrectSeeNumber.setText(data.getUpNum()+"");
        Glide.with(context).load(data.getImgUrl()).error(R.mipmap.icon).into(holder.itemDfmsDetalisrectImage);


    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_dfms_detalisrectImage)
        ImageView itemDfmsDetalisrectImage;
        @BindView(R.id.item_dfms_detalisrectName)
        TextView itemDfmsDetalisrectName;
        @BindView(R.id.item_dfms_detalisrectParice)
        TextView itemDfmsDetalisrectParice;
        @BindView(R.id.item_dfms_detalisrectSeeNumber)
        TextView itemDfmsDetalisrectSeeNumber;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
