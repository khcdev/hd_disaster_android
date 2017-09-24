package com.example.kakyunglee.projectofseoul;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kakyunglee.projectofseoul.DeclareActivity.DeclareMainActivity;
import com.example.kakyunglee.projectofseoul.EvacuationActivity.EvacuationMainActivity;
import com.example.kakyunglee.projectofseoul.ListActivity.ListMainActivity;
import com.example.kakyunglee.projectofseoul.SnsActivity.SnsMainActivity;

/**
 * Created by KakyungLee on 2017-09-14.
 */

@SuppressLint("ValidFragment")
public class MainPageFragment extends Fragment{
    Context mContext;

    public MainPageFragment(Context context){
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_fragment,null);

        //지난 재난 문자 page 이동 버튼
        Button btnListPage = (Button)view.findViewById(R.id.toListPage);
        btnListPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, ListMainActivity.class);
                startActivity(intent);
            }
        });

        //재난 대피 요령 page 이동 버튼
        Button btnEvacuationPage = (Button)view.findViewById(R.id.toEvacuationPage);
        btnEvacuationPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, EvacuationMainActivity.class);
                startActivity(intent);
            }
        });

        //재난 신고 page 이동버튼
        Button btnDeclarePage = (Button)view.findViewById(R.id.toDeclarePage);
        btnDeclarePage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, DeclareMainActivity.class);
                startActivity(intent);
            }
        });

        //공유하기 page 이동버튼
        Button btnSnsPage = (Button)view.findViewById(R.id.toSnsPage);
        btnSnsPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, SnsMainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
