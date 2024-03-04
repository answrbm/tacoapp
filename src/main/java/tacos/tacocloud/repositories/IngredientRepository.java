package tacos.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import tacos.tacocloud.models.Ingredient;
import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
