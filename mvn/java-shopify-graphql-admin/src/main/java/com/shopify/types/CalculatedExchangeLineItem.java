package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CalculatedExchangeLineItem {
  
  private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

  
  private MoneyBag discountedUnitPriceSet;

  
  private String id;

  
  private MoneyBag originalUnitPriceSet;

  
  private int quantity;

  
  private MoneyBag subtotalSet;

  
  private MoneyBag totalTaxSet;

  
  private ProductVariant variant;

  public CalculatedExchangeLineItem() {
  }

  
  public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
    return calculatedDiscountAllocations;
  }

  public void setCalculatedDiscountAllocations(
      List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
    this.calculatedDiscountAllocations = calculatedDiscountAllocations;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "CalculatedExchangeLineItem{calculatedDiscountAllocations='" + calculatedDiscountAllocations + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', id='" + id + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', subtotalSet='" + subtotalSet + "', totalTaxSet='" + totalTaxSet + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedExchangeLineItem that = (CalculatedExchangeLineItem) o;
    return Objects.equals(calculatedDiscountAllocations, that.calculatedDiscountAllocations) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDiscountAllocations, discountedUnitPriceSet, id, originalUnitPriceSet, quantity, subtotalSet, totalTaxSet, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

    
    private MoneyBag discountedUnitPriceSet;

    
    private String id;

    
    private MoneyBag originalUnitPriceSet;

    
    private int quantity;

    
    private MoneyBag subtotalSet;

    
    private MoneyBag totalTaxSet;

    
    private ProductVariant variant;

    public CalculatedExchangeLineItem build() {
      CalculatedExchangeLineItem result = new CalculatedExchangeLineItem();
      result.calculatedDiscountAllocations = this.calculatedDiscountAllocations;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.id = this.id;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.subtotalSet = this.subtotalSet;
      result.totalTaxSet = this.totalTaxSet;
      result.variant = this.variant;
      return result;
    }

    
    public Builder calculatedDiscountAllocations(
        List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
      this.calculatedDiscountAllocations = calculatedDiscountAllocations;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
