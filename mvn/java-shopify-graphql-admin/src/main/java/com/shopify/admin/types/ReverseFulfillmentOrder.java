package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A group of one or more items in a return that will be processed at a fulfillment service.
 * There can be more than one reverse fulfillment order for a return at a given location.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseFulfillmentOrder implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The list of reverse fulfillment order line items for the reverse fulfillment order.
   */
  private ReverseFulfillmentOrderLineItemConnection lineItems;

  /**
   * The order associated with the reverse fulfillment order.
   */
  private Order order;

  /**
   * The list of reverse deliveries for the reverse fulfillment order.
   */
  private ReverseDeliveryConnection reverseDeliveries;

  /**
   * The status of the reverse fulfillment order.
   */
  private ReverseFulfillmentOrderStatus status;

  /**
   * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
   * If no third-party service is involved, then this value is `nil`.
   */
  private ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation;

  public ReverseFulfillmentOrder() {
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
   * The list of reverse fulfillment order line items for the reverse fulfillment order.
   */
  public ReverseFulfillmentOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(ReverseFulfillmentOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The order associated with the reverse fulfillment order.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The list of reverse deliveries for the reverse fulfillment order.
   */
  public ReverseDeliveryConnection getReverseDeliveries() {
    return reverseDeliveries;
  }

  public void setReverseDeliveries(ReverseDeliveryConnection reverseDeliveries) {
    this.reverseDeliveries = reverseDeliveries;
  }

  /**
   * The status of the reverse fulfillment order.
   */
  public ReverseFulfillmentOrderStatus getStatus() {
    return status;
  }

  public void setStatus(ReverseFulfillmentOrderStatus status) {
    this.status = status;
  }

  /**
   * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
   * If no third-party service is involved, then this value is `nil`.
   */
  public ReverseFulfillmentOrderThirdPartyConfirmation getThirdPartyConfirmation() {
    return thirdPartyConfirmation;
  }

  public void setThirdPartyConfirmation(
      ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation) {
    this.thirdPartyConfirmation = thirdPartyConfirmation;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrder{id='" + id + "', lineItems='" + lineItems + "', order='" + order + "', reverseDeliveries='" + reverseDeliveries + "', status='" + status + "', thirdPartyConfirmation='" + thirdPartyConfirmation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrder that = (ReverseFulfillmentOrder) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(order, that.order) &&
        Objects.equals(reverseDeliveries, that.reverseDeliveries) &&
        Objects.equals(status, that.status) &&
        Objects.equals(thirdPartyConfirmation, that.thirdPartyConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItems, order, reverseDeliveries, status, thirdPartyConfirmation);
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
     * The list of reverse fulfillment order line items for the reverse fulfillment order.
     */
    private ReverseFulfillmentOrderLineItemConnection lineItems;

    /**
     * The order associated with the reverse fulfillment order.
     */
    private Order order;

    /**
     * The list of reverse deliveries for the reverse fulfillment order.
     */
    private ReverseDeliveryConnection reverseDeliveries;

    /**
     * The status of the reverse fulfillment order.
     */
    private ReverseFulfillmentOrderStatus status;

    /**
     * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
     * If no third-party service is involved, then this value is `nil`.
     */
    private ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation;

    public ReverseFulfillmentOrder build() {
      ReverseFulfillmentOrder result = new ReverseFulfillmentOrder();
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.order = this.order;
      result.reverseDeliveries = this.reverseDeliveries;
      result.status = this.status;
      result.thirdPartyConfirmation = this.thirdPartyConfirmation;
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
     * The list of reverse fulfillment order line items for the reverse fulfillment order.
     */
    public Builder lineItems(ReverseFulfillmentOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The order associated with the reverse fulfillment order.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The list of reverse deliveries for the reverse fulfillment order.
     */
    public Builder reverseDeliveries(ReverseDeliveryConnection reverseDeliveries) {
      this.reverseDeliveries = reverseDeliveries;
      return this;
    }

    /**
     * The status of the reverse fulfillment order.
     */
    public Builder status(ReverseFulfillmentOrderStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The current confirmation for the reverse fulfillment order from a third-party logistics service. 
     * If no third-party service is involved, then this value is `nil`.
     */
    public Builder thirdPartyConfirmation(
        ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation) {
      this.thirdPartyConfirmation = thirdPartyConfirmation;
      return this;
    }
  }
}
