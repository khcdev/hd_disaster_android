package com.example.kakyunglee.projectofseoul.EvacuationData;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class DataDry implements DataDisaster{
    String define     = "태풍의 정의";
    String  behavior  = "태풍 행동요령";
    String provide    ="태풍 이전 대처요령";
    String handle     ="태풍 이후 대처 방안";
    String dangerous  ="태풍 위험성";

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
