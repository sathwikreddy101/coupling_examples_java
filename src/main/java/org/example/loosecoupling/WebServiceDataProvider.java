package org.example.loosecoupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserInfo() {
        return "Fetching user data from web service";
    }
}
