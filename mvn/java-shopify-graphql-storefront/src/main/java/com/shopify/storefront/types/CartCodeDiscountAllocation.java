package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The discount that has been applied to the cart line using a discount code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartCodeDiscountAllocation implements com.shopify.storefront.types.CartDiscountAllocation {
  /**
   * The code used to apply the discount.
   */
  private String code;

  /**
   * The discount that have been applied on the cart line.
   */
  private CartDiscountApplication discountApplication;

  /**
   * The discounted amount that has been applied to the cart line.
   */
  private MoneyV2 discountedAmount;

  /**
   * The type of line that the discount is applicable towards.
   */
  private DiscountApplicationTargetType targetType;

  public CartCodeDiscountAllocation() {
  }

  /**
   * The code used to apply the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The discount that have been applied on the cart line.
   */
  public CartDiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(CartDiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  /**
   * The discounted amount that has been applied to the cart line.
   */
  public MoneyV2 getDiscountedAmount() {
    return discountedAmount;
  }

  public void setDiscountedAmount(MoneyV2 discountedAmount) {
    this.discountedAmount = discountedAmount;
  }

  /**
   * The type of line that the discount is applicable towards.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  @Override
  public String toString() {
    return "CartCodeDiscountAllocation{code='" + code + "', discountApplication='" + discountApplication + "', discountedAmount='" + discountedAmount + "', targetType='" + targetType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCodeDiscountAllocation that = (CartCodeDiscountAllocation) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(discountApplication, that.discountApplication) &&
        Objects.equals(discountedAmount, that.discountedAmount) &&
        Objects.equals(targetType, that.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, discountApplication, discountedAmount, targetType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code used to apply the discount.
     */
    private String code;

    /**
     * The discount that have been applied on the cart line.
     */
    private CartDiscountApplication discountApplication;

    /**
     * The discounted amount that has been applied to the cart line.
     */
    private MoneyV2 discountedAmount;

    /**
     * The type of line that the discount is applicable towards.
     */
    private DiscountApplicationTargetType targetType;

    public CartCodeDiscountAllocation build() {
      CartCodeDiscountAllocation result = new CartCodeDiscountAllocation();
      result.code = this.code;
      result.discountApplication = this.discountApplication;
      result.discountedAmount = this.discountedAmount;
      result.targetType = this.targetType;
      return result;
    }

    /**
     * The code used to apply the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The discount that have been applied on the cart line.
     */
    public Builder discountApplication(CartDiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }

    /**
     * The discounted amount that has been applied to the cart line.
     */
    public Builder discountedAmount(MoneyV2 discountedAmount) {
      this.discountedAmount = discountedAmount;
      return this;
    }

    /**
     * The type of line that the discount is applicable towards.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }
  }
}
