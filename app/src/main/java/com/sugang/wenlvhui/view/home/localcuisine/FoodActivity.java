package com.sugang.wenlvhui.view.home.localcuisine;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.dfms.FoodDetalisContract;
import com.sugang.wenlvhui.model.bean.home.dfms.FoodDetalisBean;
import com.sugang.wenlvhui.presenter.home.dfms.FoodDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FoodActivity extends BaseActivity<FoodDetalisPresenterImp> implements FoodDetalisContract.FoodDetalisView {


    @BindView(R.id.Food_ReturnButton)
    AutoLinearLayout FoodReturnButton;
    @BindView(R.id.Food_ShareButton)
    AutoLinearLayout FoodShareButton;
    @BindView(R.id.Food_RestaurantNameText)
    TextView FoodRestaurantNameText;
    @BindView(R.id.Food_FoodIamge)
    ImageView FoodFoodIamge;
    @BindView(R.id.Food_FoodNameText)
    TextView FoodFoodNameText;
    @BindView(R.id.Food_FoodDetails)
    TextView FoodFoodDetails;
    @BindView(R.id.FoodCommentNumber)
    TextView FoodCommentNumber;
    @BindView(R.id.FoodCommentRecycler)
    RecyclerView FoodCommentRecycler;
    @BindView(R.id.FoodCommentButton)
    AutoLinearLayout FoodCommentButton;
    @BindView(R.id.Food_BuyButton)
    TextView FoodBuyButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_food;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        String RestaurantName = (String) SPUtils.get(FoodActivity.this, SPKey.RESTAURANT_NAME, "");
        int FoodId = (int) SPUtils.get(FoodActivity.this, SPKey.FOOD_ID, 0);
        presenter.getFoodDetalisBean(FoodId + "");
        FoodRestaurantNameText.setText(RestaurantName);
    }

    @Override
    public void showRestaurantDetalisBean(FoodDetalisBean foodDetalisBean) {
        if (foodDetalisBean.getData() != null) {
            FoodDetalisBean.DataBean.FoodBean food = foodDetalisBean.getData().getFood();
            Glide.with(this).load(food.getImgUrl()).error(R.mipmap.icon).into(FoodFoodIamge);
            FoodFoodNameText.setText(food.getFoodName());
            RichText
                    .from(food.getFoodDetail()) // 数据源
                    .autoFix(true) // 是否自动修复，默认true
                    .autoPlay(true) // gif图片是否自动播放
                    .showBorder(true) // 是否显示图片边框
                    .borderColor(Color.RED) // 图片边框颜色
                    .borderSize(10) // 边框尺寸
                    .borderRadius(50) // 图片边框圆角弧度
                    .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高

                    .resetSize(false)
                    .bind(this)
                    .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                    .into(FoodFoodDetails); // 设置目标TextView
            FoodCommentNumber.setText(food.getCommentList().size() + "");
        }
    }

    @Override
    public void showError(String string) {

    }


    @OnClick({R.id.Food_ReturnButton, R.id.Food_ShareButton, R.id.FoodCommentButton, R.id.Food_BuyButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Food_ReturnButton:
                finish();
                break;
            case R.id.Food_ShareButton:
                break;
            case R.id.FoodCommentButton:
                break;
            case R.id.Food_BuyButton:
                break;
        }
    }



}
