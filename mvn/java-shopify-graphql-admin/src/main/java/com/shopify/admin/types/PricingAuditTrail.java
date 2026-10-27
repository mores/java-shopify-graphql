package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A record of how a particular price was determined.
 */
public class PricingAuditTrail {
  /**
   * The adjustments used to determine the final price, in order of their application.
   */
  private List<AuditTrailAdjustment> priceAdjustments;

  public PricingAuditTrail() {
  }

  /**
   * The adjustments used to determine the final price, in order of their application.
   */
  public List<AuditTrailAdjustment> getPriceAdjustments() {
    return priceAdjustments;
  }

  public void setPriceAdjustments(List<AuditTrailAdjustment> priceAdjustments) {
    this.priceAdjustments = priceAdjustments;
  }

  @Override
  public String toString() {
    return "PricingAuditTrail{priceAdjustments='" + priceAdjustments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PricingAuditTrail that = (PricingAuditTrail) o;
    return Objects.equals(priceAdjustments, that.priceAdjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceAdjustments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The adjustments used to determine the final price, in order of their application.
     */
    private List<AuditTrailAdjustment> priceAdjustments;

    public PricingAuditTrail build() {
      PricingAuditTrail result = new PricingAuditTrail();
      result.priceAdjustments = this.priceAdjustments;
      return result;
    }

    /**
     * The adjustments used to determine the final price, in order of their application.
     */
    public Builder priceAdjustments(List<AuditTrailAdjustment> priceAdjustments) {
      this.priceAdjustments = priceAdjustments;
      return this;
    }
  }
}
