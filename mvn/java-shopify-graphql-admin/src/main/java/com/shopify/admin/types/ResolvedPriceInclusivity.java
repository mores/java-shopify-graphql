package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The resolved price inclusivity attributes.
 */
public class ResolvedPriceInclusivity {
  /**
   * Whether duties are included in the price.
   */
  private boolean dutiesIncluded;

  /**
   * Whether taxes are included in the price.
   */
  private boolean taxesIncluded;

  public ResolvedPriceInclusivity() {
  }

  /**
   * Whether duties are included in the price.
   */
  public boolean getDutiesIncluded() {
    return dutiesIncluded;
  }

  public void setDutiesIncluded(boolean dutiesIncluded) {
    this.dutiesIncluded = dutiesIncluded;
  }

  /**
   * Whether taxes are included in the price.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  @Override
  public String toString() {
    return "ResolvedPriceInclusivity{dutiesIncluded='" + dutiesIncluded + "', taxesIncluded='" + taxesIncluded + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedPriceInclusivity that = (ResolvedPriceInclusivity) o;
    return dutiesIncluded == that.dutiesIncluded &&
        taxesIncluded == that.taxesIncluded;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutiesIncluded, taxesIncluded);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether duties are included in the price.
     */
    private boolean dutiesIncluded;

    /**
     * Whether taxes are included in the price.
     */
    private boolean taxesIncluded;

    public ResolvedPriceInclusivity build() {
      ResolvedPriceInclusivity result = new ResolvedPriceInclusivity();
      result.dutiesIncluded = this.dutiesIncluded;
      result.taxesIncluded = this.taxesIncluded;
      return result;
    }

    /**
     * Whether duties are included in the price.
     */
    public Builder dutiesIncluded(boolean dutiesIncluded) {
      this.dutiesIncluded = dutiesIncluded;
      return this;
    }

    /**
     * Whether taxes are included in the price.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }
  }
}
