package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Targets all items the cart for a specified discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AllDiscountItems implements DiscountItems {
  /**
   * Whether all items are eligible for the discount. This value always returns `true`.
   */
  private boolean allItems;

  public AllDiscountItems() {
  }

  /**
   * Whether all items are eligible for the discount. This value always returns `true`.
   */
  public boolean getAllItems() {
    return allItems;
  }

  public void setAllItems(boolean allItems) {
    this.allItems = allItems;
  }

  @Override
  public String toString() {
    return "AllDiscountItems{allItems='" + allItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllDiscountItems that = (AllDiscountItems) o;
    return allItems == that.allItems;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether all items are eligible for the discount. This value always returns `true`.
     */
    private boolean allItems;

    public AllDiscountItems build() {
      AllDiscountItems result = new AllDiscountItems();
      result.allItems = this.allItems;
      return result;
    }

    /**
     * Whether all items are eligible for the discount. This value always returns `true`.
     */
    public Builder allItems(boolean allItems) {
      this.allItems = allItems;
      return this;
    }
  }
}
