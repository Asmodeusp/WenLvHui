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
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.space.SpaceBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.utils.AutoUtils;

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
        holder.itemSpacePageDetalis.setText(data.getDateil());
        Glide.with(context).load(data.getBackupField1()).into(holder.itemSpacePageHeadImage);
        Glide.with(context).load(data.getSpaceImage().get(0).getImgUrl()).into(holder.itemSpacePageImage);
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
