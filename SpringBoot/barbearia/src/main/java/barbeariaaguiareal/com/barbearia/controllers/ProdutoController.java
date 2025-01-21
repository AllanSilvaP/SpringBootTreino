package barbeariaaguiareal.com.barbearia.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import barbeariaaguiareal.com.barbearia.models.entities.Produto;
import barbeariaaguiareal.com.barbearia.models.entities.repositories.ProdutoRepository;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/pagina/{numPagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numPagina) {
        PageRequest page = PageRequest.of(numPagina, 3);
        return produtoRepository.findAll(page);
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable Integer id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}
