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
import com.sugang.wenlvhui.model.bean.space.SpaceDetailBean;
import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.utils.AutoUtils;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

//
/* Created by $USER_NAME on 2019/6/10.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/

public class SpaceDongTaiRecyclerAdapter extends RecyclerView.Adapter<SpaceDongTaiRecyclerAdapter.Holder> implements View.OnClickListener {

    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    List<SpaceDetailBean> list;

    public SpaceDongTaiRecyclerAdapter(List<SpaceDetailBean> space_detail) {
        this.list = space_detail;
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
        SpaceDetailBean data = list.get(position);
        String SpaceAddress = (String) SPUtils.get(context, SPKey.SPACEAddress, "");
        String SpaceImage = (String) SPUtils.get(context, SPKey.SPACEImage, "");
        String SpaceName = (String) SPUtils.get(context, SPKey.SPACEName, "");
//        Long SpaceDate = (Long) SPUtils.get(context, SPKey.SPACEDate, "");

        holder.itemSpacePageAddressText.setText(SpaceAddress);
//        holder.itemSpacePageData.setText(TimeUtils.getBirthdatyData(SpaceDate));

        RichText
                .from(data.getSpacePolicyDetail()) // 数据源
                .autoFix(true) // 是否自动修复，默认true
                .autoPlay(true) // gif图片是否自动播放
                .showBorder(true) // 是否显示图片边框
                .borderColor(Color.RED) // 图片边框颜色
                .borderSize(10) // 边框尺寸
                .borderRadius(50) // 图片边框圆角弧度
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高

                .resetSize(false)
                .bind(this)
                .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                .into(holder.itemSpacePageDetalis); // 设置目标TextView
        Glide.with(context).load(SpaceImage).into(holder.itemSpacePageHeadImage);
        Glide.with(context).load(data.getVideoBackimg()).into(holder.itemSpacePageImage);
        holder.itemSpacePageNameText.setText(SpaceName);
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
