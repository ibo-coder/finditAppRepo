package com.example.ibrahim.findit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class companieskurd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companieskurd);
        final Button buttonRet=(Button)findViewById(R.id.btnReturn);
        buttonRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(companieskurd.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
