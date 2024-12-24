package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountRedeemCode {
  
  private int asyncUsageCount;

  
  private String code;

  
  private App createdBy;

  
  private String id;

  public DiscountRedeemCode() {
  }

  
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public App getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(App createdBy) {
    this.createdBy = createdBy;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCode{asyncUsageCount='" + asyncUsageCount + "', code='" + code + "', createdBy='" + createdBy + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCode that = (DiscountRedeemCode) o;
    return asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(code, that.code) &&
        Objects.equals(createdBy, that.createdBy) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncUsageCount, code, createdBy, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int asyncUsageCount;

    
    private String code;

    
    private App createdBy;

    
    private String id;

    public DiscountRedeemCode build() {
      DiscountRedeemCode result = new DiscountRedeemCode();
      result.asyncUsageCount = this.asyncUsageCount;
      result.code = this.code;
      result.createdBy = this.createdBy;
      result.id = this.id;
      return result;
    }

    
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder createdBy(App createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
