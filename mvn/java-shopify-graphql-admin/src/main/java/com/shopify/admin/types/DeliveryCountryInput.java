package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to specify a country.
 */
public class DeliveryCountryInput {
  /**
   * The country code of the country in the ISO 3166-1 alpha-2 format.
   */
  private CountryCode code;

  /**
   * Whether the country is a part of the 'Rest of World' shipping zone.
   */
  private Boolean restOfWorld;

  /**
   * The regions associated with this country.
   */
  private List<DeliveryProvinceInput> provinces;

  /**
   * Associate all available provinces with this country.
   */
  private Boolean includeAllProvinces;

  public DeliveryCountryInput() {
  }

  /**
   * The country code of the country in the ISO 3166-1 alpha-2 format.
   */
  public CountryCode getCode() {
    return code;
  }

  public void setCode(CountryCode code) {
    this.code = code;
  }

  /**
   * Whether the country is a part of the 'Rest of World' shipping zone.
   */
  public Boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(Boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  /**
   * The regions associated with this country.
   */
  public List<DeliveryProvinceInput> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<DeliveryProvinceInput> provinces) {
    this.provinces = provinces;
  }

  /**
   * Associate all available provinces with this country.
   */
  public Boolean getIncludeAllProvinces() {
    return includeAllProvinces;
  }

  public void setIncludeAllProvinces(Boolean includeAllProvinces) {
    this.includeAllProvinces = includeAllProvinces;
  }

  @Override
  public String toString() {
    return "DeliveryCountryInput{code='" + code + "', restOfWorld='" + restOfWorld + "', provinces='" + provinces + "', includeAllProvinces='" + includeAllProvinces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryInput that = (DeliveryCountryInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(restOfWorld, that.restOfWorld) &&
        Objects.equals(provinces, that.provinces) &&
        Objects.equals(includeAllProvinces, that.includeAllProvinces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, restOfWorld, provinces, includeAllProvinces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country code of the country in the ISO 3166-1 alpha-2 format.
     */
    private CountryCode code;

    /**
     * Whether the country is a part of the 'Rest of World' shipping zone.
     */
    private Boolean restOfWorld;

    /**
     * The regions associated with this country.
     */
    private List<DeliveryProvinceInput> provinces;

    /**
     * Associate all available provinces with this country.
     */
    private Boolean includeAllProvinces;

    public DeliveryCountryInput build() {
      DeliveryCountryInput result = new DeliveryCountryInput();
      result.code = this.code;
      result.restOfWorld = this.restOfWorld;
      result.provinces = this.provinces;
      result.includeAllProvinces = this.includeAllProvinces;
      return result;
    }

    /**
     * The country code of the country in the ISO 3166-1 alpha-2 format.
     */
    public Builder code(CountryCode code) {
      this.code = code;
      return this;
    }

    /**
     * Whether the country is a part of the 'Rest of World' shipping zone.
     */
    public Builder restOfWorld(Boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }

    /**
     * The regions associated with this country.
     */
    public Builder provinces(List<DeliveryProvinceInput> provinces) {
      this.provinces = provinces;
      return this;
    }

    /**
     * Associate all available provinces with this country.
     */
    public Builder includeAllProvinces(Boolean includeAllProvinces) {
      this.includeAllProvinces = includeAllProvinces;
      return this;
    }
  }
}
