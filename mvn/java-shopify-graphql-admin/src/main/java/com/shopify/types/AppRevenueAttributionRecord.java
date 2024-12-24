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
public class AppRevenueAttributionRecord implements com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private OffsetDateTime capturedAt;

  
  private OffsetDateTime createdAt;

  
  private String id;

  
  private String idempotencyKey;

  
  private boolean test;

  
  private AppRevenueAttributionType type;

  public AppRevenueAttributionRecord() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public OffsetDateTime getCapturedAt() {
    return capturedAt;
  }

  public void setCapturedAt(OffsetDateTime capturedAt) {
    this.capturedAt = capturedAt;
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

  
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  
  public AppRevenueAttributionType getType() {
    return type;
  }

  public void setType(AppRevenueAttributionType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "AppRevenueAttributionRecord{amount='" + amount + "', capturedAt='" + capturedAt + "', createdAt='" + createdAt + "', id='" + id + "', idempotencyKey='" + idempotencyKey + "', test='" + test + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppRevenueAttributionRecord that = (AppRevenueAttributionRecord) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(capturedAt, that.capturedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(idempotencyKey, that.idempotencyKey) &&
        test == that.test &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, capturedAt, createdAt, id, idempotencyKey, test, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private OffsetDateTime capturedAt;

    
    private OffsetDateTime createdAt;

    
    private String id;

    
    private String idempotencyKey;

    
    private boolean test;

    
    private AppRevenueAttributionType type;

    public AppRevenueAttributionRecord build() {
      AppRevenueAttributionRecord result = new AppRevenueAttributionRecord();
      result.amount = this.amount;
      result.capturedAt = this.capturedAt;
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.idempotencyKey = this.idempotencyKey;
      result.test = this.test;
      result.type = this.type;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder capturedAt(OffsetDateTime capturedAt) {
      this.capturedAt = capturedAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder type(AppRevenueAttributionType type) {
      this.type = type;
      return this;
    }
  }
}
