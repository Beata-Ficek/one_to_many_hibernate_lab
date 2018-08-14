import db.DBHelper;
import models.Director;
import models.Film;

public class Runner {

    public static void main(String[] args) {

        Director davidFincher = new Director("David","Fincher");
        DBHelper.save(davidFincher);

        Director joeJohnston = new Director("Joe", "Johnston");
        DBHelper.save(joeJohnston);


        Film fightClub = new Film("fight Club", 18, davidFincher);
        DBHelper.save(fightClub);

        Film jumanji = new Film("Jumanji", 12, joeJohnston);
        DBHelper.save(jumanji);

        Film greenMile = new Film("Green Mile", 13, davidFincher);
        DBHelper.save(greenMile);


        Film foundFilm = DBHelper.findById(Film.class, 1);


    }
}
