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
 * The `DiscountCodeBasic` object lets you manage
 * [amount off discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
 * that are applied on a cart and at checkout when a customer enters a code. Amount off discounts give customers a
 * fixed value or a percentage off the products in an order, but don't apply to shipping costs.
 *
 * The `DiscountCodeBasic` object stores information about amount off code discounts that apply to
 * specific [products and variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountProducts),
 * [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCollections),
 * or [all items in a cart](https://shopify.dev/docs/api/admin-graphql/latest/objects/AllDiscountItems).
 *
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts),
 * including limitations and considerations.
 *
 * > Note:
 * > The [`DiscountAutomaticBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic)
 * object has similar functionality to the `DiscountCodeBasic` object, but discounts are automatically applied,
 * without the need for customers to enter a code.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeBasic implements Discount, DiscountCode {
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
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  private DiscountCustomerGets customerGets;

  /**
   * The customers that can use the discount.
   */
  private DiscountCustomerSelection customerSelection;

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private MerchandiseDiscountClass discountClass;

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * Whether there are
   * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
   * associated with the discount.
   */
  private boolean hasTimelineComment;

  /**
   * The minimum subtotal or quantity of items that are required for the discount to be applied.
   */
  private DiscountMinimumRequirement minimumRequirement;

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
   * An abbreviated version of the discount
   * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summary)
   * field.
   */
  private String shortSummary;

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
   * A detailed explanation of what the discount is,
   * who can use it, when and where it applies, and any associated
   * rules or limitations.
   */
  private String summary;

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

  public DiscountCodeBasic() {
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
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  public DiscountCustomerGets getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGets customerGets) {
    this.customerGets = customerGets;
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
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public MerchandiseDiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(MerchandiseDiscountClass discountClass) {
    this.discountClass = discountClass;
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
   * The minimum subtotal or quantity of items that are required for the discount to be applied.
   */
  public DiscountMinimumRequirement getMinimumRequirement() {
    return minimumRequirement;
  }

  public void setMinimumRequirement(DiscountMinimumRequirement minimumRequirement) {
    this.minimumRequirement = minimumRequirement;
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
   * An abbreviated version of the discount
   * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summary)
   * field.
   */
  public String getShortSummary() {
    return shortSummary;
  }

  public void setShortSummary(String shortSummary) {
    this.shortSummary = shortSummary;
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
   * A detailed explanation of what the discount is,
   * who can use it, when and where it applies, and any associated
   * rules or limitations.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
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
    return "DiscountCodeBasic{appliesOncePerCustomer='" + appliesOncePerCustomer + "', asyncUsageCount='" + asyncUsageCount + "', codes='" + codes + "', codesCount='" + codesCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerGets='" + customerGets + "', customerSelection='" + customerSelection + "', discountClass='" + discountClass + "', endsAt='" + endsAt + "', hasTimelineComment='" + hasTimelineComment + "', minimumRequirement='" + minimumRequirement + "', recurringCycleLimit='" + recurringCycleLimit + "', shareableUrls='" + shareableUrls + "', shortSummary='" + shortSummary + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', totalSales='" + totalSales + "', updatedAt='" + updatedAt + "', usageLimit='" + usageLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeBasic that = (DiscountCodeBasic) o;
    return appliesOncePerCustomer == that.appliesOncePerCustomer &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(codes, that.codes) &&
        Objects.equals(codesCount, that.codesCount) &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(endsAt, that.endsAt) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(shareableUrls, that.shareableUrls) &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(usageLimit, that.usageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOncePerCustomer, asyncUsageCount, codes, codesCount, combinesWith, createdAt, customerGets, customerSelection, discountClass, endsAt, hasTimelineComment, minimumRequirement, recurringCycleLimit, shareableUrls, shortSummary, startsAt, status, summary, title, totalSales, updatedAt, usageLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    private DiscountCustomerGets customerGets;

    /**
     * The customers that can use the discount.
     */
    private DiscountCustomerSelection customerSelection;

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private MerchandiseDiscountClass discountClass;

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * Whether there are
     * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
     * associated with the discount.
     */
    private boolean hasTimelineComment;

    /**
     * The minimum subtotal or quantity of items that are required for the discount to be applied.
     */
    private DiscountMinimumRequirement minimumRequirement;

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
     * An abbreviated version of the discount
     * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summary)
     * field.
     */
    private String shortSummary;

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
     * A detailed explanation of what the discount is,
     * who can use it, when and where it applies, and any associated
     * rules or limitations.
     */
    private String summary;

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

    public DiscountCodeBasic build() {
      DiscountCodeBasic result = new DiscountCodeBasic();
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.asyncUsageCount = this.asyncUsageCount;
      result.codes = this.codes;
      result.codesCount = this.codesCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerGets = this.customerGets;
      result.customerSelection = this.customerSelection;
      result.discountClass = this.discountClass;
      result.endsAt = this.endsAt;
      result.hasTimelineComment = this.hasTimelineComment;
      result.minimumRequirement = this.minimumRequirement;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shareableUrls = this.shareableUrls;
      result.shortSummary = this.shortSummary;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.updatedAt = this.updatedAt;
      result.usageLimit = this.usageLimit;
      return result;
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
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGets customerGets) {
      this.customerGets = customerGets;
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
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(MerchandiseDiscountClass discountClass) {
      this.discountClass = discountClass;
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
     * Whether there are
     * [timeline comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timeline)
     * associated with the discount.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    /**
     * The minimum subtotal or quantity of items that are required for the discount to be applied.
     */
    public Builder minimumRequirement(DiscountMinimumRequirement minimumRequirement) {
      this.minimumRequirement = minimumRequirement;
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
     * An abbreviated version of the discount
     * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summary)
     * field.
     */
    public Builder shortSummary(String shortSummary) {
      this.shortSummary = shortSummary;
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
     * A detailed explanation of what the discount is,
     * who can use it, when and where it applies, and any associated
     * rules or limitations.
     */
    public Builder summary(String summary) {
      this.summary = summary;
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
