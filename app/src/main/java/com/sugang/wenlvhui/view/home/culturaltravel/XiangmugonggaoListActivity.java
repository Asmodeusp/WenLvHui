package com.sugang.wenlvhui.view.home.culturaltravel;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class XiangmugonggaoListActivity extends BaseActivity {


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

    }

   

    @OnClick(R.id.XiangmugonggaoList_ReturnButton)
    public void onViewClicked() {
        finish();
    }
}
