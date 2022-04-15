package br.com.fiap.exception;

public class IdNotFoundException extends Exception {

	private static final long serialVersionUID = 6688620110928562013L;
	
	public IdNotFoundException() {
		super("Id não encontratdo");
	}
	
	public IdNotFoundException(String msg) {
		super(msg);
	}
}
