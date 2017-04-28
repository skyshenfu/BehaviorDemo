package com.pain.behaviordemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zty
 * 个人github地址：http://www.github.com/skyshenfu
 * 日期：2017/4/28
 * 版本：1.0.0
 * 描述：
 */

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
//activity_main1为图片折叠后变成toolbar的效果
//activity_main2为颜色折叠后渐变效果
public class ImageActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LangAdapter adapter;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        recyclerView= (RecyclerView) findViewById(R.id.recycle_view);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbar= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        adapter=new LangAdapter(this);
        setSupportActionBar(toolbar);
        collapsingToolbar.setTitle("122");
        collapsingToolbar.setContentScrimColor(0xfff96732);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
    }
}

