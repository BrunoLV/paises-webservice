package com.valhala.servicos.dao.impl;

import com.valhala.servicos.dao.PaisDao;
import com.valhala.servicos.modelo.Pais;

public class PaisDaoImpl extends BaseDao<Pais> implements PaisDao {
	
	private static final Class<Pais> CLAZZ = Pais.class;
	
	public PaisDaoImpl() {
		this.classePersistente = PaisDaoImpl.CLAZZ;
	}

}
