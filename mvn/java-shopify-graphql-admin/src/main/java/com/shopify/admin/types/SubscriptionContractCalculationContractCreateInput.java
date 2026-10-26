package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for calculating a new subscription contract. Provide the
 * complete desired state of the contract. The contract isn't created until you
 * commit the calculation with the [`subscriptionContractCalculationCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCalculationCommit) mutation.
 *
 * Learn how to [build a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscription-contract).
 */
public class SubscriptionContractCalculationContractCreateInput {
  /**
   * The actor who initiated a subscription action.
   */
  private SubscriptionActor actor;

  /**
   * Specifies whether to use merchandise customizations in the calculation.
   */
  private boolean withMerchandiseCustomizations;

  /**
   * The ID of the customer to associate with the new subscription contract.
   */
  private String customerId;

  /**
   * The currency code for the new subscription contract.
   */
  private CurrencyCode currencyCode;

  /**
   * The subscription lines for the new contract.
   */
  private List<SubscriptionContractCalculationLineInput> lines;

  /**
   * The manual order and delivery discounts for the new contract. Provide an empty array for no manual discounts.
   */
  private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

  /**
   * The discount codes to apply during this calculation. Applied codes are resolved into manual
   * discounts on the resulting contract. Defaults to an empty array (apply no discount codes).
   */
  private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

  /**
   * The note for the new contract.
   */
  private String note;

  /**
   * The custom attributes for the new contract.
   */
  private List<AttributeInput> customAttributes = Collections.emptyList();

  /**
   * The billing policy for the new contract.
   */
  private SubscriptionContractCalculationBillingPolicyInput billingPolicy;

  /**
   * The delivery policy for the new contract.
   */
  private SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy;

  /**
   * The delivery method for the new contract. Provide `none` for digital-only
   * subscriptions. Provide `fetchAvailableDeliveryOptions` instead of a method to
   * discover options for an address without committing a delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

  /**
   * The payment method for the new contract. Provide `none` if no payment method is specified.
   */
  private SubscriptionContractCalculationPaymentMethodInput paymentMethod;

  /**
   * App-managed billing configuration for the contract.
   */
  private SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig;

  public SubscriptionContractCalculationContractCreateInput() {
  }

  /**
   * The actor who initiated a subscription action.
   */
  public SubscriptionActor getActor() {
    return actor;
  }

  public void setActor(SubscriptionActor actor) {
    this.actor = actor;
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
   * The ID of the customer to associate with the new subscription contract.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The currency code for the new subscription contract.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The subscription lines for the new contract.
   */
  public List<SubscriptionContractCalculationLineInput> getLines() {
    return lines;
  }

  public void setLines(List<SubscriptionContractCalculationLineInput> lines) {
    this.lines = lines;
  }

  /**
   * The manual order and delivery discounts for the new contract. Provide an empty array for no manual discounts.
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
   * discounts on the resulting contract. Defaults to an empty array (apply no discount codes).
   */
  public List<SubscriptionContractCalculationDiscountCodeInput> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(
      List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The note for the new contract.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The custom attributes for the new contract.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The billing policy for the new contract.
   */
  public SubscriptionContractCalculationBillingPolicyInput getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionContractCalculationBillingPolicyInput billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The delivery policy for the new contract.
   */
  public SubscriptionContractCalculationDeliveryPolicyInput getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The delivery method for the new contract. Provide `none` for digital-only
   * subscriptions. Provide `fetchAvailableDeliveryOptions` instead of a method to
   * discover options for an address without committing a delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodInput getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The payment method for the new contract. Provide `none` if no payment method is specified.
   */
  public SubscriptionContractCalculationPaymentMethodInput getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(SubscriptionContractCalculationPaymentMethodInput paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * App-managed billing configuration for the contract.
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
    return "SubscriptionContractCalculationContractCreateInput{actor='" + actor + "', withMerchandiseCustomizations='" + withMerchandiseCustomizations + "', customerId='" + customerId + "', currencyCode='" + currencyCode + "', lines='" + lines + "', manualDiscounts='" + manualDiscounts + "', discountCodes='" + discountCodes + "', note='" + note + "', customAttributes='" + customAttributes + "', billingPolicy='" + billingPolicy + "', deliveryPolicy='" + deliveryPolicy + "', deliveryMethod='" + deliveryMethod + "', paymentMethod='" + paymentMethod + "', appManagedBillingConfig='" + appManagedBillingConfig + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationContractCreateInput that = (SubscriptionContractCalculationContractCreateInput) o;
    return Objects.equals(actor, that.actor) &&
        withMerchandiseCustomizations == that.withMerchandiseCustomizations &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(currencyCode, that.currencyCode) &&
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
    return Objects.hash(actor, withMerchandiseCustomizations, customerId, currencyCode, lines, manualDiscounts, discountCodes, note, customAttributes, billingPolicy, deliveryPolicy, deliveryMethod, paymentMethod, appManagedBillingConfig);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The actor who initiated a subscription action.
     */
    private SubscriptionActor actor;

    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    private boolean withMerchandiseCustomizations;

    /**
     * The ID of the customer to associate with the new subscription contract.
     */
    private String customerId;

    /**
     * The currency code for the new subscription contract.
     */
    private CurrencyCode currencyCode;

    /**
     * The subscription lines for the new contract.
     */
    private List<SubscriptionContractCalculationLineInput> lines;

    /**
     * The manual order and delivery discounts for the new contract. Provide an empty array for no manual discounts.
     */
    private List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts;

    /**
     * The discount codes to apply during this calculation. Applied codes are resolved into manual
     * discounts on the resulting contract. Defaults to an empty array (apply no discount codes).
     */
    private List<SubscriptionContractCalculationDiscountCodeInput> discountCodes = Collections.emptyList();

    /**
     * The note for the new contract.
     */
    private String note;

    /**
     * The custom attributes for the new contract.
     */
    private List<AttributeInput> customAttributes = Collections.emptyList();

    /**
     * The billing policy for the new contract.
     */
    private SubscriptionContractCalculationBillingPolicyInput billingPolicy;

    /**
     * The delivery policy for the new contract.
     */
    private SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy;

    /**
     * The delivery method for the new contract. Provide `none` for digital-only
     * subscriptions. Provide `fetchAvailableDeliveryOptions` instead of a method to
     * discover options for an address without committing a delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodInput deliveryMethod;

    /**
     * The payment method for the new contract. Provide `none` if no payment method is specified.
     */
    private SubscriptionContractCalculationPaymentMethodInput paymentMethod;

    /**
     * App-managed billing configuration for the contract.
     */
    private SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig;

    public SubscriptionContractCalculationContractCreateInput build() {
      SubscriptionContractCalculationContractCreateInput result = new SubscriptionContractCalculationContractCreateInput();
      result.actor = this.actor;
      result.withMerchandiseCustomizations = this.withMerchandiseCustomizations;
      result.customerId = this.customerId;
      result.currencyCode = this.currencyCode;
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
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      return this;
    }

    /**
     * Specifies whether to use merchandise customizations in the calculation.
     */
    public Builder withMerchandiseCustomizations(boolean withMerchandiseCustomizations) {
      this.withMerchandiseCustomizations = withMerchandiseCustomizations;
      return this;
    }

    /**
     * The ID of the customer to associate with the new subscription contract.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The currency code for the new subscription contract.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The subscription lines for the new contract.
     */
    public Builder lines(List<SubscriptionContractCalculationLineInput> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The manual order and delivery discounts for the new contract. Provide an empty array for no manual discounts.
     */
    public Builder manualDiscounts(
        List<SubscriptionContractCalculationManualDiscountInput> manualDiscounts) {
      this.manualDiscounts = manualDiscounts;
      return this;
    }

    /**
     * The discount codes to apply during this calculation. Applied codes are resolved into manual
     * discounts on the resulting contract. Defaults to an empty array (apply no discount codes).
     */
    public Builder discountCodes(
        List<SubscriptionContractCalculationDiscountCodeInput> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The note for the new contract.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The custom attributes for the new contract.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The billing policy for the new contract.
     */
    public Builder billingPolicy(SubscriptionContractCalculationBillingPolicyInput billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The delivery policy for the new contract.
     */
    public Builder deliveryPolicy(
        SubscriptionContractCalculationDeliveryPolicyInput deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The delivery method for the new contract. Provide `none` for digital-only
     * subscriptions. Provide `fetchAvailableDeliveryOptions` instead of a method to
     * discover options for an address without committing a delivery method.
     */
    public Builder deliveryMethod(
        SubscriptionContractCalculationDeliveryMethodInput deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The payment method for the new contract. Provide `none` if no payment method is specified.
     */
    public Builder paymentMethod(SubscriptionContractCalculationPaymentMethodInput paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * App-managed billing configuration for the contract.
     */
    public Builder appManagedBillingConfig(
        SubscriptionContractCalculationAppManagedBillingConfigInput appManagedBillingConfig) {
      this.appManagedBillingConfig = appManagedBillingConfig;
      return this;
    }
  }
}
