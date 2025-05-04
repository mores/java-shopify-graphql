package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the context data that determines the pricing of a variant. Refer to [Product](https://shopify.dev/docs/api/admin-graphql/latest/queries/product?example=Get+the+price+range+for+a+product+for+buyers+from+Canada)for
 * more information on how to use this input object.
 */
public class ContextualPricingContext {
  /**
   * The country code used to fetch country-specific prices.
   */
  private CountryCode country;

  /**
   * The CompanyLocation ID used to fetch company location specific prices.
   */
  private String companyLocationId;

  /**
   * The Location ID used to fetch location specific prices.
   */
  private String locationId;

  public ContextualPricingContext() {
  }

  /**
   * The country code used to fetch country-specific prices.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  /**
   * The CompanyLocation ID used to fetch company location specific prices.
   */
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  /**
   * The Location ID used to fetch location specific prices.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "ContextualPricingContext{country='" + country + "', companyLocationId='" + companyLocationId + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextualPricingContext that = (ContextualPricingContext) o;
    return Objects.equals(country, that.country) &&
        Objects.equals(companyLocationId, that.companyLocationId) &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, companyLocationId, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country code used to fetch country-specific prices.
     */
    private CountryCode country;

    /**
     * The CompanyLocation ID used to fetch company location specific prices.
     */
    private String companyLocationId;

    /**
     * The Location ID used to fetch location specific prices.
     */
    private String locationId;

    public ContextualPricingContext build() {
      ContextualPricingContext result = new ContextualPricingContext();
      result.country = this.country;
      result.companyLocationId = this.companyLocationId;
      result.locationId = this.locationId;
      return result;
    }

    /**
     * The country code used to fetch country-specific prices.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    /**
     * The CompanyLocation ID used to fetch company location specific prices.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }

    /**
     * The Location ID used to fetch location specific prices.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
