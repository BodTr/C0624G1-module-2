package bom.management.users_services;

import bom.entities.user.User;
import bom.entities.user.UsersList;

public class Logout {
    public void logoutUser() {
        UsersList usersList = UsersList.getInstance();
        for (User user : usersList.getUsers()) {

        }
    }
}
