package mate.academy.security;

import mate.academy.exception.AuthenticationException;
import mate.academy.model.User;

public interface AuthenticationService {
    User login(String login, String password) throws AuthenticationException;

    User register(String name, String login, String password);
}