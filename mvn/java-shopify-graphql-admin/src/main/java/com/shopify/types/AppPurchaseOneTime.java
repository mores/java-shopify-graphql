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
public class AppPurchaseOneTime implements com.shopify.types.AppPurchase, com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String name;

  
  private MoneyV2 price;

  
  private AppPurchaseStatus status;

  
  private boolean test;

  public AppPurchaseOneTime() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  
  public AppPurchaseStatus getStatus() {
    return status;
  }

  public void setStatus(AppPurchaseStatus status) {
    this.status = status;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  @Override
  public String toString() {
    return "AppPurchaseOneTime{createdAt='" + createdAt + "', id='" + id + "', name='" + name + "', price='" + price + "', status='" + status + "', test='" + test + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPurchaseOneTime that = (AppPurchaseOneTime) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(price, that.price) &&
        Objects.equals(status, that.status) &&
        test == that.test;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, price, status, test);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String name;

    
    private MoneyV2 price;

    
    private AppPurchaseStatus status;

    
    private boolean test;

    public AppPurchaseOneTime build() {
      AppPurchaseOneTime result = new AppPurchaseOneTime();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.name = this.name;
      result.price = this.price;
      result.status = this.status;
      result.test = this.test;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    
    public Builder status(AppPurchaseStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }
  }
}
