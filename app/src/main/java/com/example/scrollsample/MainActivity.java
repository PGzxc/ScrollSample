package com.example.scrollsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener() {
        findViewById(R.id.btn_scroll_normal).setOnClickListener(view -> startActivity(ScrollViewActivity.class));
        findViewById(R.id.btn_scroll_viewGroup).setOnClickListener(view -> startActivity(MultiScreenActivity.class));
    }

    private void startActivity(Class cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
