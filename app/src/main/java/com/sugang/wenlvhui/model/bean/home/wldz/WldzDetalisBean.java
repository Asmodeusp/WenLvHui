package com.sugang.wenlvhui.model.bean.home.wldz;

import com.sugang.wenlvhui.model.bean.ImgsBean;
import com.sugang.wenlvhui.model.bean.VideosBean;

import java.util.List;

public class WldzDetalisBean {

    /**
     * code : 0
     * data : {"imgs":[{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":null,"img":"http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"}],"artist":{"isOrder":null,"orderBy":null,"asc":null,"limit":null,"startNum":null,"endNum":null,"id":1,"artistType":"30","artistName":"范元成","backgroundUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistPhone":"13629564452","artistDetails":"个性","artistStatus":1,"typeName":null,"artistExperience":" ","recommend":0,"commentList":[],"videoList":[],"experienceList":[],"imgList":[]},"video":[{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]}
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
         * imgs : [{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg"},{"detalis":null,"img":"http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"}]
         * artist : {"isOrder":null,"orderBy":null,"asc":null,"limit":null,"startNum":null,"endNum":null,"id":1,"artistType":"30","artistName":"范元成","backgroundUrl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistLogourl":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg","artistPhone":"13629564452","artistDetails":"个性","artistStatus":1,"typeName":null,"artistExperience":" ","recommend":0,"commentList":[],"videoList":[],"experienceList":[],"imgList":[]}
         * video : [{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"},{"detalis":null,"img":"http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg","video":"http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4"}]
         */

        private ArtistBean artist;
        private List<ImgsBean> imgs;
        private List<VideosBean> video;

        public ArtistBean getArtist() {
            return artist;
        }

        public void setArtist(ArtistBean artist) {
            this.artist = artist;
        }

        public List<ImgsBean> getImgs() {
            return imgs;
        }

        public void setImgs(List<ImgsBean> imgs) {
            this.imgs = imgs;
        }

        public List<VideosBean> getVideo() {
            return video;
        }

        public void setVideo(List<VideosBean> video) {
            this.video = video;
        }

        public static class ArtistBean {
            /**
             * isOrder : null
             * orderBy : null
             * asc : null
             * limit : null
             * startNum : null
             * endNum : null
             * id : 1
             * artistType : 30
             * artistName : 范元成
             * backgroundUrl : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg
             * artistLogourl : https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3513987584,1964866685&fm=26&gp=0.jpg
             * artistPhone : 13629564452
             * artistDetails : 个性
             * artistStatus : 1
             * typeName : null
             * artistExperience :
             * recommend : 0
             * commentList : []
             * videoList : []
             * experienceList : []
             * imgList : []
             */

            private Object isOrder;
            private Object orderBy;
            private Object asc;
            private Object limit;
            private Object startNum;
            private Object endNum;
            private int id;
            private String artistType;
            private String artistName;
            private String backgroundUrl;
            private String artistLogourl;
            private String artistPhone;
            private String artistDetails;
            private int artistStatus;
            private Object typeName;
            private String artistExperience;
            private int recommend;
            private List<?> commentList;
            private List<?> videoList;
            private List<?> experienceList;
            private List<?> imgList;

            public Object getIsOrder() {
                return isOrder;
            }

            public void setIsOrder(Object isOrder) {
                this.isOrder = isOrder;
            }

            public Object getOrderBy() {
                return orderBy;
            }

            public void setOrderBy(Object orderBy) {
                this.orderBy = orderBy;
            }

            public Object getAsc() {
                return asc;
            }

            public void setAsc(Object asc) {
                this.asc = asc;
            }

            public Object getLimit() {
                return limit;
            }

            public void setLimit(Object limit) {
                this.limit = limit;
            }

            public Object getStartNum() {
                return startNum;
            }

            public void setStartNum(Object startNum) {
                this.startNum = startNum;
            }

            public Object getEndNum() {
                return endNum;
            }

            public void setEndNum(Object endNum) {
                this.endNum = endNum;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getArtistType() {
                return artistType;
            }

            public void setArtistType(String artistType) {
                this.artistType = artistType;
            }

            public String getArtistName() {
                return artistName;
            }

            public void setArtistName(String artistName) {
                this.artistName = artistName;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public String getArtistLogourl() {
                return artistLogourl;
            }

            public void setArtistLogourl(String artistLogourl) {
                this.artistLogourl = artistLogourl;
            }

            public String getArtistPhone() {
                return artistPhone;
            }

            public void setArtistPhone(String artistPhone) {
                this.artistPhone = artistPhone;
            }

            public String getArtistDetails() {
                return artistDetails;
            }

            public void setArtistDetails(String artistDetails) {
                this.artistDetails = artistDetails;
            }

            public int getArtistStatus() {
                return artistStatus;
            }

            public void setArtistStatus(int artistStatus) {
                this.artistStatus = artistStatus;
            }

            public Object getTypeName() {
                return typeName;
            }

            public void setTypeName(Object typeName) {
                this.typeName = typeName;
            }

            public String getArtistExperience() {
                return artistExperience;
            }

            public void setArtistExperience(String artistExperience) {
                this.artistExperience = artistExperience;
            }

            public int getRecommend() {
                return recommend;
            }

            public void setRecommend(int recommend) {
                this.recommend = recommend;
            }

            public List<?> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<?> commentList) {
                this.commentList = commentList;
            }

            public List<?> getVideoList() {
                return videoList;
            }

            public void setVideoList(List<?> videoList) {
                this.videoList = videoList;
            }

            public List<?> getExperienceList() {
                return experienceList;
            }

            public void setExperienceList(List<?> experienceList) {
                this.experienceList = experienceList;
            }

            public List<?> getImgList() {
                return imgList;
            }

            public void setImgList(List<?> imgList) {
                this.imgList = imgList;
            }
        }


    }
}
