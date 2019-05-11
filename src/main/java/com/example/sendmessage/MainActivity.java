package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnSend);// This declares the button for reference of xml ids and java code
//create a a listner to check on the button that has been clicked on for the funtion to de done
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "DataSend" ,Toast.LENGTH_LONG).show();

                Intent second = new Intent(MainActivity.this, ReceivedActivity.class);

                startActivity(second);
            }
        });


    }
}
