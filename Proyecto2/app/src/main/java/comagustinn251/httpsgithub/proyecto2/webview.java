package comagustinn251.httpsgithub.proyecto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        final WebView webview;
        webview=(WebView) findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.adpra.org.ar/wp-content/uploads/2017/06/ELECCIONES-2017-DESTINADA-A-ELECTORES-27-ABRIL-FULL.pdf");

    }

}
