package com;

import com.dao.ActorsDaoImplement;
import com.dao.GenreDaoImplement;
import com.dao.MovieDaoImplement;
import com.model.Actor;
import com.model.Director;
import com.model.Genre;
import com.model.Movie;



import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Movie movie = new Movie();
        String str="2018-09-01 16:20:10";
        Timestamp time = Timestamp.valueOf(str);

        /** Setam toate datele pentru film*/

        movie.setTitle("Marele saolin");
        movie.setScore(30);
        movie.setDuration(5);
        movie.setReleaseDate(time);

        /** Cream un obiect de tip MovieDaoImplement care o sa acceseze metodele respective*/
        MovieDaoImplement movieDao = new MovieDaoImplement();
        movieDao.add(movie);
        System.out.println(movieDao.getMovie(38));
        movieDao.delete(42);

        /** Cream un obiect de tip Genre si GenreDaoImplement*/

        Genre genre = new Genre();
        GenreDaoImplement genreDaoImplement = new GenreDaoImplement();

        genre.setName("Drama");
        genreDaoImplement.addGenre(genre);
        //genreDaoImplement.deleteGenre(1);
        System.out.println(genreDaoImplement.getGenre(2));

        Actor actor = new Actor();
        actor.setName("Vin diesel");
        actor.setId(33);

        /**    Va da eroare deoarece nu exista niciun film cu ID-ul 100, id_movies fiind cheie straina,  in tabelul actors
        Actor actorSecond = new Actor();
        actorSecond.setName("Silvester Stalone");
        actorSecond.setId(1000);

         */

        /** Adaugam in tabela actors actorul "actor"   */
        ActorsDaoImplement actorsDaoImplement = new ActorsDaoImplement();
        //actorsDaoImplement.createActorTable();   // Tabelul este deja creat(datorita primei rulari a programului) de aceea este comentata linia.
        actorsDaoImplement.addActor(actor);

        Director director = new Director();
        director.setName("Makoto Shinkai");

        ImportData importData = new ImportData();
        importData.impData();
    }
}
