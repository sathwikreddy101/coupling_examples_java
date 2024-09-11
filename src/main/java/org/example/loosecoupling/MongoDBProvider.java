package org.example.loosecoupling;

public class MongoDBProvider implements UserDataProvider{
    @Override
    public String getUserInfo() {
        return "Fetching data from mongo DB";
    }
}
