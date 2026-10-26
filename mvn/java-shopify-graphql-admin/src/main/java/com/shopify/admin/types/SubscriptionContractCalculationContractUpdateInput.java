package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for calculating changes to an existing subscription contract.
 * Each field you provide replaces the corresponding value on the contract, and
 * omitted fields remain unchanged. For list fields, provide the complete
 * replacement list, including the `id` of each existing item that you want to keep.
 *
 * Learn how to [update a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/update-a-subscription-contract).
 */
public class SubscriptionContractCalculationContractUpdateInput {
  /**
   * Specifies whether to use merchandise customizations in the calculation.
   */
  private boolean withMerchandiseCustomizations;

  /**
   * The subscription lines to set on the contract. Replaces all existing lines
   * with the contents of this array. At least one line is required.
   * - To update an existing line within the new set, include its `id`.
   * - To add a new line, omit its `id`.
   */
  private List<SubscriptionContractCalculationLineInput> lines;

  /**
   * The manual order and delivery discounts to set on the contract. Replaces all existing manual discounts.
   * - To update an existing discount within the new set, include its `id`.
   * - To add a new discount, omit its `id`.
   * - To remove all manual discounts, provide an empty array (`[]`).
   */
  private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

  /**
   * The discount codes to apply during this calculation. Applied codes are resolved into manual
   * discounts on the contract; discount codes aren't persisted as codes, so there's nothing to
   * preserve or replace across calculations. Defaults to an empty array (apply no discount codes).
   */
  private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

  /**
   * The note for the contract. To remove the existing note, pass `null`.
   */
  private String note;

  /**
   * The custom attributes for the contract. Replaces all existing attributes. To
   * remove all attributes, provide an empty array (`[]`).
   */
  private List<AttributeInput> customAttributes;

  /**
   * The billing policy for the contract. Replaces the existing billing policy.
   */
  private SubscriptionContractCalculationBillingPolicyInput billingPolicy;

  /**
   * The delivery policy for the contract. Replaces the existing delivery policy.
   */
  private SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy;

  /**
   * The delivery method for the contract. Replaces the existing delivery method.
   * Provide `none` to remove the delivery method. Provide
   * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
   * address without changing the committed delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

  /**
   * The payment method for the contract. Replaces the existing payment method. Provide `none` to remove the payment method.
   */
  private SubscriptionContractCalculationPaymentMethodInput paymentMethod;

  /**
   * App-managed billing configuration for the contract. Replaces the existing configuration.
   */
  private SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig;

  public SubscriptionContractCalculationContractUpdateInput() {
  }

  /**
   * Specifies whether to use merchandise customizations in the calculation.
   */
  public boolean getWithMerchandiseCustomizations() {
    return withMerchandiseCustomizations;
  }

