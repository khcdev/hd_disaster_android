package com.example.kakyunglee.projectofseoul.EvacuationActivity;

import com.example.kakyunglee.projectofseoul.EvacuationData.DataCivilDefense;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataColdWave;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataDisaster;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataDownpour;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataDry;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataDustStorm;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataFineDust;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataFirstAid;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataFlood;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataFog;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataGale;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataGrasping;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataHeat;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataHeavySnow;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataStorm;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataStormTsunami;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataTsunami;
import com.example.kakyunglee.projectofseoul.EvacuationData.DataTyphoon;

/**
 * Created by KakyungLee on 2017-09-24.
 */

public class EvacuationData {
    private String define    = "null";
    private String behavior  = "null";
    private String provide   = "null";
    private String handle    = "null";
    private String dangerous = "null";
    DataDisaster data;

    EvacuationData(String type){
        switch(type){
            case "Typhoon":
                data = new DataTyphoon();
                break;
            case "Downpour":
                data = new DataDownpour();
                break;
            case "Flood":
                data = new DataFlood();
                break;
            case "HeavySnow":
                data = new DataHeavySnow();
                break;
            case "StormTsunami":
                data = new DataStormTsunami();
                break;
            case"Tsunami":
                data = new DataTsunami();
                break;
            case "ColdWave":
                data = new DataColdWave();
                break;
            case "Gale":
                data = new DataGale();
                break;
            case "Storm":
                data = new DataStorm();
                break;
            case "Dry":
                data = new DataDry();
                break;
            case "DustStorm":
                data = new DataDustStorm();
                break;
            case "Heat":
                data = new DataHeat();
                break;
            case "Grasping":
                data = new DataGrasping();
                break;
            case "Fog":
                data = new DataFog();
                break;
            case "FineDust":
                data = new DataFineDust();
                break;
            case "CivilDefense":
                data = new DataCivilDefense();
                break;
            case "FirstAid":
                data = new DataFirstAid();
                break;

        }
    }

    public String getDefine() {
        define = data.getDefine();
        return define;
    }

    public String getBehavior() {
        behavior = data.getBehavior();
        return behavior;
    }

    public String getProvide() {
        provide = data.getProvide();
        return provide;
    }

    public String getHandle() {
        handle = data.getHandle();
        return handle;
    }

    public String getDangerous() {
        dangerous = data.getDangerous();
        return dangerous;
    }


}
