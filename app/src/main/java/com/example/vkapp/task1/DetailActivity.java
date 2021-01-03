package com.example.vkapp.task1;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vkapp.R;

public class DetailActivity extends AppCompatActivity {

    public static final String iv_image = "iv_image";
    public static final String tv_name = "tv_name";
    public static final String tv_desc = "tv_desc";

    EditText ed_name;
    EditText ed_desc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            String name = savedInstanceState.getString(tv_name);
            String desc = savedInstanceState.getString(tv_desc);
            if(!(TextUtils.isEmpty(name)))
                ed_name.setText(name);
            if(!(TextUtils.isEmpty(desc)))
                ed_desc.setText(desc);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_share){
        }

        return true;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String textName = ed_name.getText().toString();
        String textDesc = ed_desc.getText().toString();
        outState.putString(tv_name, textName);
        outState.putString(tv_desc, textDesc);

    }
}
