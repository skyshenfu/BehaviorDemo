package com.pain.behaviordemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

/**
 * Created by zty
 * 个人github地址：http://www.github.com/skyshenfu
 * 日期：2017/4/28
 * 版本：1.0.0
 * 描述：
 */

public class SimpleCollapsingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LangAdapter adapter;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplecollapsing);
        recyclerView= (RecyclerView) findViewById(R.id.recycle_view);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbar= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        adapter=new LangAdapter(this);
        setSupportActionBar(toolbar);
        collapsingToolbar.setTitle("122");
        //collapsingToolbar.setContentScrimColor(0x7d000000);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
    }
}
