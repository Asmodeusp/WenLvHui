package com.sugang.wenlvhui.view.myself;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyCollectionActivity extends BaseActivity {


    @BindView(R.id.MyCollection_ReturnButton)
    AutoLinearLayout MyCollectionReturnButton;
    @BindView(R.id.MyCollection_WLZCButton)
    AutoLinearLayout MyCollectionWLZCButton;
    @BindView(R.id.MyCollection_HSTJButton)
    AutoLinearLayout MyCollectionHSTJButton;
    @BindView(R.id.MyCollection_WYPXButton)
    AutoLinearLayout MyCollectionWYPXButton;
    @BindView(R.id.MyCollection_WCTPButton)
    AutoLinearLayout MyCollectionWCTPButton;
    @BindView(R.id.MyCollection_FYJRButton)
    AutoLinearLayout MyCollectionFYJRButton;
    @BindView(R.id.MyCollection_DFMSButton)
    AutoLinearLayout MyCollectionDFMSButton;
    @BindView(R.id.MyCollection_WLYJButton)
    AutoLinearLayout MyCollectionWLYJButton;
    @BindView(R.id.MyCollection_WDHDButton)
    AutoLinearLayout MyCollectionWDHDButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_collection;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {

    }



    @OnClick({R.id.MyCollection_ReturnButton, R.id.MyCollection_WLZCButton, R.id.MyCollection_HSTJButton, R.id.MyCollection_WYPXButton, R.id.MyCollection_WCTPButton, R.id.MyCollection_FYJRButton, R.id.MyCollection_DFMSButton, R.id.MyCollection_WLYJButton, R.id.MyCollection_WDHDButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.MyCollection_ReturnButton:
                finish();
                break;
            case R.id.MyCollection_WLZCButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"文旅政策");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_HSTJButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"好书推荐");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_WYPXButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"文艺培训");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_WCTPButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"文艺淘品");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_FYJRButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"非遗匠人");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_DFMSButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"地方美食");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_WLYJButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"文旅游记");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
            case R.id.MyCollection_WDHDButton:
                SPUtils.put(this, SPKey.COLLECTION_TYPE,"我的活动");
                startActivity(new Intent(this,MyCollectionListActivity.class));
                break;
        }
    }
}
