package ac.za.mycput.repository;

//*214280829 Zintle Mgqongose*//
import ac.za.mycput.domain.Fine;

import java.util.List;

public interface IFineRepository<T, ID> {
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

    List<T> getAll();
}

