package com.example.modul4layoutbeginnerex3java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv_user_id_print;
    TextView tv_user_pw_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView() {
        EditText et_user_id = (EditText) findViewById(R.id.et_user_id);
        EditText et_user_pw = (EditText) findViewById(R.id.et_user_pw);
        tv_user_id_print = (TextView) findViewById(R.id.tv_user_id_print);
        tv_user_pw_print = (TextView) findViewById(R.id.tv_user_pw_print);
        Button b_login = (Button) findViewById(R.id.b_login);
        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printOnConsole(et_user_id, et_user_pw);
            }
        });
    }
    void printOnConsole(EditText et_user_id, EditText et_user_pw) {
        Log.d("User ID ", String.valueOf(et_user_id.getText()));
        Log.d("User PW ", String.valueOf(et_user_pw.getText()));
        tv_user_id_print.setText(et_user_id.getText());
        tv_user_pw_print.setText(et_user_pw.getText());
    }
}