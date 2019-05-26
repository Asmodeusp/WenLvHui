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
import com.sugang.wenlvhui.model.bean.home.wldz.WldzArtistindexBean;
import com.sugang.wenlvhui.model.bean.home.wypx.WypxPageBean;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LiteraryTrainingDetailsRecyclerAdapter extends RecyclerView.Adapter<LiteraryTrainingDetailsRecyclerAdapter.Holder> implements View.OnClickListener {

    private List<WypxPageBean.DataBean.SchoolsBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public LiteraryTrainingDetailsRecyclerAdapter(List<WypxPageBean.DataBean.SchoolsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wypxrecy, parent, false);
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
        final WypxPageBean.DataBean.SchoolsBean data = list.get(position);
        holder.itemWypxrecyNameText.setText(data.getName());
        Glide.with(context).load(data.getLogo()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemWypxrecyImage);
        holder.itemWypxrecyAddressText.setText(data.getCity() + "   |   " + data.getArea());
        holder.itemWypxrecyIsLikeNumber.setText(data.getLikenum()+"");
        if (data.getIslike() == 0) {

            isLike =false;
        }else{
            isLike =true;
        }
        //设置喜欢图片
        if (isLike) {
            holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itemWypxrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWypxrecyIsLikeNumber.setText(data.getLikenum() - 1 + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWypxrecyIsLikeNumber.setText(data.getLikenum() + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "1");
//                       }
                        isLike = true;
                    }

                }
            });
        } else {
            holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itemWypxrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWypxrecyIsLikeNumber.setText(data.getLikenum() + 1 + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWypxrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWypxrecyIsLikeNumber.setText(data.getLikenum() + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = true;
                    }

                }
            });}
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_wypxrecyImage)
        ImageView itemWypxrecyImage;
        @BindView(R.id.item_wypxrecyNameText)
        TextView itemWypxrecyNameText;
        @BindView(R.id.item_wypxrecyIsLikeImage)
        ImageView itemWypxrecyIsLikeImage;
        @BindView(R.id.item_wypxrecyIsLikeNumber)
        TextView itemWypxrecyIsLikeNumber;
        @BindView(R.id.item_wypxrecyIsLikeButton)
        AutoLinearLayout itemWypxrecyIsLikeButton;
        @BindView(R.id.item_wypxrecyAddressText)
        TextView itemWypxrecyAddressText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
