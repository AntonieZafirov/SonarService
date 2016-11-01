package com.en.Service;

import com.en.Entity.WidgetEntity;
import com.en.Repository.WidgetDao;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: azafirov
 * Date: 10/31/2016
 * Time: 1:30 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
public class SonarService {

    @Autowired
    WidgetDao widgetDao;

    public String getResponse(Long widgetId)
    {
        WidgetEntity widget = widgetDao.findOne(widgetId);
        return getResponse(widget);
    }

    public String getResponse(WidgetEntity widget)
    {
        String response = new String();
        String urlString = widget.getAdapter().getUrl() + widget.getAdapter().getApiPath() + widget.getCallUrl();
        System.out.println(urlString);
        URL url;
        try {
            url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if(widget.getAdapter().getUseCredantials())
            {
                String userpass = widget.getAdapter().getUserName() + ":" + widget.getAdapter().getPassword();
                String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
                conn.setRequestProperty ("Authorization", basicAuth);
            }
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                response = output;
            }
            conn.disconnect();

        } catch (Exception e) {
            response = e.getMessage();
        }
        return response;
    }

}
