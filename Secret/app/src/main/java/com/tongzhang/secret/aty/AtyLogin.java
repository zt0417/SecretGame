package com.tongzhang.secret.aty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.tongzhang.secret.R;

/**
 * Created by zt041 on 2017-03-20.
 */

public class AtyLogin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_login);


        findViewById(R.id.btnGetCode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(){

                }



                new GetCode();
            }
        });
    }

}

