package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A subdivision of a country which comprises a market.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketRegionSubdivision implements com.shopify.admin.types.MarketRegion, com.shopify.admin.types.Node {
  /**
   * The ISO code identifying the subdivision.
   */
  private String code;

  /**
   * The country the subdivision belongs to.
   */
  private MarketRegionSubdivisionCountry country;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the region.
   */
  private String name;

  public MarketRegionSubdivision() {
  }

  /**
   * The ISO code identifying the subdivision.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The country the subdivision belongs to.
   */
  public MarketRegionSubdivisionCountry getCountry() {
    return country;
  }

  public void setCountry(MarketRegionSubdivisionCountry country) {
    this.country = country;
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
    return "MarketRegionSubdivision{code='" + code + "', country='" + country + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionSubdivision that = (MarketRegionSubdivision) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(country, that.country) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, country, id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ISO code identifying the subdivision.
     */
    private String code;

    /**
     * The country the subdivision belongs to.
     */
    private MarketRegionSubdivisionCountry country;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the region.
     */
    private String name;

    public MarketRegionSubdivision build() {
      MarketRegionSubdivision result = new MarketRegionSubdivision();
      result.code = this.code;
      result.country = this.country;
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * The ISO code identifying the subdivision.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The country the subdivision belongs to.
     */
    public Builder country(MarketRegionSubdivisionCountry country) {
      this.country = country;
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
