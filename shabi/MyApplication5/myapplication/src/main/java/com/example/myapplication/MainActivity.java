package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text_yonghuming;
    private EditText text_passwd;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_yonghuming=(EditText)findViewById(R.id.text_yonghuming);
        text_passwd=(EditText)findViewById(R.id.text_passwd);
        button=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("commit", "onClick: HELLOWORLD!!!");
                String   mname ="1111";
                String   mpass ="1111";
                String user = text_yonghuming.getText().toString().trim();
                String pwd =  text_passwd.getText().toString().trim();
                if (user.equals(mname) && pwd.equals(mpass))
                {
                    Toast.makeText(MainActivity.this,"登陆成功！",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(MainActivity.this,
                            "用户名或密码错误！",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
