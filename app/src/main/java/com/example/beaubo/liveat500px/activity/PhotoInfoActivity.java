package com.example.beaubo.liveat500px.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.beaubo.liveat500px.R;
import com.example.beaubo.liveat500px.dao.PhotoItemDao;
import com.example.beaubo.liveat500px.fragment.MoreInfoFragment;

public class PhotoInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        PhotoItemDao dao = getIntent().getParcelableExtra("dao");

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.photoInfo, MoreInfoFragment.newInstance(dao))
                    .commit();
        }
    }






}

