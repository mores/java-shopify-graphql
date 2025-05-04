package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A consent policy describes the level of consent that the merchant requires from the user before actually
 * collecting and processing the data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ConsentPolicy implements com.shopify.admin.types.Node {
  /**
   * Whether consent is required for the region.
   */
  private Boolean consentRequired;

  /**
   * The `ISO 3166` country code for which the policy applies.
   */
  private PrivacyCountryCode countryCode;

  /**
   * Whether data sale opt-out is required for the region.
   */
  private Boolean dataSaleOptOutRequired;

  /**
   * The global ID of the consent policy. IDs prefixed with `SD-` are system default policies.
   */
  private String id;

  /**
   * The `ISO 3166` region code for which the policy applies.
   */
  private String regionCode;

  /**
   * The global ID of the shop that owns the policy.
   */
  private String shopId;

  public ConsentPolicy() {
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
   * The `ISO 3166` country code for which the policy applies.
   */
  public PrivacyCountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(PrivacyCountryCode countryCode) {
    this.countryCode = countryCode;
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

  /**
   * The global ID of the consent policy. IDs prefixed with `SD-` are system default policies.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * The global ID of the shop that owns the policy.
   */
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  @Override
  public String toString() {
    return "ConsentPolicy{consentRequired='" + consentRequired + "', countryCode='" + countryCode + "', dataSaleOptOutRequired='" + dataSaleOptOutRequired + "', id='" + id + "', regionCode='" + regionCode + "', shopId='" + shopId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsentPolicy that = (ConsentPolicy) o;
    return Objects.equals(consentRequired, that.consentRequired) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(dataSaleOptOutRequired, that.dataSaleOptOutRequired) &&
        Objects.equals(id, that.id) &&
        Objects.equals(regionCode, that.regionCode) &&
        Objects.equals(shopId, that.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequired, countryCode, dataSaleOptOutRequired, id, regionCode, shopId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether consent is required for the region.
     */
    private Boolean consentRequired;

    /**
     * The `ISO 3166` country code for which the policy applies.
     */
    private PrivacyCountryCode countryCode;

    /**
     * Whether data sale opt-out is required for the region.
     */
    private Boolean dataSaleOptOutRequired;

    /**
     * The global ID of the consent policy. IDs prefixed with `SD-` are system default policies.
     */
    private String id;

    /**
     * The `ISO 3166` region code for which the policy applies.
     */
    private String regionCode;

    /**
     * The global ID of the shop that owns the policy.
     */
    private String shopId;

    public ConsentPolicy build() {
      ConsentPolicy result = new ConsentPolicy();
      result.consentRequired = this.consentRequired;
      result.countryCode = this.countryCode;
      result.dataSaleOptOutRequired = this.dataSaleOptOutRequired;
      result.id = this.id;
      result.regionCode = this.regionCode;
      result.shopId = this.shopId;
      return result;
    }

    /**
     * Whether consent is required for the region.
     */
    public Builder consentRequired(Boolean consentRequired) {
      this.consentRequired = consentRequired;
      return this;
    }

    /**
     * The `ISO 3166` country code for which the policy applies.
     */
    public Builder countryCode(PrivacyCountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * Whether data sale opt-out is required for the region.
     */
    public Builder dataSaleOptOutRequired(Boolean dataSaleOptOutRequired) {
      this.dataSaleOptOutRequired = dataSaleOptOutRequired;
      return this;
    }

    /**
     * The global ID of the consent policy. IDs prefixed with `SD-` are system default policies.
     */
    public Builder id(String id) {
      this.id = id;
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
     * The global ID of the shop that owns the policy.
     */
    public Builder shopId(String shopId) {
      this.shopId = shopId;
      return this;
    }
  }
}
