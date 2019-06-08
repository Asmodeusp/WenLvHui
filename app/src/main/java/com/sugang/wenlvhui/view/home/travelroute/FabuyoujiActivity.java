package com.sugang.wenlvhui.view.home.travelroute;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.PopupWindow;

import com.google.gson.Gson;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.base.BaseActivity;
import com.sugang.wenlvhui.model.bean.FileBean;
import com.sugang.wenlvhui.utils.Urls;
import com.sugang.wenlvhui.utils.photo.BitmapUtils;
import com.sugang.wenlvhui.utils.photo.PhotoHelp;
import com.sugang.wenlvhui.utils.photo.PhotoUtils;
import com.sugang.wenlvhui.view.richeditor.RichEditor;
import com.zhy.autolayout.AutoLinearLayout;

import java.io.File;
import java.io.IOException;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FabuyoujiActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.FabuyoujiReturnButton)
    AutoLinearLayout FabuyoujiReturnButton;
    @BindView(R.id.FabuyoujiFaBuButton)
    AutoLinearLayout FoodShareButton;
    @BindView(R.id.action_undo)
    ImageButton actionUndo;
    @BindView(R.id.action_redo)
    ImageButton actionRedo;
    @BindView(R.id.action_bold)
    ImageButton actionBold;
    @BindView(R.id.action_italic)
    ImageButton actionItalic;
    @BindView(R.id.action_heading1)
    ImageButton actionHeading1;
    @BindView(R.id.action_heading2)
    ImageButton actionHeading2;
    @BindView(R.id.action_heading3)
    ImageButton actionHeading3;
    @BindView(R.id.action_heading4)
    ImageButton actionHeading4;
    @BindView(R.id.action_heading5)
    ImageButton actionHeading5;
    @BindView(R.id.action_heading6)
    ImageButton actionHeading6;
    @BindView(R.id.action_align_left)
    ImageButton actionAlignLeft;
    @BindView(R.id.action_align_center)
    ImageButton actionAlignCenter;
    @BindView(R.id.action_align_right)
    ImageButton actionAlignRight;
    @BindView(R.id.action_insert_bullets)
    ImageButton actionInsertBullets;
    @BindView(R.id.action_insert_numbers)
    ImageButton actionInsertNumbers;
    @BindView(R.id.action_insert_image)
    ImageButton actionInsertImage;
    @BindView(R.id.editor)
    RichEditor editor;
    private AutoLinearLayout selector_popup_dissmis_line;
    private AutoLinearLayout selector_popup_imgLibily_line;
    private AutoLinearLayout selector_popup_photo_line;
    private PopupWindow popupWindow;
    //这是相册权限
    private final int STORAGE_PERMISSIONS_REQUEST_CODE = 100;
    //这是相册请求码
    private final int CODE_GALLERY_REQUEST = 200;
    //相机权限码
    private final int CAMERA_PERMISSIONS_REQUEST_CODE = 300;
    //相机请求码
    private final int CODE_CAMERA_REQUEST = 400;
    private String filePath;
    private String fileName;
    private FileBean fileBean ;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_fabuyouji;
    }

    @Override
    protected void init() {
        editor.setFontSize(18);
        editor.setEditorHeight(200);
        editor.setEditorFontColor(getResources().getColor(R.color.H4));
        editor.setPlaceholder("请在这边书写你要发布的内容");
    }

    @Override
    protected void loadDate() {

    }

    @OnClick({R.id.FabuyoujiReturnButton, R.id.action_undo, R.id.action_redo, R.id.action_bold, R.id.action_italic, R.id.action_heading1, R.id.action_heading2, R.id.action_heading3, R.id.action_heading4, R.id.action_heading5, R.id.action_heading6, R.id.action_align_left, R.id.action_align_center, R.id.action_align_right, R.id.action_insert_bullets, R.id.action_insert_numbers, R.id.action_insert_image})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.FabuyoujiReturnButton:
                finish();
                break;
            case R.id.action_undo:
                editor.undo();
                break;
            case R.id.action_redo:
                editor.redo();
                break;
            case R.id.action_bold:
                editor.setBold();
                break;
            case R.id.action_italic:
                editor.setItalic();
                break;
            case R.id.action_heading1:
                editor.setHeading(1);
                break;
            case R.id.action_heading2:
                editor.setHeading(2);
                break;
            case R.id.action_heading3:
                editor.setHeading(3);
                break;
            case R.id.action_heading4:
                editor.setHeading(4);
                break;
            case R.id.action_heading5:
                editor.setHeading(5);
                break;
            case R.id.action_heading6:
                editor.setHeading(6);
                break;
            case R.id.action_align_left:
                editor.setAlignLeft();
                break;
            case R.id.action_align_center:
                editor.setAlignCenter();
                break;
            case R.id.action_align_right:
                editor.setAlignRight();
                break;
            case R.id.action_insert_bullets:
                editor.setBullets();
                break;
            case R.id.action_insert_numbers:
                editor.setNumbers();
                break;
            case R.id.action_insert_image:

                showPopueWindow();
                break;
        }
    }

    private void showPopueWindow() {
        View view = LayoutInflater.from(this).inflate(R.layout.img_selector_popup, null);
        selector_popup_dissmis_line = view.findViewById(R.id.selector_popup_dissmis_line);
        selector_popup_imgLibily_line = view.findViewById(R.id.selector_popup_imgLibily_line);
        selector_popup_photo_line = view.findViewById(R.id.selector_popup_photo_line);
        //获取屏幕宽高
        int weight = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels * 1 / 4;

        popupWindow = new PopupWindow(view, weight, height);
        // popupWindow.setAnimationStyle(R.style.anim_popup_dir);
        popupWindow.setFocusable(true);
        //点击外部popueWindow消失
        popupWindow.setOutsideTouchable(true);
        selector_popup_imgLibily_line.setOnClickListener(this);
        selector_popup_photo_line.setOnClickListener(this);
        selector_popup_dissmis_line.setOnClickListener(this);
        //popupWindow消失屏幕变为不透明
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 1.0f;
                getWindow().setAttributes(lp);
            }
        });
        popupWindow.showAtLocation(view, Gravity.BOTTOM, 0, 0);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case CAMERA_PERMISSIONS_REQUEST_CODE:
                filePath = PhotoHelp.getFilePath();
                PhotoHelp.cameraPermissionResult(this, grantResults, CAMERA_PERMISSIONS_REQUEST_CODE, filePath, CODE_CAMERA_REQUEST);
                break;
            case STORAGE_PERMISSIONS_REQUEST_CODE://调用系统相册申请Sdcard权限回调
                PhotoHelp.xiangCePermissionResult(this, grantResults, CODE_GALLERY_REQUEST);
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) switch (requestCode) {
            case CODE_CAMERA_REQUEST://拍照完成回调
                fileName = BitmapUtils.compressImageUpload(filePath);
                UpLoadImage();
                editor.insertImage(fileBean.getData().getPath(),"");
                break;
            case CODE_GALLERY_REQUEST://访问相册完成回调

                String path = PhotoUtils.getPath(FabuyoujiActivity.this, data.getData());
                fileName = BitmapUtils.compressImageUpload(path);
                 UpLoadImage();
                editor.insertImage(fileBean.getData().getPath(),"");
                break;
        }
    }

    private void UpLoadImage() {
        OkHttpClient okHttpClient = new OkHttpClient();
        //上传的图片

        //2.通过new MultipartBody build() 创建requestBody对象，
        RequestBody requestBody = new MultipartBody.Builder()
                //设置类型是表单
                .setType(MultipartBody.FORM)
                //添加数据
                .addFormDataPart("file", "hh.png",
                        RequestBody.create(MediaType.parse("image/png"),  new File(fileName)))
                .build();
        //3.创建Request对象，设置URL地址，将RequestBody作为post方法的参数传入
        final Request request = new Request.Builder().url(Urls.BASE_URL+"uploadflv/upload").post(requestBody).build();
        //4.创建一个call对象,参数就是Request请求对象
        Call call = okHttpClient.newCall(request);
        //5.请求加入调度,重写回调方法
        call.enqueue(new Callback() {



            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("FabuyoujiActivity", e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                fileBean = new Gson().fromJson(string, FileBean.class);
            }
        });




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.selector_popup_imgLibily_line:
                PhotoHelp.autoObtainStoragePermission(FabuyoujiActivity.this, STORAGE_PERMISSIONS_REQUEST_CODE, CODE_GALLERY_REQUEST);
                popupWindow.dismiss();
                break;
//                相机
            case R.id.selector_popup_photo_line:
                filePath = PhotoHelp.getFilePath();
                PhotoHelp.applyForCameraPermission(FabuyoujiActivity.this, CAMERA_PERMISSIONS_REQUEST_CODE, filePath, CODE_CAMERA_REQUEST);
                popupWindow.dismiss();
                break;
//                取消
            case R.id.selector_popup_dissmis_line:
                popupWindow.dismiss();
                break;
        }
    }
}
