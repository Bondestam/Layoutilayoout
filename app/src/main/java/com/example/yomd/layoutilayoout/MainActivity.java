package com.example.yomd.layoutilayoout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView htmlCVText = (TextView)findViewById(R.id.textView);
        htmlCVText.setText(Html.fromHtml(getString(R.string.CV)));
    }

    public void nyMetod(){
        //blabla bla

        int i = 1+1;
    }
}
