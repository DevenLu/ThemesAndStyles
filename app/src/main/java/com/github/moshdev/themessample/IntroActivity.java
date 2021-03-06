package com.github.moshdev.themessample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.moshdev.themessample.appcompat.MaterialActivity;
import com.github.moshdev.themessample.appcompat.ToolbarActivity;
import com.github.moshdev.themessample.attributes.AttributesActivity;
import com.github.moshdev.themessample.style_vs_theme.StyleVsTheme1Activity;
import com.github.moshdev.themessample.style_vs_theme.StyleVsTheme2Activity;
import com.github.moshdev.themessample.theme.InLayoutThemeActivity;
import com.github.moshdev.themessample.themewrapper.ContextThemeWrapperActivity;
import com.github.moshdev.themessample.themewrapper.ContextThemeWrapperDarkActivity;
import com.github.moshdev.themessample.themewrapper.ContextThemeWrapperLightActivity;

public class IntroActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intro);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }


  public void styleVsTheme1(View view) {
    startActivity(new Intent(this, StyleVsTheme1Activity.class));
  }

  public void styleVsTheme2(View view) {
    startActivity(new Intent(this, StyleVsTheme2Activity.class));
  }

  public void attributesActivity(View view) {
    startActivity(new Intent(this, AttributesActivity.class));
  }

  public void materialActivity(View view) {
    startActivity(new Intent(this, MaterialActivity.class));
  }

  public void toolbarActivity(View view) {
    startActivity(new Intent(this, ToolbarActivity.class));
  }

  public void inLayoutThemeActivity(View view) {
    startActivity(new Intent(this, InLayoutThemeActivity.class));
  }

  public void contextThemeWrapperActivity(View view) {
    startActivity(new Intent(this, ContextThemeWrapperActivity.class));
  }

  public void contextThemeWrapperLightActivity(View view) {
    startActivity(new Intent(this, ContextThemeWrapperLightActivity.class));
  }

  public void contextThemeWrapperDarkActivity(View view) {
    startActivity(new Intent(this, ContextThemeWrapperDarkActivity.class));
  }
}
