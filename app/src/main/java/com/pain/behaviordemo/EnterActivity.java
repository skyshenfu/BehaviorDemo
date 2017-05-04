package com.pain.behaviordemo;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zty
 * 个人github地址：http://www.github.com/skyshenfu
 * 日期：2017/4/28
 * 版本：1.0.0
 * 描述：
 */

public class EnterActivity extends AppCompatActivity {
    Button snackButton;
    Button nestButton;
    Button simplecollspacing;
    Button imageCollspacing;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        initViews();
        initEvents(this);
    }

    private void initEvents(final Context context) {
        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,SnackBarActivity.class));
            }
        });
        nestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,NestActivity.class));
            }
        });
        simplecollspacing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,SimpleCollapsingActivity.class));
            }
        });
        imageCollspacing.setOnClickListener(v->startActivity(new Intent(context, ImageActivity.class)));
    }

    private void initViews() {
        snackButton= (Button) findViewById(R.id.button_snackbar);
        nestButton= (Button) findViewById(R.id.button_nest);
        simplecollspacing= (Button) findViewById(R.id.button_collspacing);
        imageCollspacing= (Button) findViewById(R.id.button_image);
    }
}
