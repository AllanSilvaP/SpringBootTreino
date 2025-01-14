package barbeariaaguiareal.com.barbearia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import barbeariaaguiareal.com.barbearia.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente () {
        return new Cliente(1, "Allan", "057.750.591-23");
    }
}
