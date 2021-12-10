package com.example.day1project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view) {
        EditText txtFirstName = findViewById(R.id.txtFIrstName);
        EditText txtLastName = findViewById(R.id.txtLastName);
        EditText txtEmailid = findViewById(R.id.txtEmailid);

        Button submit = findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Your details have been submitted ", Toast.LENGTH_SHORT).show();
//                text.setText("The sum is  " + sum );
            }
        });
    }
}
