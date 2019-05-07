package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzcXmggListContract;
import com.sugang.wenlvhui.contract.home.wlze.WlzePageContract;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.WlzcXmggListBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcXmggListPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class XiangmugonggaoListActivity extends BaseActivity<WlzcXmggListPresenterImp> implements WlzcXmggListContract.WlzcXmggListView {


    @BindView(R.id.XiangmugonggaoList_ReturnButton)
    AutoLinearLayout XiangmugonggaoListReturnButton;
    @BindView(R.id.XiangmugonggaoList_Recycler)
    RecyclerView XiangmugonggaoListRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_xiangmugonggao_list;
    }

    @Override
    protected void init() {


    }

    @Override
    protected void loadDate() {
        presenter.getWlzcXmggListBeanData("1","3");
    }

   

    @OnClick(R.id.XiangmugonggaoList_ReturnButton)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void showWlzcXmggListBean(WlzcXmggListBean wlzcXmggListBean) {
        if (wlzcXmggListBean.getData()!=null) {
            final List<NewsBean> all_text = wlzcXmggListBean.getData().getAll_text();
            XiangmugonggaoListRecycler.setLayoutManager(new LinearLayoutManager(this));
            CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter adapter = new CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter(all_text);
            XiangmugonggaoListRecycler.setAdapter(adapter);

            adapter.setRecyclerViewOnCLickListener(new CulturalTravelPolicyXiangMuGongGaoRecyclerAdapter.RecyclerViewOnCLickListener() {
                @Override
                public void myClick(View view, int position) {
                    SPUtils.put(XiangmugonggaoListActivity.this, SPKey.NEWS_ID,all_text.get(position).getId());
                    startActivity(new Intent(XiangmugonggaoListActivity.this,NewsDetailsActivity.class));
                }
            });
        }

    }

    @Override
    public void showError(String string) {

    }
}
