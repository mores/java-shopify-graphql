package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MediaWarning {
  
  private MediaWarningCode code;

  
  private String message;

  public MediaWarning() {
  }

  
  public MediaWarningCode getCode() {
    return code;
  }

  public void setCode(MediaWarningCode code) {
    this.code = code;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "MediaWarning{code='" + code + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaWarning that = (MediaWarning) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MediaWarningCode code;

    
    private String message;

    public MediaWarning build() {
      MediaWarning result = new MediaWarning();
      result.code = this.code;
      result.message = this.message;
      return result;
    }

    
    public Builder code(MediaWarningCode code) {
      this.code = code;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
