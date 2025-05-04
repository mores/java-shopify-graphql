package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A discount code of a price rule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRuleDiscountCode implements com.shopify.admin.types.Node {
  /**
   * The application that created the discount code.
   */
  private App app;

  /**
   * The code to apply the discount.
   */
  private String code;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The number of times that the price rule has been used. This value is updated
   * asynchronously and can be different than the actual usage count.
   */
  private int usageCount;

  public PriceRuleDiscountCode() {
  }

  /**
   * The application that created the discount code.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The code to apply the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The number of times that the price rule has been used. This value is updated
   * asynchronously and can be different than the actual usage count.
   */
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
    /**
     * The application that created the discount code.
     */
    private App app;

    /**
     * The code to apply the discount.
     */
    private String code;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The number of times that the price rule has been used. This value is updated
     * asynchronously and can be different than the actual usage count.
     */
    private int usageCount;

    public PriceRuleDiscountCode build() {
      PriceRuleDiscountCode result = new PriceRuleDiscountCode();
      result.app = this.app;
      result.code = this.code;
      result.id = this.id;
      result.usageCount = this.usageCount;
      return result;
    }

    /**
     * The application that created the discount code.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The code to apply the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of times that the price rule has been used. This value is updated
     * asynchronously and can be different than the actual usage count.
     */
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }
  }
}
