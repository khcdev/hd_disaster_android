package com.example.kakyunglee.projectofseoul.ListActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.kakyunglee.projectofseoul.R;

/**
 * Created by KakyungLee on 2017-09-14.
 */

public class ListDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_detail_page);
        Intent intent = getIntent();
    }
}
