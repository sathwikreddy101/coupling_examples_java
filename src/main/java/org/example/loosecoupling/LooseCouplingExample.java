package org.example.loosecoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerDB = new UserManager(userDataProvider);
        System.out.println(userManagerDB.getUserDetails());

        UserDataProvider userDataProviderWeb = new WebServiceDataProvider();
        UserManager userManagerWeb = new UserManager(userDataProviderWeb);
        System.out.println(userManagerWeb.getUserDetails());

        UserDataProvider userDataProviderMongo = new MongoDBProvider();
        UserManager userManagerWongo = new UserManager(userDataProviderMongo);
        System.out.println(userManagerWongo.getUserDetails());
    }
}
