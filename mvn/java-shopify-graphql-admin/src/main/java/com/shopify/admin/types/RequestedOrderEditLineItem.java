package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A line item included in a buyer-initiated requested order edit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RequestedOrderEditLineItem implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The order line item associated with this requested order edit line item.
   */
  private LineItem lineItem;

  /**
   * The quantity requested for this line item in the requested order edit.
   */
  private int quantity;

  /**
   * The quantity of the requested line item that has been resolved.
   */
  private int resolvedQuantity;

  public RequestedOrderEditLineItem() {
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
   * The order line item associated with this requested order edit line item.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The quantity requested for this line item in the requested order edit.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity of the requested line item that has been resolved.
   */
  public int getResolvedQuantity() {
    return resolvedQuantity;
  }

  public void setResolvedQuantity(int resolvedQuantity) {
    this.resolvedQuantity = resolvedQuantity;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditLineItem{id='" + id + "', lineItem='" + lineItem + "', quantity='" + quantity + "', resolvedQuantity='" + resolvedQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditLineItem that = (RequestedOrderEditLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        quantity == that.quantity &&
        resolvedQuantity == that.resolvedQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem, quantity, resolvedQuantity);
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
     * The order line item associated with this requested order edit line item.
     */
    private LineItem lineItem;

    /**
     * The quantity requested for this line item in the requested order edit.
     */
    private int quantity;

    /**
     * The quantity of the requested line item that has been resolved.
     */
    private int resolvedQuantity;

    public RequestedOrderEditLineItem build() {
      RequestedOrderEditLineItem result = new RequestedOrderEditLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.quantity = this.quantity;
      result.resolvedQuantity = this.resolvedQuantity;
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
     * The order line item associated with this requested order edit line item.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The quantity requested for this line item in the requested order edit.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity of the requested line item that has been resolved.
     */
    public Builder resolvedQuantity(int resolvedQuantity) {
      this.resolvedQuantity = resolvedQuantity;
      return this;
    }
  }
}
