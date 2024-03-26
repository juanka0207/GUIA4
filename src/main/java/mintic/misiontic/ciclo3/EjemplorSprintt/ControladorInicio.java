/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemplorSprintt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Juanka
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
    
}
