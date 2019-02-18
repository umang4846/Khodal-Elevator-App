package com.appprocessors.khodalelevator;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import mehdi.sakout.fancybuttons.FancyButton;

public class ContactUs extends AppCompatActivity {

    LinearLayout mail, weblink, fb, insta, twitter;
    FancyButton map,call1,call2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        map = findViewById(R.id.btn_map);
       call1 = findViewById(R.id.btn_call1);
        call2 = findViewById(R.id.btn_call2);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?34.34&daddr=21.174366,72.82174"));
                startActivity(intent);
            }
        });

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", "+919925631201", null)));

            }
        });

        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", "+919724156402", null)));

            }
        });

        mail = findViewById(R.id.ll_Contact_us);
        weblink = findViewById(R.id.ll_link);
        fb = findViewById(R.id.ll_facebook);
        twitter = findViewById(R.id.ll_twitter);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "khodalelevator@gmail.com"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.getMessage();
                }
            }
        });
        weblink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent website = Website(ContactUs.this);
                website.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                startActivity(website);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = openFacebook(ContactUs.this);
                facebookIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                startActivity(facebookIntent);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitterIntent = openTwitter(ContactUs.this);
                twitterIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                startActivity(twitterIntent);
            }
        });

    }


        public static Intent openFacebook (Context context){
            try {
                context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
                return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/239569126624412" +
                        "" +
                        ""));
            } catch (Exception e) {
                return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/khodalelevator"));
            }
        }


        public static Intent openTwitter (Context context){
            try {
                context.getPackageManager().getPackageInfo("com.twitter.android", 0);
                return new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=749076655432306688" +
                        "" +
                        ""));
            } catch (Exception e) {
                return new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/khodalelevator"));
            }
        }

        public static Intent Website (Context context){
            return new Intent(Intent.ACTION_VIEW, Uri.parse("http://khodalelevator.com/"));
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}