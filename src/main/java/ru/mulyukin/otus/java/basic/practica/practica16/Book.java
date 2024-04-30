package ru.mulyukin.otus.java.basic.practica.practica16;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String title;
    private Autor author;
    private transient List<String > comments;


    public Book(long id, String title, Autor author, List<String> comments) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Autor getAuthor() {
        return author;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", comments=" + comments +
                '}';
    }
}
