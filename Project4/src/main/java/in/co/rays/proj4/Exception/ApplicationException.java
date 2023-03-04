package in.co.rays.proj4.Exception;
/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 *
 * @author Rupali Patel
 
 *
 */
public class ApplicationException extends Exception {
	/**
    
     *            : Error message
     */
	public ApplicationException(String msg) {
        super(msg);
    }
}