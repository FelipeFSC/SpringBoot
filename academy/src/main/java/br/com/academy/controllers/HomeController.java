package br.com.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// Notação para mostrar que essa classe é um controller
@Controller
public class HomeController {
    
    // Fazendo uma requisição GET onde chama a URL /
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index"); // Passando o caminho do arquivo que sera requisitado

        // Enviando uma mensagem para o index com o [parametro],[texto]
        mv.addObject("msg", "Teste mensagem do Controller");

        return mv;
    }

}
