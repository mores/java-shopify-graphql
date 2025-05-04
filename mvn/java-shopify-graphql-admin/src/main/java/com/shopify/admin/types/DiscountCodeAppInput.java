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
 * The input fields for creating or updating a code discount, where the discount
 * type is provided by an app extension that uses [Shopify
 * Functions](https://shopify.dev/docs/apps/build/functions).
 *
 *
 * Use these input fields when you need advanced or custom discount capabilities
 * that aren't supported by [Shopify's native discount
 * types](https://help.shopify.com/manual/discounts/discount-types).
 */
public class DiscountCodeAppInput {
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
   * Whether a customer can only use the discount once.
   */
  private Boolean appliesOncePerCustomer;

  /**
   * The code that customers use to apply the discount.
   */
  private String code;

  /**
   * The customers that can use the discount.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * The maximum number of times that a customer can use the discount.
   * For discounts with unlimited usage, specify `null`.
   */
  private Integer usageLimit;

  /**
   * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
   * type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String functionId;

  /**
   * Whether the discount applies to subscriptions items.
   */
  private Boolean appliesOnSubscription = false;

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  private Boolean appliesOnOneTimePurchase = true;

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   *         0 will apply infinitely whereas 1 will only apply to the first checkout.
   */
  private Integer recurringCycleLimit = 1;

  /**
   * Additional metafields to associate to the discount.
   * [Metafields](https://shopify.dev/docs/apps/build/custom-data) provide dynamic
   * function configuration with different parameters, such as `percentage` for a
   * percentage discount. Merchants can set metafield values in the Shopify admin,
   * which makes the discount function more flexible and customizable.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  public DiscountCodeAppInput() {
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
   * Whether a customer can only use the discount once.
   */
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
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
   * The customers that can use the discount.
   */
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
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
   * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
   * type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * Whether the discount applies to subscriptions items.
   */
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  /**
   * Whether the discount applies on regular one-time-purchase items.
   */
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  /**
   * The number of times a discount applies on recurring purchases (subscriptions).
   *         0 will apply infinitely whereas 1 will only apply to the first checkout.
   */
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  /**
   * Additional metafields to associate to the discount.
   * [Metafields](https://shopify.dev/docs/apps/build/custom-data) provide dynamic
   * function configuration with different parameters, such as `percentage` for a
   * percentage discount. Merchants can set metafield values in the Shopify admin,
   * which makes the discount function more flexible and customizable.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "DiscountCodeAppInput{combinesWith='" + combinesWith + "', discountClasses='" + discountClasses + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', code='" + code + "', customerSelection='" + customerSelection + "', usageLimit='" + usageLimit + "', functionId='" + functionId + "', appliesOnSubscription='" + appliesOnSubscription + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', recurringCycleLimit='" + recurringCycleLimit + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeAppInput that = (DiscountCodeAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(discountClasses, that.discountClasses) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(code, that.code) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, discountClasses, title, startsAt, endsAt, appliesOncePerCustomer, code, customerSelection, usageLimit, functionId, appliesOnSubscription, appliesOnOneTimePurchase, recurringCycleLimit, metafields);
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
     * Whether a customer can only use the discount once.
     */
    private Boolean appliesOncePerCustomer;

    /**
     * The code that customers use to apply the discount.
     */
    private String code;

    /**
     * The customers that can use the discount.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * The maximum number of times that a customer can use the discount.
     * For discounts with unlimited usage, specify `null`.
     */
    private Integer usageLimit;

    /**
     * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String functionId;

    /**
     * Whether the discount applies to subscriptions items.
     */
    private Boolean appliesOnSubscription = false;

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    private Boolean appliesOnOneTimePurchase = true;

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     *         0 will apply infinitely whereas 1 will only apply to the first checkout.
     */
    private Integer recurringCycleLimit = 1;

    /**
     * Additional metafields to associate to the discount.
     * [Metafields](https://shopify.dev/docs/apps/build/custom-data) provide dynamic
     * function configuration with different parameters, such as `percentage` for a
     * percentage discount. Merchants can set metafield values in the Shopify admin,
     * which makes the discount function more flexible and customizable.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    public DiscountCodeAppInput build() {
      DiscountCodeAppInput result = new DiscountCodeAppInput();
      result.combinesWith = this.combinesWith;
      result.discountClasses = this.discountClasses;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.code = this.code;
      result.customerSelection = this.customerSelection;
      result.usageLimit = this.usageLimit;
      result.functionId = this.functionId;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.metafields = this.metafields;
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
     * Whether a customer can only use the discount once.
     */
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
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
     * The customers that can use the discount.
     */
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
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
     * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * Whether the discount applies to subscriptions items.
     */
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    /**
     * Whether the discount applies on regular one-time-purchase items.
     */
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    /**
     * The number of times a discount applies on recurring purchases (subscriptions).
     *         0 will apply infinitely whereas 1 will only apply to the first checkout.
     */
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    /**
     * Additional metafields to associate to the discount.
     * [Metafields](https://shopify.dev/docs/apps/build/custom-data) provide dynamic
     * function configuration with different parameters, such as `percentage` for a
     * percentage discount. Merchants can set metafield values in the Shopify admin,
     * which makes the discount function more flexible and customizable.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
