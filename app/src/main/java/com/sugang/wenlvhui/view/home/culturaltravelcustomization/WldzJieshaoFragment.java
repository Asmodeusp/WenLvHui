package com.sugang.wenlvhui.view.home.culturaltravelcustomization;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseFragment;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class WldzJieshaoFragment extends BaseFragment {


    @BindView(R.id.WldzJieshaoJieShaoText)
    TextView WldzJieshaoJieShaoText;
    @BindView(R.id.WldzJieshaoJInliText)
    TextView WldzJieshaoJInliText;


    public WldzJieshaoFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wldz_jieshao;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        String WLDZ_YIRENDETAILS = (String) SPUtils.get(getActivity(), SPKey.WLDZ_YIRENDETAILS, "");
        String WLDZ_YIRENEXPERIENCE = (String) SPUtils.get(getActivity(), SPKey.WLDZ_YIRENEXPERIENCE, "");
        RichText
                .from(WLDZ_YIRENDETAILS) // 数据源
                .autoFix(true) // 是否自动修复，默认true
                .autoPlay(true) // gif图片是否自动播放
                .showBorder(true) // 是否显示图片边框
                .borderColor(Color.RED) // 图片边框颜色
                .borderSize(10) // 边框尺寸
                .borderRadius(50) // 图片边框圆角弧度
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                .noImage(true) // 不显示并且不加载图片
                .resetSize(false)
                .bind(getActivity())
                .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                .into(WldzJieshaoJieShaoText); // 设置目标TextView
        RichText
                .from(WLDZ_YIRENEXPERIENCE) // 数据源
                .autoFix(true) // 是否自动修复，默认true
                .autoPlay(true) // gif图片是否自动播放
                .showBorder(true) // 是否显示图片边框
                .borderColor(Color.RED) // 图片边框颜色
                .borderSize(10) // 边框尺寸
                .borderRadius(50) // 图片边框圆角弧度
                .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                .noImage(true) // 不显示并且不加载图片
                .resetSize(false)
                .bind(getActivity())
                .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                .into(WldzJieshaoJInliText); // 设置目标TextView
    }

}
