/**
 * 
 */
package com.funds.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author HP
 *
 */

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Not Found")
public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 3282316360850300949L;

 
 
 String errorMessage;
 
 String errorCode;

 public CustomException(String errorMessage, String errorCode) {
  super();
  this.errorMessage = errorMessage;
  this.errorCode = errorCode;
 }

 public String getErrorMessage() {
  return errorMessage;
 }

 public void setErrorMessage(String errorMessage) {
  this.errorMessage = errorMessage;
 }

 public String getErrorCode() {
  return errorCode;
 }

 public void setErrorCode(String errorCode) {
  this.errorCode = errorCode;
 }
}