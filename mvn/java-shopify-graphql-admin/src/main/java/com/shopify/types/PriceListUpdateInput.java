package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a price list.
 */
public class PriceListUpdateInput {
  /**
   * The unique name of the price list, used as a human-readable identifier.
   */
  private String name;

  /**
   * The three-letter currency code for fixed prices associated with this price list.
   */
  private CurrencyCode currency;

  /**
   * Relative adjustments to other prices.
   */
  private PriceListParentUpdateInput _parent;

  /**
   * The ID of the catalog to associate with this price list.
   */
  private String catalogId;

  public PriceListUpdateInput() {
  }

  /**
   * The unique name of the price list, used as a human-readable identifier.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The three-letter currency code for fixed prices associated with this price list.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * Relative adjustments to other prices.
   */
  public PriceListParentUpdateInput getParent() {
    return _parent;
  }

  public void setParent(PriceListParentUpdateInput _parent) {
    this._parent = _parent;
  }

  /**
   * The ID of the catalog to associate with this price list.
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  @Override
  public String toString() {
    return "PriceListUpdateInput{name='" + name + "', currency='" + currency + "', parent='" + _parent + "', catalogId='" + catalogId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListUpdateInput that = (PriceListUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(_parent, that._parent) &&
        Objects.equals(catalogId, that.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currency, _parent, catalogId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique name of the price list, used as a human-readable identifier.
     */
    private String name;

    /**
     * The three-letter currency code for fixed prices associated with this price list.
     */
    private CurrencyCode currency;

    /**
     * Relative adjustments to other prices.
     */
    private PriceListParentUpdateInput _parent;

    /**
     * The ID of the catalog to associate with this price list.
     */
    private String catalogId;

    public PriceListUpdateInput build() {
      PriceListUpdateInput result = new PriceListUpdateInput();
      result.name = this.name;
      result.currency = this.currency;
      result._parent = this._parent;
      result.catalogId = this.catalogId;
      return result;
    }

    /**
     * The unique name of the price list, used as a human-readable identifier.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The three-letter currency code for fixed prices associated with this price list.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Relative adjustments to other prices.
     */
    public Builder _parent(PriceListParentUpdateInput _parent) {
      this._parent = _parent;
      return this;
    }

    /**
     * The ID of the catalog to associate with this price list.
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }
  }
}
