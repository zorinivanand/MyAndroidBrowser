package ru.zorinivan.mybrowser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebClient extends WebViewClient {

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
