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
public class AppCredit implements com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private OffsetDateTime createdAt;

  
  private String description;

  
  private String id;

  
  private boolean test;

  public AppCredit() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
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

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  @Override
  public String toString() {
    return "AppCredit{amount='" + amount + "', createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', test='" + test + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppCredit that = (AppCredit) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        test == that.test;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, description, id, test);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private OffsetDateTime createdAt;

    
    private String description;

    
    private String id;

    
    private boolean test;

    public AppCredit build() {
      AppCredit result = new AppCredit();
      result.amount = this.amount;
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.test = this.test;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
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

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }
  }
}
