package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
<<<<<<< HEAD
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
=======


@Service
public class CategoriaService {

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
<<<<<<< HEAD
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

=======
		return obj;
	}
>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
}
