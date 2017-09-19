package com.example.kakyunglee.projectofseoul.SnsActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.kakyunglee.projectofseoul.R;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by KakyungLee on 2017-09-19.
 */

public class SnsWriteActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sns_write_page);
        Intent intent = getIntent();

        ImageView imageView = (ImageView)findViewById(R.id.uploadImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
                intent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,100);
            }
        });
    }

    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == 100){
            try{
                Bitmap image_bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),data.getData());
                ImageView image = (ImageView)findViewById(R.id.uploadImage);
                image.setImageBitmap(image_bitmap);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();;
            }
        }
    }
}
