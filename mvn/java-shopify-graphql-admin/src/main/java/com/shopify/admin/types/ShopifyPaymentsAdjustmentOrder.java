package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The adjustment order object.
 */
public class ShopifyPaymentsAdjustmentOrder {
  /**
   * The amount of the adjustment order.
   */
  private MoneyV2 amount;

  /**
   * The fee of the adjustment order.
   */
  private MoneyV2 fees;

  /**
   * The link to the adjustment order.
   */
  private String link;

  /**
   * The name of the adjustment order.
   */
  private String name;

  /**
   * The net of the adjustment order.
   */
  private MoneyV2 net;

  /**
   * The ID of the order transaction.
   */
  private String orderTransactionId;

  public ShopifyPaymentsAdjustmentOrder() {
  }

  /**
   * The amount of the adjustment order.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The fee of the adjustment order.
   */
  public MoneyV2 getFees() {
    return fees;
  }

  public void setFees(MoneyV2 fees) {
    this.fees = fees;
  }

  /**
   * The link to the adjustment order.
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The name of the adjustment order.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The net of the adjustment order.
   */
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  /**
   * The ID of the order transaction.
   */
  public String getOrderTransactionId() {
    return orderTransactionId;
  }

  public void setOrderTransactionId(String orderTransactionId) {
    this.orderTransactionId = orderTransactionId;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAdjustmentOrder{amount='" + amount + "', fees='" + fees + "', link='" + link + "', name='" + name + "', net='" + net + "', orderTransactionId='" + orderTransactionId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAdjustmentOrder that = (ShopifyPaymentsAdjustmentOrder) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(fees, that.fees) &&
        Objects.equals(link, that.link) &&
        Objects.equals(name, that.name) &&
        Objects.equals(net, that.net) &&
        Objects.equals(orderTransactionId, that.orderTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, fees, link, name, net, orderTransactionId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the adjustment order.
     */
    private MoneyV2 amount;

    /**
     * The fee of the adjustment order.
     */
    private MoneyV2 fees;

    /**
     * The link to the adjustment order.
     */
    private String link;

    /**
     * The name of the adjustment order.
     */
    private String name;

    /**
     * The net of the adjustment order.
     */
    private MoneyV2 net;

    /**
     * The ID of the order transaction.
     */
    private String orderTransactionId;

    public ShopifyPaymentsAdjustmentOrder build() {
      ShopifyPaymentsAdjustmentOrder result = new ShopifyPaymentsAdjustmentOrder();
      result.amount = this.amount;
      result.fees = this.fees;
      result.link = this.link;
      result.name = this.name;
      result.net = this.net;
      result.orderTransactionId = this.orderTransactionId;
      return result;
    }

    /**
     * The amount of the adjustment order.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The fee of the adjustment order.
     */
    public Builder fees(MoneyV2 fees) {
      this.fees = fees;
      return this;
    }

    /**
     * The link to the adjustment order.
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }

    /**
     * The name of the adjustment order.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The net of the adjustment order.
     */
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    /**
     * The ID of the order transaction.
     */
    public Builder orderTransactionId(String orderTransactionId) {
      this.orderTransactionId = orderTransactionId;
      return this;
    }
  }
}
