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
public class AdditionalFee implements com.shopify.types.Node {
  
  private String id;

  
  private String name;

  
  private MoneyBag price;

  
  private List<TaxLine> taxLines;

  public AdditionalFee() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    
    private String id;

    
    private String name;

    
    private MoneyBag price;

    
    private List<TaxLine> taxLines;

    public AdditionalFee build() {
      AdditionalFee result = new AdditionalFee();
      result.id = this.id;
      result.name = this.name;
      result.price = this.price;
      result.taxLines = this.taxLines;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
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
