package com.ngocdiem.tuan2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.ngocdiem.tuan2.R.id.change_background;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_ACT_B = 1000;
    public static final int REQUEST_ACT_C = 2000;
    public static String TEXT ="text";
    public static String COLOR ="color";
    int color = 1;
    @BindView(R.id.View) TextView textview;
    @BindView(R.id.view) ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
 }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ACT_C) {
            if (resultCode == RESULT_OK) {
                String ba = data.getStringExtra(Main3Activity.BACKGROUND);
                int resId = getResources().getIdentifier(ba, "drawable", MainActivity.this.getPackageName());
                Drawable drawable = getResources().getDrawable(resId);
                //Picasso.with(this).load(resId).into(image);
                image.setImageResource(resId);
            }
        } else {
            if (requestCode == REQUEST_ACT_B) {
                if (resultCode == RESULT_OK) {
                    String text = data.getStringExtra(Main2Activity.TEXT);
                    textview.setText(text);
                    color = data.getIntExtra(Main2Activity.COLOR, 0);
                    switch(color)
                    {
                        case 1:
                            textview.setTextColor(getResources().getColor(R.color.pink));
                            break;
                        case 2:
                            textview.setTextColor(getResources().getColor(R.color.purple));
                            break;
                        case 3:
                            textview.setTextColor(getResources().getColor(R.color.indigo));
                            break;
                        case 4:
                            textview.setTextColor(getResources().getColor(R.color.blue));
                            break;
                        case 5:
                            textview.setTextColor(getResources().getColor(R.color.teal));
                            break;
                        case 6:
                            textview.setTextColor(getResources().getColor(R.color.green));
                            break;
                    }
                }
            }

        }
    }

    @OnClick(value = R.id.Change_title)
    public void onButton1Click(View view) {
        Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
        i1.putExtra(TEXT,textview.getText().toString());
        i1.putExtra(COLOR,color);
        startActivityForResult(i1,REQUEST_ACT_B);
    }

    @OnClick(value = R.id.change_background)
    public void onButton2Click(View view) {
        Intent i2 = new Intent(MainActivity.this, Main3Activity.class);
        startActivityForResult(i2,REQUEST_ACT_C);
    }
}
