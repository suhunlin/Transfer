package com.suhun.lotterytransfer;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();
    private MyAppData myAppData;
    private ActivityResultLauncher startActivityCallBalck = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d(tag, "Main Activity Call back");

                }
            }
    );
    Button createBtn, goPage2Btn;
    TextView showInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        myAppData = (MyAppData) getApplication();
    }
    private void initView(){
        createBtn = findViewById(R.id.create);
        goPage2Btn = findViewById(R.id.goPage2);
        showInfo = findViewById(R.id.info);
    }

    public void createLottery(View view) {
        createLottery();
        if(myAppData.num[0] != myAppData.num[1]){
            showInfo.setText("Success!");
        }else{
            showInfo.setText("Fail");
        }
    }

    public void goPage2(View view) {
        if(myAppData.num[0] == myAppData.num[1]){
            showInfo.setText("Lottery num not create!!");
        }
        else{
            Intent intent = new Intent(this, Page2Activity.class);
            startActivityCallBalck.launch(intent);
        }
    }

    private void createLottery(){
        TreeSet<Integer> numSet = new TreeSet<>();
        while(numSet.size()<myAppData.num.length){
            numSet.add(new Random().nextInt(49) + 1);
        }
        int i=0;
        for(Integer num:numSet){
            myAppData.num[i++] = num;
        }
    }
}