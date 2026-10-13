package com.example.shell;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView t = new TextView(this);
        t.setText(getPackageName());
        t.setTextSize(30);
        setContentView(t);
    }
}

