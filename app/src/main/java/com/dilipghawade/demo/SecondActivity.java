package com.dilipghawade.demo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    launchFragment(new com.dilipghawade.demo.Fragment());
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();
    Intent i = new Intent(SecondActivity.this,MainActivity.class);
    startActivity(i);
    finish();
  }
  public void launchFragment(Fragment fragment)
  {
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.Main_Container,fragment,getClass().getName());
    ft.commit();
  }
}
