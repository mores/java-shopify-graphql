package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeApplication implements com.shopify.types.DiscountApplication {
  
  private DiscountApplicationAllocationMethod allocationMethod;

  
  private String code;

  
  private int index;

  
  private DiscountApplicationTargetSelection targetSelection;

  
  private DiscountApplicationTargetType targetType;

  
  private PricingValue value;

  public DiscountCodeApplication() {
  }

  
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  
  public PricingValue getValue() {
    return value;
  }

  public void setValue(PricingValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DiscountCodeApplication{allocationMethod='" + allocationMethod + "', code='" + code + "', index='" + index + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeApplication that = (DiscountCodeApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(code, that.code) &&
        index == that.index &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, code, index, targetSelection, targetType, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountApplicationAllocationMethod allocationMethod;

    
    private String code;

    
    private int index;

    
    private DiscountApplicationTargetSelection targetSelection;

    
    private DiscountApplicationTargetType targetType;

    
    private PricingValue value;

    public DiscountCodeApplication build() {
      DiscountCodeApplication result = new DiscountCodeApplication();
      result.allocationMethod = this.allocationMethod;
      result.code = this.code;
      result.index = this.index;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      result.value = this.value;
      return result;
    }

    
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder index(int index) {
      this.index = index;
      return this;
    }

    
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
