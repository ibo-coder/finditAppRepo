package com.example.ibrahim.findit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        final ImageView logoImage= (ImageView) findViewById(R.id.imgViewLogo);
     Thread timerThread=new Thread(){
         @Override
public void run(){
    try {
        sleep(3000);

    } catch (InterruptedException e) {
        e.printStackTrace();
    }finally {
        logoImage.getLayoutParams().width=400;
        logoImage.getLayoutParams().height=300;
        Intent intent=new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

}

     };
timerThread.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
