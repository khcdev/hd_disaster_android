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

import com.example.kakyunglee.projectofseoul.EvacuationActivity.EvacuationDetailInfoActivity;
import com.example.kakyunglee.projectofseoul.EvacuationActivity.ShelterMap;
import com.example.kakyunglee.projectofseoul.SnsActivity.SnsMainActivity;

/**
 * Created by KakyungLee on 2017-09-14.
 */

@SuppressLint("ValidFragment")
public class TodayPageFragment extends Fragment {

    Context mContext;

    public TodayPageFragment(Context context){
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.today_fragment,null);

        // 세부 대피요령 page 이동
        Button btnEavcuationDetailInfoPage = (Button)view.findViewById(R.id.toEavcuationDetailInfoPage);
        btnEavcuationDetailInfoPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, EvacuationDetailInfoActivity.class);
                startActivity(intent);
            }
        });

        // 대피소 지도 page 이동
        Button btnShelterMap = (Button)view.findViewById(R.id.toMap);
        btnShelterMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, ShelterMap.class);
                startActivity(intent);
            }
        });

        // sns page 이동
        Button btnSnsPage = (Button)view.findViewById(R.id.toSns);
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
