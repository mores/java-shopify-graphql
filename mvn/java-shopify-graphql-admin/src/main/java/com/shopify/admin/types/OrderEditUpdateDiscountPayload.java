package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderEditUpdateDiscount` mutation.
 */
public class OrderEditUpdateDiscountPayload {
  /**
   * An order with the edits applied but not saved.
   */
  private CalculatedOrder calculatedOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderEditUpdateDiscountUserError> userErrors;

  public OrderEditUpdateDiscountPayload() {
  }

  /**
   * An order with the edits applied but not saved.
   */
  public CalculatedOrder getCalculatedOrder() {
    return calculatedOrder;
  }

  public void setCalculatedOrder(CalculatedOrder calculatedOrder) {
    this.calculatedOrder = calculatedOrder;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderEditUpdateDiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderEditUpdateDiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditUpdateDiscountPayload{calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditUpdateDiscountPayload that = (OrderEditUpdateDiscountPayload) o;
    return Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An order with the edits applied but not saved.
     */
    private CalculatedOrder calculatedOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderEditUpdateDiscountUserError> userErrors;

    public OrderEditUpdateDiscountPayload build() {
      OrderEditUpdateDiscountPayload result = new OrderEditUpdateDiscountPayload();
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * An order with the edits applied but not saved.
     */
    public Builder calculatedOrder(CalculatedOrder calculatedOrder) {
      this.calculatedOrder = calculatedOrder;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderEditUpdateDiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
