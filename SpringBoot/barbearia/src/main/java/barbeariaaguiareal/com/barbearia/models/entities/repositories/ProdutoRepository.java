package barbeariaaguiareal.com.barbearia.models.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import barbeariaaguiareal.com.barbearia.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    
}