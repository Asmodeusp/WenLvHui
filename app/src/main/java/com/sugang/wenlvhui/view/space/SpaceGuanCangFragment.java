package com.sugang.wenlvhui.view.space;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.space.SpaceGuanCangContract;
import com.sugang.wenlvhui.model.bean.space.SpaceGuanCangBean;
import com.sugang.wenlvhui.presenter.space.SpaceGuanCangPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.adaptr.SpaceChangGuanAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpaceGuanCangFragment extends BaseFragment<SpaceGuanCangPresenterImp> implements SpaceGuanCangContract.SpaceGuanCangView {


    @BindView(R.id.SpaceGuanCangImage)
    ImageView SpaceGuanCangImage;
    @BindView(R.id.SpaceGuanCangNameText)
    TextView SpaceGuanCangNameText;
    @BindView(R.id.SpaceGuanCangAddressText)
    TextView SpaceGuanCangAddressText;
    @BindView(R.id.SpaceGuanCangMianJiText)
    TextView SpaceGuanCangMianJiText;
    @BindView(R.id.SpaceGuanCangDateText)
    TextView SpaceGuanCangDateText;
    @BindView(R.id.SpaceGuanCangPhoneText)
    TextView SpaceGuanCangPhoneText;
    @BindView(R.id.SpaceGuanCangRecycler)
    RecyclerView SpaceGuanCangRecycler;
    @BindView(R.id.SpaceGuanCangHuodongImage)
    ImageView SpaceGuanCangHuodongImage;
    @BindView(R.id.SpaceGuanCangDaoHangButton)
    TextView SpaceGuanCangDaoHangButton;


    public SpaceGuanCangFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_space_guan_cang;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int SpaceId = (int) SPUtils.get(getActivity(), SPKey.SPACEID, 0);
        presenter.getSpaceGuanCangBean(SpaceId + "");
    }

    @Override
    public void showSpaceGuanCangBean(SpaceGuanCangBean activityPageBean) {
        if (activityPageBean.getCode() != null) {
            final SpaceGuanCangBean.DataBean data = activityPageBean.getData();
            SpaceGuanCangNameText.setText(data.getGuancang().getSpaceName());
            SpaceGuanCangAddressText.setText(data.getGuancang().getAddr());
            SpaceGuanCangMianJiText.setText(data.getGuancang().getSpaceMeasure() + "");
            SpaceGuanCangDateText.setText(data.getGuancang().getOpenDate());
            SpaceGuanCangPhoneText.setText(data.getGuancang().getTel());
            SpaceGuanCangRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
            SpaceChangGuanAdapter spaceChangGuanAdapter = new SpaceChangGuanAdapter(data.getGuancang().getSpaceDetail());
            SpaceGuanCangRecycler.setAdapter(spaceChangGuanAdapter);
            spaceChangGuanAdapter.setRecyclerViewOnCLickListener(new SpaceChangGuanAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(getActivity(), SPKey.SPACECHANGGUANID, data.getGuancang().getSpaceDetail().get(position).getId());
                    startActivity(new Intent(getActivity(), SpaceChangguanActivity.class));
                }
            });
            Glide.with(this).load(data.getGuancang().getSpaceDetail().get(0).getImage()).error(R.mipmap.icon).into(SpaceGuanCangHuodongImage);
        }

    }

    @Override
    public void showError(String string) {

    }


    @OnClick(R.id.SpaceGuanCangDaoHangButton)
    public void onViewClicked() {
    }
}
