package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class QuantityPricingByVariantUpdateInput {
  
  private List<QuantityPriceBreakInput> quantityPriceBreaksToAdd;

  
  private List<String> quantityPriceBreaksToDelete;

  
  private List<QuantityRuleInput> quantityRulesToAdd;

  
  private List<String> quantityRulesToDeleteByVariantId;

  
  private List<PriceListPriceInput> pricesToAdd;

  
  private List<String> pricesToDeleteByVariantId;

  public QuantityPricingByVariantUpdateInput() {
  }

  
  public List<QuantityPriceBreakInput> getQuantityPriceBreaksToAdd() {
    return quantityPriceBreaksToAdd;
  }

  public void setQuantityPriceBreaksToAdd(List<QuantityPriceBreakInput> quantityPriceBreaksToAdd) {
    this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;
  }

  
  public List<String> getQuantityPriceBreaksToDelete() {
    return quantityPriceBreaksToDelete;
  }

  public void setQuantityPriceBreaksToDelete(List<String> quantityPriceBreaksToDelete) {
    this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;
  }

  
  public List<QuantityRuleInput> getQuantityRulesToAdd() {
    return quantityRulesToAdd;
  }

  public void setQuantityRulesToAdd(List<QuantityRuleInput> quantityRulesToAdd) {
    this.quantityRulesToAdd = quantityRulesToAdd;
  }

  
  public List<String> getQuantityRulesToDeleteByVariantId() {
    return quantityRulesToDeleteByVariantId;
  }

  public void setQuantityRulesToDeleteByVariantId(List<String> quantityRulesToDeleteByVariantId) {
    this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;
  }

  
  public List<PriceListPriceInput> getPricesToAdd() {
    return pricesToAdd;
  }

  public void setPricesToAdd(List<PriceListPriceInput> pricesToAdd) {
    this.pricesToAdd = pricesToAdd;
  }

  
  public List<String> getPricesToDeleteByVariantId() {
    return pricesToDeleteByVariantId;
  }

  public void setPricesToDeleteByVariantId(List<String> pricesToDeleteByVariantId) {
    this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
  }

  @Override
  public String toString() {
    return "QuantityPricingByVariantUpdateInput{quantityPriceBreaksToAdd='" + quantityPriceBreaksToAdd + "', quantityPriceBreaksToDelete='" + quantityPriceBreaksToDelete + "', quantityRulesToAdd='" + quantityRulesToAdd + "', quantityRulesToDeleteByVariantId='" + quantityRulesToDeleteByVariantId + "', pricesToAdd='" + pricesToAdd + "', pricesToDeleteByVariantId='" + pricesToDeleteByVariantId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPricingByVariantUpdateInput that = (QuantityPricingByVariantUpdateInput) o;
    return Objects.equals(quantityPriceBreaksToAdd, that.quantityPriceBreaksToAdd) &&
        Objects.equals(quantityPriceBreaksToDelete, that.quantityPriceBreaksToDelete) &&
        Objects.equals(quantityRulesToAdd, that.quantityRulesToAdd) &&
        Objects.equals(quantityRulesToDeleteByVariantId, that.quantityRulesToDeleteByVariantId) &&
        Objects.equals(pricesToAdd, that.pricesToAdd) &&
        Objects.equals(pricesToDeleteByVariantId, that.pricesToDeleteByVariantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityPriceBreaksToAdd, quantityPriceBreaksToDelete, quantityRulesToAdd, quantityRulesToDeleteByVariantId, pricesToAdd, pricesToDeleteByVariantId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<QuantityPriceBreakInput> quantityPriceBreaksToAdd;

    
    private List<String> quantityPriceBreaksToDelete;

    
    private List<QuantityRuleInput> quantityRulesToAdd;

    
    private List<String> quantityRulesToDeleteByVariantId;

    
    private List<PriceListPriceInput> pricesToAdd;

    
    private List<String> pricesToDeleteByVariantId;

    public QuantityPricingByVariantUpdateInput build() {
      QuantityPricingByVariantUpdateInput result = new QuantityPricingByVariantUpdateInput();
      result.quantityPriceBreaksToAdd = this.quantityPriceBreaksToAdd;
      result.quantityPriceBreaksToDelete = this.quantityPriceBreaksToDelete;
      result.quantityRulesToAdd = this.quantityRulesToAdd;
      result.quantityRulesToDeleteByVariantId = this.quantityRulesToDeleteByVariantId;
      result.pricesToAdd = this.pricesToAdd;
      result.pricesToDeleteByVariantId = this.pricesToDeleteByVariantId;
      return result;
    }

    
    public Builder quantityPriceBreaksToAdd(
        List<QuantityPriceBreakInput> quantityPriceBreaksToAdd) {
      this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;
      return this;
    }

    
    public Builder quantityPriceBreaksToDelete(List<String> quantityPriceBreaksToDelete) {
      this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;
      return this;
    }

    
    public Builder quantityRulesToAdd(List<QuantityRuleInput> quantityRulesToAdd) {
      this.quantityRulesToAdd = quantityRulesToAdd;
      return this;
    }

    
    public Builder quantityRulesToDeleteByVariantId(List<String> quantityRulesToDeleteByVariantId) {
      this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;
      return this;
    }

    
    public Builder pricesToAdd(List<PriceListPriceInput> pricesToAdd) {
      this.pricesToAdd = pricesToAdd;
      return this;
    }

    
    public Builder pricesToDeleteByVariantId(List<String> pricesToDeleteByVariantId) {
      this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
      return this;
    }
  }
}
