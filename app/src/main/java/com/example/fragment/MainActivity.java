package com.example.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f=getSupportFragmentManager().beginTransaction();
                f.replace(R.id.change,new fragment1());
                f.commit();
               Toast toast= Toast.makeText(getApplicationContext(),"Fragment1",Toast.LENGTH_SHORT);
            }
        });
    }
}
