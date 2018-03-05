package com.crimealert.crimealert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText userName;
    private EditText password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText)findViewById(R.id.editTextName);
        password = (EditText)findViewById(R.id.editTextpassword);
        login = (Button)findViewById(R.id.btnlogin);
    }

    private void validate(String userName, String userPassword)
    {
        /*
            suggest that we use the krumbs library here
         */


    }
}
