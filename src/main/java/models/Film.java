package models;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private int ageRating;
    private Director director;

    public Film(){}

    public Film(String title, int ageRating, Director director) {
        this.title = title;
        this.ageRating = ageRating;
        this.director = director;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "age_Rating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector(){
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

}
