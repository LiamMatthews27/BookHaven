package ac.za.mycput.repository;

import ac.za.mycput.domain.Library;

import java.util.List;

public interface ILibraryRepository extends IRepository<Library, String>{

    List<Library> getAll(Library libraryAll);
}
