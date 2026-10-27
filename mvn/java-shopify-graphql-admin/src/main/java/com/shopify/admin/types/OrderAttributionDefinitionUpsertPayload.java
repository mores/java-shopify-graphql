package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderAttributionDefinitionUpsert` mutation.
 */
public class OrderAttributionDefinitionUpsertPayload {
  /**
   * The order attribution definition that was upserted.
   */
  private OrderAttributionDefinition orderAttributionDefinition;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderAttributionDefinitionUpsertUserError> userErrors;

  public OrderAttributionDefinitionUpsertPayload() {
  }

  /**
   * The order attribution definition that was upserted.
   */
  public OrderAttributionDefinition getOrderAttributionDefinition() {
    return orderAttributionDefinition;
  }

  public void setOrderAttributionDefinition(OrderAttributionDefinition orderAttributionDefinition) {
    this.orderAttributionDefinition = orderAttributionDefinition;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderAttributionDefinitionUpsertUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderAttributionDefinitionUpsertUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderAttributionDefinitionUpsertPayload{orderAttributionDefinition='" + orderAttributionDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAttributionDefinitionUpsertPayload that = (OrderAttributionDefinitionUpsertPayload) o;
    return Objects.equals(orderAttributionDefinition, that.orderAttributionDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAttributionDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order attribution definition that was upserted.
     */
    private OrderAttributionDefinition orderAttributionDefinition;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderAttributionDefinitionUpsertUserError> userErrors;

    public OrderAttributionDefinitionUpsertPayload build() {
      OrderAttributionDefinitionUpsertPayload result = new OrderAttributionDefinitionUpsertPayload();
      result.orderAttributionDefinition = this.orderAttributionDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order attribution definition that was upserted.
     */
    public Builder orderAttributionDefinition(
        OrderAttributionDefinition orderAttributionDefinition) {
      this.orderAttributionDefinition = orderAttributionDefinition;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderAttributionDefinitionUpsertUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
