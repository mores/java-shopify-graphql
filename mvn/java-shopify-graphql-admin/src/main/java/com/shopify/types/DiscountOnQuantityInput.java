package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountOnQuantityInput {
  
  private String quantity;

  
  private DiscountEffectInput effect;

  public DiscountOnQuantityInput() {
  }

  
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  public DiscountEffectInput getEffect() {
    return effect;
  }

  public void setEffect(DiscountEffectInput effect) {
    this.effect = effect;
  }

  @Override
  public String toString() {
    return "DiscountOnQuantityInput{quantity='" + quantity + "', effect='" + effect + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountOnQuantityInput that = (DiscountOnQuantityInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(effect, that.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, effect);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String quantity;

    
    private DiscountEffectInput effect;

    public DiscountOnQuantityInput build() {
      DiscountOnQuantityInput result = new DiscountOnQuantityInput();
      result.quantity = this.quantity;
      result.effect = this.effect;
      return result;
    }

    
    public Builder quantity(String quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder effect(DiscountEffectInput effect) {
      this.effect = effect;
      return this;
    }
  }
}
