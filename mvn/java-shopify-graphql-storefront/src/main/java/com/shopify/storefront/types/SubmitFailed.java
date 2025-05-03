package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Cart submit for checkout completion failed.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubmitFailed implements CartSubmitForCompletionResult {
  /**
   * The URL of the checkout for the cart.
   */
  private String checkoutUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubmissionError> errors;

  public SubmitFailed() {
  }

  /**
   * The URL of the checkout for the cart.
   */
  public String getCheckoutUrl() {
    return checkoutUrl;
  }

  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubmissionError> getErrors() {
    return errors;
  }

  public void setErrors(List<SubmissionError> errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "SubmitFailed{checkoutUrl='" + checkoutUrl + "', errors='" + errors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitFailed that = (SubmitFailed) o;
    return Objects.equals(checkoutUrl, that.checkoutUrl) &&
        Objects.equals(errors, that.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutUrl, errors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL of the checkout for the cart.
     */
    private String checkoutUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubmissionError> errors;

    public SubmitFailed build() {
      SubmitFailed result = new SubmitFailed();
      result.checkoutUrl = this.checkoutUrl;
      result.errors = this.errors;
      return result;
    }

    /**
     * The URL of the checkout for the cart.
     */
    public Builder checkoutUrl(String checkoutUrl) {
      this.checkoutUrl = checkoutUrl;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder errors(List<SubmissionError> errors) {
      this.errors = errors;
      return this;
    }
  }
}
