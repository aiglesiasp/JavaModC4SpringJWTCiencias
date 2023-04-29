/**
 * 
 */
package com.javamodc4.springjwt.ciencias.service;

import java.util.List;

import com.javamodc4.springjwt.ciencias.dto.Cientifico;

/**
 * @author aitor
 *
 */
public interface ICientificoService {
	// Metodos del CRUD
	public List<Cientifico> listarCientifico();

	public Cientifico guardarCientifico(Cientifico cientifico);

	public Cientifico cientificoById(int id);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(int id);
}
