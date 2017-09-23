package com.example.kakyunglee.projectofseoul.EvacuationActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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
        ImageButton btnTyphoon = (ImageButton)findViewById(R.id.typhoon);
        btnTyphoon.setOnClickListener(this);

        ImageButton btnDownpour = (ImageButton)findViewById(R.id.downpour);
        btnDownpour.setOnClickListener(this);

        ImageButton btnFlood = (ImageButton)findViewById(R.id.flood);
        btnFlood.setOnClickListener(this);

        ImageButton btnHeavySnow = (ImageButton)findViewById(R.id.heavy_snow);
        btnHeavySnow.setOnClickListener(this);

        ImageButton btnStormTsunami = (ImageButton)findViewById(R.id.storm_tsunami);
        btnStormTsunami.setOnClickListener(this);

        ImageButton btnTsunami = (ImageButton)findViewById(R.id.tsunami);
        btnTsunami.setOnClickListener(this);

        ImageButton btnColdWave = (ImageButton)findViewById(R.id.cold_wave);
        btnColdWave.setOnClickListener(this);

        ImageButton btnGale = (ImageButton)findViewById(R.id.gale);
        btnGale.setOnClickListener(this);

        ImageButton btnStorm = (ImageButton)findViewById(R.id.storm);
        btnStorm.setOnClickListener(this);

        ImageButton btnDry = (ImageButton)findViewById(R.id.dry);
        btnDry.setOnClickListener(this);

        ImageButton btnDustStorm = (ImageButton)findViewById(R.id.dust_storm);
        btnDustStorm.setOnClickListener(this);

        ImageButton btnHeat = (ImageButton)findViewById(R.id.heat);
        btnHeat.setOnClickListener(this);

        ImageButton btnGrasping = (ImageButton)findViewById(R.id.grasping);
        btnGrasping.setOnClickListener(this);

        ImageButton btnFog = (ImageButton)findViewById(R.id.fog);
        btnFog.setOnClickListener(this);

        ImageButton btnFineDust = (ImageButton)findViewById(R.id.fine_dust);
        btnFineDust.setOnClickListener(this);

        ImageButton btnCivilDefense = (ImageButton)findViewById(R.id.civil_defense);
        btnHeat.setOnClickListener(this);

        ImageButton btnFirstAid = (ImageButton)findViewById(R.id.first_aid);
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