package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for creating or updating a
 * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
 * that's automatically applied on a cart and at checkout.
 */
public class DiscountAutomaticBxgyInput {
  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  private OffsetDateTime startsAt;

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  private String title;

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  private String usesPerOrderLimit;

  /**
   * The items eligible for the discount and the required quantity of each to receive the discount.
   */
  private DiscountCustomerBuysInput customerBuys;

  /**
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  private DiscountCustomerGetsInput customerGets;

  public DiscountAutomaticBxgyInput() {
  }

  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The maximum number of times that the discount can be applied to an order.
   */
  public String getUsesPerOrderLimit() {
    return usesPerOrderLimit;
  }

  public void setUsesPerOrderLimit(String usesPerOrderLimit) {
    this.usesPerOrderLimit = usesPerOrderLimit;
  }

  /**
   * The items eligible for the discount and the required quantity of each to receive the discount.
   */
  public DiscountCustomerBuysInput getCustomerBuys() {
    return customerBuys;
  }

  public void setCustomerBuys(DiscountCustomerBuysInput customerBuys) {
    this.customerBuys = customerBuys;
  }

  /**
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  public DiscountCustomerGetsInput getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGetsInput customerGets) {
    this.customerGets = customerGets;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBxgyInput{combinesWith='" + combinesWith + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', title='" + title + "', usesPerOrderLimit='" + usesPerOrderLimit + "', customerBuys='" + customerBuys + "', customerGets='" + customerGets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBxgyInput that = (DiscountAutomaticBxgyInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(title, that.title) &&
        Objects.equals(usesPerOrderLimit, that.usesPerOrderLimit) &&
        Objects.equals(customerBuys, that.customerBuys) &&
        Objects.equals(customerGets, that.customerGets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, startsAt, endsAt, title, usesPerOrderLimit, customerBuys, customerGets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWithInput combinesWith;

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    private OffsetDateTime startsAt;

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    private String title;

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    private String usesPerOrderLimit;

    /**
     * The items eligible for the discount and the required quantity of each to receive the discount.
     */
    private DiscountCustomerBuysInput customerBuys;

    /**
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    private DiscountCustomerGetsInput customerGets;

    public DiscountAutomaticBxgyInput build() {
      DiscountAutomaticBxgyInput result = new DiscountAutomaticBxgyInput();
      result.combinesWith = this.combinesWith;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.title = this.title;
      result.usesPerOrderLimit = this.usesPerOrderLimit;
      result.customerBuys = this.customerBuys;
      result.customerGets = this.customerGets;
      return result;
    }

    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The maximum number of times that the discount can be applied to an order.
     */
    public Builder usesPerOrderLimit(String usesPerOrderLimit) {
      this.usesPerOrderLimit = usesPerOrderLimit;
      return this;
    }

    /**
     * The items eligible for the discount and the required quantity of each to receive the discount.
     */
    public Builder customerBuys(DiscountCustomerBuysInput customerBuys) {
      this.customerBuys = customerBuys;
      return this;
    }

    /**
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGetsInput customerGets) {
      this.customerGets = customerGets;
      return this;
    }
  }
}
