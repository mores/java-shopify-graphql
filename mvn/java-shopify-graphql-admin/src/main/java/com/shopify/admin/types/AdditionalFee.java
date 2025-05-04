package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The additional fees that have been applied to the order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AdditionalFee implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the additional fee.
   */
  private String name;

  /**
   * The price of the additional fee.
   */
  private MoneyBag price;

  /**
   * A list of taxes charged on the additional fee.
   */
  private List<TaxLine> taxLines;

  public AdditionalFee() {
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
   * The name of the additional fee.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The price of the additional fee.
   */
  public MoneyBag getPrice() {
    return price;
  }

  public void setPrice(MoneyBag price) {
    this.price = price;
  }

  /**
   * A list of taxes charged on the additional fee.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  @Override
  public String toString() {
    return "AdditionalFee{id='" + id + "', name='" + name + "', price='" + price + "', taxLines='" + taxLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AdditionalFee that = (AdditionalFee) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(price, that.price) &&
        Objects.equals(taxLines, that.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, taxLines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the additional fee.
     */
    private String name;

    /**
     * The price of the additional fee.
     */
    private MoneyBag price;

    /**
     * A list of taxes charged on the additional fee.
     */
    private List<TaxLine> taxLines;

    public AdditionalFee build() {
      AdditionalFee result = new AdditionalFee();
      result.id = this.id;
      result.name = this.name;
      result.price = this.price;
      result.taxLines = this.taxLines;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the additional fee.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The price of the additional fee.
     */
    public Builder price(MoneyBag price) {
      this.price = price;
      return this;
    }

    /**
     * A list of taxes charged on the additional fee.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }
  }
}
