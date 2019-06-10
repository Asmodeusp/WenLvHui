package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.graphics.Color;
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
import com.sugang.wenlvhui.model.bean.home.wldz.ArtistsBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WldzArtistAdapter extends RecyclerView.Adapter<WldzArtistAdapter.Holder> implements View.OnClickListener {

    private List<ArtistsBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public WldzArtistAdapter(List<ArtistsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wldz_artist, parent, false);
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
        ArtistsBean data = list.get(position);
        RichText
                .from(data.getArtist_details()) // 数据源
                .autoFix(true) // 是否自动修复，默认true
                .autoPlay(true) // gif图片是否自动播放
                .showBorder(true) // 是否显示图片边框
                .borderColor(Color.RED) // 图片边框颜色
                .borderSize(10) // 边框尺寸
                .borderRadius(50) // 图片边框圆角弧度
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高

                .resetSize(false)
                .bind(context)
                .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                .into( holder.itemWldzArtistDetailsText); // 设置目标TextView

        Glide.with(context).load(data.getArtist_logourl()).error(R.mipmap.icon).into(holder.itemWldzArtistImage);
        holder.itemWldzArtistNameText.setText(data.getArtist_type()+"   |   "+data.getArtist_name());
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_wldz_artist_Image)
        ImageView itemWldzArtistImage;
        @BindView(R.id.item_wldz_artist_NameText)
        TextView itemWldzArtistNameText;
        @BindView(R.id.item_wldz_artist_DetailsText)
        TextView itemWldzArtistDetailsText;
        @BindView(R.id.item_wldz_artistStartOne)
        ImageView itemWldzArtistStartOne;
        @BindView(R.id.item_wldz_artistStartTwo)
        ImageView itemWldzArtistStartTwo;
        @BindView(R.id.item_wldz_artistStartThree)
        ImageView itemWldzArtistStartThree;
        @BindView(R.id.item_wldz_artistStartFour)
        ImageView itemWldzArtistStartFour;
        @BindView(R.id.item_wldz_artistStartFive)
        ImageView itemWldzArtistStartFive;
        @BindView(R.id.item_wldz_artistKStartOne)
        ImageView itemWldzArtistKStartOne;
        @BindView(R.id.item_wldz_artistKStartTwo)
        ImageView itemWldzArtistKStartTwo;
        @BindView(R.id.item_wldz_artistKStartThree)
        ImageView itemWldzArtistKStartThree;
        @BindView(R.id.item_wldz_artistKStartFour)
        ImageView itemWldzArtistKStartFour;
        @BindView(R.id.item_wldz_artistKStartFive)
        ImageView itemWldzArtistKStartFive;
        @BindView(R.id.kk)
        AutoRelativeLayout kk;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
