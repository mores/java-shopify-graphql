package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The `DiscountCodeApp` object stores information about code discounts
 * that are managed by an app using
 * [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
 * Use `DiscountCodeApp` when you need advanced, custom, or
 * dynamic discount capabilities that aren't supported by
 * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
 *
 * Learn more about creating
 * [custom discount functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
 *
 * > Note:
 * > The [`DiscountAutomaticApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticApp)
 * object has similar functionality to the `DiscountCodeApp` object, with the exception that `DiscountAutomaticApp`
 * stores information about automatic discounts that are managed by an app using Shopify Functions.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeApp implements Discount, DiscountCode {
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
   * Whether the discount applies on regular one-time-purchase items.
   */
  private boolean appliesOnOneTimePurchase;

  /**
   * Whether the discount applies to subscriptions items.
   */
  private boolean appliesOnSubscription;

  /**
   * Whether a customer can only use the discount once.
   */
  private boolean appliesOncePerCustomer;

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
   * A list codes that customers can use to redeem the discount.
   */
  private DiscountRedeemCodeConnection codes;

  /**
   * The number of codes that a customer can use to redeem the discount.
   */
  private Count codesCount;

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
   * The customers that can use the discount.
   */
  private DiscountCustomerSelection customerSelection;

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
   * Whether there are
   * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
   * associated with the discount.
   */
  private boolean hasTimelineComment;

  /**
   * The number of billing cycles for which the discount can be applied,
   * which is useful for subscription-based discounts. For example, if you set this field
   * to `3`, then the discount only applies to the first three billing cycles of a
   * subscription. If you specify `0`, then the discount applies indefinitely.
   */
  private Integer recurringCycleLimit;

  /**
   * A list of URLs that the app can use to share the discount.
   */
  private List<DiscountShareableUrl> shareableUrls;

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
   * The total sales from orders where the discount was used.
   */
  private MoneyV2 totalSales;

  /**
   * The date and time when the discount was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The maximum number of times that a customer can use the discount.
   * For discounts with unlimited usage, specify `null`.
   */
  private Integer usageLimit;

  public DiscountCodeApp() {
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
   * Whether the discount applies on regular one-time-purchase items.
   */
  public boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * Whether the discount applies to subscriptions items.
   */
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * Whether a customer can only use the discount once.
   */
  public boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
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
   * A list codes that customers can use to redeem the discount.
   */
  public DiscountRedeemCodeConnection getCodes() {
    return codes;
  }

  public void setCodes(DiscountRedeemCodeConnection codes) {
    this.codes = codes;
  }

  /**
   * The number of codes that a customer can use to redeem the discount.
   */
  public Count getCodesCount() {
    return codesCount;
  }

  public void setCodesCount(Count codesCount) {
    this.codesCount = codesCount;
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
   * The customers that can use the discount.
   */
  public DiscountCustomerSelection getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelection customerSelection) {
    this.customerSelection = customerSelection;
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
   * Whether there are
   * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
   * associated with the discount.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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

  /**
   * A list of URLs that the app can use to share the discount.
   */
  public List<DiscountShareableUrl> getShareableUrls() {
    return shareableUrls;
  }

  public void setShareableUrls(List<DiscountShareableUrl> shareableUrls) {
    this.shareableUrls = shareableUrls;
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
   * The total sales from orders where the discount was used.
   */
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
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

  @Override
  public String toString() {
    return "DiscountCodeApp{appDiscountType='" + appDiscountType + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', asyncUsageCount='" + asyncUsageCount + "', codes='" + codes + "', codesCount='" + codesCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerSelection='" + customerSelection + "', discountClass='" + discountClass + "', discountId='" + discountId + "', endsAt='" + endsAt + "', errorHistory='" + errorHistory + "', hasTimelineComment='" + hasTimelineComment + "', recurringCycleLimit='" + recurringCycleLimit + "', shareableUrls='" + shareableUrls + "', startsAt='" + startsAt + "', status='" + status + "', title='" + title + "', totalSales='" + totalSales + "', updatedAt='" + updatedAt + "', usageLimit='" + usageLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeApp that = (DiscountCodeApp) o;
    return Objects.equals(appDiscountType, that.appDiscountType) &&
        appliesOnOneTimePurchase == that.appliesOnOneTimePurchase &&
        appliesOnSubscription == that.appliesOnSubscription &&
        appliesOncePerCustomer == that.appliesOncePerCustomer &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(codes, that.codes) &&
        Objects.equals(codesCount, that.codesCount) &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountId, that.discountId) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(errorHistory, that.errorHistory) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(shareableUrls, that.shareableUrls) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(usageLimit, that.usageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDiscountType, appliesOnOneTimePurchase, appliesOnSubscription, appliesOncePerCustomer, asyncUsageCount, codes, codesCount, combinesWith, createdAt, customerSelection, discountClass, discountId, endsAt, errorHistory, hasTimelineComment, recurringCycleLimit, shareableUrls, startsAt, status, title, totalSales, updatedAt, usageLimit);
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
     * Whether the discount applies on regular one-time-purchase items.
     */
    private boolean appliesOnOneTimePurchase;

    /**
     * Whether the discount applies to subscriptions items.
     */
    private boolean appliesOnSubscription;

    /**
     * Whether a customer can only use the discount once.
     */
    private boolean appliesOncePerCustomer;

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
     * A list codes that customers can use to redeem the discount.
     */
    private DiscountRedeemCodeConnection codes;

    /**
     * The number of codes that a customer can use to redeem the discount.
     */
    private Count codesCount;

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
     * The customers that can use the discount.
     */
    private DiscountCustomerSelection customerSelection;

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
     * Whether there are
     * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
     * associated with the discount.
     */
    private boolean hasTimelineComment;

    /**
     * The number of billing cycles for which the discount can be applied,
     * which is useful for subscription-based discounts. For example, if you set this field
     * to `3`, then the discount only applies to the first three billing cycles of a
     * subscription. If you specify `0`, then the discount applies indefinitely.
     */
    private Integer recurringCycleLimit;

    /**
     * A list of URLs that the app can use to share the discount.
     */
    private List<DiscountShareableUrl> shareableUrls;

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
     * The total sales from orders where the discount was used.
     */
    private MoneyV2 totalSales;

    /**
     * The date and time when the discount was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The maximum number of times that a customer can use the discount.
     * For discounts with unlimited usage, specify `null`.
     */
    private Integer usageLimit;

    public DiscountCodeApp build() {
      DiscountCodeApp result = new DiscountCodeApp();
      result.appDiscountType = this.appDiscountType;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.asyncUsageCount = this.asyncUsageCount;
      result.codes = this.codes;
      result.codesCount = this.codesCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerSelection = this.customerSelection;
      result.discountClass = this.discountClass;
      result.discountId = this.discountId;
      result.endsAt = this.endsAt;
      result.errorHistory = this.errorHistory;
      result.hasTimelineComment = this.hasTimelineComment;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shareableUrls = this.shareableUrls;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.updatedAt = this.updatedAt;
      result.usageLimit = this.usageLimit;
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
     * Whether the discount applies on regular one-time-purchase items.
     */
    public Builder appliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * Whether the discount applies to subscriptions items.
     */
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * Whether a customer can only use the discount once.
     */
    public Builder appliesOncePerCustomer(boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
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
     * A list codes that customers can use to redeem the discount.
     */
    public Builder codes(DiscountRedeemCodeConnection codes) {
      this.codes = codes;
      return this;
    }

    /**
     * The number of codes that a customer can use to redeem the discount.
     */
    public Builder codesCount(Count codesCount) {
      this.codesCount = codesCount;
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
     * The customers that can use the discount.
     */
    public Builder customerSelection(DiscountCustomerSelection customerSelection) {
      this.customerSelection = customerSelection;
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
     * Whether there are
     * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
     * associated with the discount.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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

    /**
     * A list of URLs that the app can use to share the discount.
     */
    public Builder shareableUrls(List<DiscountShareableUrl> shareableUrls) {
      this.shareableUrls = shareableUrls;
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
     * The total sales from orders where the discount was used.
     */
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    /**
     * The date and time when the discount was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
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
  }
}
