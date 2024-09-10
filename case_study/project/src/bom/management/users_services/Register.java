package bom.management.users_services;

import bom.custom_exceptions.DuplicatedValueExceptions;
import bom.custom_exceptions.InvalidValueExceptions;
import bom.entities.user.User;
import bom.entities.user.UsersList;
import bom.helpers.fileManipulation.WriteFile;
import bom.helpers.validation.ValidationUP;


public class Register {
    public void createUser(String username, String password, int id) {
       try {
           WriteFile wf = new WriteFile();
           ValidationUP validation = new ValidationUP();
           UsersList usersList = UsersList.getInstance();
           String filePath = "project/src/bom/files/users.csv";
           validation.validateUsername(username);
           validation.validatePassword(password);
           validation.checkExistedUsername(username);
           validation.checkExistedId(id);
           User user = new User(id, username, password, "norm");
           usersList.addUser(user);
           String userCSV = user.toCSV();
           wf.fileWriter(filePath, userCSV);
       } catch (InvalidValueExceptions | DuplicatedValueExceptions e) { // multi-catch, do cách handle 2 loại exception giống nhau nên ta có thể dùng multi-catch
           System.out.println(e.getMessage());
       }

    }

}
