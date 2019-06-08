package com.sugang.wenlvhui.model.bean.home.wcfy;

import com.sugang.wenlvhui.model.bean.VideosBean;

import java.util.List;

//
/* Created by $USER_NAME on 2019/6/9.
      无人与我立黄昏，无人问我粥可温。 
      无人与我捻熄灯，无人共我书半生。 
      无人陪我夜已深，无人与我把酒分。 
      无人拭我相思泪，无人梦我与前尘。 
      无人陪我顾星辰, 无人知我茶已冷。 
      无人听我述衷肠，无人解我心头梦。 
      无人拘我言中泪 ，无人愁我独行路。 
      回首向来萧瑟处，无人等在灯火阑珊处**/
public class ShopsBean {
    /**
     * addrDetail : 县城
     * area : 金凤区
     * browse : 123
     * city : 银川
     * createDate : 1559571724000
     * experienceList : []
     * id : 1
     * imgUrl : export_xls?file=/2019/06/03/123.jpg
     * is_up : 0
     * latitude : 66
     * longitude : 33
     * productList : []
     * product_num : 5
     * province : export_xls?file=/2019/06/03/123.jpg
     * shopsDetail : <p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p></p><p>阿三大苏打实打实的</p><p></p><p><br></p><p></p><p><br></p><p></p><p>大撒大撒大撒的</p><p></p><p>d'sa'd</p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p><p></p><p><br></p>
     * shopsName : 张宝嘉放皮影
     * shopsSlogan : 吃喝玩乐
     * upList : []
     * up_num : 0
     * videoList : []
     * createUser : 2
     */

    private String addrDetail;
    private String area;
    private int browse;
    private String city;
    private long createDate;
    private int id;
    private String imgUrl;
    private int is_up;
    private String latitude;
    private String longitude;
    private int product_num;
    private String province;
    private String shopsDetail;
    private String shopsName;
    private String shopsSlogan;
    private int up_num;
    private int createUser;
    private List<?> experienceList;
    private List<?> productList;
    private List<?> upList;
    private List<VideosBean> videoList;

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getIs_up() {
        return is_up;
    }

    public void setIs_up(int is_up) {
        this.is_up = is_up;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getShopsDetail() {
        return shopsDetail;
    }

    public void setShopsDetail(String shopsDetail) {
        this.shopsDetail = shopsDetail;
    }

    public String getShopsName() {
        return shopsName;
    }

    public void setShopsName(String shopsName) {
        this.shopsName = shopsName;
    }

    public String getShopsSlogan() {
        return shopsSlogan;
    }

    public void setShopsSlogan(String shopsSlogan) {
        this.shopsSlogan = shopsSlogan;
    }

    public int getUp_num() {
        return up_num;
    }

    public void setUp_num(int up_num) {
        this.up_num = up_num;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public List<?> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<?> experienceList) {
        this.experienceList = experienceList;
    }

    public List<?> getProductList() {
        return productList;
    }

    public void setProductList(List<?> productList) {
        this.productList = productList;
    }

    public List<?> getUpList() {
        return upList;
    }

    public void setUpList(List<?> upList) {
        this.upList = upList;
    }

    public List<VideosBean> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<VideosBean> videoList) {
        this.videoList = videoList;
    }
}
