package com.example.kakyunglee.projectofseoul.ListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class ListMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page);
        Intent intent = getIntent();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("RECENT MESSAGE");

        //  세부사항  page 이동
        Button btnDetail = (Button)findViewById(R.id.toListDetailPage);
        btnDetail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ListMainActivity.this, ListDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}