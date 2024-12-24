package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FileError {
  
  private FileErrorCode code;

  
  private String details;

  
  private String message;

  public FileError() {
  }

  
  public FileErrorCode getCode() {
    return code;
  }

  public void setCode(FileErrorCode code) {
    this.code = code;
  }

  
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "FileError{code='" + code + "', details='" + details + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileError that = (FileError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(details, that.details) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FileErrorCode code;

    
    private String details;

    
    private String message;

    public FileError build() {
      FileError result = new FileError();
      result.code = this.code;
      result.details = this.details;
      result.message = this.message;
      return result;
    }

    
    public Builder code(FileErrorCode code) {
      this.code = code;
      return this;
    }

    
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
