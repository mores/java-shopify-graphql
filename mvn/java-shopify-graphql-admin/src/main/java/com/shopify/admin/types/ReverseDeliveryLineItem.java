package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The details about a reverse delivery line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseDeliveryLineItem implements com.shopify.admin.types.Node {
  /**
   * The dispositions of the item.
   */
  private List<ReverseFulfillmentOrderDisposition> dispositions;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The expected number of units.
   */
  private int quantity;

  /**
   * The corresponding reverse fulfillment order line item.
   */
  private ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem;

  public ReverseDeliveryLineItem() {
  }

  /**
   * The dispositions of the item.
   */
  public List<ReverseFulfillmentOrderDisposition> getDispositions() {
    return dispositions;
  }

  public void setDispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
    this.dispositions = dispositions;
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
   * The expected number of units.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The corresponding reverse fulfillment order line item.
   */
  public ReverseFulfillmentOrderLineItem getReverseFulfillmentOrderLineItem() {
    return reverseFulfillmentOrderLineItem;
  }

  public void setReverseFulfillmentOrderLineItem(
      ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem) {
    this.reverseFulfillmentOrderLineItem = reverseFulfillmentOrderLineItem;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLineItem{dispositions='" + dispositions + "', id='" + id + "', quantity='" + quantity + "', reverseFulfillmentOrderLineItem='" + reverseFulfillmentOrderLineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLineItem that = (ReverseDeliveryLineItem) o;
    return Objects.equals(dispositions, that.dispositions) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(reverseFulfillmentOrderLineItem, that.reverseFulfillmentOrderLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositions, id, quantity, reverseFulfillmentOrderLineItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The dispositions of the item.
     */
    private List<ReverseFulfillmentOrderDisposition> dispositions;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The expected number of units.
     */
    private int quantity;

    /**
     * The corresponding reverse fulfillment order line item.
     */
    private ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem;

    public ReverseDeliveryLineItem build() {
      ReverseDeliveryLineItem result = new ReverseDeliveryLineItem();
      result.dispositions = this.dispositions;
      result.id = this.id;
      result.quantity = this.quantity;
      result.reverseFulfillmentOrderLineItem = this.reverseFulfillmentOrderLineItem;
      return result;
    }

    /**
     * The dispositions of the item.
     */
    public Builder dispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
      this.dispositions = dispositions;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The expected number of units.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The corresponding reverse fulfillment order line item.
     */
    public Builder reverseFulfillmentOrderLineItem(
        ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem) {
      this.reverseFulfillmentOrderLineItem = reverseFulfillmentOrderLineItem;
      return this;
    }
  }
}
