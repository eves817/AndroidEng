package com.example.english5;

public class Post extends MainActivity {
    public String KK;
    public String PartsOfSpeech;
    public String VOC;
    public String VOC_CN_Explanation;
    public String VOC_EG_Explanation;


    public Post(String KK, String partsOfSpeech, String VOC, String VOC_CN_Explanation, String VOC_EG_Explanation) {
        this.KK = KK;
        this.PartsOfSpeech = partsOfSpeech;
        this.VOC = VOC;
        this.VOC_CN_Explanation = VOC_CN_Explanation;
        this.VOC_EG_Explanation = VOC_EG_Explanation;
    }

    public String getKK() {
        return KK;
    }

    public void setKK(String KK) {
        this.KK = KK;
    }

    public String getPartsOfSpeech() {
        return PartsOfSpeech;
    }

    public void setPartsOfSpeech(String partsOfSpeech) {
        this.PartsOfSpeech = partsOfSpeech;
    }

    public String getVOC() {
        return VOC;
    }

    public void setVOC(String VOC) {
        this.VOC = VOC;
    }

    public String getVOC_CN_Explanation() {
        return VOC_CN_Explanation;
    }

    public void setVOC_CN_Explanation(String VOC_CN_Explanation) {
        this.VOC_CN_Explanation = VOC_CN_Explanation;
    }

    public String getVOC_EG_Explanation() {
        return VOC_EG_Explanation;
    }

    public void setVOC_EG_Explanation(String VOC_EG_Explanation) {
        this.VOC_EG_Explanation = VOC_EG_Explanation;
    }

}

