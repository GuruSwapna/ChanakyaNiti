package com.example.enchanterswapna.chanakyaniti;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Chapterfive extends AppCompatActivity {

    TextView txt1;
    ImageButton imbtn1,imleft,imrght;
    ClipData myClip;
    ClipboardManager myClipboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapterfive);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imbtn1=(ImageButton)findViewById(R.id.imageButton1);
        txt1=(TextView)findViewById(R.id.textone);
        imleft=(ImageButton)findViewById(R.id.but1);
        imrght=(ImageButton)findViewById(R.id.but2);
        imleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"First Chapter",Toast.LENGTH_SHORT).show();
                Intent int2=new Intent(Chapterfive.this,Chapterfour.class);
                startActivity(int2);
            }
        });
        imrght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Chapterfive.this,Chaptersix.class);
                startActivity(int1);
            }
        });
//        txt1.setMovementMethod(new ScrollingMovementMethod());


        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        imbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = txt1.getText().toString();
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
//    public void onBackPressed() {
//        Intent startMain = new Intent(Intent.ACTION_MAIN);
//        startMain.addCategory(Intent.CATEGORY_HOME);
//        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(startMain);
//        finish();
//    }
@Override
public void onBackPressed()
{
    super.onBackPressed();
    startActivity(new Intent(Chapterfive.this, MainActivity.class));
    finish();

}

}


