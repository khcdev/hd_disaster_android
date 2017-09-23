package com.example.kakyunglee.projectofseoul.EvacuationData;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class DataTsunami implements  DataDisaster{
    String define     = "스나미 정의";
    String  behavior  = "스나미 행동요령";
    String provide    ="스나미 이전 대처요령";
    String handle     ="스나미 이후 대처 방안";
    String dangerous  ="스나미 위험성";

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
