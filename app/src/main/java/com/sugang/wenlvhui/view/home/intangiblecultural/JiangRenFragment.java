package com.sugang.wenlvhui.view.home.intangiblecultural;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.contract.home.wcfy.JiangRenPageContract;
import com.sugang.wenlvhui.model.bean.home.wcfy.JiangRenPageBean;
import com.sugang.wenlvhui.presenter.home.wcfy.JiangRenPagePresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.JaingRenRecyAdapter;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class JiangRenFragment extends BaseFragment<JiangRenPagePresenterImp> implements JiangRenPageContract.JiangRenPageView {


    @BindView(R.id.JaingRen_SerchEd)
    TextView JaingRenSerchEd;
    @BindView(R.id.JaingRen_Recy)
    RecyclerView JaingRenRecy;


    public JiangRenFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_jiang_ren;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        Integer userId = (Integer) SPUtils.get(getActivity(), SPKey.USER_ID, 0);
        presenter.getJiangRenPageBean(userId+"");
    }

    @Override
    public void showJiangRenPageBean(final JiangRenPageBean jiangRenPageBean) {
        if (jiangRenPageBean.getData()!=null) {
            JaingRenRecy.setLayoutManager(new LinearLayoutManager(getActivity()));
            JaingRenRecyAdapter jaingRenRecyAdapter = new JaingRenRecyAdapter(jiangRenPageBean.getData().getShops());
            jaingRenRecyAdapter.setRecyclerViewOnCLickListener(new JaingRenRecyAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(getActivity(), SPKey.SHOP_ID,jiangRenPageBean.getData().getShops().get(position).getId());
                    startActivity(new Intent(getActivity(),JaingRenDetalisActivity.class));
                }
            });
            JaingRenRecy.setAdapter(jaingRenRecyAdapter);
        }
    }

    @Override
    public void showError(String string) {

    }

    @OnClick(R.id.JaingRen_SerchEd)
    public void onViewClicked() {
    }
}
