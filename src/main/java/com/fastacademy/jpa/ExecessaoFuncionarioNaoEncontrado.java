package com.fastacademy.jpa;

class ExcessaoFuncionarioNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	ExcessaoFuncionarioNaoEncontrado(Long id) {
	    super("Não foi possível encontrar o funcionário: " + id);
	}
}

