package bom.management.film_services;

import bom.entities.film.Film;
import bom.entities.film.FilmsList;

public class AddFilm {
    public void createFilm(String title, String category, String duration, String language, String director, String rated ) {
        FilmsList filmsList = FilmsList.getInstance();
        Film film = new Film(title, category, duration, language, director, rated);
        filmsList.addFilm(film);
    }

}
