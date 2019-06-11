package com.sugang.wenlvhui.view.space;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.space.SpacePageContract;
import com.sugang.wenlvhui.model.bean.space.SpaceBean;
import com.sugang.wenlvhui.model.bean.space.SpacePageBean;
import com.sugang.wenlvhui.presenter.space.SpacePagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.adaptr.SpacePageAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class SpaceFragment extends BaseFragment<SpacePagePresenterImp> implements SpacePageContract.SpacePageView {

    @BindView(R.id.Space_FenLeiShaiXuanButton)
    AutoLinearLayout SpaceFenLeiShaiXuanButton;
    @BindView(R.id.Space_DiTuFenBuButton)
    AutoLinearLayout SpaceDiTuFenBuButton;
    @BindView(R.id.Space_Recycler)
    RecyclerView SpaceRecycler;
    @BindView(R.id.SpaceRefreshLayout)
    SmartRefreshLayout SpaceRefreshLayout;
    int page = 1;
    private List<SpaceBean> space_list = new ArrayList<>();
    private SpacePageAdapter spacePageAdapter;

    public SpaceFragment() {
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_space;
    }

    @Override
    protected void init() {

        SpaceRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        spacePageAdapter = new SpacePageAdapter(space_list);
        SpaceRecycler.setAdapter(spacePageAdapter);
        spacePageAdapter.setRecyclerViewOnCLickListener(new SpacePageAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(getActivity(), SPKey.SPACEID,space_list.get(position).getId());
                SPUtils.put(getActivity(), SPKey.SPACEAddress,space_list.get(position).getAddr());
                SPUtils.put(getActivity(), SPKey.SPACEImage,space_list.get(position).getBackupField1());
                SPUtils.put(getActivity(), SPKey.SPACEFImage,space_list.get(position).getBackImg());
                SPUtils.put(getActivity(), SPKey.SPACEDate,space_list.get(position).getCreateDate());
                SPUtils.put(getActivity(), SPKey.SPACEName,space_list.get(position).getSpaceName());
                startActivity(new Intent(getActivity(), SpaceDetalisActivity.class));
            }
        });
        SpaceRefreshLayout.setEnableRefresh(false);
        SpaceRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                page++;
                presenter.getSpacePageBean(page+"");
            }
        });
    }

    @Override
    protected void loadDate() {
        presenter.getSpacePageBean(page + "");
    }

    @OnClick({R.id.Space_FenLeiShaiXuanButton, R.id.Space_DiTuFenBuButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Space_FenLeiShaiXuanButton:

                break;
            case R.id.Space_DiTuFenBuButton:
                startActivity(new Intent(getActivity(), Space_MapActivity.class));
                break;
        }
    }


    @Override
    public void showSpacePageBean(SpacePageBean activityPageBean) {
        if (activityPageBean.getData() != null) {
            space_list.addAll(activityPageBean.getData().getSpace_list());
            spacePageAdapter.notifyDataSetChanged();
            SpaceRefreshLayout.finishLoadMore();
        }

    }

    @Override
    public void showError(String string) {

    }
}
