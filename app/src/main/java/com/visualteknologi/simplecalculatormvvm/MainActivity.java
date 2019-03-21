package com.visualteknologi.simplecalculatormvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.visualteknologi.simplecalculatormvvm.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, MainFragment.newInstance())
                .commitNow();

        }
    }
}
