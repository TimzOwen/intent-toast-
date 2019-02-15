package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ReceivedActivity extends AppCompatActivity {

    TextView textView;
    TextView tvRvd;
    Button  btnBack;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);

        textView = (TextView) findViewById(R.id.tvSecond);

        tvRvd = (TextView) findViewById(R.id.tvMsgRvd);

        btnBack = (Button) findViewById(R.id.btnBack);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ReceivedActivity.this, "Let's continue next time", Toast.LENGTH_SHORT).show();
            }
        });

        tvRvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReceivedActivity.this, "Message Received", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ReceivedActivity.this, "Going Back",Toast.LENGTH_LONG).show();

                Intent backwrd = new Intent(ReceivedActivity.this, MainActivity.class);
                startActivity(backwrd);
            }
        });

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ReceivedActivity.this, "doone",Toast.LENGTH_SHORT).show();

                Intent progress = new Intent(ReceivedActivity.this, ProgressActivity.class);
                startActivity(progress);
            }
        });
    }
}
