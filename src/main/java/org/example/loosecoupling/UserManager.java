package org.example.loosecoupling;

public class UserManager {

    private UserDataProvider userDetailsProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDetailsProvider = userDataProvider;
    }

    public String getUserDetails(){
        return userDetailsProvider.getUserInfo();
    }
}
