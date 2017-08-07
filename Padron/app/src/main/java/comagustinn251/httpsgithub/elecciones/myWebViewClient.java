package comagustinn251.httpsgithub.elecciones;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Agus on 04/08/2017.
 */

class myWebViewClient extends WebViewClient{
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;
    }}
