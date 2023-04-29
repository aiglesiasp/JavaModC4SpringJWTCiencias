/**
 * 
 */
package com.javamodc4.springjwt.ciencias.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.ciencias.dto.Proyecto;

/**
 * @author aitor
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, Integer> {

}
