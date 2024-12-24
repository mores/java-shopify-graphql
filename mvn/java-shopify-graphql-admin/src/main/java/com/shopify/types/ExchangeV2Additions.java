package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ExchangeV2Additions {
  
  private List<ExchangeV2LineItem> lineItems;

  
  private MoneyBag subtotalPriceSet;

  
  private List<TaxLine> taxLines;

  
  private MoneyBag totalPriceSet;

  public ExchangeV2Additions() {
  }

  
  public List<ExchangeV2LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ExchangeV2LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  @Override
  public String toString() {
    return "ExchangeV2Additions{lineItems='" + lineItems + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', totalPriceSet='" + totalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2Additions that = (ExchangeV2Additions) o;
    return Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(totalPriceSet, that.totalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, subtotalPriceSet, taxLines, totalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ExchangeV2LineItem> lineItems;

    
    private MoneyBag subtotalPriceSet;

    
    private List<TaxLine> taxLines;

    
    private MoneyBag totalPriceSet;

    public ExchangeV2Additions build() {
      ExchangeV2Additions result = new ExchangeV2Additions();
      result.lineItems = this.lineItems;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.totalPriceSet = this.totalPriceSet;
      return result;
    }

    
    public Builder lineItems(List<ExchangeV2LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}
