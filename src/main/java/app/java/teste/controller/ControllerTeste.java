package app.java.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ControllerTeste {

    @GetMapping
    private String endpointTeste(){
        return "Funcionando com sucesso app-teste-21";
    }
}
