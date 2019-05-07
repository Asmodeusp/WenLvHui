package com.sugang.wenlvhui.view.home.adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.Wenlvzhengcebean;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class Wlzc_zxdtRecyAdapter extends RecyclerView.Adapter<Wlzc_zxdtRecyAdapter.Holder> implements View.OnClickListener {
    private List<NewsBean> list;
    private Context context;
    private boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public Wlzc_zxdtRecyAdapter(List<NewsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlzc_zxdtrecy, parent, false);
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
    public void onBindViewHolder(final Holder holder, int position) {
        Log.d("Wlzc_zxdtRecyAdapter", "position:" + position);
        Log.d("Wlzc_zxdtRecyAdapter", "list.size():" + list.size());
        final NewsBean data = list.get(position);
        holder.itemWlzcZxdtrecyCommentNumText.setText(data.getComment_num() + "");
        holder.itemWlzcZxdtrecyfenlieText.setText(data.getTitle_type_name() + "");
        holder.itemWlzcZxdtrecyTitleText.setText(data.getTitle() + "");
//            holder.itme_wlzc_xmggrecyDataText.setText(data.get()+"");
        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getIs_up() + "");
        holder.itemWlzcZxdtrecySeeNumText.setText(data.getComment_num() + "");
        holder.itemWlzcZxdtrecyFromText.setText(data.getSource() + "");
        holder.itemView.setTag(position);
        Glide.with(context).load(data.getImage()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemWlzcZxdtrecyImage);
        if (data.getIs_up() == 0) {
            isLike = false;
        } else {
            isLike = true;
        }
        if (isLike) {
            holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itemWlzcZxdtrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getUp_num() - 1 + "");
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (data.getType() == 2) {
//                            i60.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getUp_num() + "");
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
            holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itemWlzcZxdtrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getUp_num() + 1 + "");
//                        if (data.getType() == 1) {
//                            presenter.UgcFabulous(data.getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (data.getType() == 2) {
//                            presenter.PgcCollection(data.getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = false;
                    } else {
                        holder.itemWlzcZxdtrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itemWlzcZxdtrecyIsLikeNumText.setText(data.getUp_num() + "");
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
        @BindView(R.id.item_wlzc_zxdtrecyfenlieText)
        TextView itemWlzcZxdtrecyfenlieText;
        @BindView(R.id.item_wlzc_zxdtrecyTitleText)
        TextView itemWlzcZxdtrecyTitleText;
        @BindView(R.id.item_wlzc_zxdtrecyDataText)
        TextView itemWlzcZxdtrecyDataText;
        @BindView(R.id.item_wlzc_zxdtrecyFromText)
        TextView itemWlzcZxdtrecyFromText;
        @BindView(R.id.item_wlzc_zxdtrecyContentText)
        TextView itemWlzcZxdtrecyContentText;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeImage)
        ImageView itemWlzcZxdtrecyIsLikeImage;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeNumText)
        TextView itemWlzcZxdtrecyIsLikeNumText;
        @BindView(R.id.item_wlzc_zxdtrecyIsLikeButton)
        AutoLinearLayout itemWlzcZxdtrecyIsLikeButton;
        @BindView(R.id.item_wlzc_zxdtrecyCommentImage)
        ImageView itemWlzcZxdtrecyCommentImage;
        @BindView(R.id.item_wlzc_zxdtrecyCommentNumText)
        TextView itemWlzcZxdtrecyCommentNumText;
        @BindView(R.id.item_wlzc_zxdtrecyCommentButton)
        AutoLinearLayout itemWlzcZxdtrecyCommentButton;
        @BindView(R.id.item_wlzc_zxdtrecySeeNumText)
        TextView itemWlzcZxdtrecySeeNumText;
        @BindView(R.id.item_wlzc_zxdtrecyImage)
        ImageView itemWlzcZxdtrecyImage;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


    
}
