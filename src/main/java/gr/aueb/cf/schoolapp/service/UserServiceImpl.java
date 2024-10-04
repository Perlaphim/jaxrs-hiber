package gr.aueb.cf.schoolapp.service;

import gr.aueb.cf.schoolapp.core.exceptions.AppServerException;
import gr.aueb.cf.schoolapp.core.exceptions.EntityAlreadyExistsException;
import gr.aueb.cf.schoolapp.core.exceptions.EntityNotFoundException;
import gr.aueb.cf.schoolapp.dao.IUserDAO;
import gr.aueb.cf.schoolapp.dto.UserInsertDTO;
import gr.aueb.cf.schoolapp.dto.UserReadOnlyDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ApplicationScoped
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class UserServiceImpl implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IUserService.class);
    private final IUserDAO iUserDAO;


    @Override
    public UserReadOnlyDTO insertUser(UserInsertDTO dto) throws EntityAlreadyExistsException, AppServerException {
        return null;
    }

    @Override
    public UserReadOnlyDTO getUserByUsername(String username) throws EntityNotFoundException {
        return null;
    }

    @Override
    public boolean isUserValid(String username, String Password) {
        return false;
    }

    @Override
    public boolean doesEmailExists(String Username) {
        return false;
    }
}
