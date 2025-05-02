package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The discounts automatically applied to the cart line based on prerequisites that have been met.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartAutomaticDiscountAllocation implements com.shopify.storefront.types.CartDiscountAllocation {
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

  /**
   * The title of the allocated discount.
   */
  private String title;

  public CartAutomaticDiscountAllocation() {
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

  /**
   * The title of the allocated discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CartAutomaticDiscountAllocation{discountApplication='" + discountApplication + "', discountedAmount='" + discountedAmount + "', targetType='" + targetType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartAutomaticDiscountAllocation that = (CartAutomaticDiscountAllocation) o;
    return Objects.equals(discountApplication, that.discountApplication) &&
        Objects.equals(discountedAmount, that.discountedAmount) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountApplication, discountedAmount, targetType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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

    /**
     * The title of the allocated discount.
     */
    private String title;

    public CartAutomaticDiscountAllocation build() {
      CartAutomaticDiscountAllocation result = new CartAutomaticDiscountAllocation();
      result.discountApplication = this.discountApplication;
      result.discountedAmount = this.discountedAmount;
      result.targetType = this.targetType;
      result.title = this.title;
      return result;
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

    /**
     * The title of the allocated discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
