package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     
    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                if(edemail.getText().toString().equals("okky@mail.com")&&edpassword.getText().toString().equals("okky123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES || email : " + nama + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!edemail.getText().toString().equals("okky@mail.com")&&edpassword.getText().toString().equals("okky123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Email anda salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else if (!edpassword.getText().toString().equals("okky123")&&edemail.getText().toString().equals("okky@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Password anda salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    Toast.makeText((getApplicationContext()), "Email atau Password Anda salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}