  public void setWithMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
    this.withMerchandiseCustomizations = withMerchandiseCustomizations;
  }

  /**
   * The subscription lines to set on the contract. Replaces all existing lines
   * with the contents of this array. At least one line is required.
   * - To update an existing line within the new set, include its `id`.
   * - To add a new line, omit its `id`.
   */
  public List<SubscriptionContractCalculationLineInput> getLines() {
    return lines;
  }

  public void setLines(List<SubscriptionContractCalculationLineInput> lines) {
    this.lines = lines;
  }

  /**
   * The manual order and delivery discounts to set on the contract. Replaces all existing manual discounts.
   * - To update an existing discount within the new set, include its `id`.
   * - To add a new discount, omit its `id`.
   * - To remove all manual discounts, provide an empty array (`[]`).
   */
  public List<SubscriptionContractCalculationManualDiscountInput> getManualDiscounts() {
    return manualDiscounts;
  }

  public void setManualDiscounts(
      List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts) {
    this.manualDiscounts = manualDiscounts;
  }

  /**
   * The discount codes to apply during this calculation. Applied codes are resolved into manual
   * discounts on the contract; discount codes aren't persisted as codes, so there's nothing to
   * preserve or replace across calculations. Defaults to an empty array (apply no discount codes).
   */
  public List<SubscriptionContractCalculationDiscountCodeInput> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(
      List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The note for the contract. To remove the existing note, pass `null`.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The custom attributes for the contract. Replaces all existing attributes. To
   * remove all attributes, provide an empty array (`[]`).
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The billing policy for the contract. Replaces the existing billing policy.
   */
  public SubscriptionContractCalculationBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionContractCalculationBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The delivery policy for the contract. Replaces the existing delivery policy.
   */
  public SubscriptionContractCalculationDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The delivery method for the contract. Replaces the existing delivery method.
   * Provide `none` to remove the delivery method. Provide
   * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
   * address without changing the committed delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodInput getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The payment method for the contract. Replaces the existing payment method. Provide `none` to remove the payment method.
   */
  public SubscriptionContractCalculationPaymentMethodInput getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(SubscriptionContractCalculationPaymentMethodInput paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * App-managed billing configuration for the contract. Replaces the existing configuration.
   */
  public SubscriptionContractCalculationAppManagedBillingConfigInput getAppManagedBillingConfig() {
    return appManagedBillingConfig;
  }

  public void setAppManagedBillingConfig(
      SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig) {
    this.appManagedBillingConfig = appManagedBillingConfig;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationContractUpdateInput{withMerchandiseCustomizations='" + withMerchandiseCustomizations + "', lines='" + lines + "', manualDiscounts='" + manualDiscounts + "', discountCodes='" + discountCodes + "', note='" + note + "', customAttributes='" + customAttributes + "', billingPolicy='" + billingPolicy + "', deliveryPolicy='" + deliveryPolicy + "', deliveryMethod='" + deliveryMethod + "', paymentMethod='" + paymentMethod + "', appManagedBillingConfig='" + appManagedBillingConfig + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationContractUpdateInput that = (SubscriptionContractCalculationContractUpdateInput) o;
    return withMerchandiseCustomizations == that.withMerchandiseCustomizations &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(manualDiscounts, that.manualDiscounts) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(note, that.note) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(paymentMethod, that.paymentMethod) &&
        Objects.equals(appManagedBillingConfig, that.appManagedBillingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withMerchandiseCustomizations, lines, manualDiscounts, discountCodes, note, customAttributes, billingPolicy, deliveryPolicy, deliveryMethod, paymentMethod, appManagedBillingConfig);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    private boolean withMerchandiseCustomizations;

    /**
     * The subscription lines to set on the contract. Replaces all existing lines
     * with the contents of this array. At least one line is required.
     * - To update an existing line within the new set, include its `id`.
     * - To add a new line, omit its `id`.
     */
    private List<SubscriptionContractCalculationLineInput> lines;

    /**
     * The manual order and delivery discounts to set on the contract. Replaces all existing manual discounts.
     * - To update an existing discount within the new set, include its `id`.
     * - To add a new discount, omit its `id`.
     * - To remove all manual discounts, provide an empty array (`[]`).
     */
    private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

    /**
     * The discount codes to apply during this calculation. Applied codes are resolved into manual
     * discounts on the contract; discount codes aren't persisted as codes, so there's nothing to
     * preserve or replace across calculations. Defaults to an empty array (apply no discount codes).
     */
    private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

    /**
     * The note for the contract. To remove the existing note, pass `null`.
     */
    private String note;

    /**
     * The custom attributes for the contract. Replaces all existing attributes. To
     * remove all attributes, provide an empty array (`[]`).
     */
    private List<AttributeInput> customAttributes;

    /**
     * The billing policy for the contract. Replaces the existing billing policy.
     */
    private SubscriptionContractCalculationBillingPolicyInput billingPolicy;

    /**
     * The delivery policy for the contract. Replaces the existing delivery policy.
     */
    private SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy;

    /**
     * The delivery method for the contract. Replaces the existing delivery method.
     * Provide `none` to remove the delivery method. Provide
     * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
     * address without changing the committed delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

    /**
     * The payment method for the contract. Replaces the existing payment method. Provide `none` to remove the payment method.
     */
    private SubscriptionContractCalculationPaymentMethodInput paymentMethod;

    /**
     * App-managed billing configuration for the contract. Replaces the existing configuration.
     */
    private SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig;

    public SubscriptionContractCalculationContractUpdateInput build() {
      SubscriptionContractCalculationContractUpdateInput result = new SubscriptionContractCalculationContractUpdateInput();
      result.withMerchandiseCustomizations = this.withMerchandiseCustomizations;
      result.lines = this.lines;
      result.manualDiscounts = this.manualDiscounts;
      result.discountCodes = this.discountCodes;
      result.note = this.note;
      result.customAttributes = this.customAttributes;
      result.billingPolicy = this.billingPolicy;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryMethod = this.deliveryMethod;
      result.paymentMethod = this.paymentMethod;
      result.appManagedBillingConfig = this.appManagedBillingConfig;
      return result;
    }

    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    public Builder withMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
      this.withMerchandiseCustomizations = withMerchandiseCustomizations;
      return this;
    }

    /**
     * The subscription lines to set on the contract. Replaces all existing lines
     * with the contents of this array. At least one line is required.
     * - To update an existing line within the new set, include its `id`.
     * - To add a new line, omit its `id`.
     */
    public Builder lines(List<SubscriptionContractCalculationLineInput> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The manual order and delivery discounts to set on the contract. Replaces all existing manual discounts.
     * - To update an existing discount within the new set, include its `id`.
     * - To add a new discount, omit its `id`.
     * - To remove all manual discounts, provide an empty array (`[]`).
     */
    public Builder manualDiscounts(
        List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts) {
      this.manualDiscounts = manualDiscounts;
      return this;
    }

    /**
     * The discount codes to apply during this calculation. Applied codes are resolved into manual
     * discounts on the contract; discount codes aren't persisted as codes, so there's nothing to
     * preserve or replace across calculations. Defaults to an empty array (apply no discount codes).
     */
    public Builder discountCodes(
        List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The note for the contract. To remove the existing note, pass `null`.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The custom attributes for the contract. Replaces all existing attributes. To
     * remove all attributes, provide an empty array (`[]`).
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The billing policy for the contract. Replaces the existing billing policy.
     */
    public Builder billingPolicy(SubscriptionContractCalculationBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The delivery policy for the contract. Replaces the existing delivery policy.
     */
    public Builder deliveryPolicy(
        SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The delivery method for the contract. Replaces the existing delivery method.
     * Provide `none` to remove the delivery method. Provide
     * `fetchAvailableDeliveryOptions` instead of a method to discover options for an
     * address without changing the committed delivery method.
     */
    public Builder deliveryMethod(
        SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The payment method for the contract. Replaces the existing payment method. Provide `none` to remove the payment method.
     */
    public Builder paymentMethod(SubscriptionContractCalculationPaymentMethodInput paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * App-managed billing configuration for the contract. Replaces the existing configuration.
     */
    public Builder appManagedBillingConfig(
        SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig) {
      this.appManagedBillingConfig = appManagedBillingConfig;
      return this;
    }
  }
}
