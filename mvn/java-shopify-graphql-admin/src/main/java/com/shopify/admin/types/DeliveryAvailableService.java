package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping service and a list of countries that the service is available for.
 */
public class DeliveryAvailableService {
  /**
   * The countries the service provider ships to.
   */
  private DeliveryCountryCodesOrRestOfWorld countries;

  /**
   * The name of the service.
   */
  private String name;

  public DeliveryAvailableService() {
  }

  /**
   * The countries the service provider ships to.
   */
  public DeliveryCountryCodesOrRestOfWorld getCountries() {
    return countries;
  }

  public void setCountries(DeliveryCountryCodesOrRestOfWorld countries) {
    this.countries = countries;
  }

  /**
   * The name of the service.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "DeliveryAvailableService{countries='" + countries + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryAvailableService that = (DeliveryAvailableService) o;
    return Objects.equals(countries, that.countries) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The countries the service provider ships to.
     */
    private DeliveryCountryCodesOrRestOfWorld countries;

    /**
     * The name of the service.
     */
    private String name;

    public DeliveryAvailableService build() {
      DeliveryAvailableService result = new DeliveryAvailableService();
      result.countries = this.countries;
      result.name = this.name;
      return result;
    }

    /**
     * The countries the service provider ships to.
     */
    public Builder countries(DeliveryCountryCodesOrRestOfWorld countries) {
      this.countries = countries;
      return this;
    }

    /**
     * The name of the service.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
