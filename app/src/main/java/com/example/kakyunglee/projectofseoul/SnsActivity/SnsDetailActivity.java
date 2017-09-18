package com.example.kakyunglee.projectofseoul.SnsActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class SnsDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sns_detail_page);
        Intent intent = getIntent();
    }
}