package com.example.scrollsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 滑动View
 */

public class ScrollViewActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        initView();
        setListener();
    }

    private void initView() {
        textView = findViewById(R.id.tv_scroll);
    }

    private void setListener() {

        findViewById(R.id.bt_scrollLeft).setOnClickListener(view -> scrollLeft());
        findViewById(R.id.bt_scrollRight).setOnClickListener(view -> scrollRight());

    }

    private void scrollLeft() {

        textView.scrollBy(20, 0);
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        System.out.println(" scrollX ---> " + scrollX + " --- scrollY ---> " + scrollY);
    }

    private void scrollRight() {
        textView.scrollTo(-100, 0);
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        System.out.println(" scrollX ---> " + scrollX + " --- scrollY ---> " + scrollY);
    }
}
