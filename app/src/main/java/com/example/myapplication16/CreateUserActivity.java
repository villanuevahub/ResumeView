package com.example.myapplication16;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateUserActivity extends AppCompatActivity implements View.OnClickListener{

    EditText eTnwusrname;
    EditText eTnwusrnames;
    EditText eTnwusrlstnm;
    EditText etnwusrlstnms;
    RadioButton rBttnnwusrgnrmle;
    RadioButton rBttnnwusrgnrfle;
    EditText eTnwusralias;
    EditText eTnwusrusrnm;
    EditText eTnwusrpsswd;
    EditText eTnwusrcfmpsswd;
    EditText eTnwusremail;
    EditText eTnwusrcfmemail;
    EditText eTnwusrmobpho;
    EditText eTnwusrcfmmobpho;
    Button bTtnnwusr;

    DataBaseHelper db;

    View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createuser);

        eTnwusrname = (EditText) findViewById(R.id.eTnwusrname);
        eTnwusrnames = (EditText) findViewById(R.id.eTnwusrnames);
        eTnwusrlstnm = (EditText) findViewById(R.id.eTnwusrlstnm);
        etnwusrlstnms = (EditText) findViewById(R.id.eTnwusrlstnms);
        rBttnnwusrgnrmle = (RadioButton) findViewById(R.id.rBttnnwusrmle);
        rBttnnwusrgnrfle = (RadioButton) findViewById(R.id.rBttnnwusrfmle);
        eTnwusralias = (EditText) findViewById(R.id.eTnwusralias);
        eTnwusrusrnm = (EditText) findViewById(R.id.eTnwusrusrnm);
        eTnwusrpsswd = (EditText) findViewById(R.id.eTnwusrpssd);
        eTnwusrcfmpsswd = (EditText) findViewById(R.id.eTnwusrcfmpssd);
        eTnwusremail = (EditText) findViewById(R.id.eTnwusremail);
        eTnwusrcfmemail = (EditText) findViewById(R.id.eTnwusrcfmemail);
        eTnwusrmobpho = (EditText) findViewById(R.id.eTnwusrmobpho);
        eTnwusrcfmmobpho = (EditText) findViewById(R.id.eTnwusrcfmmobpho);
        bTtnnwusr = (Button) findViewById(R.id.bTtnnwusr);

        db = new DataBaseHelper(this);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case (R.id.bTtnnwusr): {
                        Log.d("bTtnnwusr", "onClickListener");
                        toastMessage("fill the fields to continue");
                        break;
                    }

                    default:
                        break;
                }
            }
        };

        bTtnnwusr.setOnClickListener(onClickListener);

        String sTnwusrname = eTnwusrname.getText().toString();
        int maxLength = sTnwusrname.length();
        sTnwusrname.contains("@");

    }

    public void toastMessage(String toastMassage) {
        Toast.makeText(this, toastMassage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

    }
}
