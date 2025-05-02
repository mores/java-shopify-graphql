package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A successful completion to checkout a cart and a created order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCompletionSuccess implements CartCompletionAttemptResult {
  /**
   * The date and time when the job completed.
   */
  private OffsetDateTime completedAt;

  /**
   * The ID of the cart completion attempt.
   */
  private String id;

  /**
   * The ID of the order that's created in Shopify.
   */
  private String orderId;

  /**
   * The URL of the order confirmation in Shopify.
   */
  private String orderUrl;

  public CartCompletionSuccess() {
  }

  /**
   * The date and time when the job completed.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The ID of the cart completion attempt.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the order that's created in Shopify.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The URL of the order confirmation in Shopify.
   */
  public String getOrderUrl() {
    return orderUrl;
  }

  public void setOrderUrl(String orderUrl) {
    this.orderUrl = orderUrl;
  }

  @Override
  public String toString() {
    return "CartCompletionSuccess{completedAt='" + completedAt + "', id='" + id + "', orderId='" + orderId + "', orderUrl='" + orderUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCompletionSuccess that = (CartCompletionSuccess) o;
    return Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(orderId, that.orderId) &&
        Objects.equals(orderUrl, that.orderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, id, orderId, orderUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the job completed.
     */
    private OffsetDateTime completedAt;

    /**
     * The ID of the cart completion attempt.
     */
    private String id;

    /**
     * The ID of the order that's created in Shopify.
     */
    private String orderId;

    /**
     * The URL of the order confirmation in Shopify.
     */
    private String orderUrl;

    public CartCompletionSuccess build() {
      CartCompletionSuccess result = new CartCompletionSuccess();
      result.completedAt = this.completedAt;
      result.id = this.id;
      result.orderId = this.orderId;
      result.orderUrl = this.orderUrl;
      return result;
    }

    /**
     * The date and time when the job completed.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * The ID of the cart completion attempt.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the order that's created in Shopify.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The URL of the order confirmation in Shopify.
     */
    public Builder orderUrl(String orderUrl) {
      this.orderUrl = orderUrl;
      return this;
    }
  }
}
