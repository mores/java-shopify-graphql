package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticBasic implements Discount, DiscountAutomatic {
  
  private int asyncUsageCount;

  
  private DiscountCombinesWith combinesWith;

  
  private OffsetDateTime createdAt;

  
  private DiscountCustomerGets customerGets;

  
  private MerchandiseDiscountClass discountClass;

  
  private OffsetDateTime endsAt;

  
  private DiscountMinimumRequirement minimumRequirement;

  
  private int recurringCycleLimit;

  
  private String shortSummary;

  
  private OffsetDateTime startsAt;

  
  private DiscountStatus status;

  
  private String summary;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  
  private int usageCount;

  public DiscountAutomaticBasic() {
  }

  
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public DiscountCustomerGets getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGets customerGets) {
    this.customerGets = customerGets;
  }

  
  public MerchandiseDiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(MerchandiseDiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  
  public DiscountMinimumRequirement getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirement minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public String getShortSummary() {
    return shortSummary;
  }

  public void setShortSummary(String shortSummary) {
    this.shortSummary = shortSummary;
  }

  
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  
  public DiscountStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountStatus status) {
    this.status = status;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBasic{asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerGets='" + customerGets + "', discountClass='" + discountClass + "', endsAt='" + endsAt + "', minimumRequirement='" + minimumRequirement + "', recurringCycleLimit='" + recurringCycleLimit + "', shortSummary='" + shortSummary + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', updatedAt='" + updatedAt + "', usageCount='" + usageCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBasic that = (DiscountAutomaticBasic) o;
    return asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        recurringCycleLimit == that.recurringCycleLimit &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        usageCount == that.usageCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncUsageCount, combinesWith, createdAt, customerGets, discountClass, endsAt, minimumRequirement, recurringCycleLimit, shortSummary, startsAt, status, summary, title, updatedAt, usageCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int asyncUsageCount;

    
    private DiscountCombinesWith combinesWith;

    
    private OffsetDateTime createdAt;

    
    private DiscountCustomerGets customerGets;

    
    private MerchandiseDiscountClass discountClass;

    
    private OffsetDateTime endsAt;

    
    private DiscountMinimumRequirement minimumRequirement;

    
    private int recurringCycleLimit;

    
    private String shortSummary;

    
    private OffsetDateTime startsAt;

    
    private DiscountStatus status;

    
    private String summary;

    
    private String title;

    
    private OffsetDateTime updatedAt;

    
    private int usageCount;

    public DiscountAutomaticBasic build() {
      DiscountAutomaticBasic result = new DiscountAutomaticBasic();
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerGets = this.customerGets;
      result.discountClass = this.discountClass;
      result.endsAt = this.endsAt;
      result.minimumRequirement = this.minimumRequirement;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shortSummary = this.shortSummary;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      result.usageCount = this.usageCount;
      return result;
    }

    
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customerGets(DiscountCustomerGets customerGets) {
      this.customerGets = customerGets;
      return this;
    }

    
    public Builder discountClass(MerchandiseDiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    
    public Builder minimumRequirement(DiscountMinimumRequirement minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder shortSummary(String shortSummary) {
      this.shortSummary = shortSummary;
      return this;
    }

    
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    
    public Builder status(DiscountStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }
  }
}
