package com.webapps.tss.meus.titulos.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webapps.tss.meus.titulos.app.model.SituacaoTitulo;
import com.webapps.tss.meus.titulos.app.model.Titulo;
import com.webapps.tss.meus.titulos.app.repository.TitulosRepository;

@Controller
@RequestMapping("/titulo")
public class TitulosController {
	
	private TitulosRepository repository;
	
	public TitulosController(TitulosRepository titulosRepository) {
		this.repository = titulosRepository;
	}
	
    @ModelAttribute("statusAll")
    public List<SituacaoTitulo> todasSituacoes(){
    	return Arrays.asList(SituacaoTitulo.values());
    }
	
    @GetMapping("/novo")
    public ModelAndView cadastrar() {
    	ModelAndView mv = new ModelAndView("CadastroTitulo");

    	//mv.addObject("statusAll", SituacaoTitulo.values());
        return mv;
    }
    
    @PostMapping("/salvar")
    public ModelAndView salvar(Titulo titulo) {
    	System.out.println(">>> " + titulo);
    	repository.save(titulo);
    	
    	ModelAndView mv = new ModelAndView("CadastroTitulo");
    	mv.addObject("mensagem", "Título salvo com sucesso!");
    	return mv;
    }
    
    @GetMapping("/pesquisa")
    public ModelAndView pesquisar() {
    	
    	ModelAndView mv = new ModelAndView("PesquisaTitulo");
    	return mv;
    }
   
}
