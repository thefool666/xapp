package com.example.shell;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 读取本应用在系统里的名称（MT 改资源后即为改名后的名字）
        String appName;
        try {
            PackageManager pm = getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo(getPackageName(), 0);
            appName = pm.getApplicationLabel(ai).toString();
        } catch (PackageManager.NameNotFoundException e) {
            appName = getPackageName();
        }

        TextView tv = new TextView(this);
        tv.setText(appName);
        tv.setTextSize(30);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}

