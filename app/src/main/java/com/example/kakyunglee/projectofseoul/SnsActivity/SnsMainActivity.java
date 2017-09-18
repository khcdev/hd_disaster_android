package com.example.kakyunglee.projectofseoul.SnsActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class SnsMainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sns_page);
        Intent intent = getIntent();

        // 세부 sns page 이동
        Button btnHeat = (Button)findViewById(R.id.toSnsDetailPage);
        btnHeat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SnsMainActivity.this, SnsDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}