package barbeariaaguiareal.com.barbearia.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class MetodosHttpController {
    
    @GetMapping
    public String get () {
        return "Requisição GET";
    }

    @PostMapping
    public String post () {
        return "Requisição Post";
    }

    @PutMapping
    public String put () {
        return "Requisição put";
    }

    @PatchMapping
    public String patch () {
        return "Requisição patch";
    }

    @DeleteMapping
    public String delete () {
        return "Requisição Delete";
    }

}
