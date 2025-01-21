package barbeariaaguiareal.com.barbearia.models.entities.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import barbeariaaguiareal.com.barbearia.models.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
}
