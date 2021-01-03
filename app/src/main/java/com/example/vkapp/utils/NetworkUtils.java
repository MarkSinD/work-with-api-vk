package com.example.vkapp.utils;

import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkUtils {
    private static final String VK_BASE_IP = "https://api.vk.com/";
    private static final String VK_USERS_GET = "method/users.get";
    private static final String PARAM_USER_IDS = "user_ids";
    private static final String PARAM_ACCESS_TOKEN = "access_token";
    private static final String VK_VERSION = "v";

    public static URL generateURl( String id){

        // Создаем
        Uri builtUri = Uri.parse(VK_BASE_IP + VK_USERS_GET).buildUpon().appendQueryParameter(PARAM_USER_IDS, id)
                .appendQueryParameter(PARAM_ACCESS_TOKEN, "561adcf8561adcf8561adcf8bf56691b2f5561a561adcf8094968b056d0cd426d597a9c")
                .appendQueryParameter(VK_VERSION, "5.122").build();

        URL url = null;

        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String getResponseFromURL(URL url) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            Scanner scanner = new Scanner(inputStream);
            scanner.useDelimiter("\\A");
            boolean hasInput = scanner.hasNext();

            if (hasInput)
                return scanner.next();
            else
                return null;
        }catch (UnknownHostException e){
            return null;
        }
        finally{
            httpURLConnection.disconnect();
        }
    }
}
