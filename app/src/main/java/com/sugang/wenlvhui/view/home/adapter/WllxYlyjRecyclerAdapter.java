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
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wllx.WllxylyjListBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;
import com.zzhoujay.richtext.callback.ImageFixCallback;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

//
/* Created by $USER_NAME on 2019/6/9.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。
      回首向来萧瑟处，无人等在灯火阑珊处**/

public class WllxYlyjRecyclerAdapter extends RecyclerView.Adapter<WllxYlyjRecyclerAdapter.Holder> implements View.OnClickListener {


    private List<WllxylyjListBean.DataBean.ListsBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public WllxYlyjRecyclerAdapter(List<WllxylyjListBean.DataBean.ListsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_xlyjrecy, parent, false);
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
        WllxylyjListBean.DataBean.ListsBean data = list.get(position);
        RichText
                .from(data.getContent()) // 数据源
                .showBorder(false)
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                .resetSize(false)
                .into(holder.RichText); // 设置目标TextView

        Glide.with(context).load(data.getHead_pic()).error(R.mipmap.icon).into(holder.YLYJHeadImage);
        holder.YLYJUserName.setText(data.getNick_name());
        holder.YLYJDate.setText(TimeUtils.strToDateLong(data.getCreate_time()));
        holder.YLYJIsLikeNumText.setText(data.getLike()+"");
        holder.YLYJSeeNumText.setText(data.getBrowse()+"");
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.YLYJHeadImage)
        CircleImageView YLYJHeadImage;
        @BindView(R.id.YLYJUserName)
        TextView YLYJUserName;
        @BindView(R.id.YLYJDate)
        TextView YLYJDate;
        @BindView(R.id.RichText)
        TextView RichText;
        @BindView(R.id.YLYJIsLikeImage)
        ImageView YLYJIsLikeImage;
        @BindView(R.id.YLYJIsLikeNumText)
        TextView YLYJIsLikeNumText;
        @BindView(R.id.YLYJIsLikeButton)
        AutoLinearLayout YLYJIsLikeButton;
        @BindView(R.id.YLYJCommentImage)
        ImageView YLYJCommentImage;
        @BindView(R.id.YLYJCommentButton)
        AutoLinearLayout YLYJCommentButton;
        @BindView(R.id.YLYJSeeNumText)
        TextView YLYJSeeNumText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}

