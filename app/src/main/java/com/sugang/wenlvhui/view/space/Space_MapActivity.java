package com.sugang.wenlvhui.view.space;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.gyf.barlibrary.ImmersionBar;
import com.sugang.wenlvhui.R;
import com.sugang.wenlvhui.utils.map.LocationUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Space_MapActivity extends AppCompatActivity {

    @BindView(R.id.Map)
    MapView Map;
    private AMap aMap;
    private LocationUtil locationUtil;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation amapLocation) {
            locationUtil.setAmapLocation(amapLocation);
            int result = locationUtil.onSuccess();//获取返回信息代码
            if (result == 0) {
                //获取国家省份....街道号信息
                Toast.makeText(getApplicationContext(), locationUtil.getInfoString(), Toast.LENGTH_SHORT).show();
                //通过经纬度得到Latlng对象
                LatLng latLng = new LatLng(amapLocation.getLatitude(), amapLocation.getLongitude());//构造一个位置
                aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18));
                stopLocation();
            } else {
                //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                Toast.makeText(getApplicationContext(), locationUtil.getErrorCodeAndInfo(), Toast.LENGTH_SHORT).show();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space__map);
        ButterKnife.bind(this);
        ImmersionBar.with(this)
                .statusBarColor(R.color.H3)     //状态栏颜色，不写默认透明色
                .fitsSystemWindows(true)
                .init();  //必须调用方可沉浸式
        Map.onCreate(savedInstanceState);
        if (aMap == null) {
            aMap = Map.getMap();
        }
        aMap.getUiSettings().setMyLocationButtonEnabled(true);
        aMap.setMyLocationEnabled(true);// 设置为true表示启动显示定位蓝点，false表示隐藏定位蓝点并不进行定位，默认是false。

        locationUtil = new LocationUtil();
        locationUtil.autoStart();
        //初始化定位
        mLocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
        mLocationClient.setLocationOption(locationUtil.getmLocationOption());
        startLocation();


    }

    public void startLocation() {
        mLocationClient.startLocation();//启动定位
    }

    public void stopLocation() {
        mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        Map.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        Map.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        Map.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        Map.onSaveInstanceState(outState);
    }
}

