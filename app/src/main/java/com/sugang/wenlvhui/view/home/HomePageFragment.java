package com.sugang.wenlvhui.view.home;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.recker.flybanner.FlyBanner;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.home.HomePageContracr;
import com.sugang.wenlvhui.model.bean.home.HomePageBean;
import com.sugang.wenlvhui.presenter.home.HomePagePresenterImp;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.activity.ActivityDetalisActivity;
import com.sugang.wenlvhui.view.activity.ActivityListActivity;
import com.sugang.wenlvhui.view.home.adapter.HomeVPAdapter;
import com.sugang.wenlvhui.view.home.culturaltravel.NewsDetailsActivity;
import com.sugang.wenlvhui.view.home.culturaltravel.XiangmugonggaoListActivity;
import com.sugang.wenlvhui.view.home.features.FeatureOneFragment;
import com.sugang.wenlvhui.view.home.features.FeatureTwoFragment;
import com.sugang.wenlvhui.view.home.intangiblecultural.ShouyiDetailActivity;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.zhy.autolayout.AutoLinearLayout;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends BaseFragment<HomePagePresenterImp> implements HomePageContracr.HomePageView {


    @BindView(R.id.HomePager_Banner)
    FlyBanner HomePagerBanner;
    @BindView(R.id.HomePager_ViewPager)
    ViewPager HomePagerViewPager;
    ArrayList<Fragment> fragments = new ArrayList<>();
    @BindView(R.id.Featrue_One)
    View FeatrueOne;
    @BindView(R.id.Featrue_Two)
    View FeatrueTwo;
//    @BindView(R.id.YouHui_Image)
//    ImageView YouHuiImage;
//    @BindView(R.id.HomePager_YouHuijuanButton)
//    AutoLinearLayout HomePagerYouHuijuanButton;
//    @BindView(R.id.HomePager_WeiJiangxinButton)
//    AutoLinearLayout HomePagerWeiJiangxinButton;
//    @BindView(R.id.HomePager_GeiShiGuangButton)
//    AutoLinearLayout HomePagerGeiShiGuangButton;
//    @BindView(R.id.HomePager_WeiJiangxinImage)
//    ImageView HomePagerWeiJiangxinImage;
//    @BindView(R.id.HomePager_GeiShiGuangImage)
    ImageView HomePagerGeiShiGuangImage;
    @BindView(R.id.HomePager_ZuiXinHuoDongMoreButton)
    AutoLinearLayout HomePagerZuiXinHuoDongMoreButton;
    @BindView(R.id.HomePager_ZuiXinHuoDongImage)
    ImageView HomePagerZuiXinHuoDongImage;
    @BindView(R.id.HomePager_ZuiXinZiXunMoreButton)
    AutoLinearLayout HomePagerZuiXinZiXunMoreButton;
    @BindView(R.id.HomePager_ZhengCeTitleText)
    TextView HomePagerZhengCeTitleText;
    @BindView(R.id.HomePager_ZhengCeTimeText)
    TextView HomePagerZhengCeTimeText;
    @BindView(R.id.HomePager_ZhengCeAuthorText)
    TextView HomePagerZhengCeAuthorText;
    @BindView(R.id.HomePager_ZhengCeBrowseVolumeText)
    TextView HomePagerZhengCeBrowseVolumeText;
    @BindView(R.id.HomePager_ZhengCeDescribeText)
    TextView HomePagerZhengCeDescribeText;
    @BindView(R.id.HomePager_ZhengCeImage)
    ImageView HomePagerZhengCeImage;
    Unbinder unbinder;
    private int youHuiid;
    private int weiJiangxinid;
    private int geiShiGuangid;
    private int policyid;
    private int wenlvid;


    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_page;


    }

    @Override
    protected void init() {
        FeatureOneFragment featureOneFragment = new FeatureOneFragment();
        FeatureTwoFragment featureTwoFragment = new FeatureTwoFragment();
        fragments.add(featureOneFragment);
        fragments.add(featureTwoFragment);
        HomeVPAdapter homeVPAdapter = new HomeVPAdapter(getActivity().getSupportFragmentManager(), fragments);
        HomePagerViewPager.setAdapter(homeVPAdapter);
        HomePagerViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    FeatrueOne.setBackgroundColor(getResources().getColor(R.color.H2));
                    FeatrueTwo.setBackgroundColor(getResources().getColor(R.color.H7));
                } else {
                    FeatrueOne.setBackgroundColor(getResources().getColor(R.color.H7));
                    FeatrueTwo.setBackgroundColor(getResources().getColor(R.color.H2));
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @Override
    protected void loadDate() {
        presenter.getHomePageBeanData();
    }

    @OnClick({ R.id.HomePager_ZuiXinHuoDongMoreButton, R.id.HomePager_ZuiXinHuoDongImage, R.id.HomePager_ZuiXinZiXunMoreButton, R.id.HomePager_ZhengCeImage})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.HomePager_ZuiXinHuoDongMoreButton:
                SPUtils.put(getActivity(), SPKey.ACTIVITYTYPE, "演出");
                startActivity(new Intent(getActivity(), ActivityListActivity.class));
                break;
            case R.id.HomePager_ZuiXinHuoDongImage:
                SPUtils.put(getActivity(), SPKey.ACTIVITYID, policyid);
                startActivity(new Intent(getActivity(), ActivityDetalisActivity.class));
                break;
            case R.id.HomePager_ZuiXinZiXunMoreButton:
                break;
            case R.id.HomePager_ZhengCeImage:
                SPUtils.put(getActivity(), SPKey.NEWS_ID, wenlvid);
                startActivity(new Intent(getActivity(), NewsDetailsActivity.class));
                break;
        }
    }

    @Override
    public void showHomePageBean(HomePageBean HomePageBean) {
        if (HomePageBean.getData() != null) {
            final HomePageBean.DataBean data = HomePageBean.getData();
            ArrayList<String> urls = new ArrayList<>();
            urls.add(data.getPolicy().getImage());
            for (HomePageBean.DataBean.ProductBean productBean : data.getProduct()) {
                urls.add(productBean.getProductImage());
            }
            HomePagerBanner.setImagesUrl(urls);
            HomePagerBanner.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    if (position == 0) {
                        SPUtils.put(getActivity(), SPKey.ACTIVITYID, data.getPolicy().getId());
                        startActivity(new Intent(getActivity(), ActivityDetalisActivity.class));
                    } else {
                        SPUtils.put(getActivity(), SPKey.PRODUCT_ID, data.getProduct().get(position - 1).getId());
                        startActivity(new Intent(getActivity(), ShouyiDetailActivity.class));
                    }
                }
            });


