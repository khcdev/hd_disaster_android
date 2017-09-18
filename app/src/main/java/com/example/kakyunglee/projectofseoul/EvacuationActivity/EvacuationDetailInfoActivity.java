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

public class EvacuationDetailInfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evacuation_detail_info_page);
        Intent intent = getIntent();

        // 대피소 지도 page 이동
        Button btnShelterMap = (Button)findViewById(R.id.toShelterMapPage);
        btnShelterMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(EvacuationDetailInfoActivity.this, ShelterMap.class);
                startActivity(intent);
            }
        });
    }
}
