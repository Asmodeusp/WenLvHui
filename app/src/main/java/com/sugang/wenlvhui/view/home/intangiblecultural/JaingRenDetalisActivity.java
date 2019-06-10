package com.sugang.wenlvhui.view.home.intangiblecultural;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wcfy.JiangrenDetalisContract;
import com.sugang.wenlvhui.model.bean.VideosBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenDetalisBean;
import com.sugang.wenlvhui.presenter.home.wcfy.JiangrenDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class JaingRenDetalisActivity extends BaseActivity<JiangrenDetalisPresenterImp>implements JiangrenDetalisContract.JiangrenDetalisView {


    @BindView(R.id.JiangrenDetalis_ReturnButton)
    AutoLinearLayout JiangrenDetalisReturnButton;
    @BindView(R.id.JiangrenDetalis_ShareButton)
    AutoLinearLayout JiangrenDetalisShareButton;
    @BindView(R.id.JiangrenDetalis_NameText)
    TextView JiangrenDetalisNameText;
    @BindView(R.id.JiangrenDetalis_BackgroundImage)
    ImageView JiangrenDetalisBackgroundImage;
    @BindView(R.id.JiangrenDetalis_HeadImage)
    ImageView JiangrenDetalisHeadImage;
    @BindView(R.id.JiangrenDetalis_ShopDetalisText)
    TextView JiangrenDetalisShopDetalisText;
    @BindView(R.id.JiangrenDetalis_productNumberText)
    TextView JiangrenDetalisProductNumberText;
    @BindView(R.id.JiangrenDetalis_AdressText)
    TextView JiangrenDetalisAdressText;
    @BindView(R.id.JiangrenDetalis_IsLikeImage)
    ImageView JiangrenDetalisIsLikeImage;
    @BindView(R.id.JiangrenDetalis_IsLikeButton)
    AutoLinearLayout JiangrenDetalisIsLikeButton;
    @BindView(R.id.JiangrenDetalis_ZuoPinLine)
    View JiangrenDetalisZuoPinLine;
    @BindView(R.id.JiangrenDetalis_ZuoPinButton)
    AutoLinearLayout JiangrenDetalisZuoPinButton;
    @BindView(R.id.JiangrenDetalis_JieshaoLine)
    View JiangrenDetalisJieshaoLine;
    @BindView(R.id.JiangrenDetalis_JieshaoButton)
    AutoLinearLayout JiangrenDetalisJieshaoButton;
    @BindView(R.id.JiangrenDetalis_ShipinLine)
    View JiangrenDetalisShipinLine;
    @BindView(R.id.JiangrenDetalis_ShipinButton)
    AutoLinearLayout JiangrenDetalisShipinButton;
    @BindView(R.id.JiangrenDetalis_Viewpager)
    FrameLayout JiangrenDetalisViewpager;
    public ArrayList<VideosBean> videosBeans = new ArrayList<>();
    public List<JiangRenDetalisBean.DataBean.ShopBean.ProductListBean> productList= new ArrayList<>();


    @Override
    protected int getLayoutId() {
        return R.layout.activity_jiagnren_detalis;
    }

    @Override
    protected void init() {
        setContentView(R.id.JiangrenDetalis_Viewpager, JiangrenJieshaoFragment.class);
        JiangrenDetalisJieshaoLine.setVisibility(View.VISIBLE);
        JiangrenDetalisShipinLine.setVisibility(View.INVISIBLE);
        JiangrenDetalisZuoPinLine.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void loadDate() {
        int id = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        int ShopId = (int) SPUtils.get(this, SPKey.SHOP_ID, 0);
        presenter.getJiangrenDetalisBean(id+"",ShopId+"");
    }


    @OnClick({R.id.JiangrenDetalis_ReturnButton, R.id.JiangrenDetalis_ShareButton, R.id.JiangrenDetalis_IsLikeButton, R.id.JiangrenDetalis_ZuoPinButton, R.id.JiangrenDetalis_JieshaoButton, R.id.JiangrenDetalis_ShipinButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.JiangrenDetalis_ReturnButton:
                finish();
                break;
            case R.id.JiangrenDetalis_ShareButton:
                break;
            case R.id.JiangrenDetalis_IsLikeButton:
                break;
            case R.id.JiangrenDetalis_ZuoPinButton:
                setContentView(R.id.JiangrenDetalis_Viewpager, JiangrenZuopinFragment.class);
                JiangrenDetalisJieshaoLine.setVisibility(View.INVISIBLE);
                JiangrenDetalisShipinLine.setVisibility(View.INVISIBLE);
                JiangrenDetalisZuoPinLine.setVisibility(View.VISIBLE);
                break;
            case R.id.JiangrenDetalis_JieshaoButton:
                setContentView(R.id.JiangrenDetalis_Viewpager, JiangrenJieshaoFragment.class);
                JiangrenDetalisJieshaoLine.setVisibility(View.VISIBLE);
                JiangrenDetalisShipinLine.setVisibility(View.INVISIBLE);
                JiangrenDetalisZuoPinLine.setVisibility(View.INVISIBLE);
                break;
            case R.id.JiangrenDetalis_ShipinButton:
                setContentView(R.id.JiangrenDetalis_Viewpager, JiangrenShipinFragment.class);
                JiangrenDetalisJieshaoLine.setVisibility(View.INVISIBLE);
                JiangrenDetalisShipinLine.setVisibility(View.VISIBLE);
                JiangrenDetalisZuoPinLine.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void showJiangRenDetalisBean(JiangRenDetalisBean jiangRenPageBean) {
        if (jiangRenPageBean.getData()!=null) {
            JiangRenDetalisBean.DataBean data = jiangRenPageBean.getData();
            JiangrenDetalisNameText.setText(data.getShop().getShopsName());
            Glide.with(this).load(data.getShop().getProvince()).error(R.mipmap.icon).into(JiangrenDetalisBackgroundImage);
            Glide.with(this).load(data.getShop().getImgUrl()).error(R.mipmap.icon).into(JiangrenDetalisHeadImage);
            JiangrenDetalisShopDetalisText.setText(data.getShop().getShopsSlogan());
            JiangrenDetalisProductNumberText.setText(data.getShop().getProduct_num()+"");
            JiangrenDetalisAdressText.setText(data.getShop().getAddrDetail());
            String shopsDetail = data.getShop().getShopsDetail();
            SPUtils.put(this,SPKey.SHOP_DETAILS,shopsDetail);
            videosBeans.addAll(data.getShop().getVideoList());
            productList .addAll( data.getShop().getProductList());
        }

    }

    @Override
    public void showError(String string) {

    }
}
