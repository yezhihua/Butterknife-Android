package com.xiuzhu.butterknifedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tv_test)
    TextView mTextView;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_test)
    void onClick() {

        if (!flag) {
            flag = true;
            mTextView.setText("hello ButterKnife");
        } else {
            flag = false;
            mTextView.setText("hello world");
        }

    }
}
