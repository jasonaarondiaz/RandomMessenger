package com.omagle.omagle;

/**
 * Created by Anu on 11/7/2016.
 */

public class MyUser {
    String token;
    boolean matched;
    String partner;

    public MyUser()
    {
        token ="";
        matched = false;
        partner = "TESTING222222";
    }

    public MyUser(String t)
    {
        token = t;
        matched = false;
        partner = "TESTING3333333";
    }

    public String getToken()
    {
        return token;
    }

    public boolean getMatched()
    {
        return matched;
    }

    public String getPartner()
    {
        return partner;
    }

    public void setToken(String t)
    {
        token = t;
    }

    public void setMatched(boolean m)
    {
        matched = m;
    }

    public void setPartner(String p)
    {
        partner = p;
    }
}
