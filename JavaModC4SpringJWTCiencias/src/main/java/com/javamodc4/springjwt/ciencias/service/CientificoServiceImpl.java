/**
 * 
 */
package com.javamodc4.springjwt.ciencias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.ciencias.dao.ICientificoDAO;
import com.javamodc4.springjwt.ciencias.dto.Cientifico;

/**
 * @author aitor
 *
 */
@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientifico() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoById(int id) {
		return iCientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(int id) {
		iCientificoDAO.deleteById(id);

	}

}
