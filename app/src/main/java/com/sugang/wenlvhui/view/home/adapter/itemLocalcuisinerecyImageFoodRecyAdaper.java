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

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class itemLocalcuisinerecyImageFoodRecyAdaper extends RecyclerView.Adapter<itemLocalcuisinerecyImageFoodRecyAdaper.Holder> implements View.OnClickListener {


    private List<String> list;
    private Context context;
    boolean isLike = true;
    private RecyclerViewOnCLickListener myCLick;


    public itemLocalcuisinerecyImageFoodRecyAdaper(List<String> list) {
        this.list = list;

    }




    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_itemlocalcuisinerecyimagefoodrecy, parent, false);
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
    public void onBindViewHolder(@NonNull  Holder holder, int position) {
        Glide.with(context).load(list.get(position)).into( holder.itemItemlocalcuisinerecyimagefoodrecyImage);

    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_itemlocalcuisinerecyimagefoodrecyImage)
        ImageView itemItemlocalcuisinerecyimagefoodrecyImage;
        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}



