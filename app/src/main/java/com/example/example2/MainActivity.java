package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.edtName);
        pass=findViewById(R.id.editpassword);
        //this is a teast comment for githup
    }



    public void toAction(View view) {
    String name=user.getText().toString();
         String password=pass.getText().toString();
        String mesg="name " + name + " password : "  + password ;
        Toast.makeText(this,mesg,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,password,Toast.LENGTH_SHORT).show();

    }
}