package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Merchant approval for accelerated onboarding to channel integration apps.
 */
public class MerchantApprovalSignals {
  /**
   * Whether the shop's Shopify Payments account identity is verified. Returns
   * `false` if the identity is unverified or if the shop doesn't have a Shopify
   * Payments account.
   */
  private boolean identityVerified;

  /**
   * Whether Shopify has pre-verified the merchant's business for onboarding to
   * channel integration apps. Returns `false` if the shop isn't marked for verification.
   */
  private boolean verifiedByShopify;

  /**
   * Which tier of the Shopify verification was determined for the merchant's
   * business for onboarding to channel integration apps.
   */
  private String verifiedByShopifyTier;

  public MerchantApprovalSignals() {
  }

  /**
   * Whether the shop's Shopify Payments account identity is verified. Returns
   * `false` if the identity is unverified or if the shop doesn't have a Shopify
   * Payments account.
   */
  public boolean getIdentityVerified() {
    return identityVerified;
  }

  public void setIdentityVerified(boolean identityVerified) {
    this.identityVerified = identityVerified;
  }

  /**
   * Whether Shopify has pre-verified the merchant's business for onboarding to
   * channel integration apps. Returns `false` if the shop isn't marked for verification.
   */
  public boolean getVerifiedByShopify() {
    return verifiedByShopify;
  }

  public void setVerifiedByShopify(boolean verifiedByShopify) {
    this.verifiedByShopify = verifiedByShopify;
  }

  /**
   * Which tier of the Shopify verification was determined for the merchant's
   * business for onboarding to channel integration apps.
   */
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
    /**
     * Whether the shop's Shopify Payments account identity is verified. Returns
     * `false` if the identity is unverified or if the shop doesn't have a Shopify
     * Payments account.
     */
    private boolean identityVerified;

    /**
     * Whether Shopify has pre-verified the merchant's business for onboarding to
     * channel integration apps. Returns `false` if the shop isn't marked for verification.
     */
    private boolean verifiedByShopify;

    /**
     * Which tier of the Shopify verification was determined for the merchant's
     * business for onboarding to channel integration apps.
     */
    private String verifiedByShopifyTier;

    public MerchantApprovalSignals build() {
      MerchantApprovalSignals result = new MerchantApprovalSignals();
      result.identityVerified = this.identityVerified;
      result.verifiedByShopify = this.verifiedByShopify;
      result.verifiedByShopifyTier = this.verifiedByShopifyTier;
      return result;
    }

    /**
     * Whether the shop's Shopify Payments account identity is verified. Returns
     * `false` if the identity is unverified or if the shop doesn't have a Shopify
     * Payments account.
     */
    public Builder identityVerified(boolean identityVerified) {
      this.identityVerified = identityVerified;
      return this;
    }

    /**
     * Whether Shopify has pre-verified the merchant's business for onboarding to
     * channel integration apps. Returns `false` if the shop isn't marked for verification.
     */
    public Builder verifiedByShopify(boolean verifiedByShopify) {
      this.verifiedByShopify = verifiedByShopify;
      return this;
    }

    /**
     * Which tier of the Shopify verification was determined for the merchant's
     * business for onboarding to channel integration apps.
     */
    public Builder verifiedByShopifyTier(String verifiedByShopifyTier) {
      this.verifiedByShopifyTier = verifiedByShopifyTier;
      return this;
    }
  }
}
