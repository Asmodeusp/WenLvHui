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
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;

public class JiangrenZuopinRecyclerAdapter extends RecyclerView.Adapter<JiangrenZuopinRecyclerAdapter.Holder> implements View.OnClickListener {


    private List<JiangRenDetalisBean.DataBean.ShopBean.ProductListBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;



    public JiangrenZuopinRecyclerAdapter(List<JiangRenDetalisBean.DataBean.ShopBean.ProductListBean> productList) {
        this.list =productList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wcfy_jiangren_list, parent, false);
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
        JiangRenDetalisBean.DataBean.ShopBean.ProductListBean data = list.get(position);
        holder.itemWcfyJiangrenListSeeNumberText.setText(data.getBrowse()+"");
        Glide.with(context).load(data.getProductImage()).error(R.mipmap.icon).into(holder.itemWcfyJiangrenListImage);
        holder.itemWcfyJiangrenListPriceText.setText("￥"+data.getPrice());
        holder.itemWcfyJiangrenListNameText.setText(data.getProductName());

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_wcfy_jiangren_listImage)
        ImageView itemWcfyJiangrenListImage;
        @BindView(R.id.item_wcfy_jiangren_listNameText)
        TextView itemWcfyJiangrenListNameText;
        @BindView(R.id.item_wcfy_jiangren_listPriceText)
        TextView itemWcfyJiangrenListPriceText;
        @BindView(R.id.item_wcfy_jiangren_listSeeNumberText)
        TextView itemWcfyJiangrenListSeeNumberText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
