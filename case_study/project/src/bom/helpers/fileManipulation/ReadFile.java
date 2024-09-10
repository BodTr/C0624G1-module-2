package bom.helpers.fileManipulation;
import bom.entities.film.Film;
import bom.entities.user.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    public List<User> usersFileReader(String filePath) {
        List<User> userslist = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                User user = new User(Integer.parseInt(data[0]), data[1], data[2], data[3]);

                userslist.add(user);
            }
//            System.out.println(list);
            return userslist;

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
            return null;
        }
    }

    public List<Film> filmsFileReader(String filePath) {
        List<Film> filmslist = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Film user = new Film(data[0], data[1], data[2], data[3], data[4], data[5]);

                filmslist.add(user);
            }
//            System.out.println(list);
            return filmslist;

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
            return null;
        }
    }
}
