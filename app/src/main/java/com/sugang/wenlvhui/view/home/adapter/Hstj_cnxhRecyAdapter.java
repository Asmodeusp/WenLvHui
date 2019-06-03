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
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class Hstj_cnxhRecyAdapter extends RecyclerView.Adapter<Hstj_cnxhRecyAdapter.Holder> implements View.OnClickListener {


    private List<HstjLikeBean.DataBean.LikeBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public Hstj_cnxhRecyAdapter(List<HstjLikeBean.DataBean.LikeBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_hstj_cnxhrecy, parent, false);
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
        HstjLikeBean.DataBean.LikeBean data = list.get(position);
        Glide.with(context).load(data.getImgUrl()).error(R.mipmap.icon).into(holder.itemHstjCnxhBookImage);
        holder.itemHstjCnxhBookName.setText(data.getBookName());

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_hstj_cnxhBookImage)
        ImageView itemHstjCnxhBookImage;
        @BindView(R.id.item_hstj_cnxhBookName)
        TextView itemHstjCnxhBookName;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
