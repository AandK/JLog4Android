package com.ahking.jlogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<Integer, String> mHashMap= new HashMap<Integer, String>();
    private ArrayList<String> mArrayList = new ArrayList<String>();

    private static final String mJson = "{\"phonetype\":\"N95\",\"cat\":\"WP\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        mHashMap.put(1,"a");
        mHashMap.put(2,"b");
        mHashMap.put(3,"c");
        mHashMap.put(4,"d");
        mHashMap.put(5,"e");

        mArrayList.add("one");
        mArrayList.add("two");
        mArrayList.add("three");
    }

    public void logWithNothing(View view) {
        JLog.i();
    }

    public void logWithContent(View view) {
        JLog.i("your log message");
    }

    public void logWithStackTrace(View view) {
        printStackTrace();
    }

    public void logHashMap(View view) {
        JLog.printHashMapObj(mHashMap);
    }

    public void logArrayList(View view) {
        JLog.printArrayListObj(mArrayList);
    }

    private void printStackTrace() {
        JLog.printStackTrace();
    }

}
