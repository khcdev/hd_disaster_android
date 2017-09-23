package com.example.kakyunglee.projectofseoul.EvacuationActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class EvacuationMainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evacuation_page);
        Intent intent = getIntent();

        //  세부사항  page 이동
        Button btnTyphoon = (Button)findViewById(R.id.typhoon);
        btnTyphoon.setOnClickListener(this);

        Button btnDownpour = (Button)findViewById(R.id.downpour);
        btnDownpour.setOnClickListener(this);

        Button btnFlood = (Button)findViewById(R.id.flood);
        btnFlood.setOnClickListener(this);

        Button btnHeavySnow = (Button)findViewById(R.id.heavy_snow);
        btnHeavySnow.setOnClickListener(this);

        Button btnStormTsunami = (Button)findViewById(R.id.storm_tsunami);
        btnStormTsunami.setOnClickListener(this);

        Button btnTsunami = (Button)findViewById(R.id.tsunami);
        btnTsunami.setOnClickListener(this);

        Button btnColdWave = (Button)findViewById(R.id.cold_wave);
        btnColdWave.setOnClickListener(this);

        Button btnGale = (Button)findViewById(R.id.gale);
        btnGale.setOnClickListener(this);

        Button btnStorm = (Button)findViewById(R.id.storm);
        btnStorm.setOnClickListener(this);

        Button btnDry = (Button)findViewById(R.id.dry);
        btnDry.setOnClickListener(this);

        Button btnDustStorm = (Button)findViewById(R.id.dust_storm);
        btnDustStorm.setOnClickListener(this);

        Button btnHeat = (Button)findViewById(R.id.heat);
        btnHeat.setOnClickListener(this);

        Button btnGrasping = (Button)findViewById(R.id.grasping);
        btnGrasping.setOnClickListener(this);

        Button btnFog = (Button)findViewById(R.id.fog);
        btnFog.setOnClickListener(this);

        Button btnFineDust = (Button)findViewById(R.id.fine_dust);
        btnFineDust.setOnClickListener(this);

        Button btnCivilDefense = (Button)findViewById(R.id.civil_defense);
        btnHeat.setOnClickListener(this);

        Button btnFirstAid = (Button)findViewById(R.id.first_aid);
        btnFirstAid.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent intent = new Intent(EvacuationMainActivity.this, EvacuationDetailInfoActivity.class);

        switch(v.getId()){
            case R.id.typhoon:
                intent.putExtra("data","Typhoon");
                break;
            case R.id.downpour:
                intent.putExtra("data","Downpour");
                break;
            case R.id.flood:
                intent.putExtra("data","Flood");
                break;
            case R.id.heavy_snow:
                intent.putExtra("data","HeavySnow");
                break;
            case R.id.storm_tsunami:
                intent.putExtra("data","StormTsunami");
                break;
            case R.id.tsunami:
                intent.putExtra("data","Tsunami");
                break;
            case R.id.cold_wave:
                intent.putExtra("data","ColdWave");
                break;
            case R.id.gale:
                intent.putExtra("data","Gale");
                break;
            case R.id.storm:
                intent.putExtra("data","Storm");
                break;
            case R.id.dry:
                intent.putExtra("data","Dry");
                break;
            case R.id.dust_storm:
                intent.putExtra("data","DustStorm");
                break;
            case R.id.heat:
                intent.putExtra("data","Heat");
                break;
            case R.id.grasping:
                intent.putExtra("data","Grasping");
                break;
            case R.id.fog:
                intent.putExtra("data","Fog");
                break;
            case R.id.fine_dust:
                intent.putExtra("data","FineDust");
                break;
            case R.id.civil_defense:
                intent.putExtra("data","CivilDefense");
                break;
            case R.id.first_aid:
                intent.putExtra("data","FirstAid");
                break;

        }
        startActivity(intent);
    }
}