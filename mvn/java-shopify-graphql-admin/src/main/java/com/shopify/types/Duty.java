package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Duty implements com.shopify.types.Node {
  
  private CountryCode countryCodeOfOrigin;

  
  private String harmonizedSystemCode;

  
  private String id;

  
  private MoneyBag price;

  
  private List<TaxLine> taxLines;

  public Duty() {
  }

  
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyBag getPrice() {
    return price;
  }

  public void setPrice(MoneyBag price) {
    this.price = price;
  }

  
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
    
    private CountryCode countryCodeOfOrigin;

    
    private String harmonizedSystemCode;

    
    private String id;

    
    private MoneyBag price;

    
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

    
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder price(MoneyBag price) {
      this.price = price;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }
  }
}
