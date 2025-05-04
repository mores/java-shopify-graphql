package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderEditAddLineItemDiscount` mutation.
 */
public class OrderEditAddLineItemDiscountPayload {
  /**
   * The discount applied to a line item during this order edit.
   */
  private OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange;

  /**
   * The line item with the edits applied but not saved.
   */
  private CalculatedLineItem calculatedLineItem;

  /**
   * An order with the edits applied but not saved.
   */
  private CalculatedOrder calculatedOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderEditAddLineItemDiscountPayload() {
  }

  /**
   * The discount applied to a line item during this order edit.
   */
  public OrderStagedChangeAddLineItemDiscount getAddedDiscountStagedChange() {
    return addedDiscountStagedChange;
  }

  public void setAddedDiscountStagedChange(
      OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange) {
    this.addedDiscountStagedChange = addedDiscountStagedChange;
  }

  /**
   * The line item with the edits applied but not saved.
   */
  public CalculatedLineItem getCalculatedLineItem() {
    return calculatedLineItem;
  }

  public void setCalculatedLineItem(CalculatedLineItem calculatedLineItem) {
    this.calculatedLineItem = calculatedLineItem;
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
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderEditAddLineItemDiscountPayload{addedDiscountStagedChange='" + addedDiscountStagedChange + "', calculatedLineItem='" + calculatedLineItem + "', calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddLineItemDiscountPayload that = (OrderEditAddLineItemDiscountPayload) o;
    return Objects.equals(addedDiscountStagedChange, that.addedDiscountStagedChange) &&
        Objects.equals(calculatedLineItem, that.calculatedLineItem) &&
        Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedDiscountStagedChange, calculatedLineItem, calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount applied to a line item during this order edit.
     */
    private OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange;

    /**
     * The line item with the edits applied but not saved.
     */
    private CalculatedLineItem calculatedLineItem;

    /**
     * An order with the edits applied but not saved.
     */
    private CalculatedOrder calculatedOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderEditAddLineItemDiscountPayload build() {
      OrderEditAddLineItemDiscountPayload result = new OrderEditAddLineItemDiscountPayload();
      result.addedDiscountStagedChange = this.addedDiscountStagedChange;
      result.calculatedLineItem = this.calculatedLineItem;
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The discount applied to a line item during this order edit.
     */
    public Builder addedDiscountStagedChange(
        OrderStagedChangeAddLineItemDiscount addedDiscountStagedChange) {
      this.addedDiscountStagedChange = addedDiscountStagedChange;
      return this;
    }

    /**
     * The line item with the edits applied but not saved.
     */
    public Builder calculatedLineItem(CalculatedLineItem calculatedLineItem) {
      this.calculatedLineItem = calculatedLineItem;
      return this;
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
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
