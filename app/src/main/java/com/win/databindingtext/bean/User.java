package com.win.databindingtext.bean;

import android.view.View;
import android.widget.Toast;

/**
 * Author: wangshuang
 * Time: 16/9/23
 * Email:xiaoshuang990@sina.com
 */

public class User {
    private   final String firstName;
    private  final  String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void  onClickBtn( View view){
        Toast.makeText(view.getContext(),"firstname",Toast.LENGTH_SHORT).show();
    }
}
