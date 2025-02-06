package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The `DiscountAutomaticApp` object stores information about automatic discounts
 * that are managed by an app using
 * [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
 * Use `DiscountAutomaticApp`when you need advanced, custom, or
 * dynamic discount capabilities that aren't supported by
 * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
 *
 * Learn more about creating
 * [custom discount functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
 *
 * > Note:
 * > The [`DiscountCodeApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeApp)
 * object has similar functionality to the `DiscountAutomaticApp` object, with the exception that `DiscountCodeApp`
 * stores information about discount codes that are managed by an app using Shopify Functions.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticApp implements Discount, DiscountAutomatic {
  /**
   * The details about the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   * This information includes the app extension's name and
   * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
   * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
   * and other metadata about the discount type, including the discount type's name and description.
   */
  private AppDiscountType appDiscountType;

  /**
   * Whether the discount applies on one-time purchases.
   */
  private boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  private boolean appliesOnSubscription;

  /**
   * The number of times that the discount has been used.
   * For example, if a "Buy 3, Get 1 Free" t-shirt discount
   * is automatically applied in 200 transactions, then the
   * discount has been used 200 times.
   * This value is updated asynchronously. As a result,
   * it might be lower than the actual usage count until the
   * asynchronous process is completed.
   */
  private int asyncUsageCount;

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  private DiscountCombinesWith combinesWith;

  /**
   * The date and time when the discount was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private DiscountClass discountClass;

  /**
   * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
   * for the discount.
   */
  private String discountId;

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
   * for the latest version of the discount type that the app provides.
   */
  private FunctionsErrorHistory errorHistory;

  /**
   * The number of billing cycles for which the discount can be applied,
   * which is useful for subscription-based discounts. For example, if you set this field
   * to `3`, then the discount only applies to the first three billing cycles of a
   * subscription. If you specify `0`, then the discount applies indefinitely.
   */
  private int recurringCycleLimit;

  /**
   * The date and time when the discount becomes active and is available to customers.
   */
  private OffsetDateTime startsAt;

  /**
   * The status of the discount that describes its availability,
   * expiration, or pending activation.
   */
  private DiscountStatus status;

  /**
   * The discount's name that displays to merchants in the Shopify admin and to customers.
   */
  private String title;

  /**
   * The date and time when the discount was updated.
   */
  private OffsetDateTime updatedAt;

  public DiscountAutomaticApp() {
  }

  /**
   * The details about the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   * This information includes the app extension's name and
   * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
   * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
   * and other metadata about the discount type, including the discount type's name and description.
   */
  public AppDiscountType getAppDiscountType() {
    return appDiscountType;
  }

  public void setAppDiscountType(AppDiscountType appDiscountType) {
    this.appDiscountType = appDiscountType;
  }

  /**
   * Whether the discount applies on one-time purchases.
   */
  public boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies on subscription items.
   * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
   * enable customers to purchase products
   * on a recurring basis.
   */
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * The number of times that the discount has been used.
   * For example, if a "Buy 3, Get 1 Free" t-shirt discount
   * is automatically applied in 200 transactions, then the
   * discount has been used 200 times.
   * This value is updated asynchronously. As a result,
   * it might be lower than the actual usage count until the
   * asynchronous process is completed.
   */
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  /**
   * The
   * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that you can use in combination with
   * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
   */
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The date and time when the discount was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
   * for the discount.
   */
  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
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
   * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
   * for the latest version of the discount type that the app provides.
   */
  public FunctionsErrorHistory getErrorHistory() {
    return errorHistory;
  }

  public void setErrorHistory(FunctionsErrorHistory errorHistory) {
    this.errorHistory = errorHistory;
  }

  /**
   * The number of billing cycles for which the discount can be applied,
   * which is useful for subscription-based discounts. For example, if you set this field
   * to `3`, then the discount only applies to the first three billing cycles of a
   * subscription. If you specify `0`, then the discount applies indefinitely.
   */
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
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
   * The status of the discount that describes its availability,
   * expiration, or pending activation.
   */
  public DiscountStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountStatus status) {
    this.status = status;
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
   * The date and time when the discount was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticApp{appDiscountType='" + appDiscountType + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', discountClass='" + discountClass + "', discountId='" + discountId + "', endsAt='" + endsAt + "', errorHistory='" + errorHistory + "', recurringCycleLimit='" + recurringCycleLimit + "', startsAt='" + startsAt + "', status='" + status + "', title='" + title + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticApp that = (DiscountAutomaticApp) o;
    return Objects.equals(appDiscountType, that.appDiscountType) &&
        appliesOnOneTimePurchase == that.appliesOnOneTimePurchase &&
        appliesOnSubscription == that.appliesOnSubscription &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountId, that.discountId) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(errorHistory, that.errorHistory) &&
        recurringCycleLimit == that.recurringCycleLimit &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDiscountType, appliesOnOneTimePurchase, appliesOnSubscription, asyncUsageCount, combinesWith, createdAt, discountClass, discountId, endsAt, errorHistory, recurringCycleLimit, startsAt, status, title, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The details about the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     * This information includes the app extension's name and
     * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
     * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
     * and other metadata about the discount type, including the discount type's name and description.
     */
    private AppDiscountType appDiscountType;

    /**
     * Whether the discount applies on one-time purchases.
     */
    private boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    private boolean appliesOnSubscription;

    /**
     * The number of times that the discount has been used.
     * For example, if a "Buy 3, Get 1 Free" t-shirt discount
     * is automatically applied in 200 transactions, then the
     * discount has been used 200 times.
     * This value is updated asynchronously. As a result,
     * it might be lower than the actual usage count until the
     * asynchronous process is completed.
     */
    private int asyncUsageCount;

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    private DiscountCombinesWith combinesWith;

    /**
     * The date and time when the discount was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private DiscountClass discountClass;

    /**
     * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
     * for the discount.
     */
    private String discountId;

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
     * for the latest version of the discount type that the app provides.
     */
    private FunctionsErrorHistory errorHistory;

    /**
     * The number of billing cycles for which the discount can be applied,
     * which is useful for subscription-based discounts. For example, if you set this field
     * to `3`, then the discount only applies to the first three billing cycles of a
     * subscription. If you specify `0`, then the discount applies indefinitely.
     */
    private int recurringCycleLimit;

    /**
     * The date and time when the discount becomes active and is available to customers.
     */
    private OffsetDateTime startsAt;

    /**
     * The status of the discount that describes its availability,
     * expiration, or pending activation.
     */
    private DiscountStatus status;

    /**
     * The discount's name that displays to merchants in the Shopify admin and to customers.
     */
    private String title;

    /**
     * The date and time when the discount was updated.
     */
    private OffsetDateTime updatedAt;

    public DiscountAutomaticApp build() {
      DiscountAutomaticApp result = new DiscountAutomaticApp();
      result.appDiscountType = this.appDiscountType;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.discountClass = this.discountClass;
      result.discountId = this.discountId;
      result.endsAt = this.endsAt;
      result.errorHistory = this.errorHistory;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The details about the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     * This information includes the app extension's name and
     * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
     * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
     * and other metadata about the discount type, including the discount type's name and description.
     */
    public Builder appDiscountType(AppDiscountType appDiscountType) {
      this.appDiscountType = appDiscountType;
      return this;
    }

    /**
     * Whether the discount applies on one-time purchases.
     */
    public Builder appliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies on subscription items.
     * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription-discounts)
     * enable customers to purchase products
     * on a recurring basis.
     */
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * The number of times that the discount has been used.
     * For example, if a "Buy 3, Get 1 Free" t-shirt discount
     * is automatically applied in 200 transactions, then the
     * discount has been used 200 times.
     * This value is updated asynchronously. As a result,
     * it might be lower than the actual usage count until the
     * asynchronous process is completed.
     */
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    /**
     * The
     * [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that you can use in combination with
     * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The date and time when the discount was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
     * for the discount.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
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
     * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
     * for the latest version of the discount type that the app provides.
     */
    public Builder errorHistory(FunctionsErrorHistory errorHistory) {
      this.errorHistory = errorHistory;
      return this;
    }

    /**
     * The number of billing cycles for which the discount can be applied,
     * which is useful for subscription-based discounts. For example, if you set this field
     * to `3`, then the discount only applies to the first three billing cycles of a
     * subscription. If you specify `0`, then the discount applies indefinitely.
     */
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
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
     * The status of the discount that describes its availability,
     * expiration, or pending activation.
     */
    public Builder status(DiscountStatus status) {
      this.status = status;
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
     * The date and time when the discount was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
