package com.example.kakyunglee.projectofseoul.DeclareActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class DeclareMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.declare_page);
        Intent intent = getIntent();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("hello world");

        // 119 전화 연결
        Button btn119 = (Button)findViewById(R.id._119);
        btn119.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:119"));
                startActivity(intent);
            }
        });

        // 112 전화 연결
        Button btn112 = (Button)findViewById(R.id._112);
        btn112.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"));
                startActivity(intent);
            }
        });

        // 110 전화 연결
        Button btn110 = (Button)findViewById(R.id._110);
        btn110.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:110"));
                startActivity(intent);
            }
        });

        //재난 피해 신고 사이트
        Button btnDisasterDeclare = (Button)findViewById(R.id.damage);
        btn119.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.safekorea.go.kr"));
                startActivity(intent);
            }
        });
    }
}
