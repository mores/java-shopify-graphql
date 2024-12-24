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
public class AppUsageRecord implements com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private String description;

  
  private String id;

  
  private String idempotencyKey;

  
  private MoneyV2 price;

  
  private AppSubscriptionLineItem subscriptionLineItem;

  public AppUsageRecord() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  
  public AppSubscriptionLineItem getSubscriptionLineItem() {
    return subscriptionLineItem;
  }

  public void setSubscriptionLineItem(AppSubscriptionLineItem subscriptionLineItem) {
    this.subscriptionLineItem = subscriptionLineItem;
  }

  @Override
  public String toString() {
    return "AppUsageRecord{createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', idempotencyKey='" + idempotencyKey + "', price='" + price + "', subscriptionLineItem='" + subscriptionLineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsageRecord that = (AppUsageRecord) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(idempotencyKey, that.idempotencyKey) &&
        Objects.equals(price, that.price) &&
        Objects.equals(subscriptionLineItem, that.subscriptionLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, idempotencyKey, price, subscriptionLineItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private String description;

    
    private String id;

    
    private String idempotencyKey;

    
    private MoneyV2 price;

    
    private AppSubscriptionLineItem subscriptionLineItem;

    public AppUsageRecord build() {
      AppUsageRecord result = new AppUsageRecord();
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.idempotencyKey = this.idempotencyKey;
      result.price = this.price;
      result.subscriptionLineItem = this.subscriptionLineItem;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    
    public Builder subscriptionLineItem(AppSubscriptionLineItem subscriptionLineItem) {
      this.subscriptionLineItem = subscriptionLineItem;
      return this;
    }
  }
}
