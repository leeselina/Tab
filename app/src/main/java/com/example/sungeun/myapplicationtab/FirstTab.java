package com.example.sungeun.myapplicationtab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sungeun on 2017-03-14.
 */

public class FirstTab extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String activityName = getClass().getSimpleName();
        TextView tv = new TextView(this);
        tv.setText(activityName + "화면");
        setContentView(tv);
    }
}
