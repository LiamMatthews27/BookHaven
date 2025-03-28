package ac.za.mycput.repository;

import ac.za.mycput.domain.Fine;

import java.util.ArrayList;
import java.util.List;

public class FineRepository implements IFineRepository<Fine, Integer> {

    private static IFineRepository<Fine, Integer> repository = null;
    private List<Fine> fineList;

    private FineRepository() {
        fineList = new ArrayList<>();
    }

    public static IFineRepository<Fine, Integer> getRepository() {
        if (repository == null) {
            repository = new FineRepository();
        }
        return repository;
    }

    @Override
    public Fine create(Fine fine) {
        boolean success = fineList.add(fine);
        return success ? fine : null;
    }

    @Override
    public Fine read(Integer fineID) { 
        return fineList.stream()
                .filter(fine -> fine.getFineID() == fineID)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Fine update(Fine fine) {
        Integer id = fine.getFineID();
        Fine existingFine = read(id);
        if (existingFine == null) {
            return null;
        }

        boolean success = delete(id);
        if (success) {
            fineList.add(fine);
            return fine;
        }
        return null;
    }

    @Override
    public boolean delete(Integer fineID) {
        Fine fineToDelete = read(fineID);
        if (fineToDelete == null) {
            return false;
        }
        return fineList.remove(fineToDelete);
    }

    @Override
    public List<Fine> getAll() {
        return new ArrayList<>(fineList);
    }
}