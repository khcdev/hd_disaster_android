package com.example.kakyunglee.projectofseoul.EvacuationData;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class DataTyphoon implements DataDisaster{

    private String define     = "태풍의 정의";
    private String  behavior  = "태풍 행동요령";
    private String provide    ="태풍 이전 대처요령";
    private String handle     ="태풍 이후 대처 방안";
    private String dangerous  ="태풍 위험성";

    public String getDefine() {return define; }

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
