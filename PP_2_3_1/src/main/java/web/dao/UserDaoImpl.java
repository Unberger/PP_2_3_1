package web.dao;

//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.PersistenceContextType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private final EntityManager em;

    @Autowired
    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> showAllUser() {
        return em.createQuery("SELECT u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public void update(int id, User user) {
        User userToBeUpdated = getUserById(id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setAge(user.getAge());
        em.merge(userToBeUpdated); //может быть ошибкой, так как строчка, возможно добавляет юзера в конец
    }

    @Override
    public void delete(int id) {
        if (em.find(User.class, getUserById(id)) != null) {
            em.remove(getUserById(id));
        }
    }
}

