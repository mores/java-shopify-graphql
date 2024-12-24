package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ValidationCreatePayload {
  
  private List<ValidationUserError> userErrors;

  
  private Validation validation;

  public ValidationCreatePayload() {
  }

  
  public List<ValidationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ValidationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  
  public Validation getValidation() {
    return validation;
  }

  public void setValidation(Validation validation) {
    this.validation = validation;
  }

  @Override
  public String toString() {
    return "ValidationCreatePayload{userErrors='" + userErrors + "', validation='" + validation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationCreatePayload that = (ValidationCreatePayload) o;
    return Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(validation, that.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors, validation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ValidationUserError> userErrors;

    
    private Validation validation;

    public ValidationCreatePayload build() {
      ValidationCreatePayload result = new ValidationCreatePayload();
      result.userErrors = this.userErrors;
      result.validation = this.validation;
      return result;
    }

    
    public Builder userErrors(List<ValidationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    
    public Builder validation(Validation validation) {
      this.validation = validation;
      return this;
    }
  }
}
