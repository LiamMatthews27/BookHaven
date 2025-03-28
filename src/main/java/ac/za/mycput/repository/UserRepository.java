/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/


package ac.za.mycput.repository;

import ac.za.mycput.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{

    private static IUserRepository repository = null;

    private List<User> userList;
    private UserRepository() {
        userList = new ArrayList<User>();
    }

    public static IUserRepository getRepository() {//checking if repository is there or not
        if(repository == null)  {
            repository = new UserRepository();//create one if it is not there
        }
        return  repository;
    }

    @Override
    public User create(User user) {
        boolean success = userList.add(user);//add user
        if(success){
            return user; //return the user if it is success
        }
       return null;
    }

   @Override
   public User read(String id)  {//linear search
        for( User user: userList) {
            if(user.getUserId().equals(id))// search through
                return user;
        }
        return null;//if not found
   }

@Override
public User update(User user) {
        String id = user.getUserId();// user already in the list to update it
        User oldUser = read(id); // getting the old user
        if(oldUser == null)
            return null;

        boolean success =  delete(id);// deleting old object to add new
        if (success) {
            if(userList.add(user))// if old user its deleted add new one
                return  user;
        }
        return null;
}

@Override
public boolean delete(String id) {//deleting by id in the list
    User userToDelete = read(id);// finding user to delete
    if(userToDelete == null )
        return false; // if  not found
    return (userList.remove(userToDelete));//if it is found delete it
}

@Override
public List<User>getAll() {
        return userList;//returning the userlist
}
}
