package com.sugang.wenlvhui.view.adaptr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SpaceChangGuanAdapter extends RecyclerView.Adapter<SpaceChangGuanAdapter.Holder> implements View.OnClickListener {

    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    List<SpaceGuanCangBean.DataBean.GuancangBean.SpaceDetailBean> list;

    public SpaceChangGuanAdapter(List<SpaceGuanCangBean.DataBean.GuancangBean.SpaceDetailBean> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_space_changguan, parent, false);
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
        SpaceGuanCangBean.DataBean.GuancangBean.SpaceDetailBean data = list.get(position);
        holder.itemSpaceChangguanMianJiText.setText(data.getSpaceMeasure()+"");
        holder.itemSpaceChangguanName.setText(data.getName());


        Glide.with(context).load(data.getImage()).error(R.mipmap.icon).into(holder.itemSpaceChangguanIamge);

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_space_changguanIamge)
        ImageView itemSpaceChangguanIamge;
        @BindView(R.id.item_space_changguanName)
        TextView itemSpaceChangguanName;
        @BindView(R.id.item_space_changguanMianJiText)
        TextView itemSpaceChangguanMianJiText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
