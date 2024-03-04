package tacos.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.tacocloud.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}