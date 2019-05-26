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

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxDetalisBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jzvd.JZVideoPlayerStandard;

public class ShipinFragmentRecyclerAdapter extends RecyclerView.Adapter<ShipinFragmentRecyclerAdapter.Holder> implements View.OnClickListener {



    private List<VideosBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public ShipinFragmentRecyclerAdapter(List<VideosBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wypx_video, parent, false);
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
        holder.itemView.setTag(position);
    holder.itemWypxVideoJZVideo
                .setUp(list.get(position).getVideo()
                        , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL);
        Glide.with(context).load(list.get(position).getImg()).into( holder.itemWypxVideoJZVideo.thumbImageView);
        holder.itemWypxVideoJZVideo.thumbImageView.setScaleType(ImageView.ScaleType.FIT_XY);

        if (list.get(position).getDetalis() != null) {
            holder.VideoDetalis.setText(list.get(position).getDetalis());
        }

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_wypx_videoJZVideo)
        JZVideoPlayerStandard itemWypxVideoJZVideo;
        @BindView(R.id.VideoDetalis)
        TextView VideoDetalis;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}