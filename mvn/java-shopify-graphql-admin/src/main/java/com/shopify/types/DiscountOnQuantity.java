package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountOnQuantity implements DiscountCustomerGetsValue {
  
  private DiscountEffect effect;

  
  private DiscountQuantity quantity;

  public DiscountOnQuantity() {
  }

  
  public DiscountEffect getEffect() {
    return effect;
  }

  public void setEffect(DiscountEffect effect) {
    this.effect = effect;
  }

  
  public DiscountQuantity getQuantity() {
    return quantity;
  }

  public void setQuantity(DiscountQuantity quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "DiscountOnQuantity{effect='" + effect + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountOnQuantity that = (DiscountOnQuantity) o;
    return Objects.equals(effect, that.effect) &&
        Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountEffect effect;

    
    private DiscountQuantity quantity;

    public DiscountOnQuantity build() {
      DiscountOnQuantity result = new DiscountOnQuantity();
      result.effect = this.effect;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder effect(DiscountEffect effect) {
      this.effect = effect;
      return this;
    }

    
    public Builder quantity(DiscountQuantity quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
