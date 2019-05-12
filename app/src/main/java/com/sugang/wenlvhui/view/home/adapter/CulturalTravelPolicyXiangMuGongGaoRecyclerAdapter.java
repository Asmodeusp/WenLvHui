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

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;

import com.sugang.wenlvhui.utils.TimeUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter extends RecyclerView.Adapter<CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter.Holder> implements View.OnClickListener {
    private List<NewsBean> list;
    private Context context;
    boolean isLike =true;
    private RecyclerViewOnCLickListener myCLick;

    public CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter(List<NewsBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        View inflate = LayoutInflater.from(context).inflate(R.layout.item_wlzc_xmggrecy, parent, false);
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
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final NewsBean data = list.get(position);

        holder.itmeWlzcXmggrecyCommentNumText.setText(data.getComment_num() + "");
        holder.itmeWlzcXmggrecyfenlieText.setText(data.getTitleTypeName() + "");
        holder.itmeWlzcXmggrecyTitleText.setText(data.getTitle() + "");
        holder.itmeWlzcXmggrecyDataText.setText(TimeUtils.getBirthdatyData(data.getCreateDate()));
        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getUp_num() + "");
        holder.itmeWlzcXmggrecySeeNumText.setText(data.getComment_num() + "");
        holder.itmeWlzcXmggrecyFromText.setText(data.getSource() + "");
        holder.itemView.setTag(position);
        if (data.getIs_up() == 0) {
            isLike =false;
        }else{
            isLike =true;
        }
        //设置喜欢图片
        if (isLike) {
            holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
            //喜欢点击事件
            holder.itmeWlzcXmggrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getUp_num() - 1 + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = false;
                    } else {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getUp_num() + "");
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
            holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
            //喜欢点击事件
            holder.itmeWlzcXmggrecyIsLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isLike) {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getUp_num() + 1 + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "1");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "1");
//                        }
                        isLike = false;
                    } else {
                        holder.itmeWlzcXmggrecyIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                        holder.itmeWlzcXmggrecyIsLikeNumText.setText(data.getUp_num() + "");
//                        if (list.get(position).getType() == 1) {
//                            presenter.UgcFabulous(list.get(position).getUgcDynamicDto().getUgcId(), "0");
//                        }
//                        if (list.get(position).getType() == 2) {
//                            presenter.PgcCollection(list.get(position).getPgcDynamicDto().getCatalogId(), "0");
//                        }
                        isLike = true;
                    }

                }
            });
        }
        //点击评论
        holder.itmeWlzcXmggrecyCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return list.isEmpty() ? 0 : list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.itme_wlzc_xmggrecyfenlieText)
        TextView itmeWlzcXmggrecyfenlieText;
        @BindView(R.id.itme_wlzc_xmggrecyTitleText)
        TextView itmeWlzcXmggrecyTitleText;
        @BindView(R.id.itme_wlzc_xmggrecyDataText)
        TextView itmeWlzcXmggrecyDataText;
        @BindView(R.id.itme_wlzc_xmggrecyFromText)
        TextView itmeWlzcXmggrecyFromText;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeImage)
        ImageView itmeWlzcXmggrecyIsLikeImage;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeNumText)
        TextView itmeWlzcXmggrecyIsLikeNumText;
        @BindView(R.id.itme_wlzc_xmggrecyCommentImage)
        ImageView itmeWlzcXmggrecyCommentImage;
        @BindView(R.id.itme_wlzc_xmggrecyCommentNumText)
        TextView itmeWlzcXmggrecyCommentNumText;
        @BindView(R.id.itme_wlzc_xmggrecyCommentButton)
        AutoLinearLayout itmeWlzcXmggrecyCommentButton;
        @BindView(R.id.itme_wlzc_xmggrecySeeNumText)
        TextView itmeWlzcXmggrecySeeNumText;
        @BindView(R.id.itme_wlzc_xmggrecyIsLikeButton)
        AutoLinearLayout itmeWlzcXmggrecyIsLikeButton;

        public Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.autoSize(itemView);
        }
    }


}



