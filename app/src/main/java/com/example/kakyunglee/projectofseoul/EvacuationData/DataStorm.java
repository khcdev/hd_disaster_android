package com.example.kakyunglee.projectofseoul.EvacuationData;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class DataStorm implements  DataDisaster{
    String define     = "호우 정의";
    String  behavior  = "호우 행동요령";
    String provide    ="호우 이전 대처요령";
    String handle     ="호우 이후 대처 방안";
    String dangerous  ="호우 위험성";

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
