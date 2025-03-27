package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;
import ac.za.mycput.domain.Loan;

import java.util.List;

public interface ILoanRepository extends IRepository<Loan, Integer>{

    List<Loan> getAll();
}
