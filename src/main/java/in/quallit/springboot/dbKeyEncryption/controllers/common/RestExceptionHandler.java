/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.controllers.common;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import in.quallit.springboot.dbKeyEncryption.dtos.common.APIError;
import in.quallit.springboot.dbKeyEncryption.entities.common.ResponseBody;

/**
 * @author JIGS
 *
 */
//@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String errorMessage = "Malformed JSON request";
		ex.printStackTrace();
		return ResponseEntity.badRequest()
				.body(new ResponseBody<>(new APIError(HttpStatus.BAD_REQUEST, errorMessage, ex.getMessage())));
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	protected ResponseEntity<Object> handleSQLIntegrityConstraintViolationException(
			DataIntegrityViolationException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ResponseBody<>(new APIError(HttpStatus.INTERNAL_SERVER_ERROR,
						ex.getMostSpecificCause().getMessage(), ex.getMessage())));
	}

	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<Object> handleRuntimeException(RuntimeException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseBody<>(
				new APIError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(), ex.getMessage())));
	}

}
