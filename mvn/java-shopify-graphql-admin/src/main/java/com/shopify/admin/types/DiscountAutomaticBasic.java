package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The `DiscountAutomaticBasic` object lets you manage
 * [amount off discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
 * that are automatically applied on a cart and at checkout. Amount off discounts give customers a
 * fixed value or a percentage off the products in an order, but don't apply to shipping costs.
 *
 * The `DiscountAutomaticBasic` object stores information about automatic amount off discounts that apply to
 * specific [products and variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountProducts),
 * [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCollections),
 * or [all items in a cart](https://shopify.dev/docs/api/admin-graphql/latest/objects/AllDiscountItems).
 *
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts),
 * including limitations and considerations.
 *
 * > Note:
 * > The [`DiscountCodeBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic)
 * object has similar functionality to the `DiscountAutomaticBasic` object, but customers need to enter a code to
 * receive a discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticBasic implements Discount, DiscountAutomatic {
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
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  private DiscountCustomerGets customerGets;

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private MerchandiseDiscountClass discountClass;

  /**
   * The classes of the discount.
   */
  private List<DiscountClass> discountClasses;

  /**
   * The date and time when the discount expires and is no longer available to customers.
   * For discounts without a fixed expiration date, specify `null`.
   */
  private OffsetDateTime endsAt;

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
  private int recurringCycleLimit;

  /**
   * An abbreviated version of the discount
   * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-summary)
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
   * The date and time when the discount was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The number of times that the discount has been used.
   */
  private int usageCount;

  public DiscountAutomaticBasic() {
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
   * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
   */
  public DiscountCustomerGets getCustomerGets() {
    return customerGets;
  }

  public void setCustomerGets(DiscountCustomerGets customerGets) {
    this.customerGets = customerGets;
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
   * The classes of the discount.
   */
  public List<DiscountClass> getDiscountClasses() {
    return discountClasses;
  }

  public void setDiscountClasses(List<DiscountClass> discountClasses) {
    this.discountClasses = discountClasses;
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
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  /**
   * An abbreviated version of the discount
   * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-summary)
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
   * The date and time when the discount was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The number of times that the discount has been used.
   */
  public int getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(int usageCount) {
    this.usageCount = usageCount;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticBasic{asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerGets='" + customerGets + "', discountClass='" + discountClass + "', discountClasses='" + discountClasses + "', endsAt='" + endsAt + "', minimumRequirement='" + minimumRequirement + "', recurringCycleLimit='" + recurringCycleLimit + "', shortSummary='" + shortSummary + "', startsAt='" + startsAt + "', status='" + status + "', summary='" + summary + "', title='" + title + "', updatedAt='" + updatedAt + "', usageCount='" + usageCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticBasic that = (DiscountAutomaticBasic) o;
    return asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerGets, that.customerGets) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountClasses, that.discountClasses) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(minimumRequirement, that.minimumRequirement) &&
        recurringCycleLimit == that.recurringCycleLimit &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        usageCount == that.usageCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncUsageCount, combinesWith, createdAt, customerGets, discountClass, discountClasses, endsAt, minimumRequirement, recurringCycleLimit, shortSummary, startsAt, status, summary, title, updatedAt, usageCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    private DiscountCustomerGets customerGets;

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private MerchandiseDiscountClass discountClass;

    /**
     * The classes of the discount.
     */
    private List<DiscountClass> discountClasses;

    /**
     * The date and time when the discount expires and is no longer available to customers.
     * For discounts without a fixed expiration date, specify `null`.
     */
    private OffsetDateTime endsAt;

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
    private int recurringCycleLimit;

    /**
     * An abbreviated version of the discount
     * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-summary)
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
     * The date and time when the discount was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The number of times that the discount has been used.
     */
    private int usageCount;

    public DiscountAutomaticBasic build() {
      DiscountAutomaticBasic result = new DiscountAutomaticBasic();
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerGets = this.customerGets;
      result.discountClass = this.discountClass;
      result.discountClasses = this.discountClasses;
      result.endsAt = this.endsAt;
      result.minimumRequirement = this.minimumRequirement;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shortSummary = this.shortSummary;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.summary = this.summary;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      result.usageCount = this.usageCount;
      return result;
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
     * The items in the order that qualify for the discount, their quantities, and the total value of the discount.
     */
    public Builder customerGets(DiscountCustomerGets customerGets) {
      this.customerGets = customerGets;
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
     * The classes of the discount.
     */
    public Builder discountClasses(List<DiscountClass> discountClasses) {
      this.discountClasses = discountClasses;
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
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * An abbreviated version of the discount
     * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-summary)
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
     * The date and time when the discount was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The number of times that the discount has been used.
     */
    public Builder usageCount(int usageCount) {
      this.usageCount = usageCount;
      return this;
    }
  }
}
