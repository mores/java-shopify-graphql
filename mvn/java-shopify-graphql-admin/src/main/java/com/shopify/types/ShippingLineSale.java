package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLineSale implements com.shopify.types.Sale {
  
  private SaleActionType actionType;

  
  private String id;

  
  private SaleLineType lineType;

  
  private Integer quantity;

  
  private ShippingLine shippingLine;

  
  private List<SaleTax> taxes;

  
  private MoneyBag totalAmount;

  
  private MoneyBag totalDiscountAmountAfterTaxes;

  
  private MoneyBag totalDiscountAmountBeforeTaxes;

  
  private MoneyBag totalTaxAmount;

  public ShippingLineSale() {
  }

  
  public SaleActionType getActionType() {
    return actionType;
  }

  public void setActionType(SaleActionType actionType) {
    this.actionType = actionType;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public SaleLineType getLineType() {
    return lineType;
  }

  public void setLineType(SaleLineType lineType) {
    this.lineType = lineType;
  }

  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  
  public List<SaleTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<SaleTax> taxes) {
    this.taxes = taxes;
  }

  
  public MoneyBag getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyBag totalAmount) {
    this.totalAmount = totalAmount;
  }

  
  public MoneyBag getTotalDiscountAmountAfterTaxes() {
    return totalDiscountAmountAfterTaxes;
  }

  public void setTotalDiscountAmountAfterTaxes(MoneyBag totalDiscountAmountAfterTaxes) {
    this.totalDiscountAmountAfterTaxes = totalDiscountAmountAfterTaxes;
  }

  
  public MoneyBag getTotalDiscountAmountBeforeTaxes() {
    return totalDiscountAmountBeforeTaxes;
  }

  public void setTotalDiscountAmountBeforeTaxes(MoneyBag totalDiscountAmountBeforeTaxes) {
    this.totalDiscountAmountBeforeTaxes = totalDiscountAmountBeforeTaxes;
  }

  
  public MoneyBag getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(MoneyBag totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  @Override
  public String toString() {
    return "ShippingLineSale{actionType='" + actionType + "', id='" + id + "', lineType='" + lineType + "', quantity='" + quantity + "', shippingLine='" + shippingLine + "', taxes='" + taxes + "', totalAmount='" + totalAmount + "', totalDiscountAmountAfterTaxes='" + totalDiscountAmountAfterTaxes + "', totalDiscountAmountBeforeTaxes='" + totalDiscountAmountBeforeTaxes + "', totalTaxAmount='" + totalTaxAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLineSale that = (ShippingLineSale) o;
    return Objects.equals(actionType, that.actionType) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineType, that.lineType) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(taxes, that.taxes) &&
        Objects.equals(totalAmount, that.totalAmount) &&
        Objects.equals(totalDiscountAmountAfterTaxes, that.totalDiscountAmountAfterTaxes) &&
        Objects.equals(totalDiscountAmountBeforeTaxes, that.totalDiscountAmountBeforeTaxes) &&
        Objects.equals(totalTaxAmount, that.totalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, id, lineType, quantity, shippingLine, taxes, totalAmount, totalDiscountAmountAfterTaxes, totalDiscountAmountBeforeTaxes, totalTaxAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SaleActionType actionType;

    
    private String id;

    
    private SaleLineType lineType;

    
    private Integer quantity;

    
    private ShippingLine shippingLine;

    
    private List<SaleTax> taxes;

    
    private MoneyBag totalAmount;

    
    private MoneyBag totalDiscountAmountAfterTaxes;

    
    private MoneyBag totalDiscountAmountBeforeTaxes;

    
    private MoneyBag totalTaxAmount;

    public ShippingLineSale build() {
      ShippingLineSale result = new ShippingLineSale();
      result.actionType = this.actionType;
      result.id = this.id;
      result.lineType = this.lineType;
      result.quantity = this.quantity;
      result.shippingLine = this.shippingLine;
      result.taxes = this.taxes;
      result.totalAmount = this.totalAmount;
      result.totalDiscountAmountAfterTaxes = this.totalDiscountAmountAfterTaxes;
      result.totalDiscountAmountBeforeTaxes = this.totalDiscountAmountBeforeTaxes;
      result.totalTaxAmount = this.totalTaxAmount;
      return result;
    }

    
    public Builder actionType(SaleActionType actionType) {
      this.actionType = actionType;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineType(SaleLineType lineType) {
      this.lineType = lineType;
      return this;
    }

    
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    
    public Builder taxes(List<SaleTax> taxes) {
      this.taxes = taxes;
      return this;
    }

    
    public Builder totalAmount(MoneyBag totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    
    public Builder totalDiscountAmountAfterTaxes(MoneyBag totalDiscountAmountAfterTaxes) {
      this.totalDiscountAmountAfterTaxes = totalDiscountAmountAfterTaxes;
      return this;
    }

    
    public Builder totalDiscountAmountBeforeTaxes(MoneyBag totalDiscountAmountBeforeTaxes) {
      this.totalDiscountAmountBeforeTaxes = totalDiscountAmountBeforeTaxes;
      return this;
    }

    
    public Builder totalTaxAmount(MoneyBag totalTaxAmount) {
      this.totalTaxAmount = totalTaxAmount;
      return this;
    }
  }
}
