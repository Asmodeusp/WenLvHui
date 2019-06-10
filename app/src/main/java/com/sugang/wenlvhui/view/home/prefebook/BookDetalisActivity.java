package com.sugang.wenlvhui.view.home.prefebook;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.hstj.BookDetalisContract;
import com.sugang.wenlvhui.model.bean.home.hstj.BookDetalisBean;
import com.sugang.wenlvhui.presenter.home.hstj.BookDetalisPresenterImp;
import com.sugang.wenlvhui.utils.sp.SPKey;
import com.sugang.wenlvhui.utils.sp.SPUtils;
import com.sugang.wenlvhui.view.home.adapter.BookTagAdapter;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class BookDetalisActivity extends BaseActivity<BookDetalisPresenterImp>implements BookDetalisContract.BookDetalisView {

    @BindView(R.id.BookDetalisReturnButton)
    AutoLinearLayout BookDetalisReturnButton;
    @BindView(R.id.BookDetalisShaiXuanButton)
    AutoLinearLayout BookDetalisShaiXuanButton;
    @BindView(R.id.BookDetalisRenzhengButton)
    AutoLinearLayout BookDetalisRenzhengButton;
    @BindView(R.id.BookDetalisBookName)
    TextView BookDetalisBookName;
    @BindView(R.id.BookDetalisBookAuther)
    TextView BookDetalisBookAuther;
    @BindView(R.id.BookDetalisStartOne)
    ImageView BookDetalisStartOne;
    @BindView(R.id.BookDetalisStartTwo)
    ImageView BookDetalisStartTwo;
    @BindView(R.id.BookDetalisStartThree)
    ImageView BookDetalisStartThree;
    @BindView(R.id.BookDetalisStartFour)
    ImageView BookDetalisStartFour;
    @BindView(R.id.BookDetalisStartFive)
    ImageView BookDetalisStartFive;
    @BindView(R.id.BookDetalisKStartOne)
    ImageView BookDetalisKStartOne;
    @BindView(R.id.BookDetalisKStartTwo)
    ImageView BookDetalisKStartTwo;
    @BindView(R.id.BookDetalisKStartThree)
    ImageView BookDetalisKStartThree;
    @BindView(R.id.BookDetalisKStartFour)
    ImageView BookDetalisKStartFour;
    @BindView(R.id.BookDetalisKStartFive)
    ImageView BookDetalisKStartFive;
    @BindView(R.id.kk)
    AutoRelativeLayout kk;
    @BindView(R.id.BookDetalisBookTagRecy)
    RecyclerView BookDetalisBookTagRecy;
    @BindView(R.id.BookDetalisBookAddress)
    TextView BookDetalisBookAddress;
    @BindView(R.id.BookDetalisBookImage)
    ImageView BookDetalisBookImage;
    @BindView(R.id.BookDetalisUserHeadImage)
    CircleImageView BookDetalisUserHeadImage;
    @BindView(R.id.BookDetalisUserNameText)
    TextView BookDetalisUserNameText;
    @BindView(R.id.BookDetalisUserTuijianNnmText)
    TextView BookDetalisUserTuijianNnmText;
    @BindView(R.id.BookDetalisJJText)
    TextView BookDetalisJJText;
    @BindView(R.id.BookDetalisBookCommentButton)
    TextView BookDetalisBookDetalisButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_book_detalis;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        int BookId = (int) SPUtils.get(this, SPKey.BOOKID, 0);
        presenter.getBookDetalisBean(BookId+"");
    }


    @OnClick({R.id.BookDetalisReturnButton, R.id.BookDetalisBookCommentButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.BookDetalisReturnButton:
                finish();
                break;
            case R.id.BookDetalisBookCommentButton:
                break;
        }
    }

    @Override
    public void showBookDetalisBean(BookDetalisBean bookDetalisBean) {
        if (bookDetalisBean.getData()!=null) {
            BookDetalisBean.DataBean.BookBean book = bookDetalisBean.getData().getBook();
            BookDetalisBookName.setText(book.getBook_name());
            BookDetalisBookAuther.setText(book.getBook_auther());
            if (book.getRecommend_class() == 1) {
                BookDetalisStartOne.setVisibility(View.VISIBLE);
                BookDetalisStartTwo.setVisibility(View.GONE);
                BookDetalisStartThree.setVisibility(View.GONE);
                BookDetalisStartFour.setVisibility(View.GONE);
                BookDetalisStartFive.setVisibility(View.GONE);
            } else if (book.getRecommend_class() == 2) {
                BookDetalisStartOne.setVisibility(View.VISIBLE);
                BookDetalisStartTwo.setVisibility(View.VISIBLE);
                BookDetalisStartThree.setVisibility(View.GONE);
                BookDetalisStartFour.setVisibility(View.GONE);
                BookDetalisStartFive.setVisibility(View.GONE);
            } else if (book.getRecommend_class() == 3) {
                BookDetalisStartOne.setVisibility(View.VISIBLE);
                BookDetalisStartTwo.setVisibility(View.VISIBLE);
                BookDetalisStartThree.setVisibility(View.VISIBLE);
                BookDetalisStartFour.setVisibility(View.GONE);
                BookDetalisStartFive.setVisibility(View.GONE);
            } else if (book.getRecommend_class() == 4) {
                BookDetalisStartOne.setVisibility(View.VISIBLE);
                BookDetalisStartTwo.setVisibility(View.VISIBLE);
                BookDetalisStartThree.setVisibility(View.VISIBLE);
                BookDetalisStartFour.setVisibility(View.VISIBLE);
                BookDetalisStartFive.setVisibility(View.GONE);
            }else if (book.getRecommend_class() == 5) {
                BookDetalisStartOne.setVisibility(View.VISIBLE);
                BookDetalisStartTwo.setVisibility(View.VISIBLE);
                BookDetalisStartThree.setVisibility(View.VISIBLE);
                BookDetalisStartFour.setVisibility(View.VISIBLE);
                BookDetalisStartFive.setVisibility(View.VISIBLE);
            }
            BookDetalisBookAddress.setText(book.getLibrary_address());
            Glide.with(this).load(book.getImg_url()).error(R.mipmap.icon).into(BookDetalisBookImage);
            Glide.with(this).load(book.getHeadpic()).error(R.mipmap.icon).into(BookDetalisUserHeadImage);
            BookDetalisUserNameText.setText(book.getUsername());
            BookDetalisUserTuijianNnmText.setText(book.getRecommended_number()+"人推荐");
            RichText
                    .from(book.getBook_detail()) // 数据源
                    .autoFix(true) // 是否自动修复，默认true
                    .autoPlay(true) // gif图片是否自动播放
                    .showBorder(true) // 是否显示图片边框
                    .borderColor(Color.RED) // 图片边框颜色
                    .borderSize(10) // 边框尺寸
                    .borderRadius(50) // 图片边框圆角弧度
                    .size(ImageHolder.MATCH_PARENT, ImageHolder.WRAP_CONTENT) // 图片占位区域的宽高
                    .resetSize(false)
                    .bind(this)
                    .clickable(true) // 是否可点击，默认只有设置了点击监听才可点击
                    .into(BookDetalisJJText); // 设置目标
            BookDetalisBookTagRecy.setLayoutManager(new GridLayoutManager(this,3));
            BookDetalisBookTagRecy.setAdapter(new BookTagAdapter(bookDetalisBean.getData().getTags()));

        }
    }

    @Override
    public void showError(String string) {

    }
}
