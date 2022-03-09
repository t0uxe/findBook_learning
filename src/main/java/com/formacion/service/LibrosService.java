package com.formacion.service;

import java.util.List;

import com.formacion.model.Libro;

public interface LibrosService {

	List<Libro> buscarLibrosTitulo(String titulo);

}
