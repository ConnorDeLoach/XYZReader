package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/Protino/dump/master/Lego/data.json");
        } catch (MalformedURLException e) {
            Log.e("data retrieval error: ", e.getMessage());
        }

        BASE_URL = url;
    }
}
