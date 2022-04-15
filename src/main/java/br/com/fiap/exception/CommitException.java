package br.com.fiap.exception;

public class CommitException extends Exception {

	private static final long serialVersionUID = -4506360168194185620L;
	
	public CommitException() {
		super("Erro ao realizar commit");
	}
	
	public CommitException(String msg) {
		super(msg);
	}
}
