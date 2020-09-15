package com.github.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.content.Intent.*;

public class MainActivity extends AppCompatActivity {
Button b;
EditText E;
    TextView v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Hbutton);
        E =(EditText) findViewById(R.id.HPersonName);
        v=(TextView)findViewById(R.id.HtextView);
        String s= E.getText().toString();
        v.setText("Hello"+s);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String s= E.getText().toString();

               sendData(s);
               //Intent i= getIntent();




           }
       });
    }

    private void sendData(String s) {
        Intent intent = new Intent(this, this);
        intent.putExtra(name"HPersonName", s);
        startActivity(intent);
    }
}