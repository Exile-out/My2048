package com.example.my2048;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2048 extends AppCompatActivity implements View.OnClickListener {

    private Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2048);
        initView();
    }

    private void initView() {
        startGame = (Button) findViewById(R.id.start_game);
        startGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_game:
                Intent intent =new Intent(Activity2048.this,GameActivity.class);
                startActivity(intent);
                break;
        }
    }
}
