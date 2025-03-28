package ac.za.mycput.repository;
/*
ILoanRepository.java
ILoanRepository model class
Author: Liam Matthews
Student Number: 221818340
Date: 23 March 2025
 */
import ac.za.mycput.domain.Loan;

import java.util.List;

public interface ILoanRepository extends IRepository<Loan, Integer>{

    List<Loan> getAll();
}
