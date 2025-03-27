package ac.za.mycput.repository;

import ac.za.mycput.domain.Fine;

import java.util.ArrayList;
import java.util.List;

public class FineRepository implements IFineRepository<Fine, String> {

    private static IFineRepository<Fine, String> repository = null;
    private List<Fine> fineList;

    private FineRepository() {
        fineList = new ArrayList<>();
    }

    public static IFineRepository<Fine, String> getRepository() {
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
    public Fine read(String loanID) {
        return fineList.stream()
                .filter(fine -> fine.getLoanID().equals(loanID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Fine update(Fine fine) {
        String id = fine.getLoanID();
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
    public boolean delete(String loanID) {
        Fine fineToDelete = read(loanID);
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