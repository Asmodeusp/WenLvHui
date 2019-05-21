package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.CoordinateConverter;
import com.amap.api.location.DPoint;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantPageBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class JaingRenRecyAdapter extends RecyclerView.Adapter<JaingRenRecyAdapter.Holder> implements View.OnClickListener {


    private List<JiangRenPageBean.DataBean.ShopsBean> list;
    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    private boolean isLike = true;

    public JaingRenRecyAdapter(List<JiangRenPageBean.DataBean.ShopsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wcfyjiangren, parent, false);
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
        JiangRenPageBean.DataBean.ShopsBean data = list.get(position);

        Glide.with(context).load(data.getImgUrl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemWcfyjiangrenHeadImage);

        holder.itemWcfyjiangrenNameText.setText(data.getShopsName());
        holder.itemWcfyjiangrenWorksNumberText.setText(data.getProduct_num() + "");
        //查看数量
//       holder.itemWcfyjiangrenSeeNumberText.setText(data.get());
        if (data.getIs_up() == 0) {
            isLike = false;
        } else {
            isLike = true;
        }
        if (isLike) {
            holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itemWcfyjiangrenIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = true;
                    }

                }
            });
        } else {
            holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itemWcfyjiangrenIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWcfyjiangrenIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = true;
                    }

                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_wcfyjiangrenHeadImage)
        ImageView itemWcfyjiangrenHeadImage;
        @BindView(R.id.item_wcfyjiangrenNameText)
        TextView itemWcfyjiangrenNameText;
        @BindView(R.id.item_wcfyjiangrenWorksNumberText)
        TextView itemWcfyjiangrenWorksNumberText;
        @BindView(R.id.item_wcfyjiangrenSeeNumberText)
        TextView itemWcfyjiangrenSeeNumberText;
        @BindView(R.id.item_wcfyjiangrenIsLikeImage)
        ImageView itemWcfyjiangrenIsLikeImage;
        @BindView(R.id.item_wcfyjiangrenIsLikeButton)
        AutoLinearLayout itemWcfyjiangrenIsLikeButton;


        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
