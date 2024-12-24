package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionManualDiscount implements SubscriptionDiscount {
  
  private SubscriptionDiscountEntitledLines entitledLines;

  
  private String id;

  
  private Integer recurringCycleLimit;

  
  private SubscriptionDiscountRejectionReason rejectionReason;

  
  private DiscountTargetType targetType;

  
  private String title;

  
  private DiscountType type;

  
  private int usageCount;

  
  private SubscriptionDiscountValue value;

  public SubscriptionManualDiscount() {
  }

  
  public SubscriptionDiscountEntitledLines getEntitledLines() {
    return entitledLines;
  }

  public void setEntitledLines(SubscriptionDiscountEntitledLines entitledLines) {
    this.entitledLines = entitledLines;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public SubscriptionDiscountRejectionReason getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  
  public DiscountTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountTargetType targetType) {
    this.targetType = targetType;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public DiscountType getType() {
    return type;
  }

  public void setType(DiscountType type) {
    this.type = type;
  }

  
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  
  public SubscriptionDiscountValue getValue() {
    return value;
  }

  public void setValue(SubscriptionDiscountValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscount{entitledLines='" + entitledLines + "', id='" + id + "', recurringCycleLimit='" + recurringCycleLimit + "', rejectionReason='" + rejectionReason + "', targetType='" + targetType + "', title='" + title + "', type='" + type + "', usageCount='" + usageCount + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscount that = (SubscriptionManualDiscount) o;
    return Objects.equals(entitledLines, that.entitledLines) &&
        Objects.equals(id, that.id) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(rejectionReason, that.rejectionReason) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(type, that.type) &&
        usageCount == that.usageCount &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitledLines, id, recurringCycleLimit, rejectionReason, targetType, title, type, usageCount, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionDiscountEntitledLines entitledLines;

    
    private String id;

    
    private Integer recurringCycleLimit;

    
    private SubscriptionDiscountRejectionReason rejectionReason;

    
    private DiscountTargetType targetType;

    
    private String title;

    
    private DiscountType type;

    
    private int usageCount;

    
    private SubscriptionDiscountValue value;

    public SubscriptionManualDiscount build() {
      SubscriptionManualDiscount result = new SubscriptionManualDiscount();
      result.entitledLines = this.entitledLines;
      result.id = this.id;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.rejectionReason = this.rejectionReason;
      result.targetType = this.targetType;
      result.title = this.title;
      result.type = this.type;
      result.usageCount = this.usageCount;
      result.value = this.value;
      return result;
    }

    
    public Builder entitledLines(SubscriptionDiscountEntitledLines entitledLines) {
      this.entitledLines = entitledLines;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder rejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
      this.rejectionReason = rejectionReason;
      return this;
    }

    
    public Builder targetType(DiscountTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder type(DiscountType type) {
      this.type = type;
      return this;
    }

    
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }

    
    public Builder value(SubscriptionDiscountValue value) {
      this.value = value;
      return this;
    }
  }
}
