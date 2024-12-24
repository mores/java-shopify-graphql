package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class BundlesFeature {
  
  private boolean eligibleForBundles;

  
  private String ineligibilityReason;

  
  private boolean sellsBundles;

  public BundlesFeature() {
  }

  
  public boolean getEligibleForBundles() {
    return eligibleForBundles;
  }

  public void setEligibleForBundles(boolean eligibleForBundles) {
    this.eligibleForBundles = eligibleForBundles;
  }

  
  public String getIneligibilityReason() {
    return ineligibilityReason;
  }

  public void setIneligibilityReason(String ineligibilityReason) {
    this.ineligibilityReason = ineligibilityReason;
  }

  
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
    
    private boolean eligibleForBundles;

    
    private String ineligibilityReason;

    
    private boolean sellsBundles;

    public BundlesFeature build() {
      BundlesFeature result = new BundlesFeature();
      result.eligibleForBundles = this.eligibleForBundles;
      result.ineligibilityReason = this.ineligibilityReason;
      result.sellsBundles = this.sellsBundles;
      return result;
    }

    
    public Builder eligibleForBundles(boolean eligibleForBundles) {
      this.eligibleForBundles = eligibleForBundles;
      return this;
    }

    
    public Builder ineligibilityReason(String ineligibilityReason) {
      this.ineligibilityReason = ineligibilityReason;
      return this;
    }

    
    public Builder sellsBundles(boolean sellsBundles) {
      this.sellsBundles = sellsBundles;
      return this;
    }
  }
}
