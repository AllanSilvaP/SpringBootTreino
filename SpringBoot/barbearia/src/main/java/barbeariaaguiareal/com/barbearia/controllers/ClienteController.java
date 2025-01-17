package barbeariaaguiareal.com.barbearia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import barbeariaaguiareal.com.barbearia.models.entities.Cliente;

import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente () {
        return new Cliente(1, "Allan", "057.750.591-23");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @RequestMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "João Lindo", "123-456-789-00");
    }
}
