package com.suhun.lotterytransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page2Activity extends AppCompatActivity {
    private MyAppData myAppData;
    private Button exitBtn;
    private TextView[] numTextView;
    private int[] numResourceId = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        myAppData = (MyAppData) getApplication();
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLottery();
    }

    private void initView(){
        numTextView = new TextView[myAppData.num.length];
        for(int i=0;i<numResourceId.length;i++){
            numTextView[i] = findViewById(numResourceId[i]);
        }
        exitBtn = findViewById(R.id.exit);
    }

    private void showLottery(){
        for(int i=0; i<myAppData.num.length; i++){
            numTextView[i].setText(""+myAppData.num[i]);
        }
    }


    public void exit(View view) {
        finish();
    }
}