package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SaleTax {
  
  private MoneyBag amount;

  
  private String id;

  
  private TaxLine taxLine;

  public SaleTax() {
  }

  
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public TaxLine getTaxLine() {
    return taxLine;
  }

  public void setTaxLine(TaxLine taxLine) {
    this.taxLine = taxLine;
  }

  @Override
  public String toString() {
    return "SaleTax{amount='" + amount + "', id='" + id + "', taxLine='" + taxLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SaleTax that = (SaleTax) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(taxLine, that.taxLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, taxLine);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag amount;

    
    private String id;

    
    private TaxLine taxLine;

    public SaleTax build() {
      SaleTax result = new SaleTax();
      result.amount = this.amount;
      result.id = this.id;
      result.taxLine = this.taxLine;
      return result;
    }

    
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder taxLine(TaxLine taxLine) {
      this.taxLine = taxLine;
      return this;
    }
  }
}
