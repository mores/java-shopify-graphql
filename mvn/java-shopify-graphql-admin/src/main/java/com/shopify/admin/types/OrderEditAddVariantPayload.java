package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderEditAddVariant` mutation.
 */
public class OrderEditAddVariantPayload {
  /**
   * The [calculated line item](https://shopify.dev/api/admin-graphql/latest/objects/calculatedlineitem)
   * that's added during this order edit.
   */
  private CalculatedLineItem calculatedLineItem;

  /**
   * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
   * with the edits applied but not saved.
   */
  private CalculatedOrder calculatedOrder;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public OrderEditAddVariantPayload() {
  }

  /**
   * The [calculated line item](https://shopify.dev/api/admin-graphql/latest/objects/calculatedlineitem)
   * that's added during this order edit.
   */
  public CalculatedLineItem getCalculatedLineItem() {
    return calculatedLineItem;
  }

  public void setCalculatedLineItem(CalculatedLineItem calculatedLineItem) {
    this.calculatedLineItem = calculatedLineItem;
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
    return "OrderEditAddVariantPayload{calculatedLineItem='" + calculatedLineItem + "', calculatedOrder='" + calculatedOrder + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddVariantPayload that = (OrderEditAddVariantPayload) o;
    return Objects.equals(calculatedLineItem, that.calculatedLineItem) &&
        Objects.equals(calculatedOrder, that.calculatedOrder) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedLineItem, calculatedOrder, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The [calculated line item](https://shopify.dev/api/admin-graphql/latest/objects/calculatedlineitem)
     * that's added during this order edit.
     */
    private CalculatedLineItem calculatedLineItem;

    /**
     * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * with the edits applied but not saved.
     */
    private CalculatedOrder calculatedOrder;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public OrderEditAddVariantPayload build() {
      OrderEditAddVariantPayload result = new OrderEditAddVariantPayload();
      result.calculatedLineItem = this.calculatedLineItem;
      result.calculatedOrder = this.calculatedOrder;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The [calculated line item](https://shopify.dev/api/admin-graphql/latest/objects/calculatedlineitem)
     * that's added during this order edit.
     */
    public Builder calculatedLineItem(CalculatedLineItem calculatedLineItem) {
      this.calculatedLineItem = calculatedLineItem;
      return this;
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
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
