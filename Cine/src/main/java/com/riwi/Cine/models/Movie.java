package com.riwi.Cine.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movies;
    private String title;
    private String description;
    private int year;
    private int votes;
    private double rating;
    private String image_url;

    //Se hace la REFERENCIA a el atributo de la base de datos "image_url" porque se llama diferente
    //Esto solo en caso de que la instancia no se llame igual que el atributo de la base de datos
    //@Column(name = "image_url")
    //private String imageUrl;

    public int getId_movies() {
        return this.id_movies;
    }

    public void setId_movies(int id_movies) {
        this.id_movies = id_movies;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVotes() {
        return this.votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    /*@Override
    public String toString() {
        return "MOVIE: " +
                "Id_movies=" + id_movies +
                "Title='" + title + '\'' +
                "Description='" + description + '\'' +
                "Year=" + year +
                "Votes=" + votes +
                "Rating=" + rating +
                "Image_url='" + image_url + '\'' +
                '}';
    }*/
}
