package barbeariaaguiareal.com.barbearia.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class PrimeiroController {

    @GetMapping
    public String voz () {
        return "Testando 123";
    }
}
