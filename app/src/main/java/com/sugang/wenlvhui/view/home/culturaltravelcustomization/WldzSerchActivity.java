package com.sugang.wenlvhui.view.home.culturaltravelcustomization;

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
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wldz.WldzSerchContract;
import com.sugang.wenlvhui.model.bean.home.wldz.ArtistsBean;
import com.sugang.wenlvhui.model.bean.home.wldz.WldzSerchBean;
import com.sugang.wenlvhui.presenter.home.wldz.WldzSerchPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.WldzArtistAdapter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WldzSerchActivity extends BaseActivity<WldzSerchPresenterImp> implements WldzSerchContract.WldzSerchView {


    @BindView(R.id.WldzSerch_ReturnButton)
    AutoLinearLayout WldzSerchReturnButton;
    @BindView(R.id.WldzSerch_WldzSerchButton)
    AutoLinearLayout WldzSerchWldzSerchButton;
    @BindView(R.id.WldzSerch_Edtext)
    EditText WldzSerchEdtext;
    @BindView(R.id.WldzSerch_SousuoRecycler)
    RecyclerView WldzSerchSousuoRecycler;
    @BindView(R.id.WldzSerch_SousuoRefreshLayout)
    SmartRefreshLayout WldzSerchSousuoRefreshLayout;
    private List<ArtistsBean> newsBeans =new ArrayList<>();
    private WldzArtistAdapter wlzc_zxdtRecyAdapter;
    int page =1;
    private String trim;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_wldz_serch;
    }

    @Override
    protected void init() {
        WldzSerchSousuoRefreshLayout.setEnableRefresh(false);

        WldzSerchSousuoRefreshLayout.finishRefresh();
        WldzSerchSousuoRecycler.setLayoutManager(new LinearLayoutManager(this));
        wlzc_zxdtRecyAdapter = new WldzArtistAdapter(newsBeans);
        WldzSerchSousuoRecycler.setAdapter(wlzc_zxdtRecyAdapter);
        wlzc_zxdtRecyAdapter.setRecyclerViewOnCLickListener(new WldzArtistAdapter.RecyclerViewOnCLickListener() {
            @Override
            public void myClick(View view, int position) {
                SPUtils.put(WldzSerchActivity.this, SPKey.WLDZ_YIRENTYPE,newsBeans.get(position).getId());
                startActivity(new Intent(WldzSerchActivity.this,WldzDetalisActivity.class));
            }
        });

        WldzSerchSousuoRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                page++;
                presenter.getWldzSerchBean( trim,page+"");
            }
        });
    }

    @Override
    protected void loadDate() {

    }


    @OnClick({R.id.WldzSerch_ReturnButton, R.id.WldzSerch_WldzSerchButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.WldzSerch_ReturnButton:
                finish();
                break;
            case R.id.WldzSerch_WldzSerchButton:
                trim = WldzSerchEdtext.getText().toString().trim();
                presenter.getWldzSerchBean( trim,page+"");
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                WldzSerchEdtext.setText("");
                break;
        }
    }


    @Override
    public void showWldzSerchBean(WldzSerchBean wllxDetalisBean) {
        newsBeans.addAll(wllxDetalisBean.getData().getArtists());
        wlzc_zxdtRecyAdapter .notifyDataSetChanged();
        WldzSerchSousuoRefreshLayout.finishLoadMore();


    }

    @Override
    public void showError(String string) {

    }
}
