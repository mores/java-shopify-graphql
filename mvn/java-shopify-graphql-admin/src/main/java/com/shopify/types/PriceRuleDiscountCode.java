package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRuleDiscountCode implements com.shopify.types.Node {
  
  private App app;

  
  private String code;

  
  private String id;

  
  private int usageCount;

  public PriceRuleDiscountCode() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  @Override
  public String toString() {
    return "PriceRuleDiscountCode{app='" + app + "', code='" + code + "', id='" + id + "', usageCount='" + usageCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleDiscountCode that = (PriceRuleDiscountCode) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(code, that.code) &&
        Objects.equals(id, that.id) &&
        usageCount == that.usageCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, code, id, usageCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private String code;

    
    private String id;

    
    private int usageCount;

    public PriceRuleDiscountCode build() {
      PriceRuleDiscountCode result = new PriceRuleDiscountCode();
      result.app = this.app;
      result.code = this.code;
      result.id = this.id;
      result.usageCount = this.usageCount;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }
  }
}
