package com.sugang.wenlvhui.view.adaptr;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.space.SpaceBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.utils.AutoUtils;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;


public class SpacePageAdapter extends RecyclerView.Adapter<SpacePageAdapter.Holder> implements View.OnClickListener {

    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    List<SpaceBean> list;

    public SpacePageAdapter(List<SpaceBean> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_spacepage, parent, false);
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
        SpaceBean data = list.get(position);
        holder.itemSpacePageAddressText.setText(data.getAddr());
        holder.itemSpacePageData.setText(TimeUtils.getBirthdatyData(data.getCreateDate()));

        RichText
                .from(data.getDateil()) // 数据源
                .autoFix(true) // 是否自动修复，默认true
                .autoPlay(true) // gif图片是否自动播放
                .showBorder(true) // 是否显示图片边框
                .borderColor(Color.RED) // 图片边框颜色
                .borderSize(10) // 边框尺寸
                .borderRadius(50) // 图片边框圆角弧度
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                .noImage(true) // 不显示并且不加载图片
                .resetSize(false)
                .bind(this)
                .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                .into(holder.itemSpacePageDetalis); // 设置目标TextView
        Glide.with(context).load(data.getBackupField1()).into(holder.itemSpacePageHeadImage);
        Glide.with(context).load(data.getBackImg()).into(holder.itemSpacePageImage);
        holder.itemSpacePageNameText.setText(data.getSpaceName());
        holder.itemSpacePageSeeNumberText.setText(data.getBrowse()+"");
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_spacePageHead_Image)
        CircleImageView itemSpacePageHeadImage;
        @BindView(R.id.item_spacePageNameText)
        TextView itemSpacePageNameText;
        @BindView(R.id.item_spacePageData)
        TextView itemSpacePageData;
        @BindView(R.id.item_spacePageSeeNumberText)
        TextView itemSpacePageSeeNumberText;
        @BindView(R.id.item_spacePageDetalis)
        TextView itemSpacePageDetalis;
        @BindView(R.id.item_spacePageImage)
        ImageView itemSpacePageImage;
        @BindView(R.id.item_spacePageAddressText)
        TextView itemSpacePageAddressText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
