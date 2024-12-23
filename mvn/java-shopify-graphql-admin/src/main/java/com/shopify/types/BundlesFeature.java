package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the Bundles feature configuration for the shop.
 */
public class BundlesFeature {
  /**
   * Whether a shop is configured properly to sell bundles.
   */
  private boolean eligibleForBundles;

  /**
   * The reason why a shop is not eligible for bundles.
   */
  private String ineligibilityReason;

  /**
   * Whether a shop has any fixed bundle products or has a cartTransform function installed.
   */
  private boolean sellsBundles;

  public BundlesFeature() {
  }

  /**
   * Whether a shop is configured properly to sell bundles.
   */
  public boolean getEligibleForBundles() {
    return eligibleForBundles;
  }

  public void setEligibleForBundles(boolean eligibleForBundles) {
    this.eligibleForBundles = eligibleForBundles;
  }

  /**
   * The reason why a shop is not eligible for bundles.
   */
  public String getIneligibilityReason() {
    return ineligibilityReason;
  }

  public void setIneligibilityReason(String ineligibilityReason) {
    this.ineligibilityReason = ineligibilityReason;
  }

  /**
   * Whether a shop has any fixed bundle products or has a cartTransform function installed.
   */
  public boolean getSellsBundles() {
    return sellsBundles;
  }

  public void setSellsBundles(boolean sellsBundles) {
    this.sellsBundles = sellsBundles;
  }

  @Override
  public String toString() {
    return "BundlesFeature{eligibleForBundles='" + eligibleForBundles + "', ineligibilityReason='" + ineligibilityReason + "', sellsBundles='" + sellsBundles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BundlesFeature that = (BundlesFeature) o;
    return eligibleForBundles == that.eligibleForBundles &&
        Objects.equals(ineligibilityReason, that.ineligibilityReason) &&
        sellsBundles == that.sellsBundles;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibleForBundles, ineligibilityReason, sellsBundles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether a shop is configured properly to sell bundles.
     */
    private boolean eligibleForBundles;

    /**
     * The reason why a shop is not eligible for bundles.
     */
    private String ineligibilityReason;

    /**
     * Whether a shop has any fixed bundle products or has a cartTransform function installed.
     */
    private boolean sellsBundles;

    public BundlesFeature build() {
      BundlesFeature result = new BundlesFeature();
      result.eligibleForBundles = this.eligibleForBundles;
      result.ineligibilityReason = this.ineligibilityReason;
      result.sellsBundles = this.sellsBundles;
      return result;
    }

    /**
     * Whether a shop is configured properly to sell bundles.
     */
    public Builder eligibleForBundles(boolean eligibleForBundles) {
      this.eligibleForBundles = eligibleForBundles;
      return this;
    }

    /**
     * The reason why a shop is not eligible for bundles.
     */
    public Builder ineligibilityReason(String ineligibilityReason) {
      this.ineligibilityReason = ineligibilityReason;
      return this;
    }

    /**
     * Whether a shop has any fixed bundle products or has a cartTransform function installed.
     */
    public Builder sellsBundles(boolean sellsBundles) {
      this.sellsBundles = sellsBundles;
      return this;
    }
  }
}