//            Glide.with(getActivity()).load(data.getProduct().get(2).getProductImage()).into(HomePagerGeiShiGuangImage);

            Glide.with(getActivity()).load(data.getPolicy().getImage()).into(HomePagerZuiXinHuoDongImage);

            HomePagerZhengCeTitleText.setText(data.getWnelv().getTitle());
            HomePagerZhengCeTimeText.setText(TimeUtils.getBirthdatyData(data.getWnelv().getCreateDate()));
            HomePagerZhengCeAuthorText.setText(data.getWnelv().getStatus());
            HomePagerZhengCeBrowseVolumeText.setText("浏览量 ：" + data.getWnelv().getBrowse());
            RichText
                    .from(data.getWnelv().getCotent()) //数据源
                    .autoFix(true) //是否自动修复，默认true
                    .autoPlay(true) //gif图片是否自动播放
                    .showBorder(true) //是否显示图片边框
                    .borderColor(Color.RED) //图片边框颜色
                    .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) //图片占位区域的宽高
                    .resetSize(false)
                    .bind(this)
                    .clickable(true) //是否可点击,默认只有设置了点击监听才可点击
                    .into(HomePagerZhengCeDescribeText); //设置目标TextView
            wenlvid = data.getWnelv().getId();
            Glide.with(getActivity()).load(data.getWnelv().getImage()).into(HomePagerZhengCeImage);
        }
    }

    @Override
    public void showError(String string) {

    }
}
