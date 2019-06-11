package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wlbd.WlbdHsBean;
import com.sugang.wenlvhui.model.bean.home.wllx.BrigadesBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;

//
/* Created by $USER_NAME on 2019/6/11.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/

public class WlbdAdapter extends RecyclerView.Adapter<WlbdAdapter.Holder> implements View.OnClickListener {


    private List<WlbdHsBean.DataBean.BangdanBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public WlbdAdapter(List<WlbdHsBean.DataBean.BangdanBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlbd, parent, false);
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
        WlbdHsBean.DataBean.BangdanBean data = list.get(position);
        if (position == 0) {
            holder.wlbdImage.setImageResource(R.mipmap.first);
        } else if (position == 1) {
            holder.wlbdImage.setImageResource(R.mipmap.second);
        } else if (position == 2) {
            holder.wlbdImage.setImageResource(R.mipmap.third);
        }else {
            holder.wlbdImage.setVisibility(View.GONE);
        }
        holder.wlbdSeeText.setText(data.getBrowse()+"次");
        holder.wlbdText.setText(data.getNAME());
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.wlbdImage)
        ImageView wlbdImage;
        @BindView(R.id.wlbdText)
        TextView wlbdText;
        @BindView(R.id.wlbdSeeText)
        TextView wlbdSeeText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
