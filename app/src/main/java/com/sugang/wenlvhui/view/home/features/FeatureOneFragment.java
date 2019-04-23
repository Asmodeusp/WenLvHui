package com.sugang.wenlvhui.view.home.features;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.view.home.intangiblecultural.IntangibleCulturalHeritageActivity;
import com.sugang.wenlvhui.view.home.literarytraining.LiteraryTrainingActivity;
import com.sugang.wenlvhui.view.home.localcuisine.LocalcuisineActivity;
import com.sugang.wenlvhui.view.home.travelroute.TravelRouteActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeatureOneFragment extends BaseFragment {

    //文艺培训
    @BindView(R.id.Featrue_LiteraryTrainingButton)
    AutoLinearLayout FeatrueLiteraryTrainingButton;
    //非遗文创
    @BindView(R.id.Featrue_IntangibleCulturalHeritageButton)
    AutoLinearLayout FeatrueIntangibleCulturalHeritageButton;
    //地方美食
    @BindView(R.id.Featrue_LocalcuisineButton)
    AutoLinearLayout FeatrueLocalcuisineButton;
    //文旅路线
    @BindView(R.id.Featrue_TravelRouteButton)
    AutoLinearLayout FeatrueTravelRouteButton;


    public FeatureOneFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_feature_one;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.Featrue_LiteraryTrainingButton, R.id.Featrue_IntangibleCulturalHeritageButton, R.id.Featrue_LocalcuisineButton, R.id.Featrue_TravelRouteButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //文艺培训
            case R.id.Featrue_LiteraryTrainingButton:
                this.startActivity(new Intent(getActivity(), LiteraryTrainingActivity.class));
                break;
            //非遗文创
            case R.id.Featrue_IntangibleCulturalHeritageButton:
                this.startActivity(new Intent(getActivity(),IntangibleCulturalHeritageActivity.class));
                break;
            //地方美食
            case R.id.Featrue_LocalcuisineButton:
                this.startActivity(new Intent(getActivity(), LocalcuisineActivity.class));
                break;
            case R.id.Featrue_TravelRouteButton:
                //文旅路线
                this.startActivity(new Intent(getActivity(), TravelRouteActivity.class));
                break;
        }
    }
}
