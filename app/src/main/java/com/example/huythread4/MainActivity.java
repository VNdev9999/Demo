package com.example.huythread4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

            private TextView tvNumber ;
            private Button btnIncrease;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        tvNumber = (TextView) findViewById(R.id.tv_number);
        btnIncrease = (Button) findViewById(R.id.btn_increase);
        btnIncrease.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_increase:
                doIncreaseNumber();
                break;
            default:
                break;
        }
    }

    private void doIncreaseNumber() {

    }
    private class MyAsync extends AsyncTask<Void , Integer , Void>{

        @Override
        protected Void doInBackground(Void... voids) {
                return null;
        }
    };
}
