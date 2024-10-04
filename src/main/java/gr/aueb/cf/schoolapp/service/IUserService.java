package gr.aueb.cf.schoolapp.service;

import gr.aueb.cf.schoolapp.core.exceptions.*;
import gr.aueb.cf.schoolapp.dto.UserInsertDTO;
import gr.aueb.cf.schoolapp.dto.UserReadOnlyDTO;


public interface IUserService {

    UserReadOnlyDTO insertUser(UserInsertDTO dto) throws EntityAlreadyExistsException, AppServerException;
    UserReadOnlyDTO getUserByUsername(String username) throws EntityNotFoundException;
    boolean isUserValid(String username, String Password);
    boolean doesEmailExists(String Username);
}
