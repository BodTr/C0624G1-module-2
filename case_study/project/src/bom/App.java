package bom;
import bom.helpers.fileManipulation.EditFile;
import bom.management.users_services.EditUser;
import bom.management.users_services.Login;
import bom.management.users_services.Register;
import bom.entities.user.User;
import bom.entities.user.UsersList;



public class App {
    public static void main(String[] args) {

//        Register register = new Register();
//        register.createUser("TruuCN", "123TrgggT@", 111160);
        UsersList usersList = UsersList.getInstance();
        for (User user : usersList.getUsers()) {
            System.out.println(user);
        }
        Login login = new Login();
        String loginString = login.loginUser("Goop", "Tr1234");
        System.out.println("loginString: " + loginString);
        EditUser editUser = new EditUser();
        String msg = editUser.updateUser(12345678, 1111333, "TrWWJP", "123TrgggT1@");
        System.out.println("edit user: " + msg);
    }
}
