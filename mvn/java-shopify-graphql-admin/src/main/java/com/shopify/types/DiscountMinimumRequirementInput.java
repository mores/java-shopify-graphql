package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountMinimumRequirementInput {
  
  private DiscountMinimumQuantityInput quantity;

  
  private DiscountMinimumSubtotalInput subtotal;

  public DiscountMinimumRequirementInput() {
  }

  
  public DiscountMinimumQuantityInput getQuantity() {
    return quantity;
  }

  public void setQuantity(DiscountMinimumQuantityInput quantity) {
    this.quantity = quantity;
  }

  
  public DiscountMinimumSubtotalInput getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(DiscountMinimumSubtotalInput subtotal) {
    this.subtotal = subtotal;
  }

  @Override
  public String toString() {
    return "DiscountMinimumRequirementInput{quantity='" + quantity + "', subtotal='" + subtotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMinimumRequirementInput that = (DiscountMinimumRequirementInput) o;
    return Objects.equals(quantity, that.quantity) &&
        Objects.equals(subtotal, that.subtotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, subtotal);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountMinimumQuantityInput quantity;

    
    private DiscountMinimumSubtotalInput subtotal;

    public DiscountMinimumRequirementInput build() {
      DiscountMinimumRequirementInput result = new DiscountMinimumRequirementInput();
      result.quantity = this.quantity;
      result.subtotal = this.subtotal;
      return result;
    }

    
    public Builder quantity(DiscountMinimumQuantityInput quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder subtotal(DiscountMinimumSubtotalInput subtotal) {
      this.subtotal = subtotal;
      return this;
    }
  }
}
