package edu.canisius.cyb600.lab4.database;

import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Category;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import java.sql.Connection;
import java.util.List;

/**
 * Abstract DB Adapter
 */
public abstract class AbstractDBAdapter {
    Connection conn;

    public AbstractDBAdapter(Connection conn) {
        this.conn = conn;
    }



    //SELECTS

    //INSERTS

    //JOIN
    //SELECTS
    public abstract List<Film> getAllFilms();

    public abstract List<Category> getActorsWithLastName(String lastName);

    //INSERTS
    public abstract Category addActor(Category category);

    //JOIN
    public abstract List<Film> getFilmsForActor(Category category);

    public abstract List<Category> getAllActors();

    public abstract List<Category> getAllActorsWithLastName(String lastName);

    public abstract List<Category> getAllActorsWithLastNameWithCode(String lastName);


    public abstract List<Film> getFilmsInCategory(Category category);

}
