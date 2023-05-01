package com.suhun.lotterytransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyAppData myAppData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAppData = (MyAppData) getApplication();
    }

    public void createLottery(View view) {
    }

    public void goPage2(View view) {
    }
}