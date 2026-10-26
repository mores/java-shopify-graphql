package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A country that a subdivision belongs to.
 */
public class MarketRegionSubdivisionCountry {
  /**
   * The ISO code identifying the country.
   */
  private CountryCode code;

  /**
   * The name of the country.
   */
  private String name;

  public MarketRegionSubdivisionCountry() {
  }

  /**
   * The ISO code identifying the country.
   */
  public CountryCode getCode() {
    return code;
  }

  public void setCode(CountryCode code) {
    this.code = code;
  }

  /**
   * The name of the country.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "MarketRegionSubdivisionCountry{code='" + code + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionSubdivisionCountry that = (MarketRegionSubdivisionCountry) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ISO code identifying the country.
     */
    private CountryCode code;

    /**
     * The name of the country.
     */
    private String name;

    public MarketRegionSubdivisionCountry build() {
      MarketRegionSubdivisionCountry result = new MarketRegionSubdivisionCountry();
      result.code = this.code;
      result.name = this.name;
      return result;
    }

    /**
     * The ISO code identifying the country.
     */
    public Builder code(CountryCode code) {
      this.code = code;
      return this;
    }

    /**
     * The name of the country.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
