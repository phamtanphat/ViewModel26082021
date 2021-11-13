package com.example.viewmodel26082021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdt;
    Button mBtn;
    TextView mTv;
    MyViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdt = findViewById(R.id.edittext);
        mBtn = findViewById(R.id.buttonGetString);
        mTv = findViewById(R.id.textView);

        mViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        mViewModel.getStringLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTv.setText(s);
            }
        });


        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEdt.getText().toString();
                mViewModel.setStringLiveData(text);
            }
        });

    }
}