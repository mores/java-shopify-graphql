package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a parent/child relationship between two markets.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketRelationship implements com.shopify.admin.types.Node {
  /**
   * The child market in the relationship.
   */
  private Market childMarket;

  /**
   * The unique identifier for the market relationship.
   */
  private String id;

  /**
   * The parent market in the relationship.
   */
  private Market parentMarket;

  public MarketRelationship() {
  }

  /**
   * The child market in the relationship.
   */
  public Market getChildMarket() {
    return childMarket;
  }

  public void setChildMarket(Market childMarket) {
    this.childMarket = childMarket;
  }

  /**
   * The unique identifier for the market relationship.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The parent market in the relationship.
   */
  public Market getParentMarket() {
    return parentMarket;
  }

  public void setParentMarket(Market parentMarket) {
    this.parentMarket = parentMarket;
  }

  @Override
  public String toString() {
    return "MarketRelationship{childMarket='" + childMarket + "', id='" + id + "', parentMarket='" + parentMarket + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRelationship that = (MarketRelationship) o;
    return Objects.equals(childMarket, that.childMarket) &&
        Objects.equals(id, that.id) &&
        Objects.equals(parentMarket, that.parentMarket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childMarket, id, parentMarket);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The child market in the relationship.
     */
    private Market childMarket;

    /**
     * The unique identifier for the market relationship.
     */
    private String id;

    /**
     * The parent market in the relationship.
     */
    private Market parentMarket;

    public MarketRelationship build() {
      MarketRelationship result = new MarketRelationship();
      result.childMarket = this.childMarket;
      result.id = this.id;
      result.parentMarket = this.parentMarket;
      return result;
    }

    /**
     * The child market in the relationship.
     */
    public Builder childMarket(Market childMarket) {
      this.childMarket = childMarket;
      return this;
    }

    /**
     * The unique identifier for the market relationship.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The parent market in the relationship.
     */
    public Builder parentMarket(Market parentMarket) {
      this.parentMarket = parentMarket;
      return this;
    }
  }
}
