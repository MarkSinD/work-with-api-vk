package com.example.vkapp.task1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vkapp.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task1_main_activity);
    }

    public void tapOnView(View view) {

        Intent intent = new Intent(this, DetailActivity.class);

        if(view.getId() == R.id.iv_1) {
            intent.putExtra(DetailActivity.iv_image, R.id.iv_1);
            intent.putExtra(DetailActivity.tv_name, R.id.tv_name_1);
            intent.putExtra(DetailActivity.tv_desc, R.id.tv_desc_1);
        }
        else if(view.getId() == R.id.iv_2) {
            intent.putExtra(DetailActivity.iv_image, R.id.iv_2);
            intent.putExtra(DetailActivity.tv_name, R.id.tv_name_2);
            intent.putExtra(DetailActivity.tv_desc, R.id.tv_desc_2);
        }
        else if(view.getId() == R.id.iv_3) {
            intent.putExtra(DetailActivity.iv_image, R.id.iv_3);
            intent.putExtra(DetailActivity.tv_name, R.id.tv_name_3);
            intent.putExtra(DetailActivity.tv_desc, R.id.tv_desc_3);
        }


    }
}