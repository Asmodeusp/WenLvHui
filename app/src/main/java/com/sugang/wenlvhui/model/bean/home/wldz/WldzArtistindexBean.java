package com.sugang.wenlvhui.model.bean.home.wldz;

import java.util.List;

public class WldzArtistindexBean {

    /**
     * code : 0
     * data : {"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","artists":[{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":4,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":8,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":12,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":16,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1}]}
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
        /**
         * img : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
         * artists : [{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":4,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":8,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":12,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1},{"artist_logourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artist_name":"范远程","artist_phone":"19796326563","artist_experience":" ","recommend":0,"id":16,"artist_type":30,"artist_details":"个性","artist_browse":278,"artist_status":1}]
         */

        private String img;
        private List<ArtistsBean> artists;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public List<ArtistsBean> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBean> artists) {
            this.artists = artists;
        }


    }
}
