package bom.entities.film;

public class Film {
    private String title;
    private String category;
    private String duration;
    private String language;
    private String director;
    private String rated;
    public Film(String title, String category, String duration, String language, String director, String rated) {
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.language = language;
        this.director = director;
        this.rated = rated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    @Override
    public String toString() {
        return "{ title=" + title + ", category=" + category + ", duration=" + duration + ", language=" + language
                + ", director=" + director + ", rated=" + rated + "}\n";
    }
}
