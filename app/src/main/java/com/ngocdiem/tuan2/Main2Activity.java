package com.ngocdiem.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.viewSample)View vi;
    @BindView(R.id.edt)EditText edt;
    public static String TEXT ="text";
    public static String COLOR = "color";
    String text;
    int color1,color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getData();
    }


    @OnClick(value = R.id.iv1)
    public void oniv1Click(View view) {
        vi.setBackgroundResource(R.color.pink);
        color2=1;
    }

    @OnClick(value = R.id.iv2)
    public void oniv2Click(View view) {
        vi.setBackgroundResource(R.color.purple);
        color2=2;
    }

    @OnClick(value = R.id.iv3)
    public void oniv3Click(View view) {
        vi.setBackgroundResource(R.color.indigo);
        color2=3;
    }

    @OnClick(value = R.id.iv4)
    public void oniv4Click(View view) {
        vi.setBackgroundResource(R.color.blue);
        color2=4;
    }

    @OnClick(value = R.id.iv5)
    public void oniv5Click(View view) {
        vi.setBackgroundResource(R.color.teal);
        color2=5;
    }

    @OnClick(value = R.id.iv6)
    public void oniv6Click(View view) {
        vi.setBackgroundResource(R.color.green);
        color2=6;
    }

    @OnClick(value = R.id.btnSave)
    public void onButtonClick(View view) {
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        i.putExtra(TEXT,edt.getText().toString());
        i.putExtra(COLOR,color2);
        setResult(RESULT_OK,i);
        finish();
    }
    public void getData(){
        Intent intent = getIntent();
        text=intent.getStringExtra(MainActivity.TEXT);
        edt.setText(text);
        color1 = intent.getIntExtra(MainActivity.COLOR,0);
        switch(color1)
        {
            case 1:
                vi.setBackgroundResource(R.color.pink);
                break;
            case 2:
                vi.setBackgroundResource(R.color.purple);
                break;
            case 3:
                vi.setBackgroundResource(R.color.indigo);
                break;
            case 4:
                vi.setBackgroundResource(R.color.blue);
                break;
            case 5:
                vi.setBackgroundResource(R.color.teal);
                break;
            case 6:
                vi.setBackgroundResource(R.color.green);
                break;
        }
    }


}
