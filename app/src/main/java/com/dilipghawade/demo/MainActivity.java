package com.dilipghawade.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  TextView textView;
  Button btnok,btnshow;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = findViewById(R.id.txt_show);
    btnok = findViewById(R.id.btn_ok);
    btnshow = findViewById(R.id.btn_showActivity);

    btnok.setOnClickListener(this);
    textView.setOnClickListener(this);

    btnshow.setOnClickListener(this);

  }

  @Override
  public void onClick(View view) {
    switch (view.getId())
    {
      case R.id.txt_show:
        textviewClick();
        break;
      case R.id.btn_ok:
        btnClick();
        break;
      case R.id.btn_showActivity:
        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
        finish();
        break;
        default:
    }

  }
  public void textviewClick()
  {
    Toast.makeText(this, "Toast Message", Toast.LENGTH_SHORT).show();
  }
  public void btnClick()
  {
    textView.setVisibility(View.VISIBLE);
    textView.setText("Welcome...!!!");
  }
}
