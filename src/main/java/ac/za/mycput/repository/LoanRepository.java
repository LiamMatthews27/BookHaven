package ac.za.mycput.repository;

import ac.za.mycput.domain.Loan;

import java.util.ArrayList;
import java.util.List;

public class LoanRepository implements ILoanRepository {

    private static ILoanRepository repository = null;
    private List<Loan> loanList;

    private LoanRepository() {
        loanList = new ArrayList<>();
    }

    public static ILoanRepository getRepository() {
        if (repository == null) {
            repository = new LoanRepository();
        }
        return repository;
    }

    @Override
    public Loan create(Loan loan) {
        boolean success = loanList.add(loan);
        return success ? loan : null;
    }

    @Override
    public Loan read(Integer id) {
        for (Loan loan : loanList) {
            if (loan.getLoanId() == id) {
                return loan;
            }
        }
        return null;
    }

    @Override
    public Loan update(Loan loan) {
        int id = loan.getLoanId();
        Loan existingLoan = read(id);
        if (existingLoan == null) {
            return null;
        }
        boolean success = delete(id);
        if (success) {
            if (loanList.add(loan)) {
                return loan;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Loan loanToBeDeleted = read(id);
        if (loanToBeDeleted == null) {
            return false;
        }
        return loanList.remove(loanToBeDeleted);
    }

    @Override
    public List<Loan> getAll() {
        return loanList;
    }
}
