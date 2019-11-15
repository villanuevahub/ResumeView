package com.example.myapplication16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bTtnmainnwusr;
    Button bTtnmainsignin;
    EditText eTmainuser;
    EditText eTmainpsswd;
    View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTtnmainsignin = (Button)findViewById(R.id.bTtnmainsignin);
        bTtnmainnwusr = (Button)findViewById(R.id.bTtnmainnwusr);
        eTmainuser = (EditText)findViewById(R.id.eTmainuser);
        eTmainpsswd = (EditText)findViewById(R.id.eTmainpsswd);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case(R.id.bTtnmainsignin):
                        //toastMessage("Sign in...");
                        signInValidator();
                        break;
                    case(R.id.bTtnmainnwusr):
                        toastMessage("Create User...");
                        break;
                    default:
                        break;
                }
            }
        };

        bTtnmainsignin.setOnClickListener(onClickListener);
        bTtnmainnwusr.setOnClickListener(onClickListener);
    }

    public void toastMessage(String toastMassage) {

        Toast.makeText(this, toastMassage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

    }

    public void editTextClean(){
        eTmainpsswd.setText("");
        eTmainuser.setText("");
    }

    public void signInValidator() {

        String usuario = "q";
        String pass = "q";
        String user = eTmainuser.getText().toString();
        String password = eTmainpsswd.getText().toString();
        if(usuario.equals(user)&& pass.equals(password)) {
            toastMessage("Access Granted...");
            editTextClean();
        }else {
            toastMessage("Sign in...");
            editTextClean();
        }
    }

}
