package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An item for exchange.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ExchangeLineItem implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The order line item for the exchange.
   */
  private LineItem lineItem;

  public ExchangeLineItem() {
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
   * The order line item for the exchange.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  @Override
  public String toString() {
    return "ExchangeLineItem{id='" + id + "', lineItem='" + lineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItem that = (ExchangeLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem);
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
     * The order line item for the exchange.
     */
    private LineItem lineItem;

    public ExchangeLineItem build() {
      ExchangeLineItem result = new ExchangeLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
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
     * The order line item for the exchange.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }
  }
}
