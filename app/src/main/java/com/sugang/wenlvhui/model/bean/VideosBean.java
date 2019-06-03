package com.sugang.wenlvhui.model.bean;

public class VideosBean {

    /**
     * detalis : 图片描述
     * img : http://pic11.nipic.com/20101208/6332275_140730007350_2.jpg
     * video : http://mirror.aarnet.edu.au/pub/TED-talks/911Mothers_2010W-480p.mp4
     */

    private String detalis;
    private String img;

    public VideosBean(String detalis, String img, String video) {
        this.detalis = detalis;
        this.img = img;
        this.video = video;
    }

    private String video;

    public String getDetalis() {
        return detalis;
    }

    public void setDetalis(String detalis) {
        this.detalis = detalis;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}