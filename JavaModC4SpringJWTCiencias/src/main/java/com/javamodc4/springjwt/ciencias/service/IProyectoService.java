/**
 * 
 */
package com.javamodc4.springjwt.ciencias.service;

import java.util.List;

import com.javamodc4.springjwt.ciencias.dto.Proyecto;

/**
 * @author aitor
 *
 */
public interface IProyectoService {
	// Metodos del CRUD
	public List<Proyecto> listarProyecto();

	public Proyecto guardarProyecto(Proyecto proyecto);

	public Proyecto proveedorById(int id);

	public Proyecto actualizarProyecto(Proyecto proyecto);

	public void eliminarProyecto(int id);
}
