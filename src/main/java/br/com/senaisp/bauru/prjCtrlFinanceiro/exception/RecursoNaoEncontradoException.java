package br.com.senaisp.bauru.prjCtrlFinanceiro.exception;

public class RecursoNaoEncontradoException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}