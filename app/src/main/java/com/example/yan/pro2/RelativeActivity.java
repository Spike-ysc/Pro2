package com.example.yan.pro2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by yan on 2017/1/19.
 */
public class RelativeActivity extends Activity implements View.OnClickListener {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        btn = (Button) findViewById(R.id.align1);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.align1:
                Intent intent2 = new Intent(RelativeActivity.this,RelativeActivity2.class);
                startActivity(intent2);

                break;
            default:
                break;
        }

    }
}
