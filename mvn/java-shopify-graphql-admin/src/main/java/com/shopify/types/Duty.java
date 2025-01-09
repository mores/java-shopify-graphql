package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The duty details for a line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Duty implements com.shopify.types.Node {
  /**
   * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
   */
  private CountryCode countryCodeOfOrigin;

  /**
   * The harmonized system code of the item used in calculating the duty.
   */
  private String harmonizedSystemCode;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The amount of the duty.
   */
  private MoneyBag price;

  /**
   * A list of taxes charged on the duty.
   */
  private List<TaxLine> taxLines;

  public Duty() {
  }

  /**
   * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
   */
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  /**
   * The harmonized system code of the item used in calculating the duty.
   */
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
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
   * The amount of the duty.
   */
  public MoneyBag getPrice() {
    return price;
  }

  public void setPrice(MoneyBag price) {
    this.price = price;
  }

  /**
   * A list of taxes charged on the duty.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  @Override
  public String toString() {
    return "Duty{countryCodeOfOrigin='" + countryCodeOfOrigin + "', harmonizedSystemCode='" + harmonizedSystemCode + "', id='" + id + "', price='" + price + "', taxLines='" + taxLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Duty that = (Duty) o;
    return Objects.equals(countryCodeOfOrigin, that.countryCodeOfOrigin) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(price, that.price) &&
        Objects.equals(taxLines, that.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodeOfOrigin, harmonizedSystemCode, id, price, taxLines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
     */
    private CountryCode countryCodeOfOrigin;

    /**
     * The harmonized system code of the item used in calculating the duty.
     */
    private String harmonizedSystemCode;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The amount of the duty.
     */
    private MoneyBag price;

    /**
     * A list of taxes charged on the duty.
     */
    private List<TaxLine> taxLines;

    public Duty build() {
      Duty result = new Duty();
      result.countryCodeOfOrigin = this.countryCodeOfOrigin;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.id = this.id;
      result.price = this.price;
      result.taxLines = this.taxLines;
      return result;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
     */
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    /**
     * The harmonized system code of the item used in calculating the duty.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
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
     * The amount of the duty.
     */
    public Builder price(MoneyBag price) {
      this.price = price;
      return this;
    }

    /**
     * A list of taxes charged on the duty.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }
  }
}
