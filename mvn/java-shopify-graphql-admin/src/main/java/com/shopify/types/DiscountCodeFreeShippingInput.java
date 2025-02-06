package com.shopify.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for creating or updating a [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
 * that's applied on a cart and at checkout when a customer enters a code.
 */
public class DiscountCodeFreeShippingInput {
  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with the shipping discount.
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  private String title;

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  private OffsetDateTime startsAt;

  /**
   * The date and time when the discount expires and is no longer available to
   * customers. For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * The code that customers use to apply the discount.
   */
  private String code;

  /**
   * The maximum number of times that a customer can use the discount.
   * For discounts with unlimited usage, specify `null`.
   */
  private Integer usageLimit;

  /**
   * Whether a customer can only use the discount once.
   */
  private Boolean appliesOncePerCustomer;

  /**
   * The minimum subtotal or quantity of items that are required for the discount to be applied.
   */
  private DiscountMinimumRequirementInput minimumRequirement;

  /**
   * The customers that can use the discount. You can target specific customer IDs
   * or make the discount available to all customers.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * The shipping destinations where the free shipping discount can be applied. You
   * can specify whether the discount applies to all countries, or specify
   * individual countries.
   */
  private DiscountShippingDestinationSelectionInput destination;

  /**
   * The maximum shipping price, in the shop's currency, that qualifies for free shipping.
   * <br/><br/>
   * For example, if set to 20.00, then only shipping rates that cost $20.00 or
   * less will be made free. To apply the discount to all shipping rates, specify `null`.
   */
  private String maximumShippingPrice;

  /**
   * The number of billing cycles for which the discount can be applied, which is useful for subscription-based discounts.
   * <br/><br/>
   * For example, if set to `3`, then the discount only applies to the first three
   * billing cycles of a subscription. If set to `0`, then the discount applies indefinitely.
   */
  private Integer recurringCycleLimit;

  /**
   * Whether the discount applies on one-time purchases. A one-time purchase is a
   * transaction where you pay a single time for a product, without any ongoing
   * commitments or recurring charges.
   */
  private Boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription items. [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products on a recurring basis.
   */
  private Boolean appliesOnSubscription;

  public DiscountCodeFreeShippingInput() {
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with the shipping discount.
   */
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
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
   * The date and time when the discount becomes active and is available to customers.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The date and time when the discount expires and is no longer available to
   * customers. For discounts without a fixed expiration date, specify `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * The code that customers use to apply the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The maximum number of times that a customer can use the discount.
   * For discounts with unlimited usage, specify `null`.
   */
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  /**
   * Whether a customer can only use the discount once.
   */
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  /**
   * The minimum subtotal or quantity of items that are required for the discount to be applied.
   */
  public DiscountMinimumRequirementInput getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
  }

  /**
   * The customers that can use the discount. You can target specific customer IDs
   * or make the discount available to all customers.
   */
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The shipping destinations where the free shipping discount can be applied. You
   * can specify whether the discount applies to all countries, or specify
   * individual countries.
   */
  public DiscountShippingDestinationSelectionInput getDestination() {
    return destination;
  }

  public void setDestination(DiscountShippingDestinationSelectionInput destination) {
    this.destination = destination;
  }

  /**
   * The maximum shipping price, in the shop's currency, that qualifies for free shipping.
   * <br/><br/>
   * For example, if set to 20.00, then only shipping rates that cost $20.00 or
   * less will be made free. To apply the discount to all shipping rates, specify `null`.
   */
  public String getMaximumShippingPrice() {
    return maximumShippingPrice;
  }

  public void setMaximumShippingPrice(String maximumShippingPrice) {
    this.maximumShippingPrice = maximumShippingPrice;
  }

  /**
   * The number of billing cycles for which the discount can be applied, which is useful for subscription-based discounts.
   * <br/><br/>
   * For example, if set to `3`, then the discount only applies to the first three
   * billing cycles of a subscription. If set to `0`, then the discount applies indefinitely.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  /**
   * Whether the discount applies on one-time purchases. A one-time purchase is a
   * transaction where you pay a single time for a product, without any ongoing
   * commitments or recurring charges.
   */
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription items. [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products on a recurring basis.
   */
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCodeFreeShippingInput{combinesWith='" + combinesWith + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', code='" + code + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', minimumRequirement='" + minimumRequirement + "', customerSelection='" + customerSelection + "', destination='" + destination + "', maximumShippingPrice='" + maximumShippingPrice + "', recurringCycleLimit='" + recurringCycleLimit + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeFreeShippingInput that = (DiscountCodeFreeShippingInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(code, that.code) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(maximumShippingPrice, that.maximumShippingPrice) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, title, startsAt, endsAt, code, usageLimit, appliesOncePerCustomer, minimumRequirement, customerSelection, destination, maximumShippingPrice, recurringCycleLimit, appliesOnOneTimePurchase, appliesOnSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with the shipping discount.
     */
    private DiscountCombinesWithInput combinesWith;

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    private String title;

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    private OffsetDateTime startsAt;

    /**
     * The date and time when the discount expires and is no longer available to
     * customers. For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * The code that customers use to apply the discount.
     */
    private String code;

    /**
     * The maximum number of times that a customer can use the discount.
     * For discounts with unlimited usage, specify `null`.
     */
    private Integer usageLimit;

    /**
     * Whether a customer can only use the discount once.
     */
    private Boolean appliesOncePerCustomer;

    /**
     * The minimum subtotal or quantity of items that are required for the discount to be applied.
     */
    private DiscountMinimumRequirementInput minimumRequirement;

    /**
     * The customers that can use the discount. You can target specific customer IDs
     * or make the discount available to all customers.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * The shipping destinations where the free shipping discount can be applied. You
     * can specify whether the discount applies to all countries, or specify
     * individual countries.
     */
    private DiscountShippingDestinationSelectionInput destination;

    /**
     * The maximum shipping price, in the shop's currency, that qualifies for free shipping.
     * <br/><br/>
     * For example, if set to 20.00, then only shipping rates that cost $20.00 or
     * less will be made free. To apply the discount to all shipping rates, specify `null`.
     */
    private String maximumShippingPrice;

    /**
     * The number of billing cycles for which the discount can be applied, which is useful for subscription-based discounts.
     * <br/><br/>
     * For example, if set to `3`, then the discount only applies to the first three
     * billing cycles of a subscription. If set to `0`, then the discount applies indefinitely.
     */
    private Integer recurringCycleLimit;

    /**
     * Whether the discount applies on one-time purchases. A one-time purchase is a
     * transaction where you pay a single time for a product, without any ongoing
     * commitments or recurring charges.
     */
    private Boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription items. [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products on a recurring basis.
     */
    private Boolean appliesOnSubscription;

    public DiscountCodeFreeShippingInput build() {
      DiscountCodeFreeShippingInput result = new DiscountCodeFreeShippingInput();
      result.combinesWith = this.combinesWith;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.code = this.code;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.minimumRequirement = this.minimumRequirement;
      result.customerSelection = this.customerSelection;
      result.destination = this.destination;
      result.maximumShippingPrice = this.maximumShippingPrice;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      return result;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with the shipping discount.
     */
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
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
     * The date and time when the discount becomes active and is available to customers.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The date and time when the discount expires and is no longer available to
     * customers. For discounts without a fixed expiration date, specify `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * The code that customers use to apply the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The maximum number of times that a customer can use the discount.
     * For discounts with unlimited usage, specify `null`.
     */
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    /**
     * Whether a customer can only use the discount once.
     */
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    /**
     * The minimum subtotal or quantity of items that are required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirementInput minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
      return this;
    }

    /**
     * The customers that can use the discount. You can target specific customer IDs
     * or make the discount available to all customers.
     */
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The shipping destinations where the free shipping discount can be applied. You
     * can specify whether the discount applies to all countries, or specify
     * individual countries.
     */
    public Builder destination(DiscountShippingDestinationSelectionInput destination) {
      this.destination = destination;
      return this;
    }

    /**
     * The maximum shipping price, in the shop's currency, that qualifies for free shipping.
     * <br/><br/>
     * For example, if set to 20.00, then only shipping rates that cost $20.00 or
     * less will be made free. To apply the discount to all shipping rates, specify `null`.
     */
    public Builder maximumShippingPrice(String maximumShippingPrice) {
      this.maximumShippingPrice = maximumShippingPrice;
      return this;
    }

    /**
     * The number of billing cycles for which the discount can be applied, which is useful for subscription-based discounts.
     * <br/><br/>
     * For example, if set to `3`, then the discount only applies to the first three
     * billing cycles of a subscription. If set to `0`, then the discount applies indefinitely.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * Whether the discount applies on one-time purchases. A one-time purchase is a
     * transaction where you pay a single time for a product, without any ongoing
     * commitments or recurring charges.
     */
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription items. [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products on a recurring basis.
     */
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }
  }
}
