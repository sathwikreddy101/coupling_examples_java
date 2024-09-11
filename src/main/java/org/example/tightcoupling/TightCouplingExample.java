package org.example.tightcoupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        // this is tightly coupled because if we want to change the database provider in future we have to touch every file
        System.out.println(userManager.getUserInfo());
    }
}
