package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MerchantApprovalSignals {
  
  private boolean identityVerified;

  
  private boolean verifiedByShopify;

  
  private String verifiedByShopifyTier;

  public MerchantApprovalSignals() {
  }

  
  public boolean getIdentityVerified() {
    return identityVerified;
  }

  public void setIdentityVerified(boolean identityVerified) {
    this.identityVerified = identityVerified;
  }

  
  public boolean getVerifiedByShopify() {
    return verifiedByShopify;
  }

  public void setVerifiedByShopify(boolean verifiedByShopify) {
    this.verifiedByShopify = verifiedByShopify;
  }

  
  public String getVerifiedByShopifyTier() {
    return verifiedByShopifyTier;
  }

  public void setVerifiedByShopifyTier(String verifiedByShopifyTier) {
    this.verifiedByShopifyTier = verifiedByShopifyTier;
  }

  @Override
  public String toString() {
    return "MerchantApprovalSignals{identityVerified='" + identityVerified + "', verifiedByShopify='" + verifiedByShopify + "', verifiedByShopifyTier='" + verifiedByShopifyTier + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MerchantApprovalSignals that = (MerchantApprovalSignals) o;
    return identityVerified == that.identityVerified &&
        verifiedByShopify == that.verifiedByShopify &&
        Objects.equals(verifiedByShopifyTier, that.verifiedByShopifyTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVerified, verifiedByShopify, verifiedByShopifyTier);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean identityVerified;

    
    private boolean verifiedByShopify;

    
    private String verifiedByShopifyTier;

    public MerchantApprovalSignals build() {
      MerchantApprovalSignals result = new MerchantApprovalSignals();
      result.identityVerified = this.identityVerified;
      result.verifiedByShopify = this.verifiedByShopify;
      result.verifiedByShopifyTier = this.verifiedByShopifyTier;
      return result;
    }

    
    public Builder identityVerified(boolean identityVerified) {
      this.identityVerified = identityVerified;
      return this;
    }

    
    public Builder verifiedByShopify(boolean verifiedByShopify) {
      this.verifiedByShopify = verifiedByShopify;
      return this;
    }

    
    public Builder verifiedByShopifyTier(String verifiedByShopifyTier) {
      this.verifiedByShopifyTier = verifiedByShopifyTier;
      return this;
    }
  }
}
