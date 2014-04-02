package com.valhala.servicos.dao;

import java.util.List;

import com.valhala.servicos.exception.ConsultaSemResultados;

/**
 * Interface genérica
 * @author Bruno Luiz Viana
 *
 * @param <T>
 */
public interface Dao<T> {
	
	List<T> buscarTudo() throws ConsultaSemResultados;

} // fim da interface Dao