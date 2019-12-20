package com.wd.healthhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.commonlib.utils.ARouterConstants;

@Route(path = ARouterConstants.ACTIVITY_URL_HOME)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //ARouter.getInstance().inject(this);
    }
}
