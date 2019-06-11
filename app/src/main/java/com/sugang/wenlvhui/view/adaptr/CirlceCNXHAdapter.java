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
import com.sugang.wenlvhui.model.bean.circle.CircleCNXHBean;
import com.sugang.wenlvhui.model.bean.space.SpaceBean;
import com.sugang.wenlvhui.utils.TimeUtils;
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

public class CirlceCNXHAdapter extends RecyclerView.Adapter<CirlceCNXHAdapter.Holder> implements View.OnClickListener {


    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    List<CircleCNXHBean.DataBean.PolicyListBean> list;

    public CirlceCNXHAdapter(List<CircleCNXHBean.DataBean.PolicyListBean> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_circle_cnxh, parent, false);
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
        CircleCNXHBean.DataBean.PolicyListBean data = list.get(position);
        holder.CircleCNXHCircleName.setText(data.getCircleName());
        holder.CircleCNXHCircleTag.setText(data.getDataName());
        Glide.with(context).load(data.getImgUrl()).into(holder.CircleCNXHCircleImage);
        if (data.getUserType()==1) {
            holder.CircleCNXHCirclefollew.setText("+关注");
            holder.CircleCNXHCirclefollew.setBackgroundResource(R.drawable.tag);
            holder.CircleCNXHCirclefollew.setTextColor(context.getResources().getColor(R.color.H2));
        }else {
            holder.CircleCNXHCirclefollew.setText("已关注");
            holder.CircleCNXHCirclefollew.setBackgroundResource(R.drawable.buybutton);
            holder.CircleCNXHCirclefollew.setTextColor(context.getResources().getColor(R.color.H8));
        }

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.CircleCNXH_CircleImage)
        ImageView CircleCNXHCircleImage;
        @BindView(R.id.CircleCNXH_CircleName)
        TextView CircleCNXHCircleName;
        @BindView(R.id.CircleCNXH_CircleTag)
        TextView CircleCNXHCircleTag;
        @BindView(R.id.CircleCNXH_Circlefollew)
        TextView CircleCNXHCirclefollew;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
