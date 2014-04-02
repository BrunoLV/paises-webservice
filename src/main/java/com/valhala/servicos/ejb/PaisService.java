package com.valhala.servicos.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.valhala.servicos.dao.impl.PaisDaoImpl;
import com.valhala.servicos.exception.ConsultaSemResultados;
import com.valhala.servicos.modelo.Pais;

/**
 * EJB que define também os serviços pertinentes a Pais.
 * @author Bruno Luiz Viana
 * @version 1.0
 * @since 01/04/2014
 *
 */
@WebService
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PaisService {
	
	@Inject
	private PaisDaoImpl paisDao;
	
	/**
	 * Método utilizado para devolver a lista de países cadastrados na base de dados.
	 * @return
	 * @throws ConsultaSemResultados 
	 */
	@WebMethod
	public List<Pais>  buscarPaises() throws ConsultaSemResultados {
		return this.paisDao.buscarTudo();
	} // fim do método buscarPaises

} // fim da clase PaisService