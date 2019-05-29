package com.sugang.wenlvhui.view.home.culturaltravel;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.wlze.WlzeDetalisContract;
import com.sugang.wenlvhui.model.bean.IsLikeBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsDetalisBean;
import com.sugang.wenlvhui.model.bean.home.wlze.NewsTBean;
import com.sugang.wenlvhui.presenter.home.wlzc.WlzeDetalisPresenterImp;
import com.sugang.wenlvhui.utils.TimeUtils;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.zhy.autolayout.AutoLinearLayout;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsDetailsActivity extends BaseActivity<WlzeDetalisPresenterImp> implements WlzeDetalisContract.WlzeDetalisView {

    @BindView(R.id.NewsDetailsReturnButton)
    AutoLinearLayout NewsDetailsReturnButton;
    @BindView(R.id.NewsDetailsShareButton)
    AutoLinearLayout NewsDetailsShareButton;
    @BindView(R.id.NewsDetailsText)
    TextView NewsDetailsText;
    @BindView(R.id.NewsDetails_TitleText)
    TextView NewsDetailsTitleText;
    @BindView(R.id.NewsDetails_DateText)
    TextView NewsDetailsDateText;
    @BindView(R.id.NewsDetailsStatusText)
    TextView NewsDetailsStatusText;
    @BindView(R.id.NewsDetailsFromText)
    TextView NewsDetailsFromText;
    @BindView(R.id.NewsDetailsContentText)
    TextView NewsDetailsContentText;
    @BindView(R.id.NewsDetailsIsLikeImage)
    ImageView NewsDetailsIsLikeImage;
    @BindView(R.id.NewsDetailsIsLikeNumText)
    TextView NewsDetailsIsLikeNumText;
    @BindView(R.id.NewsDetailsIsLikeButton)
    AutoLinearLayout NewsDetailsIsLikeButton;
    @BindView(R.id.NewsDetailsCommentImage)
    ImageView NewsDetailsCommentImage;
    @BindView(R.id.NewsDetailsCommentNumText)
    TextView NewsDetailsCommentNumText;
    @BindView(R.id.NewsDetailsCommentButton)
    AutoLinearLayout NewsDetailsCommentButton;
    @BindView(R.id.NewsDetailsSeeNumText)
    TextView NewsDetailsSeeNumText;
    boolean isLike;
    private int userId;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_news_details;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        userId = (int) SPUtils.get(this, SPKey.USER_ID, 0);
        int newsid = (int) SPUtils.get(this, SPKey.NEWS_ID, 0);
        String newsType = (String) SPUtils.get(this, SPKey.NEWS_TYPE, "");
        NewsDetailsText.setText(newsType);
        presenter.getNewsDetalisBeanData(userId +"",newsid+"");
    }


    @OnClick({R.id.NewsDetailsReturnButton, R.id.NewsDetailsShareButton, R.id.NewsDetailsCommentButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.NewsDetailsReturnButton:
                finish();
                break;
            case R.id.NewsDetailsShareButton:
                break;

            case R.id.NewsDetailsCommentButton:
                break;
        }
    }

    @Override
    public void showNewsDetalisBean(NewsDetalisBean wenlvzhengcebean) {
        if (wenlvzhengcebean.getData()!=null) {
            final NewsTBean newsBean = wenlvzhengcebean.getData().get(0);
            NewsDetailsTitleText.setText(newsBean.getTitle());
            NewsDetailsDateText.setText(TimeUtils.strToDateLong(newsBean.getCreate_date()));
            NewsDetailsStatusText.setText(newsBean.getStatus());
            if (newsBean.getSource()!=null) {
                NewsDetailsFromText.setText(newsBean.getSource());
            }
            RichText
                    .from(newsBean.getCotent()) // 数据源
                    .autoFix(true) // 是否自动修复，默认true
                    .autoPlay(true) // gif图片是否自动播放
                    .showBorder(true) // 是否显示图片边框
                    .borderColor(Color.RED) // 图片边框颜色
                    .borderSize(10) // 边框尺寸
                    .borderRadius(50) // 图片边框圆角弧度
                    .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                    .noImage(true) // 不显示并且不加载图片
                    .resetSize(false)
                    .bind(this)
                    .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                    .into(NewsDetailsContentText); // 设置目标TextView
            NewsDetailsIsLikeNumText.setText(newsBean.getLikes()+"");
            if (newsBean.getIslike() == 0) {
                isLike = false;
            } else {
                isLike = true;
            }
            //设置喜欢图片
            if (isLike) {
                NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan);
                //喜欢点击事件
                NewsDetailsIsLikeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isLike) {
                            NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan);
                           NewsDetailsIsLikeNumText.setText(newsBean.getLikes()+ "");

                            presenter.iSlike(userId + "", "2", newsBean.getId() + "");
                            isLike = false;
                        } else {
                            NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                           NewsDetailsIsLikeNumText.setText(newsBean.getLikes()-1 + "");

                            presenter.iSlike(userId + "", "2", newsBean.getId() + "");
                            isLike = true;
                        }

                    }
                });
            } else {
                NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                //喜欢点击事件
                NewsDetailsIsLikeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isLike) {
                            NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan_pass);
                           NewsDetailsIsLikeNumText.setText(newsBean.getLikes() + "");
                            presenter.iSlike(userId+"","2",newsBean.getId()+"");

                            isLike = false;
                        } else {
                            NewsDetailsIsLikeImage.setImageResource(R.mipmap.dianzan);
                           NewsDetailsIsLikeNumText.setText(newsBean.getLikes() +1+ "");

                            presenter.iSlike(userId+"","2",newsBean.getId()+"");
                            isLike = true;
                        }

                    }
                });
            }
            NewsDetailsSeeNumText.setText(newsBean.getBrowse()+"");
            NewsDetailsCommentNumText.setText(newsBean.getCommens()+"");
        }

    }

    @Override
    public void ShowiSlike(IsLikeBean isLikeBean) {

    }

    @Override
    public void showError(String string) {

    }
}
