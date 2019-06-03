package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.home.wcfy.ShouYiPageContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiPageBean;
import com.sugang.wenlvhui.presenter.home.wcfy.ShouYiPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ShouYiRecyclerAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class ShouyiFragment extends BaseFragment<ShouYiPagePresenterImp> implements ShouYiPageContract.ShouYiPageView {


    @BindView(R.id.ShouYi_SerchEd)
    TextView ShouYiSerchEd;
    @BindView(R.id.ShouYi_FirtImage)
    ImageView ShouYiFirtImage;
    @BindView(R.id.ShouYi_FirtTextView)
    TextView ShouYiFirtTextView;
    @BindView(R.id.ShouYi_SecondImage)
    ImageView ShouYiSecondImage;
    @BindView(R.id.ShouYi_SecondText)
    TextView ShouYiSecondText;
    @BindView(R.id.ShouYi_ThirdImage)
    ImageView ShouYiThirdImage;
    @BindView(R.id.ShouYi_ThirdText)
    TextView ShouYiThirdText;
    @BindView(R.id.ShouYi_Recycler)
    RecyclerView ShouYiRecycler;
    private ShouYiPageBean.DataBean data;


    public ShouyiFragment() {
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_shouyi;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        Integer userId = (Integer) SPUtils.get(getActivity(), SPKey.USER_ID, 0);
        presenter.getShouYiPageBean(userId + "");
    }

    @OnClick({R.id.ShouYi_FirtImage, R.id.ShouYi_SecondImage, R.id.ShouYi_ThirdImage, R.id.ShouYi_SerchEd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ShouYi_FirtImage:
                startActivity(new Intent(getActivity(), ShouyiDetailActivity.class));
                SPUtils.put(getActivity(), SPKey.PRODUCT_ID, data.getAllday().get(0).getId());
                break;
            case R.id.ShouYi_SecondImage:
                startActivity(new Intent(getActivity(), ShouyiDetailActivity.class));
                SPUtils.put(getActivity(), SPKey.PRODUCT_ID, data.getAllday().get(1).getId());
                break;
            case R.id.ShouYi_ThirdImage:
                startActivity(new Intent(getActivity(), ShouyiDetailActivity.class));
                SPUtils.put(getActivity(), SPKey.PRODUCT_ID, data.getAllday().get(2).getId());
                break;
            case R.id.ShouYi_SerchEd:

                break;
        }
    }

    @Override
    public void showShouYiPageBean(ShouYiPageBean shouYiPageBean) {
        if (shouYiPageBean.getData() != null) {
            data = shouYiPageBean.getData();
            Glide.with(this).load(shouYiPageBean.getData().getAllday().get(0).getImgUrl()).error(R.mipmap.icon).into(ShouYiFirtImage);
            Glide.with(this).load(shouYiPageBean.getData().getAllday().get(1).getImgUrl()).error(R.mipmap.icon).into(ShouYiSecondImage);
            Glide.with(this).load(shouYiPageBean.getData().getAllday().get(2).getImgUrl()).error(R.mipmap.icon).into(ShouYiThirdImage);
            ShouYiFirtTextView.setText(shouYiPageBean.getData().getAllday().get(0).getProductName());
            ShouYiSecondText.setText(shouYiPageBean.getData().getAllday().get(1).getProductName());
            ShouYiThirdText.setText(shouYiPageBean.getData().getAllday().get(2).getProductName());
            ShouYiRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            ShouYiRecyclerAdapter shouYiRecyclerAdapter = new ShouYiRecyclerAdapter(shouYiPageBean.getData().getSelect_product());
            ShouYiRecycler.setAdapter(shouYiRecyclerAdapter);
            shouYiRecyclerAdapter.setRecyclerViewOnCLickListener(new ShouYiRecyclerAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    startActivity(new Intent(getActivity(), ShouyiDetailActivity.class));
                    SPUtils.put(getActivity(), SPKey.PRODUCT_ID, data.getSelect_product().get(position).getId());
                }
            });

        }
    }

    @Override
    public void showError(String string) {

    }
}
