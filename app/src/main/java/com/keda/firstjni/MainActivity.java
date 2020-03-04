package com.keda.firstjni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doJni(View view) {

        MyJniTest myJniTest = new MyJniTest();
        String string = myJniTest.getString();
        Toast.makeText(this,string,Toast.LENGTH_LONG).show();

    }
}
