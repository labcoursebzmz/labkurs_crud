package bl;

import ejb.Statusi;
import java.util.List;

public interface StatusiInterface {
    void create(Statusi s);
    void edit(Statusi s);
    void delete(Statusi s);
    //List<Statusi> selectAll();
    List<Statusi> findAll();
    //Statusi selectByID(int id);
    Statusi findByID(int id);
}
