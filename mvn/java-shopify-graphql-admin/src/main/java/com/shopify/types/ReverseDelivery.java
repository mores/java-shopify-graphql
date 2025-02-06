package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A reverse delivery is a post-fulfillment object that represents a buyer sending a package to a merchant.
 * For example, a buyer requests a return, and a merchant sends the buyer a shipping label.
 * The reverse delivery contains the context of the items sent back, how they're being sent back
 * (for example, a shipping label), and the current state of the delivery (tracking information).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseDelivery implements com.shopify.types.Node {
  /**
   * The deliverable associated with the reverse delivery.
   */
  private ReverseDeliveryDeliverable deliverable;

  /**
   * The ID of the reverse delivery.
   */
  private String id;

  /**
   * The reverse delivery line items attached to the reverse delivery.
   */
  private ReverseDeliveryLineItemConnection reverseDeliveryLineItems;

  /**
   * The `ReverseFulfillmentOrder` associated with the reverse delivery.
   */
  private ReverseFulfillmentOrder reverseFulfillmentOrder;

  public ReverseDelivery() {
  }

  /**
   * The deliverable associated with the reverse delivery.
   */
  public ReverseDeliveryDeliverable getDeliverable() {
    return deliverable;
  }

  public void setDeliverable(ReverseDeliveryDeliverable deliverable) {
    this.deliverable = deliverable;
  }

  /**
   * The ID of the reverse delivery.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The reverse delivery line items attached to the reverse delivery.
   */
  public ReverseDeliveryLineItemConnection getReverseDeliveryLineItems() {
    return reverseDeliveryLineItems;
  }

  public void setReverseDeliveryLineItems(
      ReverseDeliveryLineItemConnection reverseDeliveryLineItems) {
    this.reverseDeliveryLineItems = reverseDeliveryLineItems;
  }

  /**
   * The `ReverseFulfillmentOrder` associated with the reverse delivery.
   */
  public ReverseFulfillmentOrder getReverseFulfillmentOrder() {
    return reverseFulfillmentOrder;
  }

  public void setReverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
    this.reverseFulfillmentOrder = reverseFulfillmentOrder;
  }

  @Override
  public String toString() {
    return "ReverseDelivery{deliverable='" + deliverable + "', id='" + id + "', reverseDeliveryLineItems='" + reverseDeliveryLineItems + "', reverseFulfillmentOrder='" + reverseFulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDelivery that = (ReverseDelivery) o;
    return Objects.equals(deliverable, that.deliverable) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reverseDeliveryLineItems, that.reverseDeliveryLineItems) &&
        Objects.equals(reverseFulfillmentOrder, that.reverseFulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverable, id, reverseDeliveryLineItems, reverseFulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The deliverable associated with the reverse delivery.
     */
    private ReverseDeliveryDeliverable deliverable;

    /**
     * The ID of the reverse delivery.
     */
    private String id;

    /**
     * The reverse delivery line items attached to the reverse delivery.
     */
    private ReverseDeliveryLineItemConnection reverseDeliveryLineItems;

    /**
     * The `ReverseFulfillmentOrder` associated with the reverse delivery.
     */
    private ReverseFulfillmentOrder reverseFulfillmentOrder;

    public ReverseDelivery build() {
      ReverseDelivery result = new ReverseDelivery();
      result.deliverable = this.deliverable;
      result.id = this.id;
      result.reverseDeliveryLineItems = this.reverseDeliveryLineItems;
      result.reverseFulfillmentOrder = this.reverseFulfillmentOrder;
      return result;
    }

    /**
     * The deliverable associated with the reverse delivery.
     */
    public Builder deliverable(ReverseDeliveryDeliverable deliverable) {
      this.deliverable = deliverable;
      return this;
    }

    /**
     * The ID of the reverse delivery.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The reverse delivery line items attached to the reverse delivery.
     */
    public Builder reverseDeliveryLineItems(
        ReverseDeliveryLineItemConnection reverseDeliveryLineItems) {
      this.reverseDeliveryLineItems = reverseDeliveryLineItems;
      return this;
    }

    /**
     * The `ReverseFulfillmentOrder` associated with the reverse delivery.
     */
    public Builder reverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
      this.reverseFulfillmentOrder = reverseFulfillmentOrder;
      return this;
    }
  }
}
