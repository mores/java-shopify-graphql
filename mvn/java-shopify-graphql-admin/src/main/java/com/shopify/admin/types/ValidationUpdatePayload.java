package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `validationUpdate` mutation.
 */
public class ValidationUpdatePayload {
  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ValidationUserError> userErrors;

  /**
   * The updated validation.
   */
  private Validation validation;

  public ValidationUpdatePayload() {
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ValidationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ValidationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * The updated validation.
   */
  public Validation getValidation() {
    return validation;
  }

  public void setValidation(Validation validation) {
    this.validation = validation;
  }

  @Override
  public String toString() {
    return "ValidationUpdatePayload{userErrors='" + userErrors + "', validation='" + validation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationUpdatePayload that = (ValidationUpdatePayload) o;
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
    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ValidationUserError> userErrors;

    /**
     * The updated validation.
     */
    private Validation validation;

    public ValidationUpdatePayload build() {
      ValidationUpdatePayload result = new ValidationUpdatePayload();
      result.userErrors = this.userErrors;
      result.validation = this.validation;
      return result;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ValidationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * The updated validation.
     */
    public Builder validation(Validation validation) {
      this.validation = validation;
      return this;
    }
  }
}
