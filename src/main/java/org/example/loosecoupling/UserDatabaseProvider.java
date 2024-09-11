package org.example.loosecoupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserInfo() {
        return "Fetching user details from DB";
    }
}
