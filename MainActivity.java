package com.example.samhuang.cameratest;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ShowCamera showCamera;
    Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        camera= Camera.open();
        showCamera = new ShowCamera(this,camera);

        frameLayout.addView(showCamera);

        //This button will have the screenshot function enabled
        //in it.
        Button captureBtn = findViewById(R.id.captureBtn);
        captureBtn.setOnClickListener(new View.OnClickListener() {
            //this onClick method will be the function which
            //contain all the details of screenshotting the thing
            @Override
            public void onClick(View v) {

            }
        });
    }
}
