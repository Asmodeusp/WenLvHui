package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wcfy.ProductListBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiPageBean;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class ShouYiRecyclerAdapter extends RecyclerView.Adapter<ShouYiRecyclerAdapter.Holder> implements View.OnClickListener {


    private List<ProductListBean> list;
    private Context context;
    private RecyclerViewOnCLickListener myCLick;
    private boolean isLike = true;
    private int a ;

    public ShouYiRecyclerAdapter(List<ProductListBean> list,int a) {
        this.list = list;
        this.a =a;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wcfyshouyi, parent, false);
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
        ProductListBean data = list.get(position);
        if (a==0) {
            holder.itemWcfyshouyiAddressText.setVisibility(View.GONE);
        }
        Glide.with(context).load(data.getProductImage()).error(R.mipmap.icon).into(holder.itemWcfyshouyiImage);
        holder.itemWcfyshouyiNameText.setText(data.getProductName());
        holder.itemWcfyshouyiAddressText.setText(data.getCity() + "-"+data.getArea());
        holder.itemWcfyshouyiSeeNumberText.setText(data.getBrowse()+"");
        if (data.getIsUp() == 0) {
            isLike = false;
        } else {
            isLike = true;
        }
        if (isLike) {
            holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itemWcfyshouyiIslikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan_pass);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan);
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
            holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itemWcfyshouyiIslikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan);
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWcfyshouyiIslikeImage.setImageResource(R.mipmap.dianzan_pass);
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

        @BindView(R.id.item_wcfyshouyiImage)
        ImageView itemWcfyshouyiImage;
        @BindView(R.id.item_wcfyshouyiNameText)
        TextView itemWcfyshouyiNameText;
        @BindView(R.id.item_wcfyshouyiIslikeImage)
        ImageView itemWcfyshouyiIslikeImage;
        @BindView(R.id.item_wcfyshouyiIslikeButton)
        AutoRelativeLayout itemWcfyshouyiIslikeButton;

        @BindView(R.id.item_wcfyshouyiAddressText)
        TextView itemWcfyshouyiAddressText;
        @BindView(R.id.item_wcfyshouyiSeeNumberText)
        TextView itemWcfyshouyiSeeNumberText;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
