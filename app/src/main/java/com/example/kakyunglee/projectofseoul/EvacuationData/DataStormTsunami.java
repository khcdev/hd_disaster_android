package com.example.kakyunglee.projectofseoul.EvacuationData;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class DataStormTsunami implements  DataDisaster{
    String define     = "폭풍해일 정의";
    String  behavior  = "폭풍해일 행동요령";
    String provide    ="폭풍해일 이전 대처요령";
    String handle     ="폭풍해일 이후 대처 방안";
    String dangerous  ="폭풍해일 위험성";

    public String getDefine() {
        return define;
    }

    public String getBehavior() {
        return behavior;
    }

    public String getProvide() {
        return provide;
    }

    public String getHandle() {
        return handle;
    }

    public String getDangerous() {
        return dangerous;
    }
}
