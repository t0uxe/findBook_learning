package com.formacion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.formacion.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService {
	List<Libro> libros;
	public LibrosServiceImpl() {
		}
	
	@Override
	public List<Libro> buscarLibrosTitulo(String titulo){
		return libros.stream()
				.filter(c->c.getTitulo().equals(titulo))
				.collect(Collectors.toList());
		
	}
}
