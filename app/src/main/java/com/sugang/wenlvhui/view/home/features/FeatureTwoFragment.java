package com.sugang.wenlvhui.view.home.features;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.view.home.culturaltravel.CulturalTravelPolicyActivity;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.CulturalTravelCustomizationActivity;
import com.sugang.wenlvhui.view.home.literarybrigadelist.LiteraryBrigadeListActivity;
import com.sugang.wenlvhui.view.home.literarytraining.LiteraryTrainingActivity;
import com.sugang.wenlvhui.view.home.prefebook.RecommendedBooksActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeatureTwoFragment extends BaseFragment {

    //文旅榜单
    @BindView(R.id.Featrue_LiteraryBrigadeListButton)
    AutoLinearLayout FeatrueLiteraryBrigadeListButton;
    //文旅定制
    @BindView(R.id.Featrue_CulturalTravelCustomizationButton)
    AutoLinearLayout FeatrueCulturalTravelCustomizationButton;
    //文旅政策
    @BindView(R.id.Featrue_CulturalTravelPolicyButton)
    AutoLinearLayout FeatrueCulturalTravelPolicyButton;
    //好书推荐
    @BindView(R.id.Featrue_RecommendedBooksButton)
    AutoLinearLayout FeatrueRecommendedBooksButton;


    public FeatureTwoFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_feature_two;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.Featrue_LiteraryBrigadeListButton, R.id.Featrue_CulturalTravelCustomizationButton, R.id.Featrue_CulturalTravelPolicyButton, R.id.Featrue_RecommendedBooksButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //文旅榜单
            case R.id.Featrue_LiteraryBrigadeListButton:
                this.startActivity(new Intent(getActivity(), LiteraryBrigadeListActivity.class));
                break;
            //文旅定制
            case R.id.Featrue_CulturalTravelCustomizationButton:
                this.startActivity(new Intent(getActivity(), CulturalTravelCustomizationActivity.class));
                break;
            //文旅政策
            case R.id.Featrue_CulturalTravelPolicyButton:
                this.startActivity(new Intent(getActivity(), CulturalTravelPolicyActivity.class));
                break;
            //好书推荐
            case R.id.Featrue_RecommendedBooksButton:
                this.startActivity(new Intent(getActivity(), RecommendedBooksActivity.class));
                break;
        }
    }
}
