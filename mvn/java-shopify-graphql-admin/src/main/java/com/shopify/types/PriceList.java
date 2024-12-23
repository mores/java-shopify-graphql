package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a price list, including information about related prices and eligibility rules.
 * You can use price lists to specify either fixed prices or adjusted relative prices that
 * override initial product variant prices. Price lists are applied to customers
 * using context rules, which determine price list eligibility.
 *
 *   For more information on price lists, refer to
 *   [Support different pricing models](https://shopify.dev/apps/internationalization/product-price-lists).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceList implements com.shopify.types.Node {
  /**
   * The catalog that the price list is associated with.
   */
  private Catalog catalog;

  /**
   * The currency for fixed prices associated with this price list.
   */
  private CurrencyCode currency;

  /**
   * The number of fixed prices on the price list.
   */
  private int fixedPricesCount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The unique name of the price list, used as a human-readable identifier.
   */
  private String name;

  /**
   * Relative adjustments to other prices.
   */
  private PriceListParent _parent;

  /**
   * A list of prices associated with the price list.
   */
  private PriceListPriceConnection prices;

  /**
   * A list of quantity rules associated with the price list, ordered by product variants.
   */
  private QuantityRuleConnection quantityRules;

  public PriceList() {
  }

  /**
   * The catalog that the price list is associated with.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * The currency for fixed prices associated with this price list.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * The number of fixed prices on the price list.
   */
  public int getFixedPricesCount() {
    return fixedPricesCount;
  }

  public void setFixedPricesCount(int fixedPricesCount) {
    this.fixedPricesCount = fixedPricesCount;
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
   * The unique name of the price list, used as a human-readable identifier.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Relative adjustments to other prices.
   */
  public PriceListParent getParent() {
    return _parent;
  }

  public void setParent(PriceListParent _parent) {
    this._parent = _parent;
  }

  /**
   * A list of prices associated with the price list.
   */
  public PriceListPriceConnection getPrices() {
    return prices;
  }

  public void setPrices(PriceListPriceConnection prices) {
    this.prices = prices;
  }

  /**
   * A list of quantity rules associated with the price list, ordered by product variants.
   */
  public QuantityRuleConnection getQuantityRules() {
    return quantityRules;
  }

  public void setQuantityRules(QuantityRuleConnection quantityRules) {
    this.quantityRules = quantityRules;
  }

  @Override
  public String toString() {
    return "PriceList{catalog='" + catalog + "', currency='" + currency + "', fixedPricesCount='" + fixedPricesCount + "', id='" + id + "', name='" + name + "', parent='" + _parent + "', prices='" + prices + "', quantityRules='" + quantityRules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceList that = (PriceList) o;
    return Objects.equals(catalog, that.catalog) &&
        Objects.equals(currency, that.currency) &&
        fixedPricesCount == that.fixedPricesCount &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(_parent, that._parent) &&
        Objects.equals(prices, that.prices) &&
        Objects.equals(quantityRules, that.quantityRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, currency, fixedPricesCount, id, name, _parent, prices, quantityRules);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The catalog that the price list is associated with.
     */
    private Catalog catalog;

    /**
     * The currency for fixed prices associated with this price list.
     */
    private CurrencyCode currency;

    /**
     * The number of fixed prices on the price list.
     */
    private int fixedPricesCount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The unique name of the price list, used as a human-readable identifier.
     */
    private String name;

    /**
     * Relative adjustments to other prices.
     */
    private PriceListParent _parent;

    /**
     * A list of prices associated with the price list.
     */
    private PriceListPriceConnection prices;

    /**
     * A list of quantity rules associated with the price list, ordered by product variants.
     */
    private QuantityRuleConnection quantityRules;

    public PriceList build() {
      PriceList result = new PriceList();
      result.catalog = this.catalog;
      result.currency = this.currency;
      result.fixedPricesCount = this.fixedPricesCount;
      result.id = this.id;
      result.name = this.name;
      result._parent = this._parent;
      result.prices = this.prices;
      result.quantityRules = this.quantityRules;
      return result;
    }

    /**
     * The catalog that the price list is associated with.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * The currency for fixed prices associated with this price list.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The number of fixed prices on the price list.
     */
    public Builder fixedPricesCount(int fixedPricesCount) {
      this.fixedPricesCount = fixedPricesCount;
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
     * The unique name of the price list, used as a human-readable identifier.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Relative adjustments to other prices.
     */
    public Builder _parent(PriceListParent _parent) {
      this._parent = _parent;
      return this;
    }

    /**
     * A list of prices associated with the price list.
     */
    public Builder prices(PriceListPriceConnection prices) {
      this.prices = prices;
      return this;
    }

    /**
     * A list of quantity rules associated with the price list, ordered by product variants.
     */
    public Builder quantityRules(QuantityRuleConnection quantityRules) {
      this.quantityRules = quantityRules;
      return this;
    }
  }
}
