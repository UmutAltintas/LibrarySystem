import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private String releaseDate;
    private String language;
    private ArrayList<String> genres;

    public Book(String name) {
        this(name, "Unknown", "Unknown", "Unknown", new ArrayList<>());
    }

    public Book(String name, String author, String releaseDate, String language, ArrayList<String> genres) {
        this.name = name;
        this.author = author.isEmpty() ? "Unknown" : author;
        this.releaseDate = releaseDate.isEmpty() ? "Unknown" : releaseDate;
        this.language = language.isEmpty() ? "Unknown" : language;
        this.genres = new ArrayList<>(genres);
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getReleaseDate() { return releaseDate; }
    public String getLanguage() { return language; }
    public ArrayList<String> getGenres() { return new ArrayList<>(genres); }

    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author.isEmpty() ? "Unknown" : author; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }
    public void setLanguage(String language) { this.language = language; }

    public void addGenre(String genre) { genres.add(genre); }
    public void removeGenre(String genre) { genres.remove(genre); }

    @Override
    public String toString() {
        return "Book { name = '" + name + "', author = '" + author + "', releaseDate = '" +
                releaseDate + "', language = '" + language + "', genres=" + genres + " }";
    }
}