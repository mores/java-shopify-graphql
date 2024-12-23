package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a fraud check on an order.
 * As of version 2024-04 this resource is deprecated. Risk Assessments can be queried via the
 * [OrderRisk Assessments API](https://shopify.dev/api/admin-graphql/2024-04/objects/OrderRiskAssessment).
 */
public class OrderRisk {
  /**
   * Whether the risk level is shown in the Shopify admin. If false, then this
   * order risk is ignored when Shopify determines the overall risk level for the order.
   */
  private boolean display;

  /**
   * The likelihood that an order is fraudulent, based on this order risk.
   *   
   * The level can be set by Shopify risk analysis or by an app.
   */
  private OrderRiskLevel level;

  /**
   * The risk message that's shown to the merchant in the Shopify admin.
   */
  private String message;

  public OrderRisk() {
  }

  /**
   * Whether the risk level is shown in the Shopify admin. If false, then this
   * order risk is ignored when Shopify determines the overall risk level for the order.
   */
  public boolean getDisplay() {
    return display;
  }

  public void setDisplay(boolean display) {
    this.display = display;
  }

  /**
   * The likelihood that an order is fraudulent, based on this order risk.
   *   
   * The level can be set by Shopify risk analysis or by an app.
   */
  public OrderRiskLevel getLevel() {
    return level;
  }

  public void setLevel(OrderRiskLevel level) {
    this.level = level;
  }

  /**
   * The risk message that's shown to the merchant in the Shopify admin.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "OrderRisk{display='" + display + "', level='" + level + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRisk that = (OrderRisk) o;
    return display == that.display &&
        Objects.equals(level, that.level) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, level, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the risk level is shown in the Shopify admin. If false, then this
     * order risk is ignored when Shopify determines the overall risk level for the order.
     */
    private boolean display;

    /**
     * The likelihood that an order is fraudulent, based on this order risk.
     *   
     * The level can be set by Shopify risk analysis or by an app.
     */
    private OrderRiskLevel level;

    /**
     * The risk message that's shown to the merchant in the Shopify admin.
     */
    private String message;

    public OrderRisk build() {
      OrderRisk result = new OrderRisk();
      result.display = this.display;
      result.level = this.level;
      result.message = this.message;
      return result;
    }

    /**
     * Whether the risk level is shown in the Shopify admin. If false, then this
     * order risk is ignored when Shopify determines the overall risk level for the order.
     */
    public Builder display(boolean display) {
      this.display = display;
      return this;
    }

    /**
     * The likelihood that an order is fraudulent, based on this order risk.
     *   
     * The level can be set by Shopify risk analysis or by an app.
     */
    public Builder level(OrderRiskLevel level) {
      this.level = level;
      return this;
    }

    /**
     * The risk message that's shown to the merchant in the Shopify admin.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
