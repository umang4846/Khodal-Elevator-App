package com.appprocessors.khodalelevator;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_product, rellay_project, rellay_maintenance, rellay_quality,
            rellay_gallery, rellay_video, rellay_contact_us, rellay_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rellay_product = findViewById(R.id.rellay_product);
        rellay_project = findViewById(R.id.rellay_projects);
        rellay_maintenance = findViewById(R.id.rellay_maintenance);
        rellay_quality = findViewById(R.id.rellay_quality);
        rellay_gallery = findViewById(R.id.rellay_gallery);
        rellay_video = findViewById(R.id.rellay_video);
        rellay_contact_us = findViewById(R.id.rellay_contact_us);
        rellay_about = findViewById(R.id.rellay_about);

        rellay_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FinestWebView.Builder(MainActivity.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Khodal Elevator Products")
                        .showUrl(true)
                        .statusBarColorRes(R.color.bluePrimaryDark)
                        .toolbarColorRes(R.color.bluePrimary)
                        .titleColorRes(R.color.finestWhite)
                        .urlColorRes(R.color.bluePrimaryLight)
                        .iconDefaultColorRes(R.color.finestWhite)
                        .progressBarColorRes(R.color.finestWhite)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .showSwipeRefreshLayout(true)
                        .swipeRefreshColorRes(R.color.bluePrimaryDark)
                        .menuSelector(R.drawable.selector_light_theme)
                        .menuTextGravity(Gravity.CENTER)
                        .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                        .dividerHeight(0)
                        .toolbarScrollFlags(0)
                        .webViewSupportZoom(true)
                        .webViewBuiltInZoomControls(true)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("http://khodalelevator.com/feature.html");
            }
        });

        rellay_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FinestWebView.Builder(MainActivity.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Khodal Elevator Projects")
                        .showUrl(true)
                        .statusBarColorRes(R.color.bluePrimaryDark)
                        .toolbarColorRes(R.color.bluePrimary)
                        .titleColorRes(R.color.finestWhite)
                        .urlColorRes(R.color.bluePrimaryLight)
                        .iconDefaultColorRes(R.color.finestWhite)
                        .progressBarColorRes(R.color.finestWhite)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .showSwipeRefreshLayout(true)
                        .swipeRefreshColorRes(R.color.bluePrimaryDark)
                        .menuSelector(R.drawable.selector_light_theme)
                        .menuTextGravity(Gravity.CENTER)
                        .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                        .dividerHeight(0)
                        .toolbarScrollFlags(0)
                        .webViewSupportZoom(true)
                        .webViewBuiltInZoomControls(true)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("http://khodalelevator.com/Projects.html");
            }
        });

        rellay_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FinestWebView.Builder(MainActivity.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Khodal Elevator Gallery")
                        .showUrl(true)
                        .statusBarColorRes(R.color.bluePrimaryDark)
                        .toolbarColorRes(R.color.bluePrimary)
                        .titleColorRes(R.color.finestWhite)
                        .urlColorRes(R.color.bluePrimaryLight)
                        .iconDefaultColorRes(R.color.finestWhite)
                        .progressBarColorRes(R.color.finestWhite)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .showSwipeRefreshLayout(true)
                        .swipeRefreshColorRes(R.color.bluePrimaryDark)
                        .menuSelector(R.drawable.selector_light_theme)
                        .menuTextGravity(Gravity.CENTER)
                        .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                        .dividerHeight(0)
                        .toolbarScrollFlags(0)
                        .webViewSupportZoom(true)
                        .webViewBuiltInZoomControls(true)
                        .webViewDisplayZoomControls(true)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("http://khodalelevator.com/Gallery.html");
            }
        });
        rellay_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FinestWebView.Builder(MainActivity.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Khodal Elevator Videos")
                        .showUrl(true)
                        .statusBarColorRes(R.color.bluePrimaryDark)
                        .toolbarColorRes(R.color.bluePrimary)
                        .titleColorRes(R.color.finestWhite)
                        .urlColorRes(R.color.bluePrimaryLight)
                        .webViewJavaScriptCanOpenWindowsAutomatically(true)
                        .iconDefaultColorRes(R.color.finestWhite)
                        .progressBarColorRes(R.color.finestWhite)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .showSwipeRefreshLayout(true)
                        .swipeRefreshColorRes(R.color.bluePrimaryDark)
                        .menuSelector(R.drawable.selector_light_theme)
                        .menuTextGravity(Gravity.CENTER)
                        .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                        .dividerHeight(0)
                        .webViewSupportZoom(true)
                        .webViewBuiltInZoomControls(true)
                        .webViewDisplayZoomControls(true)
                        .toolbarScrollFlags(0)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("http://khodalelevator.com/Videos.html");
            }
        });
        rellay_contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContactUs.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Maintenance.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutKhodal.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_quality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new FinestWebView.Builder(MainActivity.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Khodal Elevator Quality")
                        .showUrl(true)
                        .statusBarColorRes(R.color.bluePrimaryDark)
                        .toolbarColorRes(R.color.bluePrimary)
                        .titleColorRes(R.color.finestWhite)
                        .urlColorRes(R.color.bluePrimaryLight)
                        .webViewJavaScriptCanOpenWindowsAutomatically(true)
                        .iconDefaultColorRes(R.color.finestWhite)
                        .progressBarColorRes(R.color.finestWhite)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .stringResCopiedToClipboard(R.string.copied_to_clipboard)
                        .showSwipeRefreshLayout(true)
                        .swipeRefreshColorRes(R.color.bluePrimaryDark)
                        .menuSelector(R.drawable.selector_light_theme)
                        .menuTextGravity(Gravity.CENTER)
                        .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
                        .dividerHeight(0)
                        .webViewSupportZoom(true)
                        .webViewBuiltInZoomControls(true)
                        .webViewDisplayZoomControls(true)
                        .toolbarScrollFlags(0)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("http://khodalelevator.com/Quality.html");
            }
        });

    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_call) {

                    startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", "+919925631201", null)));

            return true;
        }
        if (id == R.id.action_mail){
            try {
                Intent intent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" +"khodalelevator@gmail.com"));
                startActivity(intent);
            }
            catch (ActivityNotFoundException e){
                e.getMessage();
            }
        }
        if (id==R.id.action_developedby){
            startActivity(new Intent(MainActivity.this,AboutUs.class));
        }

        return super.onOptionsItemSelected(item);
    }

}
