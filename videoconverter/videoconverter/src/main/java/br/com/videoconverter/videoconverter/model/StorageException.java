/**
 * 
 */
package br.com.videoconverter.videoconverter.model;

/**
 * Exceção lançada quando ocorre erros no armazenamento de arquivos.
 * @author maycon
 *
 */
public class StorageException extends Exception {

	private static final long serialVersionUID = 6261377022308710325L;

	public StorageException(Throwable throwable) {
		super(throwable);
	}
	
	public StorageException(String message) {
		super(message);
	}
	
}
