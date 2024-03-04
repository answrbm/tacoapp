package tacos.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.tacocloud.models.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
