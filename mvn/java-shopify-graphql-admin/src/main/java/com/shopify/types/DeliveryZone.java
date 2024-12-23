package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A zone is a group of countries that have the same shipping rates. Customers can
 * order products from a store only if they choose a shipping destination that's
 * included in one of the store's zones.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryZone implements com.shopify.types.Node {
  /**
   * The list of countries within the zone.
   */
  private List<DeliveryCountry> countries;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the zone.
   */
  private String name;

  public DeliveryZone() {
  }

  /**
   * The list of countries within the zone.
   */
  public List<DeliveryCountry> getCountries() {
    return countries;
  }

  public void setCountries(List<DeliveryCountry> countries) {
    this.countries = countries;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the zone.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "DeliveryZone{countries='" + countries + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryZone that = (DeliveryZone) o;
    return Objects.equals(countries, that.countries) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of countries within the zone.
     */
    private List<DeliveryCountry> countries;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the zone.
     */
    private String name;

    public DeliveryZone build() {
      DeliveryZone result = new DeliveryZone();
      result.countries = this.countries;
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * The list of countries within the zone.
     */
    public Builder countries(List<DeliveryCountry> countries) {
      this.countries = countries;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the zone.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
