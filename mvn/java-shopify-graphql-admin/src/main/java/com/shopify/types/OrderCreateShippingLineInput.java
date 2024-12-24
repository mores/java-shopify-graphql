package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderCreateShippingLineInput {
  
  private String code;

  
  private MoneyBagInput priceSet;

  
  private String source;

  
  private List<OrderCreateTaxLineInput> taxLines;

  
  private String title;

  public OrderCreateShippingLineInput() {
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
  public List<OrderCreateTaxLineInput> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
    this.taxLines = taxLines;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderCreateShippingLineInput{code='" + code + "', priceSet='" + priceSet + "', source='" + source + "', taxLines='" + taxLines + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateShippingLineInput that = (OrderCreateShippingLineInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(source, that.source) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, priceSet, source, taxLines, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private MoneyBagInput priceSet;

    
    private String source;

    
    private List<OrderCreateTaxLineInput> taxLines;

    
    private String title;

    public OrderCreateShippingLineInput build() {
      OrderCreateShippingLineInput result = new OrderCreateShippingLineInput();
      result.code = this.code;
      result.priceSet = this.priceSet;
      result.source = this.source;
      result.taxLines = this.taxLines;
      result.title = this.title;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder taxLines(List<OrderCreateTaxLineInput> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
