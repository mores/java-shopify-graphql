package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The context data that determines the publication status of a product.
 */
public class ContextualPublicationContext {
  /**
   * The country code used to fetch country-specific publication.
   */
  private CountryCode country;

  /**
   * The company location ID used to fetch company-specific publication.
   */
  private String companyLocationId;

  /**
   * The Location ID used to fetch the publication status of a product.
   */
  private String locationId;

  public ContextualPublicationContext() {
  }

  /**
   * The country code used to fetch country-specific publication.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  /**
   * The company location ID used to fetch company-specific publication.
   */
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  /**
   * The Location ID used to fetch the publication status of a product.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "ContextualPublicationContext{country='" + country + "', companyLocationId='" + companyLocationId + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextualPublicationContext that = (ContextualPublicationContext) o;
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
     * The country code used to fetch country-specific publication.
     */
    private CountryCode country;

    /**
     * The company location ID used to fetch company-specific publication.
     */
    private String companyLocationId;

    /**
     * The Location ID used to fetch the publication status of a product.
     */
    private String locationId;

    public ContextualPublicationContext build() {
      ContextualPublicationContext result = new ContextualPublicationContext();
      result.country = this.country;
      result.companyLocationId = this.companyLocationId;
      result.locationId = this.locationId;
      return result;
    }

    /**
     * The country code used to fetch country-specific publication.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    /**
     * The company location ID used to fetch company-specific publication.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }

    /**
     * The Location ID used to fetch the publication status of a product.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
