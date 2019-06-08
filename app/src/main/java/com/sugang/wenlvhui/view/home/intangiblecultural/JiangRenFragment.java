package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.home.wcfy.JiangRenPageContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.model.bean.home.wcfy.ShopsBean;
import com.sugang.wenlvhui.presenter.home.wcfy.JiangRenPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.JaingRenRecyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class JiangRenFragment extends BaseFragment<JiangRenPagePresenterImp> implements JiangRenPageContract.JiangRenPageView {


    @BindView(R.id.JaingRen_SerchEd)
    TextView JaingRenSerchEd;
    @BindView(R.id.JaingRen_Recy)
    RecyclerView JaingRenRecy;
    @BindView(R.id.JaingRen_RefreshLayout)
    SmartRefreshLayout JaingRenRefreshLayout;
    Unbinder unbinder;
    private List<ShopsBean> shops = new ArrayList<>();
    private JaingRenRecyAdapter jaingRenRecyAdapter;
    int page = 1;
    private Integer userId;


    public JiangRenFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_jiang_ren;
    }

    @Override
    protected void init() {
        JaingRenRecy.setLayoutManager(new LinearLayoutManager(getActivity()));
        jaingRenRecyAdapter = new JaingRenRecyAdapter(shops);
        jaingRenRecyAdapter.setRecyclerViewOnCLickListener(new JaingRenRecyAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(getActivity(), SPKey.SHOP_ID, shops.get(position).getId());
                startActivity(new Intent(getActivity(), JaingRenDetalisActivity.class));
                SPUtils.put(getActivity(),SPKey.SHOP_DETAILS,shops.get(position).getShopsDetail());
            }
        });
        JaingRenRecy.setAdapter(jaingRenRecyAdapter);
        JaingRenRefreshLayout.setEnableRefresh(false);
        JaingRenRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshLayout) {
                page++;
                presenter.getJiangRenPageBean(userId + "",page+"");

            }
        });
    }

    @Override
    protected void loadDate() {
        userId = (Integer) SPUtils.get(getActivity(), SPKey.USER_ID, 0);
        presenter.getJiangRenPageBean(userId + "", "1");
    }

    @Override
    public void showJiangRenPageBean(final JiangRenPageBean jiangRenPageBean) {
        if (jiangRenPageBean.getData() != null) {
            shops.addAll(jiangRenPageBean.getData().getShops()) ;
            jaingRenRecyAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showError(String string) {

    }

    @OnClick(R.id.JaingRen_SerchEd)
    public void onViewClicked() {
        startActivity(new Intent(getActivity(), JiangrenSerchActivity.class));
    }


}
