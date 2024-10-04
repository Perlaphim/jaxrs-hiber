package gr.aueb.cf.schoolapp.validator;

import gr.aueb.cf.schoolapp.dao.IUserDAO;
import gr.aueb.cf.schoolapp.dao.UserDAOImpl;
import gr.aueb.cf.schoolapp.dto.UserInsertDTO;
import gr.aueb.cf.schoolapp.model.User;
import gr.aueb.cf.schoolapp.service.IUserService;
import gr.aueb.cf.schoolapp.service.UserServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserInputValidator {

    private static final IUserDAO userDAO = new UserDAOImpl();
    private static final IUserService userService = new UserServiceImpl(userDAO);

    private UserInputValidator() {}

    public static <T extends UserInsertDTO> Map<String, String> validate(T dto) {
        Map<String, String> error = new HashMap<>();

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            error.put("confirmPassword", "Passwords do not match");
        }

        if (userService.doesEmailExists(dto.getUsername())) {
            error.put("username", "Email/Username already in use");
        }

        return error;
    }
}
