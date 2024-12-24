package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionManualDiscountInput {
  
  private String title;

  
  private SubscriptionManualDiscountValueInput value;

  
  private Integer recurringCycleLimit;

  
  private SubscriptionManualDiscountEntitledLinesInput entitledLines;

  public SubscriptionManualDiscountInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public SubscriptionManualDiscountValueInput getValue() {
    return value;
  }

  public void setValue(SubscriptionManualDiscountValueInput value) {
    this.value = value;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public SubscriptionManualDiscountEntitledLinesInput getEntitledLines() {
    return entitledLines;
  }

  public void setEntitledLines(SubscriptionManualDiscountEntitledLinesInput entitledLines) {
    this.entitledLines = entitledLines;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountInput{title='" + title + "', value='" + value + "', recurringCycleLimit='" + recurringCycleLimit + "', entitledLines='" + entitledLines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountInput that = (SubscriptionManualDiscountInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(value, that.value) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(entitledLines, that.entitledLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, recurringCycleLimit, entitledLines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private SubscriptionManualDiscountValueInput value;

    
    private Integer recurringCycleLimit;

    
    private SubscriptionManualDiscountEntitledLinesInput entitledLines;

    public SubscriptionManualDiscountInput build() {
      SubscriptionManualDiscountInput result = new SubscriptionManualDiscountInput();
      result.title = this.title;
      result.value = this.value;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.entitledLines = this.entitledLines;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder value(SubscriptionManualDiscountValueInput value) {
      this.value = value;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder entitledLines(SubscriptionManualDiscountEntitledLinesInput entitledLines) {
      this.entitledLines = entitledLines;
      return this;
    }
  }
}
