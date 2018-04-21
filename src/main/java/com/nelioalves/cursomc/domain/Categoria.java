package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

<<<<<<< HEAD
@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
=======




@Entity
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<>();
	
	public Categoria() {
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public Integer getId() {
		return id;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public void setId(Integer id) {
		this.id = id;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public String getNome() {
		return nome;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

<<<<<<< HEAD
=======

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

<<<<<<< HEAD
=======


	
	

>>>>>>> 04fcbc0d3e8104fcd90e14d5cb19da145a7b8c3e
}
