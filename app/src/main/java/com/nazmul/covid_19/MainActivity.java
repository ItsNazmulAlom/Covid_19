package com.nazmul.covid_19;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.worldometers.info/coronavirus/country/bangladesh/");
    }
}
