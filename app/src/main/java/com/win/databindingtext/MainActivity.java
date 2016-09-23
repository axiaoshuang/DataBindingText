package com.win.databindingtext;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.win.databindingtext.bean.User;
import com.win.databindingtext.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user=new User("wang","shuang");
        viewDataBinding.setUser(user);

    }
}
