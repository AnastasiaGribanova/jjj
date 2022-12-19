package web.service;
import web.model.User;
import java.util.List;

public interface UserService {



    List<User> listAll();
    void delete(int id);
    void save(User user);
    void update(int id, User updatedUser);
    User show(int id);

}
