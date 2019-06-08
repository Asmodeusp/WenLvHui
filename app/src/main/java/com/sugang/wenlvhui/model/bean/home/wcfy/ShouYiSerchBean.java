package com.sugang.wenlvhui.model.bean.home.wcfy;

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
public class ShouYiSerchBean {

    /**
     * msg : 成功
     * code : 0
     * data : {"product_list":[{"browse":256,"commentList":[],"createDate":1559923200000,"id":27,"price":129,"priceDq":129,"productDatile":"<p><\/p><p>一般指贴身的下身内衣，分男装与女装两种。而且根据性别不同，款式也越来越多花样了。穿<em>内裤<\/em>各国各地出现的时间不一。<em>内裤<\/em>并不是古已有之的，汉代以前，女人下体无衣，到了汉朝才穿上开裆裤。直至现代，<em>内裤<\/em>款式和面料上...\r\n\r\n<\/p>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/5ca7f12f-8c9d-453e-b483-6e2e726b0663.jpg","productName":"老张的原味内裤","productPoint":"原味的哦！","shopsId":27,"status":1},{"browse":712,"commentList":[],"createDate":1559923200000,"id":31,"price":129,"priceDq":129,"productDatile":"<p><\/p><div>正在使用用。效果还不清楚。以下是凑字数请忽略。珊珊芭蕾舞剧都记得记得记得你的呢记得那年的你都不说你的呢你懂的那件事都记得记得你的呢都记得你当年的聚集地你对武术记得记得记得喝喝喝喝酒就记得叫呃呃记得叫谁的家了\u2026\u2026我在这里吃饭去了\u2026\u2026\u2026\u2026不知道你是不是有问题吧。。不知道怎么了。我说的不是我喜欢那个不一定的作用。<\/div><div><br><\/div>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/33c7c8cf-87aa-4cb7-ae1a-7c029f50b014.jpg","productName":"老张的原味内裤","productPoint":"送礼好评","shopsId":28,"status":1},{"browse":712,"commentList":[],"createDate":1559923200000,"id":33,"price":129,"priceDq":129,"productDatile":"<p><\/p><div>正在使用用。效果还不清楚。以下是凑字数请忽略。珊珊芭蕾舞剧都记得记得记得你的呢记得那年的你都不说你的呢你懂的那件事都记得记得你的呢都记得你当年的聚集地你对武术记得记得记得喝喝喝喝酒就记得叫呃呃记得叫谁的家了\u2026\u2026我在这里吃饭去了\u2026\u2026\u2026\u2026不知道你是不是有问题吧。。不知道怎么了。我说的不是我喜欢那个不一定的作用。<\/div><div><br><\/div>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/8223cb37-cd5b-45b6-9e1d-05cf002bede3.jpg","productName":"老张的原味内裤","productPoint":"原味的哦！","shopsId":29,"status":1},{"browse":712,"commentList":[],"createDate":1559923200000,"id":34,"price":129,"priceDq":129,"productDatile":"<p><\/p><div>正在使用用。效果还不清楚。以下是凑字数请忽略。珊珊芭蕾舞剧都记得记得记得你的呢记得那年的你都不说你的呢你懂的那件事都记得记得你的呢都记得你当年的聚集地你对武术记得记得记得喝喝喝喝酒就记得叫呃呃记得叫谁的家了\u2026\u2026我在这里吃饭去了\u2026\u2026\u2026\u2026不知道你是不是有问题吧。。不知道怎么了。我说的不是我喜欢那个不一定的作用。<\/div><div><br><\/div>","productImage":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/93b00d41-7779-4d16-bf1e-98f13b27a145.jpg","productName":"老张的原味内裤","productPoint":"原味的哦！","shopsId":30,"status":1}]}
     */

    private String msg;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<ProductListBean> product_list;

        public List<ProductListBean> getProduct_list() {
            return product_list;
        }

        public void setProduct_list(List<ProductListBean> product_list) {
            this.product_list = product_list;
        }
    }
}
