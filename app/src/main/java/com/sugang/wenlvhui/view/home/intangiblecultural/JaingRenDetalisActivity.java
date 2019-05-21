package com.sugang.wenlvhui.view.home.intangiblecultural;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class JaingRenDetalisActivity extends BaseActivity {


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
    ViewPager JiangrenDetalisViewpager;

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
}
