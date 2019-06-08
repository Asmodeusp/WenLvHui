package com.sugang.wenlvhui.utils;

public class Urls {
    //基本路径
    public static final String BASE_URL = "http://www.zwwlh.com:8012/";
    //判断手机号是否注册
    public static final String REGISTER_PHOTO = "user/getTel";
    //用户注册
    public static final String REGISTER = "user/regist";
    //登录
    public static final String LOGIN = "user/login";
    //文艺培训列表
    public static final String WYPX_LIST = "ymSchool/getSchoolsByType";
    //文艺培训学校详情
    public static final String SCHOOL_DETAILS = "ymSchool/getSchoolById";
    //文旅政策
    public static final String WENLV_ZHENGCE = "wenlv/wenlvzhengce_list";
    //文旅政策列表页
    public static final String WLZC_XMGGLIST = "wenlv/getlistBytype";
    //文旅政策详情
    public static final String WLZC_DETAILS = "wenlv/findOne";
    //文旅政策搜索
    public static final String WLZC_SERCH = "wenlv/getListByKey";
    //艺人主页
    public static final String ARTIST_INDEX = "artist/artist_index";
    //艺人详情
    public static final String ARTIST_DETAIL = "artist/artist_detail";
    //艺人搜索
    public static final String ARTIST_SERCH = "artist/selectBykey";
    //空间主页
    public static final String  SPACE_PAGE="ymSpaceTbl/list";
    //空间馆藏
    public static final String SPACE_GUANCANG ="ymSpaceTbl/space_guancang";
    //空间动态
    public static final String SPACE_DONGTAI = "ymSpaceTbl/space_policy_list";
    //场馆详情
    public static final String SPACE_CHANGGUAN = "ymSpaceTbl/space_detail";
    //上传图片
    public static final String UPLOADIMAGE ="uploadflv/upload";

    //文旅路线首页
    public static final String WLLX_PAGE = "wenbrigade/index";
    //文旅路线列表
    public static final String WLLX_LIST = "wenbrigade/list";
    //文旅路线详情
    public static final String WLLX_DETAILS = "/wenbrigade/details";
    //发布游记
    public static final String YLYJFABU = "/wildtravels/insert";//参数{userid:userid,content:content}
    //游记列表
    public static final String YLYJLIST = "/wildtravels/findall";//参数{userid:userid,page:page,num:num}
    //游记详情
    public static final String YLYJDETALIS = "/wildtravels/findone";//参数{id:id}
    //文旅榜单

    //匠人主页
    public static final String JIANGREN_PAGER = "ymShopsTbl/list";
    //手艺
    public static final String SHOUYI_PAGER = "ymShopsTbl/shouyituijian";
    //匠人详情
    public static final String JIANGREN_DETAILS = "ymShopsTbl/get";
    //手艺详情
    public static final String SHOUYI_DETAILS="ymShopsTbl/product_detail";//参数 product_id
    //手艺搜索
   public static final String SHOUYI_SERCH="ymShopsTbl/find_product";// 参数  page    name_detail
    //匠人搜索
    public static final String JIANGREN_SERCH ="ymShopsTbl/find_shop";// 参数 page    name_detail

    //地方美食主页
    public static final String RESTAURANT_LIST = "restaurant/restaurant_list";
    //餐馆详情
    public static final String RESTAURANT_DETAIL = "restaurant/restaurant_detail";
    //食物详情
    public static final String FOOD_DETAIL = "restaurant/food_detail";
    //地区筛选

    //搜索

    //活动详情
    public static final String ACTIVITY_DETALIS ="policy/policy_detail";
    //活动大接口
    public static final String  ACTIVITY_LIST="policy/policy_list";
    //活动主页
    public static final String  ACTIVITY_PAGE="policy/getindex";

    //好书推荐 推荐
    public static final String HSTJ_TUIJIAN = "book/book_index_tuijian";
    //好书推荐  猜你喜欢
    public static final String HSTJ_CNXH = "book/book_index_like";
    // 好书推荐  最新最热
    public static final String HSTJ_ZXZR = "book/book_index_new";
    //点赞
    public static final String ISLIKE = "/ymup/insert";
    //评论
    public static final String COMMENTLIST ="ymComment/findAll";
    //添加评论
    public static final String COMMENTINSERT ="ymComment/insert";


}
