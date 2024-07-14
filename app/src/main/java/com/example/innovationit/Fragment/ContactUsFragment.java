package com.example.innovationit.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.innovationit.R;


public class ContactUsFragment extends Fragment {

    private WebView webview;
    private TextView titleTV;

    private ImageView backBtn;

    public ContactUsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_contact_us, container, false);

        webview = view.findViewById(R.id.webviewid);
        titleTV=view.findViewById(R.id.titleTV);
        backBtn=view.findViewById(R.id.backBtn);

        webview.setWebViewClient(new WebViewClient());
        String url = "https://innovationit.com.bd/Web/job_apply";
        webview.loadUrl(url);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);




        return view;
    }

}