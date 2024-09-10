package bom.helpers.validation;
import bom.custom_exceptions.DuplicatedValueExceptions;
import bom.custom_exceptions.InvalidValueExceptions;
import bom.entities.user.User;
import bom.entities.user.UsersList;

import java.util.List;
import java.util.regex.Pattern;

public class ValidationUP {
    public void validateUsername( String username ) throws InvalidValueExceptions {
        // Regex cho username: 6-16 ký tự, chỉ chứa chữ cái, chữ số và dấu gạch dưới
        String regex = "^[a-zA-Z0-9_]{6,16}$";

        if (!Pattern.matches(regex, username)) {
            throw new InvalidValueExceptions("Username không hợp lệ. phải có 6-16 ký tự và chỉ chứa chữ cái, chữ số hoặc ký hiệu '_' ");
        }
    }

    public void validatePassword( String password ) throws InvalidValueExceptions {
        // Regex cho password: 6-16 ký tự, ít nhất có 1 chữ cái in hoa, 1 chữ cái in thường, 1 chữ số, và 1 ký tự đặc biệt
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{6,16}$";

        if (!Pattern.matches(regex, password)) {
            throw new InvalidValueExceptions("Password không hợp lệ. Phải có 6-16 k tự, ít nhất có 1 cữ cái in hoa, 1 chữ cái in thường, 1 số và 1 ký tự đặc biệt.");
        }
    }

    public void checkExistedUsername(String username) throws DuplicatedValueExceptions {
        UsersList listInstance = UsersList.getInstance();
        List<User> usersList = listInstance.getUsers();
        boolean existed = false;
        for (User u : usersList) {
            if (u.getUsername().equals(username)) {
                existed = true;
                break;
            }
        }
        if (existed) {
            throw new DuplicatedValueExceptions("Giá trị username đã tồn tại");
        }

    }

    public void checkExistedId(int id) throws DuplicatedValueExceptions {
        UsersList listInstance = UsersList.getInstance();
        List<User> usersList = listInstance.getUsers();
        boolean existed = false;
        for (User u : usersList) {
            if (u.getId() == id) {
                existed = true;
                break;
            }
        }
        if (existed) {
            throw new DuplicatedValueExceptions("Giá trị id đã tồn tại");
        }
    }

}
