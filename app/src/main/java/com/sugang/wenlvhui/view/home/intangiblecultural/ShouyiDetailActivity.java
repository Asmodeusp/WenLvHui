package com.sugang.wenlvhui.view.home.intangiblecultural;



import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wcfy.ShouYiDetalisContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShouYiDetalisBean;
import com.sugang.wenlvhui.presenter.home.wcfy.ShouYiDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.ShouyiDetalisRecyAdapter;
import com.zhy.autolayout.AutoLinearLayout;
import butterknife.BindView;
import butterknife.OnClick;

public class ShouyiDetailActivity extends BaseActivity<ShouYiDetalisPresenterImp> implements ShouYiDetalisContract.ShouYiDetalisView {


    @BindView(R.id.ShouyiDetail_ReturnButton)
    AutoLinearLayout ShouyiDetailReturnButton;
    @BindView(R.id.ShouyiDetail_ShareButton)
    AutoLinearLayout ShouyiDetailShareButton;
    @BindView(R.id.ShouyiDetailFlyBanner)
    ImageView ShouyiDetailFlyBanner;
    @BindView(R.id.ShouyiDetail_ProductNameText)
    TextView ShouyiDetailProductNameText;
    @BindView(R.id.ShouyiDetail_Parice)
    TextView ShouyiDetailParice;
    @BindView(R.id.ShouyiDetail_YuanParice)
    TextView ShouyiDetailYuanParice;
    @BindView(R.id.ShouyiDetail_CommentText)
    TextView ShouyiDetailCommentText;
    @BindView(R.id.ShouyiDetail_ShopImage)
    ImageView ShouyiDetailShopImage;
    @BindView(R.id.ShouyiDetail_shopName)
    TextView ShouyiDetailShopName;
    @BindView(R.id.ShouyiDetail_goShopPageButton)
    TextView ShouyiDetailGoShopPageButton;
    @BindView(R.id.ShouyiDetail_ShopRecy)
    RecyclerView ShouyiDetailShopRecy;
    @BindView(R.id.ShouyiDetail_CollectionImage)
    ImageView ShouyiDetailCollectionImage;
    @BindView(R.id.ShouyiDetail_CollectionButton)
    AutoLinearLayout ShouyiDetailCollectionButton;
    @BindView(R.id.ShouyiDetail_JionShopingCarButton)
    AutoLinearLayout ShouyiDetailJionShopingCarButton;
    @BindView(R.id.ShouyiDetail_LiJiGouMaiButton)
    AutoLinearLayout ShouyiDetailLiJiGouMaiButton;
    boolean islike =true;
    private int id;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shouyi_detail;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int o = (int) SPUtils.get(this, SPKey.PRODUCT_ID, 0);
        presenter.getShouYiDetalisBean(o+"");
    }




    @OnClick({R.id.ShouyiDetail_ReturnButton, R.id.ShouyiDetail_ShareButton, R.id.ShouyiDetail_CommentText, R.id.ShouyiDetail_goShopPageButton, R.id.ShouyiDetail_CollectionButton, R.id.ShouyiDetail_JionShopingCarButton, R.id.ShouyiDetail_LiJiGouMaiButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ShouyiDetail_ReturnButton:
                finish();
                break;
            case R.id.ShouyiDetail_ShareButton:

                break;
            case R.id.ShouyiDetail_CommentText:

                break;
            case R.id.ShouyiDetail_goShopPageButton:
                SPUtils.put(this, SPKey.SHOP_ID, id);
                startActivity(new Intent(this, JaingRenDetalisActivity.class));
                startActivity(new Intent());
                break;
            case R.id.ShouyiDetail_CollectionButton:
                if (islike) {
                    ShouyiDetailCollectionImage.setImageResource(R.mipmap.dianzan_pass);
                    islike =false;
                }else{
                    ShouyiDetailCollectionImage.setImageResource(R.mipmap.dianzan);
                }
                break;
            case R.id.ShouyiDetail_JionShopingCarButton:
                break;
            case R.id.ShouyiDetail_LiJiGouMaiButton:
                break;
        }
    }

    @Override
    public void showShouYiDetalisBean(ShouYiDetalisBean shouYiPageBean) {
        if (shouYiPageBean.getData()!= null) {
            ShouYiDetalisBean.DataBean data = shouYiPageBean.getData();
            Glide.with(this).load(data.getProduct().getProductImage()).into(ShouyiDetailFlyBanner);
            ShouyiDetailProductNameText.setText(data.getProduct().getProductName());
            ShouyiDetailParice.setText(data.getProduct().getPrice()+"");
            ShouyiDetailCommentText.setText(data.getProduct().getCommentNum()+"");
            Glide.with(this).load(data.getShop().getImgUrl()).into(ShouyiDetailShopImage);
            ShouyiDetailShopName.setText(data.getShop().getShopsName());
            id = data.getShop().getId();
            ShouyiDetailShopRecy.setLayoutManager(new GridLayoutManager(this,2));
            ShouyiDetalisRecyAdapter shouyiDetalisRecyAdapter = new ShouyiDetalisRecyAdapter(data.getProduct_list());
            ShouyiDetailShopRecy.setAdapter(shouyiDetalisRecyAdapter);
            shouyiDetalisRecyAdapter.setRecyclerViewOnCLickListener(new ShouyiDetalisRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {

                    startActivity(new Intent(ShouyiDetailActivity.this,ShouyiDetailActivity.class));
                }
            });
        }
    }

    @Override
    public void showError(String string) {

    }
}
