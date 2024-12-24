package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CalculatedReturnLineItem {
  
  private FulfillmentLineItem fulfillmentLineItem;

  
  private String id;

  
  private int quantity;

  
  private CalculatedRestockingFee restockingFee;

  
  private MoneyBag subtotalBeforeOrderDiscountsSet;

  
  private MoneyBag subtotalSet;

  
  private MoneyBag totalTaxSet;

  public CalculatedReturnLineItem() {
  }

  
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public CalculatedRestockingFee getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(CalculatedRestockingFee restockingFee) {
    this.restockingFee = restockingFee;
  }

  
  public MoneyBag getSubtotalBeforeOrderDiscountsSet() {
    return subtotalBeforeOrderDiscountsSet;
  }

  public void setSubtotalBeforeOrderDiscountsSet(MoneyBag subtotalBeforeOrderDiscountsSet) {
    this.subtotalBeforeOrderDiscountsSet = subtotalBeforeOrderDiscountsSet;
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

  @Override
  public String toString() {
    return "CalculatedReturnLineItem{fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', quantity='" + quantity + "', restockingFee='" + restockingFee + "', subtotalBeforeOrderDiscountsSet='" + subtotalBeforeOrderDiscountsSet + "', subtotalSet='" + subtotalSet + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturnLineItem that = (CalculatedReturnLineItem) o;
    return Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(subtotalBeforeOrderDiscountsSet, that.subtotalBeforeOrderDiscountsSet) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItem, id, quantity, restockingFee, subtotalBeforeOrderDiscountsSet, subtotalSet, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentLineItem fulfillmentLineItem;

    
    private String id;

    
    private int quantity;

    
    private CalculatedRestockingFee restockingFee;

    
    private MoneyBag subtotalBeforeOrderDiscountsSet;

    
    private MoneyBag subtotalSet;

    
    private MoneyBag totalTaxSet;

    public CalculatedReturnLineItem build() {
      CalculatedReturnLineItem result = new CalculatedReturnLineItem();
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.quantity = this.quantity;
      result.restockingFee = this.restockingFee;
      result.subtotalBeforeOrderDiscountsSet = this.subtotalBeforeOrderDiscountsSet;
      result.subtotalSet = this.subtotalSet;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder restockingFee(CalculatedRestockingFee restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }

    
    public Builder subtotalBeforeOrderDiscountsSet(MoneyBag subtotalBeforeOrderDiscountsSet) {
      this.subtotalBeforeOrderDiscountsSet = subtotalBeforeOrderDiscountsSet;
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
  }
}
