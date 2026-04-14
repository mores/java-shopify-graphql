package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Indicates that a shipping discount applies to all countries without restriction,
 * enabling merchants to create truly global promotions. This object represents
 * universal geographic eligibility for shipping discount offers.
 *
 * For example, an online store launching a "Worldwide Free Shipping" campaign
 * would use this configuration to ensure customers from any country can benefit
 * from the promotion.
 *
 * This setting simplifies international discount management by eliminating the
 * need to manually select individual countries or regions, making it ideal for
 * digital products or stores with comprehensive global shipping capabilities.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCountryAll implements DiscountShippingDestinationSelection {
  /**
   * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
   */
  private boolean allCountries;

  public DiscountCountryAll() {
  }

  /**
   * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
   */
  public boolean getAllCountries() {
    return allCountries;
  }

  public void setAllCountries(boolean allCountries) {
    this.allCountries = allCountries;
  }

  @Override
  public String toString() {
    return "DiscountCountryAll{allCountries='" + allCountries + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCountryAll that = (DiscountCountryAll) o;
    return allCountries == that.allCountries;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCountries);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
     */
    private boolean allCountries;

    public DiscountCountryAll build() {
      DiscountCountryAll result = new DiscountCountryAll();
      result.allCountries = this.allCountries;
      return result;
    }

    /**
     * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
     */
    public Builder allCountries(boolean allCountries) {
      this.allCountries = allCountries;
      return this;
    }
  }
}
