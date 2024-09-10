package bom.entities.user;

import bom.helpers.fileManipulation.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    private static UsersList instance = null;
    private List<User> users;
    private UsersList() {
        this.users = new ArrayList<>();
        this.users.add(new User(1234, "Goop", "Tr1234", "admin"));

    }
    public static UsersList getInstance() {
        if (instance == null) {
            UsersList usersList = new UsersList();
            String filePath = "project/src/bom/files/users.csv";
            ReadFile readFile = new ReadFile();
            List<User> usersListCSV = readFile.usersFileReader(filePath);
            usersList.users.addAll(usersListCSV);
            instance = usersList;
        }
        return instance;
    }

    public List<User> getUsers() {

        return users;
    }
    public void addUser(User user) {
        this.users.add(user);
    }
    public int findUserIndex(int id) {
        int idF;
        int index = -1;
        for (User user : users) {
            if (user.getId() == id) {
                index = users.indexOf(user);
                break;
            }
        }
        return index;
    }
    public User findUser(int index) {
        return users.get(index);
    }
    public void editUser(int index, User user) {
        users.set(index, user);
    }
    public void removeUser(int index) {
        users.remove(index);
    }
}
