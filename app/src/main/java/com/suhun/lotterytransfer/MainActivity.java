package com.suhun.lotterytransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MyAppData myAppData;
    Button createBtn, goPage2Btn;
    TextView showInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAppData = (MyAppData) getApplication();
    }
    private void initView(){
        createBtn = findViewById(R.id.create);
        goPage2Btn = findViewById(R.id.goPage2);
        showInfo = findViewById(R.id.info);
    }

    public void createLottery(View view) {
    }

    public void goPage2(View view) {
    }
}