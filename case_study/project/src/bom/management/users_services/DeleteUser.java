package bom.management.users_services;

import bom.entities.user.UsersList;
import bom.helpers.fileManipulation.EditFile;

public class DeleteUser {
    public String deletingUser(int deletingUserId) {
        UsersList usersList = UsersList.getInstance();
        EditFile editFile = new EditFile();
        String message;
        String filePath = "project/src/bom/files/users.csv";
        int elIndex = usersList.findUserIndex(deletingUserId);
        String deletingUserIdString = String.valueOf(deletingUserId);
        if (elIndex == -1) {
            message = "User not found";
        } else {
            usersList.removeUser(elIndex);
            editFile.fileEditor(filePath, deletingUserIdString, "");
            message = "User successfully deleted";
        }
        return message;
    }
}
