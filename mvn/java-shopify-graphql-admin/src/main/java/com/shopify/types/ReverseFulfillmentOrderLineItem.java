package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The details about a reverse fulfillment order line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseFulfillmentOrderLineItem implements com.shopify.types.Node {
  /**
   * The dispositions of the item.
   */
  private List<ReverseFulfillmentOrderDisposition> dispositions;

  /**
   * The corresponding fulfillment line item for a reverse fulfillment order line item.
   */
  private FulfillmentLineItem fulfillmentLineItem;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The total number of units to be processed.
   */
  private int totalQuantity;

  public ReverseFulfillmentOrderLineItem() {
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
   * The corresponding fulfillment line item for a reverse fulfillment order line item.
   */
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
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
   * The total number of units to be processed.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderLineItem{dispositions='" + dispositions + "', fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderLineItem that = (ReverseFulfillmentOrderLineItem) o;
    return Objects.equals(dispositions, that.dispositions) &&
        Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositions, fulfillmentLineItem, id, totalQuantity);
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
     * The corresponding fulfillment line item for a reverse fulfillment order line item.
     */
    private FulfillmentLineItem fulfillmentLineItem;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The total number of units to be processed.
     */
    private int totalQuantity;

    public ReverseFulfillmentOrderLineItem build() {
      ReverseFulfillmentOrderLineItem result = new ReverseFulfillmentOrderLineItem();
      result.dispositions = this.dispositions;
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.totalQuantity = this.totalQuantity;
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
     * The corresponding fulfillment line item for a reverse fulfillment order line item.
     */
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
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
     * The total number of units to be processed.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
