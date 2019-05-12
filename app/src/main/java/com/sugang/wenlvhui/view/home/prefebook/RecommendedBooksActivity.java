package com.sugang.wenlvhui.view.home.prefebook;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.contract.home.hstj.HstjpageContract;
import com.sugang.wenlvhui.model.bean.home.hstj.BookTuijianBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjLikeBean;
import com.sugang.wenlvhui.model.bean.home.hstj.HstjNewBean;
import com.sugang.wenlvhui.presenter.home.hstj.HstjPagePresenterImp;
import com.sugang.wenlvhui.utils.GlideUtils;
import com.sugang.wenlvhui.view.home.adapter.Hstj_cnxhRecyAdapter;
import com.sugang.wenlvhui.view.home.adapter.Hstj_zxzrRecyclerAdapter;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//好书推荐
public class RecommendedBooksActivity extends BaseActivity<HstjPagePresenterImp> implements HstjpageContract.HstjpageView {


    @BindView(R.id.RecommendedBooksReturnButton)
    AutoLinearLayout RecommendedBooksReturnButton;
    @BindView(R.id.RecommendedBooksShaiXuanButton)
    AutoLinearLayout RecommendedBooksShaiXuanButton;
    @BindView(R.id.RecommendedBooks_SerchEd)
    TextView RecommendedBooksSerchEd;
    @BindView(R.id.RecommendedBooks_HstjRefreshButton)
    ImageView RecommendedBooksHstjRefreshButton;
    @BindView(R.id.RecommendedBooks_HstjBookImage)
    ImageView RecommendedBooksHstjBookImage;
    @BindView(R.id.RecommendedBooks_HstjBookNameText)
    TextView RecommendedBooksHstjBookNameText;
    @BindView(R.id.RecommendedBooks_HstjBookAutherText)
    TextView RecommendedBooksHstjBookAutherText;
    @BindView(R.id.RecommendedBooks_HstjBookStartOne)
    ImageView RecommendedBooksHstjBookStartOne;
    @BindView(R.id.RecommendedBooks_HstjBookStartTwo)
    ImageView RecommendedBooksHstjBookStartTwo;
    @BindView(R.id.RecommendedBooks_HstjBookStartThree)
    ImageView RecommendedBooksHstjBookStartThree;
    @BindView(R.id.RecommendedBooks_HstjBookStartFour)
    ImageView RecommendedBooksHstjBookStartFour;
    @BindView(R.id.RecommendedBooks_HstjBookStartFive)
    ImageView RecommendedBooksHstjBookStartFive;
    @BindView(R.id.RecommendedBooks_HstjBookKStartOne)
    ImageView RecommendedBooksHstjBookKStartOne;
    @BindView(R.id.RecommendedBooks_HstjBookKStartTwo)
    ImageView RecommendedBooksHstjBookKStartTwo;
    @BindView(R.id.RecommendedBooks_HstjBookKStartThree)
    ImageView RecommendedBooksHstjBookKStartThree;
    @BindView(R.id.RecommendedBooks_HstjBookKStartFour)
    ImageView RecommendedBooksHstjBookKStartFour;
    @BindView(R.id.RecommendedBooks_HstjBookKStartFive)
    ImageView RecommendedBooksHstjBookKStartFive;
    @BindView(R.id.RecommendedBooks_HstjUserHeadImage)
    ImageView RecommendedBooksHstjUserHeadImage;
    @BindView(R.id.RecommendedBooks_HstjUserNameText)
    TextView RecommendedBooksHstjUserNameText;
    @BindView(R.id.RecommendedBooks_HstjUserTuijianNnmText)
    TextView RecommendedBooksHstjUserTuijianNnmText;
    @BindView(R.id.RecommendedBooks_HstjJJText)
    TextView RecommendedBooksHstjJJText;
    @BindView(R.id.RecommendedBooks_HstjBookButton)
    AutoLinearLayout RecommendedBooksHstjBookButton;
    @BindView(R.id.RecommendedBooks_ZXZRRefreshButton)
    ImageView RecommendedBooksZXZRRefreshButton;
    @BindView(R.id.RecommendedBooks_ZXZRRecy)
    RecyclerView RecommendedBooksZXZRRecy;
    @BindView(R.id.RecommendedBooks_CNXHRefreshButton)
    ImageView RecommendedBooksCNXHRefreshButton;
    @BindView(R.id.RecommendedBooks_CNXHRecy)
    RecyclerView RecommendedBooksCNXHRecy;
    @BindView(R.id.kk)
    AutoRelativeLayout kk;
    private int Tuijianpage = 1;
    private int Newpage = 1;
    private int Likepage = 1;
    private ArrayList<HstjNewBean.DataBean.NewBean> booknews = new ArrayList<>();
    private ArrayList<HstjLikeBean.DataBean.LikeBean> bookcnxh = new ArrayList<>();
    private BookTuijianBean.DataBean.TuijianBean tuijian = new BookTuijianBean.DataBean.TuijianBean();
    private Hstj_zxzrRecyclerAdapter hstj_zxzrRecyclerAdapter;
    private Hstj_cnxhRecyAdapter hstj_cnxhRecyAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recommended_books;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDate() {
        presenter.getBookCnxhBean(Likepage + "");
        presenter.getBookNewBean(Newpage + "");
        presenter.getBookTuijianBean(Tuijianpage + "");
    }

