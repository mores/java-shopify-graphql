package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RefundShippingLine implements com.shopify.types.Node {
  
  private String id;

  
  private ShippingLine shippingLine;

  
  private MoneyBag subtotalAmountSet;

  
  private MoneyBag taxAmountSet;

  public RefundShippingLine() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  
  public MoneyBag getSubtotalAmountSet() {
    return subtotalAmountSet;
  }

  public void setSubtotalAmountSet(MoneyBag subtotalAmountSet) {
    this.subtotalAmountSet = subtotalAmountSet;
  }

  
  public MoneyBag getTaxAmountSet() {
    return taxAmountSet;
  }

  public void setTaxAmountSet(MoneyBag taxAmountSet) {
    this.taxAmountSet = taxAmountSet;
  }

  @Override
  public String toString() {
    return "RefundShippingLine{id='" + id + "', shippingLine='" + shippingLine + "', subtotalAmountSet='" + subtotalAmountSet + "', taxAmountSet='" + taxAmountSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundShippingLine that = (RefundShippingLine) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(subtotalAmountSet, that.subtotalAmountSet) &&
        Objects.equals(taxAmountSet, that.taxAmountSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shippingLine, subtotalAmountSet, taxAmountSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private ShippingLine shippingLine;

    
    private MoneyBag subtotalAmountSet;

    
    private MoneyBag taxAmountSet;

    public RefundShippingLine build() {
      RefundShippingLine result = new RefundShippingLine();
      result.id = this.id;
      result.shippingLine = this.shippingLine;
      result.subtotalAmountSet = this.subtotalAmountSet;
      result.taxAmountSet = this.taxAmountSet;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    
    public Builder subtotalAmountSet(MoneyBag subtotalAmountSet) {
      this.subtotalAmountSet = subtotalAmountSet;
      return this;
    }

    
    public Builder taxAmountSet(MoneyBag taxAmountSet) {
      this.taxAmountSet = taxAmountSet;
      return this;
    }
  }
}
