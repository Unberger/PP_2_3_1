package web.dao;

//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

@Component
public interface UserDao {

    List<User> showAllUser ();

    User getUserById(int id);

    void save(User user);
    void update(int id, User user);
    void delete(int id);


}
