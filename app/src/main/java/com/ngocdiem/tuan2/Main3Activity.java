package com.ngocdiem.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends AppCompatActivity {
    public static final String BACKGROUND = "BACKGROUND";
    String background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        }

    @OnClick(value = R.id.iv1)
    public void oniv1Click(View view) {
        background = "a";
    }

    @OnClick(value = R.id.iv2)
    public void oniv2Click(View view) {
        background = "b";
    }

    @OnClick(value = R.id.iv3)
    public void oniv3Click(View view) {
        background = "c";
    }

    @OnClick(value = R.id.iv4)
    public void oniv4Click(View view) {
        background = "d";
    }

    @OnClick(value = R.id.iv5)
    public void oniv5Click(View view) {
        background = "e";
    }

    @OnClick(value = R.id.iv6)
    public void oniv6Click(View view) {
        background = "f";
    }

    @OnClick(value = R.id.btnSave)
    public void onButtonClick(View view) {
        Intent i = new Intent();
        i.putExtra(BACKGROUND,background);
        setResult(RESULT_OK,i);
        finish();
    }
}
