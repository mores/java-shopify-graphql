package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping line removed during an order edit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeRemoveShippingLine implements OrderStagedChange {
  /**
   * The removed shipping line.
   */
  private ShippingLine shippingLine;

  public OrderStagedChangeRemoveShippingLine() {
  }

  /**
   * The removed shipping line.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeRemoveShippingLine{shippingLine='" + shippingLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeRemoveShippingLine that = (OrderStagedChangeRemoveShippingLine) o;
    return Objects.equals(shippingLine, that.shippingLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingLine);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The removed shipping line.
     */
    private ShippingLine shippingLine;

    public OrderStagedChangeRemoveShippingLine build() {
      OrderStagedChangeRemoveShippingLine result = new OrderStagedChangeRemoveShippingLine();
      result.shippingLine = this.shippingLine;
      return result;
    }

    /**
     * The removed shipping line.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }
  }
}
