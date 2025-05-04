package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A code that a customer can use at checkout to receive a discount. For example, a
 * customer can use the redeem code 'SUMMER20' at checkout to receive a 20%
 * discount on their entire order.
 */
public class DiscountRedeemCode {
  /**
   * The number of times that the discount redeem code has been used. This value is
   * updated asynchronously and can be different than the actual usage count.
   */
  private int asyncUsageCount;

  /**
   * The code that a customer can use at checkout to receive a discount.
   */
  private String code;

  /**
   * The application that created the discount redeem code.
   */
  private App createdBy;

  /**
   * A globally-unique ID of the discount redeem code.
   */
  private String id;

  public DiscountRedeemCode() {
  }

  /**
   * The number of times that the discount redeem code has been used. This value is
   * updated asynchronously and can be different than the actual usage count.
   */
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  /**
   * The code that a customer can use at checkout to receive a discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The application that created the discount redeem code.
   */
  public App getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(App createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * A globally-unique ID of the discount redeem code.
   */
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
    /**
     * The number of times that the discount redeem code has been used. This value is
     * updated asynchronously and can be different than the actual usage count.
     */
    private int asyncUsageCount;

    /**
     * The code that a customer can use at checkout to receive a discount.
     */
    private String code;

    /**
     * The application that created the discount redeem code.
     */
    private App createdBy;

    /**
     * A globally-unique ID of the discount redeem code.
     */
    private String id;

    public DiscountRedeemCode build() {
      DiscountRedeemCode result = new DiscountRedeemCode();
      result.asyncUsageCount = this.asyncUsageCount;
      result.code = this.code;
      result.createdBy = this.createdBy;
      result.id = this.id;
      return result;
    }

    /**
     * The number of times that the discount redeem code has been used. This value is
     * updated asynchronously and can be different than the actual usage count.
     */
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    /**
     * The code that a customer can use at checkout to receive a discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The application that created the discount redeem code.
     */
    public Builder createdBy(App createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * A globally-unique ID of the discount redeem code.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
