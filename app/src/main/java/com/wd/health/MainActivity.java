package com.wd.health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wd.commonlib.utils.ARouterConstants;

@Route(path = ARouterConstants.ACTIVITY_URL_LOGIN )
public class MainActivity extends AppCompatActivity {

    private Button viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
        viewById = findViewById(R.id.button);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(ARouterConstants.ACTIVITY_URL_HOME)
                        .navigation(MainActivity.this);
            }
        });

    }
}
