package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartSubmitForCompletion` mutation.
 */
public class CartSubmitForCompletionPayload {
  /**
   * The result of cart submission for completion.
   */
  private CartSubmitForCompletionResult result;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CartUserError> userErrors;

  public CartSubmitForCompletionPayload() {
  }

  /**
   * The result of cart submission for completion.
   */
  public CartSubmitForCompletionResult getResult() {
    return result;
  }

  public void setResult(CartSubmitForCompletionResult result) {
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
    return "CartSubmitForCompletionPayload{result='" + result + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartSubmitForCompletionPayload that = (CartSubmitForCompletionPayload) o;
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
     * The result of cart submission for completion.
     */
    private CartSubmitForCompletionResult result;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CartUserError> userErrors;

    public CartSubmitForCompletionPayload build() {
      CartSubmitForCompletionPayload result = new CartSubmitForCompletionPayload();
      result.result = this.result;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The result of cart submission for completion.
     */
    public Builder result(CartSubmitForCompletionResult result) {
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
