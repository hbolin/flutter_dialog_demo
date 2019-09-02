package com.zh.flutter_dialog_demo;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);

    DisplayMetrics outMetrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
    int widthPixels = outMetrics.widthPixels;
    int heightPixels = outMetrics.heightPixels;

    Window window = getWindow();
    window.setGravity(Gravity.BOTTOM);
    window.getDecorView().setPadding(0, 0, 0, 0);

    WindowManager.LayoutParams lp = window.getAttributes();
    lp.width = ViewGroup.LayoutParams.MATCH_PARENT;
    lp.height = (int) (heightPixels * 0.8);
    window.setAttributes(lp);
  }
}
