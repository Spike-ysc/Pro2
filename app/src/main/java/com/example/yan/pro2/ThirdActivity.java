package com.example.yan.pro2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by yan on 2017/1/19.
 */
public class ThirdActivity extends Activity implements View.OnClickListener {

    private Button button;
    private Button btn, btn2, btn3, btn4, btn5;
    private EditText edittext;
    private ProgressBar progressbar;
    @Override

    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
         button = (Button) findViewById(R.id.button3);
        edittext = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(this);
        btn = (Button) findViewById(R.id.jindu);
        progressbar = (ProgressBar)findViewById(R.id.progress_bar);
        btn.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.alert);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.progress);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.linear1);
        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.relative1);
        btn5.setOnClickListener(this);

    }
    @Override
    public  void onClick(View v){
        switch (v.getId()){
            case R.id.button3:
                String inputtext = edittext.getText().toString();
                Toast.makeText(ThirdActivity.this, inputtext, Toast.LENGTH_SHORT).show();
                break;
            case R.id.jindu:
                if(progressbar.getVisibility() == View.GONE){
                    progressbar.setVisibility(View.VISIBLE);
                } else {
                    progressbar.setVisibility(View.GONE);
                }
                break;
            case R.id.alert:
                AlertDialog.Builder dialog = new AlertDialog.Builder(ThirdActivity.this);
                dialog.setTitle("this is dialog");
                dialog.setMessage("something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener(){
                    @Override
                    public  void onClick(DialogInterface dialog,int which){

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){

                    }
                });
                dialog.show();
                break;
            case R.id.progress:
                ProgressDialog progressDialog = new ProgressDialog(ThirdActivity.this);
                progressDialog.setTitle("this is progressdialog");
                progressDialog.setMessage("loading");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            case R.id.linear1:
                Intent intent = new Intent(ThirdActivity.this,LinearActivity.class);
                startActivity(intent);
                break;
            case R.id.relative1:
                Intent intent1 = new Intent(ThirdActivity.this, RelativeActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
