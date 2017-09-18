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

public class EvacuationMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evacuation_page);
        Intent intent = getIntent();

        //  세부사항  page 이동
        Button btnHeat = (Button)findViewById(R.id.heat);
        btnHeat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(EvacuationMainActivity.this, EvacuationDetailInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}