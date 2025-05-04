package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The shipping lines to which the price rule applies to.
 */
public class PriceRuleShippingLineEntitlements {
  /**
   * The codes for the countries to which the price rule applies to.
   */
  private List<CountryCode> countryCodes;

  /**
   * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
   */
  private boolean includeRestOfWorld;

  /**
   * Whether the price rule applies to all shipping lines.
   */
  private boolean targetAllShippingLines;

  public PriceRuleShippingLineEntitlements() {
  }

  /**
   * The codes for the countries to which the price rule applies to.
   */
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  /**
   * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
   */
  public boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  /**
   * Whether the price rule applies to all shipping lines.
   */
  public boolean getTargetAllShippingLines() {
    return targetAllShippingLines;
  }

  public void setTargetAllShippingLines(boolean targetAllShippingLines) {
    this.targetAllShippingLines = targetAllShippingLines;
  }

  @Override
  public String toString() {
    return "PriceRuleShippingLineEntitlements{countryCodes='" + countryCodes + "', includeRestOfWorld='" + includeRestOfWorld + "', targetAllShippingLines='" + targetAllShippingLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleShippingLineEntitlements that = (PriceRuleShippingLineEntitlements) o;
    return Objects.equals(countryCodes, that.countryCodes) &&
        includeRestOfWorld == that.includeRestOfWorld &&
        targetAllShippingLines == that.targetAllShippingLines;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, includeRestOfWorld, targetAllShippingLines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The codes for the countries to which the price rule applies to.
     */
    private List<CountryCode> countryCodes;

    /**
     * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    private boolean includeRestOfWorld;

    /**
     * Whether the price rule applies to all shipping lines.
     */
    private boolean targetAllShippingLines;

    public PriceRuleShippingLineEntitlements build() {
      PriceRuleShippingLineEntitlements result = new PriceRuleShippingLineEntitlements();
      result.countryCodes = this.countryCodes;
      result.includeRestOfWorld = this.includeRestOfWorld;
      result.targetAllShippingLines = this.targetAllShippingLines;
      return result;
    }

    /**
     * The codes for the countries to which the price rule applies to.
     */
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    /**
     * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }

    /**
     * Whether the price rule applies to all shipping lines.
     */
    public Builder targetAllShippingLines(boolean targetAllShippingLines) {
      this.targetAllShippingLines = targetAllShippingLines;
      return this;
    }
  }
}
