package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartPrepareForCompletion` mutation.
 */
public class CartPrepareForCompletionPayload {
  /**
   * The result of cart preparation for completion.
   */
  private CartPrepareForCompletionResult result;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CartUserError> userErrors;

  public CartPrepareForCompletionPayload() {
  }

  /**
   * The result of cart preparation for completion.
   */
  public CartPrepareForCompletionResult getResult() {
    return result;
  }

  public void setResult(CartPrepareForCompletionResult result) {
    this.result = result;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CartUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CartUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartPrepareForCompletionPayload{result='" + result + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartPrepareForCompletionPayload that = (CartPrepareForCompletionPayload) o;
    return Objects.equals(result, that.result) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of cart preparation for completion.
     */
    private CartPrepareForCompletionResult result;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CartUserError> userErrors;

    public CartPrepareForCompletionPayload build() {
      CartPrepareForCompletionPayload result = new CartPrepareForCompletionPayload();
      result.result = this.result;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The result of cart preparation for completion.
     */
    public Builder result(CartPrepareForCompletionResult result) {
      this.result = result;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CartUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
