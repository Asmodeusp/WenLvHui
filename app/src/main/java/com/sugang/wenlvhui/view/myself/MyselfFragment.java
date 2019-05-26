package com.sugang.wenlvhui.view.myself;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sugang.wenlvhui.App;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.MainActivity;
import com.sugang.wenlvhui.view.login.LoginActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyselfFragment extends BaseFragment {


    @BindView(R.id.Myself_UserNameText)
    TextView MyselfUserNameText;
    @BindView(R.id.Myself_UserHeandImage)
    ImageView MyselfUserHeandImage;
    @BindView(R.id.Myself_CollectionButton)
    AutoLinearLayout MyselfCollectionButton;
    @BindView(R.id.Myself_CardCouponButton)
    AutoLinearLayout MyselfCardCouponButton;
    @BindView(R.id.Myself_SettingButton)
    AutoLinearLayout MyselfSettingButton;
    @BindView(R.id.Myself_AllOrderText)
    TextView MyselfAllOrderText;
    @BindView(R.id.Myself_AllOrderButton)
    AutoRelativeLayout MyselfAllOrderButton;
    @BindView(R.id.Myself_DaiFuKuanButton)
    AutoLinearLayout MyselfDaiFuKuanButton;
    @BindView(R.id.Myself_DaiFaHuoButton)
    AutoLinearLayout MyselfDaiFaHuoButton;
    @BindView(R.id.Myself_DaiShuoHuoButton)
    AutoLinearLayout MyselfDaiShuoHuoButton;
    @BindView(R.id.Myself_PingJiaButton)
    AutoLinearLayout MyselfPingJiaButton;
    @BindView(R.id.Myself_TuiKuanButton)
    AutoLinearLayout MyselfTuiKuanButton;
    @BindView(R.id.Myself_RenZhengCenterButton)
    AutoLinearLayout MyselfRenZhengCenterButton;
    @BindView(R.id.Myself_TouSuJianYiButton)
    AutoLinearLayout MyselfTouSuJianYiButton;
    @BindView(R.id.Myself_MesssageTongzhiButton)
    AutoLinearLayout MyselfMesssageTongzhiButton;
    @BindView(R.id.Myself_AddressSettingButton)
    AutoLinearLayout MyselfAddressSettingButton;
    @BindView(R.id.Myself_MySelfSettingButton)
    AutoLinearLayout MyselfMySelfSettingButton;


    public MyselfFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_myself;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }





    @OnClick({R.id.Myself_CollectionButton, R.id.Myself_CardCouponButton, R.id.Myself_SettingButton, R.id.Myself_AllOrderButton, R.id.Myself_DaiFuKuanButton, R.id.Myself_DaiFaHuoButton, R.id.Myself_DaiShuoHuoButton, R.id.Myself_PingJiaButton, R.id.Myself_TuiKuanButton, R.id.Myself_RenZhengCenterButton, R.id.Myself_TouSuJianYiButton, R.id.Myself_MesssageTongzhiButton, R.id.Myself_AddressSettingButton, R.id.Myself_MySelfSettingButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Myself_CollectionButton:
                startActivity(new Intent(getActivity(),MyCollectionActivity.class));
                break;
            case R.id.Myself_CardCouponButton:
//                Toast.makeText(getActivity(), "该功能未开放", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Myself_SettingButton:
                startActivity(new Intent(getActivity(),MyselfSettingActivity.class));
                break;
            case R.id.Myself_AllOrderButton:
                break;
            case R.id.Myself_DaiFuKuanButton:
                break;
            case R.id.Myself_DaiFaHuoButton:
                break;
            case R.id.Myself_DaiShuoHuoButton:
                break;
            case R.id.Myself_PingJiaButton:
                break;
            case R.id.Myself_TuiKuanButton:
                break;
            case R.id.Myself_RenZhengCenterButton:
                break;
            case R.id.Myself_TouSuJianYiButton:
                break;
            case R.id.Myself_MesssageTongzhiButton:
                break;
            case R.id.Myself_AddressSettingButton:
                break;
            case R.id.Myself_MySelfSettingButton:
                SPUtils.clear(App.context);
                startActivity(new Intent(App.context, LoginActivity.class));
                getActivity().finish();
                break;
        }
    }
}
