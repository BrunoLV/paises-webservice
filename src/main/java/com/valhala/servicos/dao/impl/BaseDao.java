package com.valhala.servicos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.valhala.servicos.dao.Dao;
import com.valhala.servicos.exception.ConsultaSemResultados;

public abstract class BaseDao<T> implements Dao<T> {
	
	@PersistenceContext(unitName = "paises-ws")
	protected EntityManager manager;
	protected Class<T> classePersistente;
	
	@SuppressWarnings("unused")
	@Override
	public List<T> buscarTudo() throws ConsultaSemResultados {
		List<T> lista = new ArrayList<>();
		CriteriaBuilder builder = this.manager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = builder.createQuery(this.classePersistente);
		Root<T> root = criteriaQuery.from(this.classePersistente);
		TypedQuery<T> query = this.manager.createQuery(criteriaQuery);
		lista = query.getResultList();
		if (lista.isEmpty()) {
			throw new ConsultaSemResultados("Consulta não retornou resultados.");
		}
		return lista;
	} // fim do método buscarTudo
	
} // fim da classe BaseDao