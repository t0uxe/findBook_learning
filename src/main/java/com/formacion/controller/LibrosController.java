package com.formacion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacion.model.Libro;
import com.formacion.service.LibrosService;

@Controller
public class LibrosController {
	//inyecta una instancia del servicio
	@Autowired
	LibrosService service;
	List<Libro> libros;
	public LibrosController() {
		libros=new ArrayList<>();
		libros.add(new Libro("978-4-6558-7164-2", "Aprende Java","Francisco Albares",450));
		libros.add(new Libro("978-0-2838-2569-9","El viento del mal","Paco Umbral",330));
		libros.add(new Libro("978-9-7150-5983-1","Nunca perder la esperanza","Rosalia Iglesias",450));
		libros.add(new Libro("978-1-3057-2846-2","Nunca es nunca","Ana Lago",830));
		libros.add(new Libro("978-6-7455-2076-8","Casi siempre es nunca","Mar Pascal",320));
	}
	
	
	@PostMapping(value="buscar")
	public String buscador(@RequestParam("titulo") String titulo,
							HttpServletRequest request) {
		List<Libro> encontrados=service.buscarLibrosTitulo(titulo);
		//guarda en un atributo de peticion
		//la lista de libros encontrados por titulo
		request.setAttribute("libros", encontrados);
		return "libros";
	}
}
