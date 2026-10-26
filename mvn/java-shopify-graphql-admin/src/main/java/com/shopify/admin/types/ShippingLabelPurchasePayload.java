package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shippingLabelPurchase` mutation.
 */
public class ShippingLabelPurchasePayload {
  /**
   * The asynchronous purchase result. Query this object to track purchase status,
   * retrieve purchased shipping labels, or inspect purchase-processing errors.
   */
  private ShippingLabelPurchaseResult shippingLabelPurchaseResult;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ShippingLabelPurchaseUserError> userErrors;

  public ShippingLabelPurchasePayload() {
  }

  /**
   * The asynchronous purchase result. Query this object to track purchase status,
   * retrieve purchased shipping labels, or inspect purchase-processing errors.
   */
  public ShippingLabelPurchaseResult getShippingLabelPurchaseResult() {
    return shippingLabelPurchaseResult;
  }

  public void setShippingLabelPurchaseResult(
      ShippingLabelPurchaseResult shippingLabelPurchaseResult) {
    this.shippingLabelPurchaseResult = shippingLabelPurchaseResult;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ShippingLabelPurchaseUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ShippingLabelPurchaseUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShippingLabelPurchasePayload{shippingLabelPurchaseResult='" + shippingLabelPurchaseResult + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabelPurchasePayload that = (ShippingLabelPurchasePayload) o;
    return Objects.equals(shippingLabelPurchaseResult, that.shippingLabelPurchaseResult) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingLabelPurchaseResult, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous purchase result. Query this object to track purchase status,
     * retrieve purchased shipping labels, or inspect purchase-processing errors.
     */
    private ShippingLabelPurchaseResult shippingLabelPurchaseResult;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ShippingLabelPurchaseUserError> userErrors;

    public ShippingLabelPurchasePayload build() {
      ShippingLabelPurchasePayload result = new ShippingLabelPurchasePayload();
      result.shippingLabelPurchaseResult = this.shippingLabelPurchaseResult;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous purchase result. Query this object to track purchase status,
     * retrieve purchased shipping labels, or inspect purchase-processing errors.
     */
    public Builder shippingLabelPurchaseResult(
        ShippingLabelPurchaseResult shippingLabelPurchaseResult) {
      this.shippingLabelPurchaseResult = shippingLabelPurchaseResult;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ShippingLabelPurchaseUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
