package com.valhala.servicos.exception;

public class ConsultaSemResultados extends Exception {

	private static final long serialVersionUID = 7516908623372376342L;
	
	public ConsultaSemResultados() {
		super();
	}

	public ConsultaSemResultados(String message, Throwable cause) {
		super(message, cause);
	}

	public ConsultaSemResultados(String message) {
		super(message);
	}

	public ConsultaSemResultados(Throwable cause) {
		super(cause);
	}

}
