package com.example.softicastle30.management;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SOFTiCastle30 on 2018-02-08.
 */

public class LoginRequest extends StringRequest {

    final static private String URL = "http://a50c9dcc.ngrok.io/routes/login";  // web호스팅 도메인 주소
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);   // 해당 URL에 post 방식으로 전송
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
