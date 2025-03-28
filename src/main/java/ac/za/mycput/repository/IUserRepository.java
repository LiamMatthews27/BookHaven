/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/


package ac.za.mycput.repository;

import ac.za.mycput.domain.User;

import java.util.List;

public interface IUserRepository extends   IRepository<User, String > {


    List<User> getAll();
}
