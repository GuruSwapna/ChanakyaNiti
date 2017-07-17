package com.example.enchanterswapna.chanakyaniti;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.appcompat.R.attr.title;

public class MainActivity extends AppCompatActivity {


    ListView list1;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tx1=(TextView)findViewById(R.id.chanhind);
        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity.this,Hindiact.class);
                startActivity(int1);
            }
        });
        list1=(ListView)findViewById(R.id.englist);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
//                        Toast.LENGTH_SHORT).show();
                String str=((TextView) view).getText().toString();
                if(str.equals("Chapter One")){
                    Intent in1=new Intent(MainActivity.this,Chapterone.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Two")){
                    Intent in1=new Intent(MainActivity.this,Chaptertwo.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Three")){
                    Intent in1=new Intent(MainActivity.this,Chapterthree.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Four")){
                    Intent in1=new Intent(MainActivity.this,Chapterfour.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Five")){
                    Intent in1=new Intent(MainActivity.this,Chapterfive.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Six")){
                    Intent in1=new Intent(MainActivity.this,Chaptersix.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Seven")){
                    Intent in1=new Intent(MainActivity.this,Chapterseven.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Eight")){
                    Intent in1=new Intent(MainActivity.this,Chaptereight.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Nine")){
                    Intent in1=new Intent(MainActivity.this,Chapternine.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Ten")){
                    Intent in1=new Intent(MainActivity.this,Chapterten.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Eleven")){
                    Intent in1=new Intent(MainActivity.this,Chaptereleven.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Twelve")){
                    Intent in1=new Intent(MainActivity.this,Chaptertwelve.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Thirteen")){
                    Intent in1=new Intent(MainActivity.this,Chaptertrn.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Fourteen")){
                    Intent in1=new Intent(MainActivity.this,Chapterfrtn.class);
                    startActivity(in1);
                }
                else if(str.equals("Chapter Fifteen")){
                    Intent in1=new Intent(MainActivity.this,Chapterfftn.class);
                    startActivity(in1);
                }
            }
        });
//        String[] items={"Chapter One","Chapter Tw0","Chapter Three","Chapter Three","Chapter Three","Chapter Three","Chapter Three","Chapter Three","Chapter Three","Chapter Three","Chapter Three"};
//        arrayList=new ArrayList<>(Arrays.asList(items));
//        adapter=new ArrayAdapter<String>(this,R.layout.listex);
//        list1.setAdapter(adapter);
//        arrayList.add(String.valueOf(items));
//        adapter.notifyDataSetChanged();

//        ArrayList<String> myStringArray1 = new ArrayList<String>();
//        myStringArray1.add("Chapter One");
//        myStringArray1.add("Chapter Two");
//        myStringArray1.add("Chapter Three");
//        myStringArray1.add("Chapter Four");
//        myStringArray1.add("Chapter Five");
//        myStringArray1.add("Chapter Six");
//        myStringArray1.add("Chapter Seven");
//        myStringArray1.add("Chapter Eight");
//        myStringArray1.add("Chapter Nine");
//        myStringArray1.add("Chapter Ten");
//        myStringArray1.add("Chapter Eleven");
//        myStringArray1.add("Chapter Twelve");
//        myStringArray1.add("Chapter Thirteen");
//        myStringArray1.add("Chapter Fourteen");
//        myStringArray1.add("Chapter Fifteen");





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.chanakyanitihindienglish&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings1) {

            Intent sendIntent=new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(sendIntent.EXTRA_TEXT,"Title:"+title);
                    //+"Place:"+place+"Date:"+date1+"Time:"+time1+"Organisedby:"+organisedby+"EmailId"+email1+"MobileNo:"+mobileno+"Description"+desc+"Image"+imagesn);
            sendIntent.setType("text/plain");
            startActivity(sendIntent);

        }
        else if(id==R.id.action_settings2){

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("http://ajaykhatri.in/"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings3) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.chanakyanitihindienglish&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings4) {

            final Dialog m_dialog;
            m_dialog = new Dialog(MainActivity.this);
            m_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

            LayoutInflater m_inflater = LayoutInflater.from(MainActivity.this);
            View m_view = m_inflater.inflate(R.layout.rateus_popup, null);
            //myPopLay = (LinearLayout) m_view.findViewById(R.id.myPopLay);
            m_dialog.setContentView(m_view);
            m_dialog.show();

//            Button btn=(Button)findViewById(R.id.btnok);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    m_dialog.dismiss();
//                }
//            });
        }

        else if (id == R.id.action_settings5) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.debtmanager&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings6) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.vijaykhatri.exceltocontacts&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings7) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.aartibhajanandchalisa&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings8) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.chanakyanitiaudio&hl=en"));


            startActivity(intent);

        }

        else if (id == R.id.action_settings9) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.hanumanchalisaaudiolyrics&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings10) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.kabirkedoheaudio&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings11) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.durgachalisaaudiolyrics&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings12) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.omjaijagdishhareaarti&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings13) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.hindimuhavare&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings14) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.quotescollection&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings15) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.rashtriyagaan&hl=en"));


            startActivity(intent);

        }
        else if (id == R.id.action_settings16) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.androidstudiocheatsheet&hl=en"));
            startActivity(intent);
        }

        else if (id == R.id.action_settings17) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.sqltutorial&hl=en"));
            startActivity(intent);
        }
        else if (id == R.id.action_settings18) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.javatutorial&hl=en"));
            startActivity(intent);
        }
        else if (id == R.id.action_settings19) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.ctutorial&hl=en"));
            startActivity(intent);
        }
        else if (id == R.id.action_settings20) {

            Intent intent = new Intent(android.content.Intent.ACTION_VIEW);

            //Copy App URL from Google Play Store.
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=in.ajaykhatri.cpptutorial&hl=en"));
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }
}
