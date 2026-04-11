package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A discount application removed during an order edit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeRemoveDiscount implements OrderStagedChange {
  /**
   * The removed discount application.
   */
  private DiscountApplication discountApplication;

  public OrderStagedChangeRemoveDiscount() {
  }

  /**
   * The removed discount application.
   */
  public DiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(DiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeRemoveDiscount{discountApplication='" + discountApplication + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeRemoveDiscount that = (OrderStagedChangeRemoveDiscount) o;
    return Objects.equals(discountApplication, that.discountApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountApplication);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The removed discount application.
     */
    private DiscountApplication discountApplication;

    public OrderStagedChangeRemoveDiscount build() {
      OrderStagedChangeRemoveDiscount result = new OrderStagedChangeRemoveDiscount();
      result.discountApplication = this.discountApplication;
      return result;
    }

    /**
     * The removed discount application.
     */
    public Builder discountApplication(DiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}
