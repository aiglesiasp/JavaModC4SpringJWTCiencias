/**
 * 
 */
package com.javamodc4.springjwt.ciencias.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.ciencias.dto.Cientifico;

/**
 * @author aitor
 *
 */
public interface ICientificoDAO extends JpaRepository<Cientifico, Integer> {

}
