package com.example.greenbooty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class privacy_Ui extends AppCompatActivity {

    private Button nxtBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy);

        Button nxtButton = (Button) findViewById(R.id.nxtBtn);
        nxtButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ openConvo();
            }
        });

    }

    public void openConvo(){
        Intent intent = new Intent(privacy_Ui.this, startConvo.class);
        startActivity(intent);
    }

}
