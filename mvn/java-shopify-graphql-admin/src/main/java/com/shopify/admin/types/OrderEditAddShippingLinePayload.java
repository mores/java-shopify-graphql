package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderEditAddShippingLine` mutation.
 */
public class OrderEditAddShippingLinePayload {
  /**
   * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
   * with the edits applied but not saved.
   */
  private CalculatedOrder calculatedOrder;

  /**
   * The [calculated shipping line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
   * that's added during this order edit.
   */
  private CalculatedShippingLine calculatedShippingLine;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderEditAddShippingLineUserError> userErrors;

  public OrderEditAddShippingLinePayload() {
  }

  /**
   * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
   * with the edits applied but not saved.
   */
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  /**
   * The [calculated shipping line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
   * that's added during this order edit.
   */
  public CalculatedShippingLine getCalculatedShippingLine() {
    return calculatedShippingLine;
  }

  public void setCalculatedShippingLine(CalculatedShippingLine calculatedShippingLine) {
    this.calculatedShippingLine = calculatedShippingLine;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderEditAddShippingLineUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditAddShippingLineUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditAddShippingLinePayload{calculatedOrder='" + calculatedOrder + "', calculatedShippingLine='" + calculatedShippingLine + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddShippingLinePayload that = (OrderEditAddShippingLinePayload) o;
    return Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(calculatedShippingLine, that.calculatedShippingLine) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedOrder, calculatedShippingLine, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * with the edits applied but not saved.
     */
    private CalculatedOrder calculatedOrder;

    /**
     * The [calculated shipping line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
     * that's added during this order edit.
     */
    private CalculatedShippingLine calculatedShippingLine;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderEditAddShippingLineUserError> userErrors;

    public OrderEditAddShippingLinePayload build() {
      OrderEditAddShippingLinePayload result = new OrderEditAddShippingLinePayload();
      result.calculatedOrder = this.calculatedOrder;
      result.calculatedShippingLine = this.calculatedShippingLine;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * with the edits applied but not saved.
     */
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    /**
     * The [calculated shipping line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
     * that's added during this order edit.
     */
    public Builder calculatedShippingLine(CalculatedShippingLine calculatedShippingLine) {
      this.calculatedShippingLine = calculatedShippingLine;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderEditAddShippingLineUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
