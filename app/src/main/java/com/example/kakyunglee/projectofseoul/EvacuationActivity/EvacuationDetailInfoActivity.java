package com.example.kakyunglee.projectofseoul.EvacuationActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.kakyunglee.projectofseoul.R;

public class EvacuationDetailInfoActivity extends AppCompatActivity {

    private String define;
    private String  behavior;
    private String provide;
    private String handle;
    private String dangerous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evacuation_detail_info_page);
        Intent intent = getIntent();
        String type = intent.getStringExtra("data");
        EvacuationData data = new EvacuationData(type);

        // 종류에 맞는 데이터 입력
        define = data.getDefine();
        behavior = data.getBehavior();
        provide = data.getProvide();
        handle = data.getHandle();
        dangerous = data.getDangerous();

        // 화면 내용 설정
        final TextView textDefine = (TextView)findViewById(R.id.define_content);
        textDefine.setText(define);

        final TextView textBehavior = (TextView)findViewById(R.id.behavior_content);
        textBehavior.setText(behavior);

        final TextView textProvide = (TextView)findViewById(R.id.provide_content);
        textProvide.setText(provide);

        final TextView textHandle = (TextView)findViewById(R.id.handle_content);
        textHandle.setText(handle);

        final TextView textDangerous = (TextView)findViewById(R.id.dangerous_content);
        textDangerous.setText(dangerous);

        //toggle button 입력시 text view 보이기
        final ToggleButton btnDefine = (ToggleButton)findViewById(R.id.define);
        btnDefine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(btnDefine.isChecked()){
                    textDefine.setVisibility(View.VISIBLE);
                }
                else{
                    textDefine.setVisibility(View.GONE);
                }
            }
        });

        final ToggleButton btnBehavior = (ToggleButton)findViewById(R.id.behavior);
        btnBehavior.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(btnBehavior.isChecked()){
                    textBehavior.setVisibility(View.VISIBLE);
                }
                else{
                    textBehavior.setVisibility(View.GONE);
                }
            }
        });

        final ToggleButton btnProvide = (ToggleButton)findViewById(R.id.provide);
        btnProvide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(btnProvide.isChecked()){
                    textProvide.setVisibility(View.VISIBLE);
                }
                else{
                    textProvide.setVisibility(View.GONE);
                }
            }
        });

        final ToggleButton btnHandle = (ToggleButton)findViewById(R.id.handle);
        btnHandle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(btnHandle.isChecked()){
                    textHandle.setVisibility(View.VISIBLE);
                }
                else{
                    textHandle.setVisibility(View.GONE);
                }
            }
        });

        final ToggleButton btnDangerous = (ToggleButton)findViewById(R.id.dangerous);
        btnDangerous.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                if(btnDangerous.isChecked()){
                    textDangerous.setVisibility(View.VISIBLE);
                }
                else{
                    textDangerous.setVisibility(View.GONE);
                }
            }
        });

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
