package barbeariaaguiareal.com.barbearia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

@GetMapping("/soma/{num1}/{num2}")
public double soma (@PathVariable double num1, @PathVariable double num2) {
    double resultadoSum = num1 + num2;
    return resultadoSum;
}


@GetMapping("/subtrair")
public double subtrair(@RequestParam(name = "a")double num1, @RequestParam(name = "b") double num2) {
    double resultadoSub = num1 - num2;
    return resultadoSub;
}

}
