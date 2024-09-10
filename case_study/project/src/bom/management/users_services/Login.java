package bom.management.users_services;
import bom.custom_exceptions.InvalidValueExceptions;
import bom.entities.user.User;
import bom.entities.user.UsersList;
import bom.helpers.validation.ValidationUP;

public class Login {
    public String loginUser(String username, String password) {
        UsersList usersList = UsersList.getInstance();
        String usernameExisted;
        String passwordExisted;
        boolean doesUsernameMatch = false;
        boolean doesPasswordMatch = false;
        String message;
        for (User user : usersList.getUsers()) {
            usernameExisted = user.getUsername();
            passwordExisted = user.getPassword();
            if (usernameExisted.equals(username)) {
                doesUsernameMatch = true;
                if (passwordExisted.equals(password)) {
                    doesPasswordMatch = true;
                }
                break;
            }

        }
        if (doesUsernameMatch && doesPasswordMatch) {
            message = "Login Successful";
        } else if (!doesUsernameMatch) {
            message = "Wrong username";
        } else {
            message = "Wrong password";
        }
        return message;
    }
}
