package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Resource limits of a shop.
 */
public class ShopResourceLimits {
  /**
   * Maximum number of locations allowed.
   */
  private int locationLimit;

  /**
   * Maximum number of product options allowed.
   */
  private int maxProductOptions;

  /**
   * The maximum number of variants allowed per product.
   */
  private int maxProductVariants;

  /**
   * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
   */
  private boolean redirectLimitReached;

  public ShopResourceLimits() {
  }

  /**
   * Maximum number of locations allowed.
   */
  public int getLocationLimit() {
    return locationLimit;
  }

  public void setLocationLimit(int locationLimit) {
    this.locationLimit = locationLimit;
  }

  /**
   * Maximum number of product options allowed.
   */
  public int getMaxProductOptions() {
    return maxProductOptions;
  }

  public void setMaxProductOptions(int maxProductOptions) {
    this.maxProductOptions = maxProductOptions;
  }

  /**
   * The maximum number of variants allowed per product.
   */
  public int getMaxProductVariants() {
    return maxProductVariants;
  }

  public void setMaxProductVariants(int maxProductVariants) {
    this.maxProductVariants = maxProductVariants;
  }

  /**
   * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
   */
  public boolean getRedirectLimitReached() {
    return redirectLimitReached;
  }

  public void setRedirectLimitReached(boolean redirectLimitReached) {
    this.redirectLimitReached = redirectLimitReached;
  }

  @Override
  public String toString() {
    return "ShopResourceLimits{locationLimit='" + locationLimit + "', maxProductOptions='" + maxProductOptions + "', maxProductVariants='" + maxProductVariants + "', redirectLimitReached='" + redirectLimitReached + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopResourceLimits that = (ShopResourceLimits) o;
    return locationLimit == that.locationLimit &&
        maxProductOptions == that.maxProductOptions &&
        maxProductVariants == that.maxProductVariants &&
        redirectLimitReached == that.redirectLimitReached;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationLimit, maxProductOptions, maxProductVariants, redirectLimitReached);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Maximum number of locations allowed.
     */
    private int locationLimit;

    /**
     * Maximum number of product options allowed.
     */
    private int maxProductOptions;

    /**
     * The maximum number of variants allowed per product.
     */
    private int maxProductVariants;

    /**
     * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
     */
    private boolean redirectLimitReached;

    public ShopResourceLimits build() {
      ShopResourceLimits result = new ShopResourceLimits();
      result.locationLimit = this.locationLimit;
      result.maxProductOptions = this.maxProductOptions;
      result.maxProductVariants = this.maxProductVariants;
      result.redirectLimitReached = this.redirectLimitReached;
      return result;
    }

    /**
     * Maximum number of locations allowed.
     */
    public Builder locationLimit(int locationLimit) {
      this.locationLimit = locationLimit;
      return this;
    }

    /**
     * Maximum number of product options allowed.
     */
    public Builder maxProductOptions(int maxProductOptions) {
      this.maxProductOptions = maxProductOptions;
      return this;
    }

    /**
     * The maximum number of variants allowed per product.
     */
    public Builder maxProductVariants(int maxProductVariants) {
      this.maxProductVariants = maxProductVariants;
      return this;
    }

    /**
     * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
     */
    public Builder redirectLimitReached(boolean redirectLimitReached) {
      this.redirectLimitReached = redirectLimitReached;
      return this;
    }
  }
}
