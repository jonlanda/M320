package D3;

public class UserValidation {
    private User user;

    public UserValidation(User user) {
        this.user = user;
    }

    private void validateUser() throws InvalidUserException {
        if (this.user.getName().length() == 0) {
            throw new InvalidUserException("Username cannot be null");
        }

        if (this.user.getName().length() > 20) {
            throw new InvalidUserException("Username is too long");
        }
    }

    public void createUser() throws InvalidUserException {
        validateUser();
        System.out.println("User has been created");
    }
}
