package com.shopify.types;

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
   * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
   * type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String functionId;

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
   * The maximum number of times that the discount can be used. For discounts with no usage limit, specify `null`.
   */
  private Integer usageLimit;

  /**
   * Whether a customer can only use the discount once.
   */
  private Boolean appliesOncePerCustomer;

  /**
   * The customers that can use the discount. You can target specific customer IDs,
   * use customer segments, or make the discount available to all customers.
   */
  private DiscountCustomerSelectionInput customerSelection;

  /**
   * The code that customers need to enter to redeem the discount.
   */
  private String code;

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
   * The maximum number of times that the discount can be used. For discounts with no usage limit, specify `null`.
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
   * The customers that can use the discount. You can target specific customer IDs,
   * use customer segments, or make the discount available to all customers.
   */
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  /**
   * The code that customers need to enter to redeem the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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
    return "DiscountCodeAppInput{combinesWith='" + combinesWith + "', functionId='" + functionId + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', customerSelection='" + customerSelection + "', code='" + code + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeAppInput that = (DiscountCodeAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(code, that.code) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, functionId, title, startsAt, endsAt, usageLimit, appliesOncePerCustomer, customerSelection, code, metafields);
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
     * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String functionId;

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
     * The maximum number of times that the discount can be used. For discounts with no usage limit, specify `null`.
     */
    private Integer usageLimit;

    /**
     * Whether a customer can only use the discount once.
     */
    private Boolean appliesOncePerCustomer;

    /**
     * The customers that can use the discount. You can target specific customer IDs,
     * use customer segments, or make the discount available to all customers.
     */
    private DiscountCustomerSelectionInput customerSelection;

    /**
     * The code that customers need to enter to redeem the discount.
     */
    private String code;

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
      result.functionId = this.functionId;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.customerSelection = this.customerSelection;
      result.code = this.code;
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
     * The [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries) associated with the app extension that's providing the [discount
     * type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
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
     * The maximum number of times that the discount can be used. For discounts with no usage limit, specify `null`.
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
     * The customers that can use the discount. You can target specific customer IDs,
     * use customer segments, or make the discount available to all customers.
     */
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    /**
     * The code that customers need to enter to redeem the discount.
     */
    public Builder code(String code) {
      this.code = code;
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
