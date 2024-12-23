package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A line item that's included in a refund.
 */
public class RefundLineItem {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The `LineItem` resource associated to the refunded line item.
   */
  private LineItem lineItem;

  /**
   * The inventory restock location.
   */
  private Location location;

  /**
   * The price of a refunded line item.
   */
  private String price;

  /**
   * The price of a refunded line item in shop and presentment currencies.
   */
  private MoneyBag priceSet;

  /**
   * The quantity of a refunded line item.
   */
  private int quantity;

  /**
   * The type of restock for the refunded line item.
   */
  private RefundLineItemRestockType restockType;

  /**
   * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
   */
  private boolean restocked;

  /**
   * The subtotal price of a refunded line item.
   */
  private String subtotal;

  /**
   * The subtotal price of a refunded line item in shop and presentment currencies.
   */
  private MoneyBag subtotalSet;

  /**
   * The total tax charged on a refunded line item.
   */
  private String totalTax;

  /**
   * The total tax charged on a refunded line item in shop and presentment currencies.
   */
  private MoneyBag totalTaxSet;

  public RefundLineItem() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The `LineItem` resource associated to the refunded line item.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The inventory restock location.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The price of a refunded line item.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The price of a refunded line item in shop and presentment currencies.
   */
  public MoneyBag getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBag priceSet) {
    this.priceSet = priceSet;
  }

  /**
   * The quantity of a refunded line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The type of restock for the refunded line item.
   */
  public RefundLineItemRestockType getRestockType() {
    return restockType;
  }

  public void setRestockType(RefundLineItemRestockType restockType) {
    this.restockType = restockType;
  }

  /**
   * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
   */
  public boolean getRestocked() {
    return restocked;
  }

  public void setRestocked(boolean restocked) {
    this.restocked = restocked;
  }

  /**
   * The subtotal price of a refunded line item.
   */
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * The subtotal price of a refunded line item in shop and presentment currencies.
   */
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  /**
   * The total tax charged on a refunded line item.
   */
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total tax charged on a refunded line item in shop and presentment currencies.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  @Override
  public String toString() {
    return "RefundLineItem{id='" + id + "', lineItem='" + lineItem + "', location='" + location + "', price='" + price + "', priceSet='" + priceSet + "', quantity='" + quantity + "', restockType='" + restockType + "', restocked='" + restocked + "', subtotal='" + subtotal + "', subtotalSet='" + subtotalSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundLineItem that = (RefundLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(location, that.location) &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceSet, that.priceSet) &&
        quantity == that.quantity &&
        Objects.equals(restockType, that.restockType) &&
        restocked == that.restocked &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem, location, price, priceSet, quantity, restockType, restocked, subtotal, subtotalSet, totalTax, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The `LineItem` resource associated to the refunded line item.
     */
    private LineItem lineItem;

    /**
     * The inventory restock location.
     */
    private Location location;

    /**
     * The price of a refunded line item.
     */
    private String price;

    /**
     * The price of a refunded line item in shop and presentment currencies.
     */
    private MoneyBag priceSet;

    /**
     * The quantity of a refunded line item.
     */
    private int quantity;

    /**
     * The type of restock for the refunded line item.
     */
    private RefundLineItemRestockType restockType;

    /**
     * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
     */
    private boolean restocked;

    /**
     * The subtotal price of a refunded line item.
     */
    private String subtotal;

    /**
     * The subtotal price of a refunded line item in shop and presentment currencies.
     */
    private MoneyBag subtotalSet;

    /**
     * The total tax charged on a refunded line item.
     */
    private String totalTax;

    /**
     * The total tax charged on a refunded line item in shop and presentment currencies.
     */
    private MoneyBag totalTaxSet;

    public RefundLineItem build() {
      RefundLineItem result = new RefundLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.location = this.location;
      result.price = this.price;
      result.priceSet = this.priceSet;
      result.quantity = this.quantity;
      result.restockType = this.restockType;
      result.restocked = this.restocked;
      result.subtotal = this.subtotal;
      result.subtotalSet = this.subtotalSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The `LineItem` resource associated to the refunded line item.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The inventory restock location.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The price of a refunded line item.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * The price of a refunded line item in shop and presentment currencies.
     */
    public Builder priceSet(MoneyBag priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    /**
     * The quantity of a refunded line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The type of restock for the refunded line item.
     */
    public Builder restockType(RefundLineItemRestockType restockType) {
      this.restockType = restockType;
      return this;
    }

    /**
     * Whether the refunded line item was restocked. Not applicable in the context of a SuggestedRefund.
     */
    public Builder restocked(boolean restocked) {
      this.restocked = restocked;
      return this;
    }

    /**
     * The subtotal price of a refunded line item.
     */
    public Builder subtotal(String subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    /**
     * The subtotal price of a refunded line item in shop and presentment currencies.
     */
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    /**
     * The total tax charged on a refunded line item.
     */
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total tax charged on a refunded line item in shop and presentment currencies.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }
  }
}
