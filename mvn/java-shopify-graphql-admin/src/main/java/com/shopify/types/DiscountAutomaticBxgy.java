package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticBxgy implements Discount, DiscountAutomatic, com.shopify.types.HasEvents, com.shopify.types.Node {
  
  private int asyncUsageCount;

  
  private DiscountCombinesWith combinesWith;

  
  private OffsetDateTime createdAt;

  
  private DiscountCustomerBuys customerBuys;

  
  private DiscountCustomerGets customerGets;

  
  private MerchandiseDiscountClass discountClass;

  
  private OffsetDateTime endsAt;

  
  private EventConnection events;

  
  private String id;

  
  private OffsetDateTime startsAt;

  
  private DiscountStatus status;

  
  private String summary;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  
  private int usageCount;

  
  private Integer usesPerOrderLimit;

  public DiscountAutomaticBxgy() {
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

  
  public DiscountCustomerBuys getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuys customerBuys) {
    this.customerBuys = customerBuys;
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

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  
  public Integer getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(Integer usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBxgy{asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "', discountClass='" + discountClass + "', endsAt='" + endsAt + "', events='" + events + "', id='" + id + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', updatedAt='" + updatedAt + "', usageCount='" + usageCount + "', usesPerOrderLimit='" + usesPerOrderLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgy that = (DiscountAutomaticBxgy) o;
    return asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(events, that.events) &&
        Objects.equals(id, that.id) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        usageCount == that.usageCount &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncUsageCount, combinesWith, createdAt, customerBuys, customerGets, discountClass, endsAt, events, id, startsAt, status, summary, title, updatedAt, usageCount, usesPerOrderLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int asyncUsageCount;

    
    private DiscountCombinesWith combinesWith;

    
    private OffsetDateTime createdAt;

    
    private DiscountCustomerBuys customerBuys;

    
    private DiscountCustomerGets customerGets;

    
    private MerchandiseDiscountClass discountClass;

    
    private OffsetDateTime endsAt;

    
    private EventConnection events;

    
    private String id;

    
    private OffsetDateTime startsAt;

    
    private DiscountStatus status;

    
    private String summary;

    
    private String title;

    
    private OffsetDateTime updatedAt;

    
    private int usageCount;

    
    private Integer usesPerOrderLimit;

    public DiscountAutomaticBxgy build() {
      DiscountAutomaticBxgy result = new DiscountAutomaticBxgy();
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      result.discountClass = this.discountClass;
      result.endsAt = this.endsAt;
      result.events = this.events;
      result.id = this.id;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      result.usageCount = this.usageCount;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
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

    
    public Builder customerBuys(DiscountCustomerBuys customerBuys) {
      this.customerBuys = customerBuys;
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

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
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

    
    public Builder usesPerOrderLimit(Integer usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }
  }
}
