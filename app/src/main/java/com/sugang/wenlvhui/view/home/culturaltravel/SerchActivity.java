package com.sugang.wenlvhui.view.home.culturaltravel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzcSerchContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wldz.ArtistsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewSerchBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsTBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzcSerchPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.WldzArtistAdapter;
import com.sugang.wenlvhui.view.home.adapter.WlzcXmggListAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zcjdListAdapter;
import com.sugang.wenlvhui.view.home.adapter.Wlzc_zxdtRecyAdapter;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.WldzDetalisActivity;
import com.sugang.wenlvhui.view.home.culturaltravelcustomization.WldzSerchActivity;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SerchActivity extends BaseActivity<WlzcSerchPresenterImp> implements WlzcSerchContract.WlzcSerchView {


    @BindView(R.id.Serch_ReturnButton)
    AutoLinearLayout SerchReturnButton;
    @BindView(R.id.Serch_SerchButton)
    AutoLinearLayout SerchSerchButton;
    @BindView(R.id.Serch_SousuoReciRecycler)
    RecyclerView SerchSousuoReciRecycler;
    @BindView(R.id.serch_Ed)
    EditText serchEd;
    @BindView(R.id.Serch_SousuoReciRefreshLayout)
    SmartRefreshLayout SerchSousuoReciRefreshLayout;
    private List<NewsTBean> newsBeans =new ArrayList<>();

    int page =1;
    private int userid;
    private String trim;
    private Wlzc_zcjdListAdapter wlzc_zxdtRecyAdapter1;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_serch;
    }

    @Override
    protected void init() {
        userid = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        SerchSousuoReciRefreshLayout.setEnableRefresh(false);
        SerchSousuoReciRecycler.setLayoutManager(new LinearLayoutManager(this));

        wlzc_zxdtRecyAdapter1 = new Wlzc_zcjdListAdapter(newsBeans,"s");
        SerchSousuoReciRecycler.setAdapter(wlzc_zxdtRecyAdapter1);
        wlzc_zxdtRecyAdapter1.setRecyclerViewOnCLickListener(new Wlzc_zcjdListAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(SerchActivity.this, SPKey.NEWS_TYPE,"搜索结果");
                SPUtils.put(SerchActivity.this, SPKey.NEWS_ID,newsBeans.get(position).getId());
                startActivity(new Intent(SerchActivity.this,NewsDetailsActivity.class));
            }
        });

        SerchSousuoReciRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                page++;
                presenter.getWlzcSerchBeanData(userid+"",trim,page+"","10");
            }
        });
    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.Serch_ReturnButton, R.id.Serch_SerchButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Serch_ReturnButton:
                finish();
                break;
            case R.id.Serch_SerchButton:
                trim = serchEd.getText().toString().trim();
                presenter.getWlzcSerchBeanData(userid+"",trim,page+"","10");
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                serchEd.setText("");
                break;
        }
    }

    @Override
    public void showWlzcSerchBean(NewSerchBean wlzcXmggListBean) {
        if (wlzcXmggListBean.getData()!=null) {
            newsBeans.addAll(wlzcXmggListBean.getData().getLists());
            wlzc_zxdtRecyAdapter1.notifyDataSetChanged();
        }


    }

    @Override
    public void showError(String string) {

    }

    @Override
    public void ShowiSlike(IsLikeBean isLikeBean) {

    }


   
}
