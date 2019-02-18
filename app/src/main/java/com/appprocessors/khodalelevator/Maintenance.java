package com.appprocessors.khodalelevator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.mukesh.MarkdownView;
import com.thefinestartist.finestwebview.FinestWebView;

import mehdi.sakout.fancybuttons.FancyButton;

public class Maintenance extends AppCompatActivity {

    FancyButton maintenance,services,modernization;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdown_view);
        markdownView.setMarkDownText("* Safe and reliable travel \n" +
                "* Gearless technology \n" +
                "* Savings in energy costs \n" +
                "* Smooth Elevator car working \n" +
                "* Low speed to high speed conversation \n" +
                "* Reduce energy consumption \n" +
                "* Comfort from the latest in elevator safety technology \n" +
                "* Enhancement in property value \n" +
                "* Reduced Noise, Vibration and waiting time \n" +
                "* performance with standards \n" +
                "* Accurate floor levelling \n" +
                "");

        maintenance = findViewById(R.id.btn_maintenance_form);
        services = findViewById(R.id.btn_services);
        modernization = findViewById(R.id.btn_MODERNIZATION_FORM);

        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FinestWebView.Builder(Maintenance.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("MAINTENANCE FORM")
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
                        .show("https://docs.google.com/forms/d/e/1FAIpQLSfrVFwTK1L6sP8eAphhWT4kojlhW0_mynsXv876tAn9T1CekA/viewform");
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FinestWebView.Builder(Maintenance.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("Service (Customer)")
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
                        .show("https://docs.google.com/forms/d/e/1FAIpQLSdinCM_ihK_12cEhZfT8y_e3BL2eZOGK6BZoXzfqnyKjBUpcQ/viewform");
            }
        });

        modernization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FinestWebView.Builder(Maintenance.this).theme(R.style.FinestWebViewTheme)
                        .titleDefault("MODERNIZATION FORM")
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
                        .webViewBuiltInZoomControls(true)
                        .toolbarScrollFlags(0)
                        .gradientDivider(false)
                        .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
                        .show("https://docs.google.com/forms/d/e/1FAIpQLSeQ-GKiCEuYlhIvYRU25i0qwJkcWvO1z0BdXg7TWb6nLJzKYA/viewform");
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
