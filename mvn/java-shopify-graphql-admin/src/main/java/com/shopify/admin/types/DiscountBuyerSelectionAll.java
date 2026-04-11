package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Indicates that a discount applies to all buyers without restrictions, enabling
 * universal promotions that reach every customer. This selection removes
 * buyer-specific limitations from discount eligibility.
 *
 * For example, a flash sale or grand opening promotion would target all buyers to maximize participation and store visibility.
 *
 * Learn more about [discount targeting](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountApplication).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountBuyerSelectionAll implements DiscountContext {
  /**
   * All buyers are eligible for the discount.
   */
  private DiscountBuyerSelection all;

  public DiscountBuyerSelectionAll() {
  }

  /**
   * All buyers are eligible for the discount.
   */
  public DiscountBuyerSelection getAll() {
    return all;
  }

  public void setAll(DiscountBuyerSelection all) {
    this.all = all;
  }

  @Override
  public String toString() {
    return "DiscountBuyerSelectionAll{all='" + all + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountBuyerSelectionAll that = (DiscountBuyerSelectionAll) o;
    return Objects.equals(all, that.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * All buyers are eligible for the discount.
     */
    private DiscountBuyerSelection all;

    public DiscountBuyerSelectionAll build() {
      DiscountBuyerSelectionAll result = new DiscountBuyerSelectionAll();
      result.all = this.all;
      return result;
    }

    /**
     * All buyers are eligible for the discount.
     */
    public Builder all(DiscountBuyerSelection all) {
      this.all = all;
      return this;
    }
  }
}
