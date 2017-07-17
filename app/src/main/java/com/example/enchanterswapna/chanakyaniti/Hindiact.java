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
import android.widget.ListView;
import android.widget.TextView;

import static android.support.v7.appcompat.R.attr.title;

public class Hindiact extends AppCompatActivity {

    ListView listv1;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindiact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txt1 = (TextView) findViewById(R.id.chanhind);

        listv1 = (ListView) findViewById(R.id.hindlist);
        listv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str=((TextView) view).getText().toString();
                if(str.equals("प्रथम अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindione.class);
                    startActivity(in1);
                }
                else if(str.equals("द्वितीया अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hinditwo.class);
                    startActivity(in1);
                }
                else if(str.equals("तीसरा अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindithree.class);
                    startActivity(in1);
                }
                else if(str.equals("चौथा अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindifour.class);
                    startActivity(in1);
                }
                else if(str.equals("पांचवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindifive.class);
                    startActivity(in1);
                }
                else if(str.equals("छठावां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindisix.class);
                    startActivity(in1);
                }
                else if(str.equals("सातवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindiseven.class);
                    startActivity(in1);
                }
                else if(str.equals("आठवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindieight.class);
                    startActivity(in1);
                }
                else if(str.equals("नौवाँ अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindinine.class);
                    startActivity(in1);
                }
                else if(str.equals("दसवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hinditen.class);
                    startActivity(in1);
                }
                else if(str.equals("ग्यारहवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindieleven.class);
                    startActivity(in1);
                }
                else if(str.equals("बारहवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hinditwelve.class);
                    startActivity(in1);
                }
                else if(str.equals("तेरहवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindithrn.class);
                    startActivity(in1);
                }
                else if(str.equals("चौदहवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindifrtn.class);
                    startActivity(in1);
                }
                else if(str.equals("पंद्रहवां अध्याय")){
                    Intent in1=new Intent(Hindiact.this,Hindifftn.class);
                    startActivity(in1);
                }
            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Hindiact.this,MainActivity.class);
                startActivity(int1);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hindi, menu);
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
            m_dialog = new Dialog(Hindiact.this);
            m_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

            LayoutInflater m_inflater = LayoutInflater.from(Hindiact.this);
            View m_view = m_inflater.inflate(R.layout.rateus_popup, null);
            //myPopLay = (LinearLayout) m_view.findViewById(R.id.myPopLay);
            m_dialog.setContentView(m_view);
            m_dialog.show();

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