package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing attempt completed successfully and created an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptSuccessState implements SubscriptionBillingAttemptState {
  /**
   * The order created by the successful billing attempt. May be null if the order was deleted.
   */
  private Order order;

  public SubscriptionBillingAttemptSuccessState() {
  }

  /**
   * The order created by the successful billing attempt. May be null if the order was deleted.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptSuccessState{order='" + order + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptSuccessState that = (SubscriptionBillingAttemptSuccessState) o;
    return Objects.equals(order, that.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order created by the successful billing attempt. May be null if the order was deleted.
     */
    private Order order;

    public SubscriptionBillingAttemptSuccessState build() {
      SubscriptionBillingAttemptSuccessState result = new SubscriptionBillingAttemptSuccessState();
      result.order = this.order;
      return result;
    }

    /**
     * The order created by the successful billing attempt. May be null if the order was deleted.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }
  }
}
