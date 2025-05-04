package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating or updating an automatic discount
 * that's managed by an app.
 *
 * Use these input fields when you need advanced, custom, or
 * dynamic discount capabilities that aren't supported by
 * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
 */
public class DiscountAutomaticAppInput {
  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * Determines which discount effects the discount can apply.
   */
  private List<DiscountClass> discountClasses;

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  private String title;

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
   * The
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
   * associated with the app extension providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String functionId;

  /**
   * Additional metafields to associate to the discount.
   * [Metafields](https://shopify.dev/docs/apps/build/custom-data)
   * provide dynamic function configuration with
   * different parameters, such as `percentage` for a percentage discount. Merchants can set metafield values
   * in the Shopify admin, which makes the discount function more flexible and customizable.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  private Boolean appliesOnSubscription = false;

  /**
   * Whether the discount applies on one-time purchases.
   */
  private Boolean appliesOnOneTimePurchase = true;

  /**
   * The number of billing cycles for which the discount can be applied,
   * which is useful for subscription-based discounts. For example, if you set this field
   * to `3`, then the discount only applies to the first three billing cycles of a
   * subscription. If you specify `0`, then the discount applies indefinitely.
   */
  private Integer recurringCycleLimit = 1;

  public DiscountAutomaticAppInput() {
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
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
   * Determines which discount effects the discount can apply.
   */
  public List<DiscountClass> getDiscountClasses() {
    return discountClasses;
  }

  public void setDiscountClasses(List<DiscountClass> discountClasses) {
    this.discountClasses = discountClasses;
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
   * The
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
   * associated with the app extension providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * Additional metafields to associate to the discount.
   * [Metafields](https://shopify.dev/docs/apps/build/custom-data)
   * provide dynamic function configuration with
   * different parameters, such as `percentage` for a percentage discount. Merchants can set metafield values
   * in the Shopify admin, which makes the discount function more flexible and customizable.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * Whether the discount applies on one-time purchases.
   */
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * The number of billing cycles for which the discount can be applied,
   * which is useful for subscription-based discounts. For example, if you set this field
   * to `3`, then the discount only applies to the first three billing cycles of a
   * subscription. If you specify `0`, then the discount applies indefinitely.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticAppInput{combinesWith='" + combinesWith + "', discountClasses='" + discountClasses + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', functionId='" + functionId + "', metafields='" + metafields + "', appliesOnSubscription='" + appliesOnSubscription + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticAppInput that = (DiscountAutomaticAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(discountClasses, that.discountClasses) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, discountClasses, title, startsAt, endsAt, functionId, metafields, appliesOnSubscription, appliesOnOneTimePurchase, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWithInput combinesWith;

    /**
     * Determines which discount effects the discount can apply.
     */
    private List<DiscountClass> discountClasses;

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    private String title;

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
     * The
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
     * associated with the app extension providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String functionId;

    /**
     * Additional metafields to associate to the discount.
     * [Metafields](https://shopify.dev/docs/apps/build/custom-data)
     * provide dynamic function configuration with
     * different parameters, such as `percentage` for a percentage discount. Merchants can set metafield values
     * in the Shopify admin, which makes the discount function more flexible and customizable.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    private Boolean appliesOnSubscription = false;

    /**
     * Whether the discount applies on one-time purchases.
     */
    private Boolean appliesOnOneTimePurchase = true;

    /**
     * The number of billing cycles for which the discount can be applied,
     * which is useful for subscription-based discounts. For example, if you set this field
     * to `3`, then the discount only applies to the first three billing cycles of a
     * subscription. If you specify `0`, then the discount applies indefinitely.
     */
    private Integer recurringCycleLimit = 1;

    public DiscountAutomaticAppInput build() {
      DiscountAutomaticAppInput result = new DiscountAutomaticAppInput();
      result.combinesWith = this.combinesWith;
      result.discountClasses = this.discountClasses;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.functionId = this.functionId;
      result.metafields = this.metafields;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * Determines which discount effects the discount can apply.
     */
    public Builder discountClasses(List<DiscountClass> discountClasses) {
      this.discountClasses = discountClasses;
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
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * The
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
     * associated with the app extension providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * Additional metafields to associate to the discount.
     * [Metafields](https://shopify.dev/docs/apps/build/custom-data)
     * provide dynamic function configuration with
     * different parameters, such as `percentage` for a percentage discount. Merchants can set metafield values
     * in the Shopify admin, which makes the discount function more flexible and customizable.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * Whether the discount applies on one-time purchases.
     */
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * The number of billing cycles for which the discount can be applied,
     * which is useful for subscription-based discounts. For example, if you set this field
     * to `3`, then the discount only applies to the first three billing cycles of a
     * subscription. If you specify `0`, then the discount applies indefinitely.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