    @OnClick({R.id.RecommendedBooksReturnButton, R.id.RecommendedBooksShaiXuanButton, R.id.RecommendedBooks_SerchEd, R.id.RecommendedBooks_HstjRefreshButton, R.id.RecommendedBooks_HstjBookButton, R.id.RecommendedBooks_ZXZRRefreshButton, R.id.RecommendedBooks_CNXHRefreshButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.RecommendedBooksReturnButton:
                finish();
                break;
            case R.id.RecommendedBooksShaiXuanButton:

                break;
            case R.id.RecommendedBooks_SerchEd:

                break;
            case R.id.RecommendedBooks_HstjRefreshButton:
                Tuijianpage++;
                presenter.getBookTuijianBean(Tuijianpage + "");
                kk.invalidate();
                break;
            case R.id.RecommendedBooks_HstjBookButton:

                break;
            case R.id.RecommendedBooks_ZXZRRefreshButton:
                Newpage++;
                presenter.getBookNewBean(Newpage + "");
                break;
            case R.id.RecommendedBooks_CNXHRefreshButton:
                Likepage++;
                presenter.getBookCnxhBean(Likepage + "");
                break;
        }
    }

    @Override
    public void showBookTuijianBean(BookTuijianBean bookTuijianBean) {
        if (bookTuijianBean.getData() != null) {
            this.tuijian = bookTuijianBean.getData().getTuijian();
            initTuijian();
        }

    }

    @Override
    public void showBookNewBean(HstjNewBean bookLikeorNewBean) {
        if (bookLikeorNewBean.getData() != null) {
            booknews.clear();
            booknews.addAll(bookLikeorNewBean.getData().getNewX());
            initZXZR();
        }

    }

    private void initZXZR() {
        RecommendedBooksZXZRRecy.setLayoutManager(new GridLayoutManager(this,3));
        hstj_zxzrRecyclerAdapter = new Hstj_zxzrRecyclerAdapter(booknews);
        RecommendedBooksZXZRRecy.setAdapter(hstj_zxzrRecyclerAdapter);
        hstj_zxzrRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void showBookCnxhBean(HstjLikeBean bookLikeorNewBean) {
        if (bookLikeorNewBean.getData() != null) {
            bookcnxh.clear();
            bookcnxh.addAll(bookLikeorNewBean.getData().getLike());
            initCNXH();
        }


    }

    private void initCNXH() {
        RecommendedBooksCNXHRecy .setLayoutManager(new GridLayoutManager(this,4));
        hstj_cnxhRecyAdapter = new Hstj_cnxhRecyAdapter(bookcnxh);
        RecommendedBooksCNXHRecy.setAdapter(hstj_cnxhRecyAdapter);
        hstj_cnxhRecyAdapter.notifyDataSetChanged();

    }

    @Override
    public void showError(String string) {

    }

    private void initTuijian() {
        //好书推荐数据渲染
        Glide.with(this).load(tuijian.getImgUrl()).skipMemoryCache(true).error(R.mipmap.icon).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(RecommendedBooksHstjBookImage);
        RecommendedBooksHstjBookAutherText.setText(tuijian.getBookAuther());
        RecommendedBooksHstjBookNameText.setText(tuijian.getBookName());
        RecommendedBooksHstjJJText.setText("    " + tuijian.getBookDetail());
        GlideUtils.loadCircleImage(tuijian.getUser().getHeadPic(), RecommendedBooksHstjUserHeadImage, new GlideUtils.ImageLoadListener<String, GlideDrawable>() {
            @Override
            public void onLoadingComplete(String uri, ImageView view, GlideDrawable resource) {

            }

            @Override
            public void onLoadingError(String source, Exception e) {

            }
        }, R.mipmap.icon);
        RecommendedBooksHstjUserNameText.setText(tuijian.getUser().getName());
        RecommendedBooksHstjUserTuijianNnmText.setText(tuijian.getRecommendedNumber() + "人推荐");
        if (tuijian.getRecommendClass() == 1) {
            RecommendedBooksHstjBookStartOne.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartTwo.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartThree.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartFour.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartFive.setVisibility(View.GONE);
        } else if (tuijian.getRecommendClass() == 2) {
            RecommendedBooksHstjBookStartOne.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartTwo.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartThree.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartFour.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartFive.setVisibility(View.GONE);
        } else if (tuijian.getRecommendClass() == 3) {
            RecommendedBooksHstjBookStartOne.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartTwo.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartThree.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartFour.setVisibility(View.GONE);
            RecommendedBooksHstjBookStartFive.setVisibility(View.GONE);
        } else if (tuijian.getRecommendClass() == 4) {
            RecommendedBooksHstjBookStartOne.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartTwo.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartThree.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartFour.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartFive.setVisibility(View.GONE);
        }else if (tuijian.getRecommendClass() == 5) {
            RecommendedBooksHstjBookStartOne.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartTwo.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartThree.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartFour.setVisibility(View.VISIBLE);
            RecommendedBooksHstjBookStartFive.setVisibility(View.VISIBLE);
        }
    }



}
