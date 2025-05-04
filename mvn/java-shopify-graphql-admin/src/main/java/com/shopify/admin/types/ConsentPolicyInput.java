package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a consent policy to be updated or created.
 */
public class ConsentPolicyInput {
  /**
   * The `ISO 3166` country code for which the policy applies.
   */
  private PrivacyCountryCode countryCode;

  /**
   * The `ISO 3166` region code for which the policy applies.
   */
  private String regionCode;

  /**
   * Whether consent is required for the region.
   */
  private Boolean consentRequired;

  /**
   * Whether data sale opt-out is required for the region.
   */
  private Boolean dataSaleOptOutRequired;

  public ConsentPolicyInput() {
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

  /**
   * Whether consent is required for the region.
   */
  public Boolean getConsentRequired() {
    return consentRequired;
  }

  public void setConsentRequired(Boolean consentRequired) {
    this.consentRequired = consentRequired;
  }

  /**
   * Whether data sale opt-out is required for the region.
   */
  public Boolean getDataSaleOptOutRequired() {
    return dataSaleOptOutRequired;
  }

  public void setDataSaleOptOutRequired(Boolean dataSaleOptOutRequired) {
    this.dataSaleOptOutRequired = dataSaleOptOutRequired;
  }

  @Override
  public String toString() {
    return "ConsentPolicyInput{countryCode='" + countryCode + "', regionCode='" + regionCode + "', consentRequired='" + consentRequired + "', dataSaleOptOutRequired='" + dataSaleOptOutRequired + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsentPolicyInput that = (ConsentPolicyInput) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(regionCode, that.regionCode) &&
        Objects.equals(consentRequired, that.consentRequired) &&
        Objects.equals(dataSaleOptOutRequired, that.dataSaleOptOutRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, regionCode, consentRequired, dataSaleOptOutRequired);
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

    /**
     * Whether consent is required for the region.
     */
    private Boolean consentRequired;

    /**
     * Whether data sale opt-out is required for the region.
     */
    private Boolean dataSaleOptOutRequired;

    public ConsentPolicyInput build() {
      ConsentPolicyInput result = new ConsentPolicyInput();
      result.countryCode = this.countryCode;
      result.regionCode = this.regionCode;
      result.consentRequired = this.consentRequired;
      result.dataSaleOptOutRequired = this.dataSaleOptOutRequired;
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

    /**
     * Whether consent is required for the region.
     */
    public Builder consentRequired(Boolean consentRequired) {
      this.consentRequired = consentRequired;
      return this;
    }

    /**
     * Whether data sale opt-out is required for the region.
     */
    public Builder dataSaleOptOutRequired(Boolean dataSaleOptOutRequired) {
      this.dataSaleOptOutRequired = dataSaleOptOutRequired;
      return this;
    }
  }
}
