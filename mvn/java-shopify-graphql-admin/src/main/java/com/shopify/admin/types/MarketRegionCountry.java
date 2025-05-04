package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A country which comprises a market.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketRegionCountry implements com.shopify.admin.types.MarketRegion, com.shopify.admin.types.Node {
  /**
   * The ISO code identifying the country.
   */
  private CountryCode code;

  /**
   * The currency which this country uses given its market settings.
   */
  private CurrencySetting currency;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the region.
   */
  private String name;

  public MarketRegionCountry() {
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
   * The currency which this country uses given its market settings.
   */
  public CurrencySetting getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencySetting currency) {
    this.currency = currency;
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
   * The name of the region.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "MarketRegionCountry{code='" + code + "', currency='" + currency + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionCountry that = (MarketRegionCountry) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, currency, id, name);
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
     * The currency which this country uses given its market settings.
     */
    private CurrencySetting currency;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the region.
     */
    private String name;

    public MarketRegionCountry build() {
      MarketRegionCountry result = new MarketRegionCountry();
      result.code = this.code;
      result.currency = this.currency;
      result.id = this.id;
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
     * The currency which this country uses given its market settings.
     */
    public Builder currency(CurrencySetting currency) {
      this.currency = currency;
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
     * The name of the region.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
