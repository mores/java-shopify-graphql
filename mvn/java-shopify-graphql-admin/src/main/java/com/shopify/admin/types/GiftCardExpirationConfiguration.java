package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the default expiration configuration of gift cards on the shop.
 */
public class GiftCardExpirationConfiguration {
  /**
   * The unit for the default gift card expiration.
   */
  private GiftCardConfigurationExpirationUnit expirationUnit;

  /**
   * The value for the default gift card expiration.
   */
  private int expirationValue;

  public GiftCardExpirationConfiguration() {
  }

  /**
   * The unit for the default gift card expiration.
   */
  public GiftCardConfigurationExpirationUnit getExpirationUnit() {
    return expirationUnit;
  }

  public void setExpirationUnit(GiftCardConfigurationExpirationUnit expirationUnit) {
    this.expirationUnit = expirationUnit;
  }

  /**
   * The value for the default gift card expiration.
   */
  public int getExpirationValue() {
    return expirationValue;
  }

  public void setExpirationValue(int expirationValue) {
    this.expirationValue = expirationValue;
  }

  @Override
  public String toString() {
    return "GiftCardExpirationConfiguration{expirationUnit='" + expirationUnit + "', expirationValue='" + expirationValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardExpirationConfiguration that = (GiftCardExpirationConfiguration) o;
    return Objects.equals(expirationUnit, that.expirationUnit) &&
        expirationValue == that.expirationValue;
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationUnit, expirationValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unit for the default gift card expiration.
     */
    private GiftCardConfigurationExpirationUnit expirationUnit;

    /**
     * The value for the default gift card expiration.
     */
    private int expirationValue;

    public GiftCardExpirationConfiguration build() {
      GiftCardExpirationConfiguration result = new GiftCardExpirationConfiguration();
      result.expirationUnit = this.expirationUnit;
      result.expirationValue = this.expirationValue;
      return result;
    }

    /**
     * The unit for the default gift card expiration.
     */
    public Builder expirationUnit(GiftCardConfigurationExpirationUnit expirationUnit) {
      this.expirationUnit = expirationUnit;
      return this;
    }

    /**
     * The value for the default gift card expiration.
     */
    public Builder expirationValue(int expirationValue) {
      this.expirationValue = expirationValue;
      return this;
    }
  }
}
