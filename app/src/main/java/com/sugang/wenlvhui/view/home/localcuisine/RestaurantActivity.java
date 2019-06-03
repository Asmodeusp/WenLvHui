package com.sugang.wenlvhui.view.home.localcuisine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.dfms.RestaurantDetalisContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.dfms.RestaurantDetalisBean;
import com.sugang.wenlvhui.presenter.home.dfms.RestaurantDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.RestaurantDetalisAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RestaurantActivity extends BaseActivity<RestaurantDetalisPresenterImp> implements RestaurantDetalisContract.RestaurantDetalisView {


    @BindView(R.id.Restaurant_ReturnButton)
    AutoLinearLayout RestaurantReturnButton;
    @BindView(R.id.Restaurant_BackgroundImage)
    ImageView RestaurantBackgroundImage;
    @BindView(R.id.Restaurant_HeadImage)
    ImageView RestaurantHeadImage;
    @BindView(R.id.Restaurant_RestaurantName)
    TextView RestaurantRestaurantName;
    @BindView(R.id.Restaurant_RestaurantpinjunParice)
    TextView RestaurantRestaurantpinjunParice;
    @BindView(R.id.Restaurant_RestaurantIsLikeImage)
    ImageView RestaurantRestaurantIsLikeImage;
    @BindView(R.id.Restaurant_RestaurantIsLikeText)
    TextView RestaurantRestaurantIsLikeText;
    @BindView(R.id.Restaurant_RestaurantIsLikeButton)
    AutoLinearLayout RestaurantRestaurantIsLikeButton;
    @BindView(R.id.Restaurant_RestaurantAdressText)
    TextView RestaurantRestaurantAdressText;
    @BindView(R.id.Restaurant_BuDeBuChiRecycler)
    RecyclerView RestaurantBuDeBuChiRecycler;
    @BindView(R.id.Restaurant_BuRongCuoGuoRecycler)
    RecyclerView RestaurantBuRongCuoGuoRecycler;
    ArrayList<RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean> BuDeBuChi = new ArrayList<>();
    ArrayList<RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean> BuRongCuoGuo = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_restaurant;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int RestaurantId = (int) SPUtils.get(this, SPKey.RESTAURANT_ID, 0);
        presenter.getRestaurantDetalisBean(RestaurantId + "");
    }

    @Override
    public void showRestaurantDetalisBean(RestaurantDetalisBean restaurantDetalisBean) {
        if (restaurantDetalisBean.getData() != null) {
            final RestaurantDetalisBean.DataBean.RestaurantBean restaurant = restaurantDetalisBean.getData().getRestaurant();
            Glide.with(this).load(restaurant.getRestaurantBackimage()).error(R.mipmap.icon).into(RestaurantBackgroundImage);
            Glide.with(this).load(restaurant.getRestaurantImg()).error(R.mipmap.icon).into(RestaurantHeadImage);
            RestaurantRestaurantName.setText(restaurant.getRestaurantName());
            RestaurantRestaurantpinjunParice.setText(restaurant.getAverageConsumption() + "/人");
            RestaurantRestaurantAdressText.setText(restaurant.getAddrDetail());
            for (RestaurantDetalisBean.DataBean.RestaurantBean.FoodListBean foodListBean : restaurant.getFoodList()) {
                if (foodListBean.getFoodType() == 1) {
                    BuDeBuChi.add(foodListBean);
                } else {
                    BuRongCuoGuo.add(foodListBean);
                }
            }
            RestaurantDetalisAdapter BuRongCuoGuoChirestaurantDetalisAdapter = new RestaurantDetalisAdapter(BuRongCuoGuo);
            RestaurantDetalisAdapter BuDeBuChirestaurantDetalisAdapter = new RestaurantDetalisAdapter(BuDeBuChi);
            RestaurantBuDeBuChiRecycler.setLayoutManager(new GridLayoutManager(this,2));
            RestaurantBuRongCuoGuoRecycler.setLayoutManager(new GridLayoutManager(this,2));
            RestaurantBuDeBuChiRecycler.setAdapter(BuDeBuChirestaurantDetalisAdapter);
            RestaurantBuRongCuoGuoRecycler.setAdapter(BuRongCuoGuoChirestaurantDetalisAdapter);
            BuDeBuChirestaurantDetalisAdapter.setRecyclerViewOnCLickListener(new RestaurantDetalisAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(RestaurantActivity.this,SPKey.RESTAURANT_NAME,restaurant.getRestaurantName());
                    SPUtils.put(RestaurantActivity.this,SPKey.FOOD_ID,BuDeBuChi.get(position).getId());
                    startActivity(new Intent(RestaurantActivity.this,FoodActivity.class));
                }
            });
            BuRongCuoGuoChirestaurantDetalisAdapter.setRecyclerViewOnCLickListener(new RestaurantDetalisAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(RestaurantActivity.this,SPKey.FOOD_ID,BuRongCuoGuo.get(position).getId());
                    SPUtils.put(RestaurantActivity.this,SPKey.RESTAURANT_NAME,restaurant.getRestaurantName());
                    startActivity(new Intent(RestaurantActivity.this,FoodActivity.class));
                }
            });
        }

    }

    @Override
    public void showError(String string) {

    }

    @Override
    public void ShowiSlike(IsLikeBean isLikeBean) {

    }


    @OnClick({R.id.Restaurant_ReturnButton, R.id.Restaurant_RestaurantIsLikeButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Restaurant_ReturnButton:
                finish();
                break;
            case R.id.Restaurant_RestaurantIsLikeButton:


                break;
        }
    }
}
