package bom.entities.film;

import bom.helpers.fileManipulation.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class FilmsList {
    private static FilmsList instance = null;
    private List<Film> films;
    private FilmsList() {
        this.films = new ArrayList<>();
    }
    public static FilmsList getInstance() {
        if (instance == null) {
            FilmsList filmsList = new FilmsList();
            String filePath = "project/src/bom/files/films.csv";
            ReadFile readFile = new ReadFile();
            List<Film> filmsListCSV = readFile.filmsFileReader(filePath);
            filmsList.films.addAll(filmsListCSV);
            instance = filmsList;
        }
        return instance;
    }
    public List<Film> getFilms() {
        return films;
    }
    public void addFilm(Film film) {
        films.add(film);
    }
    public int findFilmIndex(String name) {
        String nameF;
        int index = -1;
        for (Film film : films) {
            nameF = film.getTitle();
            if (name.equals(nameF)) {
                index = films.indexOf(film);
                break;
            }
        }
        return index;
    }
    public String findFilm(int index) {
        Film findedFilm = films.get(index);
        return findedFilm.toString();
    }
    public void editFilm(int index, Film film) {
        films.set(index, film);
    }
    public void removeFilm(int index) {
        films.remove(index);
    }

}
