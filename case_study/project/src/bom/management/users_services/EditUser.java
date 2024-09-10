package bom.management.users_services;

import bom.custom_exceptions.DuplicatedValueExceptions;
import bom.custom_exceptions.InvalidValueExceptions;
import bom.entities.user.User;
import bom.entities.user.UsersList;
import bom.helpers.fileManipulation.EditFile;
import bom.helpers.fileManipulation.WriteFile;
import bom.helpers.validation.ValidationUP;

public class EditUser {
    public String updateUser(int oldId, int newId, String newUsername, String newPassword) {
        try {
            EditFile editFile = new EditFile();
            UsersList usersList = UsersList.getInstance();
            ValidationUP validation = new ValidationUP();
            validation.validateUsername(newUsername);
            validation.validatePassword(newPassword);
            validation.checkExistedUsername(newUsername);
            validation.checkExistedId(newId);
            String filePath = "project/src/bom/files/users.csv";
            String message;
            int elIndex = usersList.findUserIndex(oldId);
            if (elIndex == -1) {
                message = "User not found";
            } else {
                // tìm thấy user có id = oldId
                User editedUser = new User(newId, newUsername, newPassword, "norm");
                String editedUserCSV = editedUser.toCSV();
                usersList.editUser(elIndex, editedUser);
                String oldIdString = String.valueOf(oldId);
                editFile.fileEditor(filePath, oldIdString, editedUserCSV);
                message = "User successfully updated";
            }
            return message;
        } catch (InvalidValueExceptions | DuplicatedValueExceptions e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
}
