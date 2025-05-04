package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A country or region code.
 */
public class ConsentPolicyRegion {
  /**
   * The `ISO 3166` country code for which the policy applies.
   */
  private PrivacyCountryCode countryCode;

  /**
   * The `ISO 3166` region code for which the policy applies.
   */
  private String regionCode;

  public ConsentPolicyRegion() {
  }

  /**
   * The `ISO 3166` country code for which the policy applies.
   */
  public PrivacyCountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(PrivacyCountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The `ISO 3166` region code for which the policy applies.
   */
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  @Override
  public String toString() {
    return "ConsentPolicyRegion{countryCode='" + countryCode + "', regionCode='" + regionCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsentPolicyRegion that = (ConsentPolicyRegion) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(regionCode, that.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, regionCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The `ISO 3166` country code for which the policy applies.
     */
    private PrivacyCountryCode countryCode;

    /**
     * The `ISO 3166` region code for which the policy applies.
     */
    private String regionCode;

    public ConsentPolicyRegion build() {
      ConsentPolicyRegion result = new ConsentPolicyRegion();
      result.countryCode = this.countryCode;
      result.regionCode = this.regionCode;
      return result;
    }

    /**
     * The `ISO 3166` country code for which the policy applies.
     */
    public Builder countryCode(PrivacyCountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The `ISO 3166` region code for which the policy applies.
     */
    public Builder regionCode(String regionCode) {
      this.regionCode = regionCode;
      return this;
    }
  }
}
