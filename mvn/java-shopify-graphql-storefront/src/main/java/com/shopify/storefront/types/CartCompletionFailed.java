package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A failed completion to checkout a cart.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCompletionFailed implements CartCompletionAttemptResult {
  /**
   * The errors that caused the checkout to fail.
   */
  private List<CompletionError> errors;

  /**
   * The ID of the cart completion attempt.
   */
  private String id;

  public CartCompletionFailed() {
  }

  /**
   * The errors that caused the checkout to fail.
   */
  public List<CompletionError> getErrors() {
    return errors;
  }

  public void setErrors(List<CompletionError> errors) {
    this.errors = errors;
  }

  /**
   * The ID of the cart completion attempt.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CartCompletionFailed{errors='" + errors + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCompletionFailed that = (CartCompletionFailed) o;
    return Objects.equals(errors, that.errors) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The errors that caused the checkout to fail.
     */
    private List<CompletionError> errors;

    /**
     * The ID of the cart completion attempt.
     */
    private String id;

    public CartCompletionFailed build() {
      CartCompletionFailed result = new CartCompletionFailed();
      result.errors = this.errors;
      result.id = this.id;
      return result;
    }

    /**
     * The errors that caused the checkout to fail.
     */
    public Builder errors(List<CompletionError> errors) {
      this.errors = errors;
      return this;
    }

    /**
     * The ID of the cart completion attempt.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
