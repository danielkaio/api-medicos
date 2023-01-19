package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicosController {
    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);

    }
}
