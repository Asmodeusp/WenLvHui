package com.sugang.wenlvhui.model.bean.home.wllx;

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
public class WllxSerchBean {

    /**
     * code : 0
     * data : {"brigades":[{"id":54,"type":1,"adult":344,"children":123,"setMeal":333,"adultDescribe":"<p><\/p><p>大萨达萨达<\/p>","childrenDescribe":"<p><\/p><p>大撒大撒<\/p>","mealDescribe":"<p><\/p><p>大撒大撒<\/p>","tripArrange":"<p><\/p><p>达萨达<\/p>","feeNotice":"<p><\/p><p>达萨达<\/p>","securityTip":"<p><\/p><p>达萨达<\/p>","createTime":"2019-06-08T11:15:33.000+0000","recommend":1,"browse":712,"img":"http://47.92.174.98:8011/uploadflv/export_xls?file=/var/yimen/upload//2019/06/08/3125d91e-1c47-4034-a30c-976b4f3228dc.png","reservedFields1":"老张的私人影院","reservedFields2":"宝湖中路72号"}]}
     * mes : 成功
     */

    private int code;
    private DataBean data;
    private String mes;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public static class DataBean {
        private List<BrigadesBean> brigades;

        public List<BrigadesBean> getBrigades() {
            return brigades;
        }

        public void setBrigades(List<BrigadesBean> brigades) {
            this.brigades = brigades;
        }


    }
}
