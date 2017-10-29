package com.yu.lin.qodkaewrioqruerjkrje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yu.lin.qodkaewrioqruerjkrje.async.OneTask;
import com.yu.lin.qodkaewrioqruerjkrje.async.ThreeTask;
import com.yu.lin.qodkaewrioqruerjkrje.async.TwoTask;
import com.yu.lin.testasynctask.R;

/**
 * Created by Lin-Yu on 29/10/2017.
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button go1;
    private Button go2;
    private Button go3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go1 = (Button) findViewById(R.id.button5);
        go2 = (Button) findViewById(R.id.button7);
        go3 = (Button) findViewById(R.id.button6);
    }

    @Override
    protected void onResume(){
        super.onResume();
        go1.setOnClickListener(this);
        go2.setOnClickListener(this);
        go3.setOnClickListener(this);
    }

    public void go1(View v){
        new OneTask(this).execute();
    }

    public void go2(View v){
        new TwoTask(this).execute(3);
    }

    public void go3(View v){
        new ThreeTask(this).execute(6);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button5:
                go1(v);
                break;
            case R.id.button7:
                go2(v);
                break;
            case R.id.button6:
                go3(v);
                break;
        }
    }
}
