package com.suhun.lotterytransfer;

import android.app.Application;

public class MyAppData extends Application {
    public int[] num;

    public MyAppData(){
        num = new int[6];
    }
}
