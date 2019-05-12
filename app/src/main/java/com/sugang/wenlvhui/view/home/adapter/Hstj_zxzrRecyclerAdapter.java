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
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;


public class Hstj_zxzrRecyclerAdapter extends RecyclerView.Adapter<Hstj_zxzrRecyclerAdapter.Holder> implements View.OnClickListener {

    private List<HstjNewBean.DataBean.NewBean> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;

    public Hstj_zxzrRecyclerAdapter(List<HstjNewBean.DataBean.NewBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_hstj_zxzrrecy, parent, false);
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
        HstjNewBean.DataBean.NewBean data = list.get(position);
        holder.itemHstjZxzrBookAutorText.setText(data.getBookAuther());
        Glide.with(context).load(data.getImgUrl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(holder.itemHstjZxzrBookImage);
        holder.itemHstjZxzrBookNameText.setText(data.getBookName());
        if (data.getRecommendClass() == 1) {
            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartTwo.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartThree.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
        } else if (data.getRecommendClass() == 2) {
            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartThree.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
        } else if (data.getRecommendClass() == 3) {
            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartFour.setVisibility(View.GONE);
            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
        } else if (data.getRecommendClass() == 4) {
            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartFour.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartFive.setVisibility(View.GONE);
        }else if (data.getRecommendClass() == 5) {
            holder.itemHstjZxzrBookStartOne.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartTwo.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartThree.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartFour.setVisibility(View.VISIBLE);
            holder.itemHstjZxzrBookStartFive.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_hstj_zxzrBookNameText)
        TextView itemHstjZxzrBookNameText;
        @BindView(R.id.item_hstj_zxzrBookImage)
        ImageView itemHstjZxzrBookImage;
        @BindView(R.id.item_hstj_zxzrBookAutorText)
        TextView itemHstjZxzrBookAutorText;
        @BindView(R.id.item_hstj_zxzrBookStartOne)
        ImageView itemHstjZxzrBookStartOne;
        @BindView(R.id.item_hstj_zxzrBookStartTwo)
        ImageView itemHstjZxzrBookStartTwo;
        @BindView(R.id.item_hstj_zxzrBookStartThree)
        ImageView itemHstjZxzrBookStartThree;
        @BindView(R.id.item_hstj_zxzrBookStartFour)
        ImageView itemHstjZxzrBookStartFour;
        @BindView(R.id.item_hstj_zxzrBookStartFive)
        ImageView itemHstjZxzrBookStartFive;
        @BindView(R.id.item_hstj_zxzrBookKStartOne)
        ImageView itemHstjZxzrBookKStartOne;
        @BindView(R.id.item_hstj_zxzrBookKStartTwo)
        ImageView itemHstjZxzrBookKStartTwo;
        @BindView(R.id.item_hstj_zxzrBookKStartThree)
        ImageView itemHstjZxzrBookKStartThree;
        @BindView(R.id.item_hstj_zxzrBookKStartFour)
        ImageView itemHstjZxzrBookKStartFour;
        @BindView(R.id.item_hstj_zxzrBookKStartFive)
        ImageView itemHstjZxzrBookKStartFive;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}
