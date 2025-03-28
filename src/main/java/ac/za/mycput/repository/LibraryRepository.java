package ac.za.mycput.repository;

import ac.za.mycput.domain.Library;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepository implements ILibraryRepository {
    private static ILibraryRepository repository = null;
    private List<Library> libraryList;

    private LibraryRepository(){
        libraryList = new ArrayList<>();
    }

    public static ILibraryRepository getRepository(){
        if(repository == null){
            repository = new LibraryRepository();
        }
        return repository;
    }


    @Override
    public Library create(Library library) {
        boolean success = libraryList.add(library);
        if(success){
            return library;
        }
        return null;
    }

    @Override
    public Library read(String libraryID) {
        for(Library library : libraryList){
            if(library.getLibraryID().equals(libraryID)){
                return library;
            }
        }
        return null;
    }

    @Override
    public Library update(Library library) {
        String Id = library.getLibraryID();
        Library updateLibrary = read(Id);
        if(updateLibrary == null){
            return null;
        }

        boolean success = libraryList.add(library);
        if(success){
            if(libraryList.add(library))
                return library;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Library libraryToDelete = read(s);
        if(libraryToDelete == null){
            return false;
        }
        return libraryList.remove(libraryToDelete);
    }

    @Override
    public List<Library> getAll(Library libraryAll) {
        return libraryList;
    }
}
