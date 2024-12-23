package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Draft.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDraft implements com.shopify.types.Node {
  /**
   * The billing cycle that the subscription contract will be associated with.
   */
  private SubscriptionBillingCycle billingCycle;

  /**
   * The billing policy for the subscription contract.
   */
  private SubscriptionBillingPolicy billingPolicy;

  /**
   * The billing cycles of the contracts that will be concatenated to the subscription contract.
   */
  private SubscriptionBillingCycleConnection concatenatedBillingCycles;

  /**
   * The currency used for the subscription contract.
   */
  private CurrencyCode currencyCode;

  /**
   * A list of the custom attributes to be added to the generated orders.
   */
  private List<Attribute> customAttributes;

  /**
   * The customer to whom the subscription contract belongs.
   */
  private Customer customer;

  /**
   * The customer payment method used for the subscription contract.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * The delivery method for each billing of the subscription contract.
   */
  private SubscriptionDeliveryMethod deliveryMethod;

  /**
   * The available delivery options for a given delivery address. Returns `null` for pending requests.
   */
  private SubscriptionDeliveryOptionResult deliveryOptions;

  /**
   * The delivery policy for the subscription contract.
   */
  private SubscriptionDeliveryPolicy deliveryPolicy;

  /**
   * The delivery price for each billing the subscription contract.
   */
  private MoneyV2 deliveryPrice;

  /**
   * The list of subscription discounts which will be associated with the subscription contract.
   */
  private SubscriptionDiscountConnection discounts;

  /**
   * The list of subscription discounts to be added to the subscription contract.
   */
  private SubscriptionDiscountConnection discountsAdded;

  /**
   * The list of subscription discounts to be removed from the subscription contract.
   */
  private SubscriptionDiscountConnection discountsRemoved;

  /**
   * The list of subscription discounts to be updated on the subscription contract.
   */
  private SubscriptionDiscountConnection discountsUpdated;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The list of subscription lines which will be associated with the subscription contract.
   */
  private SubscriptionLineConnection lines;

  /**
   * The list of subscription lines to be added to the subscription contract.
   */
  private SubscriptionLineConnection linesAdded;

  /**
   * The list of subscription lines to be removed from the subscription contract.
   */
  private SubscriptionLineConnection linesRemoved;

  /**
   * The next billing date for the subscription contract.
   */
  private OffsetDateTime nextBillingDate;

  /**
   * The note field that will be applied to the generated orders.
   */
  private String note;

  /**
   * The original subscription contract.
   */
  private SubscriptionContract originalContract;

  /**
   * Available Shipping Options for a given delivery address. Returns NULL for pending requests.
   */
  private SubscriptionShippingOptionResult shippingOptions;

  /**
   * The current status of the subscription contract.
   */
  private SubscriptionContractSubscriptionStatus status;

  public SubscriptionDraft() {
  }

  /**
   * The billing cycle that the subscription contract will be associated with.
   */
  public SubscriptionBillingCycle getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(SubscriptionBillingCycle billingCycle) {
    this.billingCycle = billingCycle;
  }

  /**
   * The billing policy for the subscription contract.
   */
  public SubscriptionBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The billing cycles of the contracts that will be concatenated to the subscription contract.
   */
  public SubscriptionBillingCycleConnection getConcatenatedBillingCycles() {
    return concatenatedBillingCycles;
  }

  public void setConcatenatedBillingCycles(
      SubscriptionBillingCycleConnection concatenatedBillingCycles) {
    this.concatenatedBillingCycles = concatenatedBillingCycles;
  }

  /**
   * The currency used for the subscription contract.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * A list of the custom attributes to be added to the generated orders.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer to whom the subscription contract belongs.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The customer payment method used for the subscription contract.
   */
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * The delivery method for each billing of the subscription contract.
   */
  public SubscriptionDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubscriptionDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The available delivery options for a given delivery address. Returns `null` for pending requests.
   */
  public SubscriptionDeliveryOptionResult getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(SubscriptionDeliveryOptionResult deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  /**
   * The delivery policy for the subscription contract.
   */
  public SubscriptionDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The delivery price for each billing the subscription contract.
   */
  public MoneyV2 getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(MoneyV2 deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  /**
   * The list of subscription discounts which will be associated with the subscription contract.
   */
  public SubscriptionDiscountConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(SubscriptionDiscountConnection discounts) {
    this.discounts = discounts;
  }

  /**
   * The list of subscription discounts to be added to the subscription contract.
   */
  public SubscriptionDiscountConnection getDiscountsAdded() {
    return discountsAdded;
  }

  public void setDiscountsAdded(SubscriptionDiscountConnection discountsAdded) {
    this.discountsAdded = discountsAdded;
  }

  /**
   * The list of subscription discounts to be removed from the subscription contract.
   */
  public SubscriptionDiscountConnection getDiscountsRemoved() {
    return discountsRemoved;
  }

  public void setDiscountsRemoved(SubscriptionDiscountConnection discountsRemoved) {
    this.discountsRemoved = discountsRemoved;
  }

  /**
   * The list of subscription discounts to be updated on the subscription contract.
   */
  public SubscriptionDiscountConnection getDiscountsUpdated() {
    return discountsUpdated;
  }

  public void setDiscountsUpdated(SubscriptionDiscountConnection discountsUpdated) {
    this.discountsUpdated = discountsUpdated;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of subscription lines which will be associated with the subscription contract.
   */
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
  }

  /**
   * The list of subscription lines to be added to the subscription contract.
   */
  public SubscriptionLineConnection getLinesAdded() {
    return linesAdded;
  }

  public void setLinesAdded(SubscriptionLineConnection linesAdded) {
    this.linesAdded = linesAdded;
  }

  /**
   * The list of subscription lines to be removed from the subscription contract.
   */
  public SubscriptionLineConnection getLinesRemoved() {
    return linesRemoved;
  }

  public void setLinesRemoved(SubscriptionLineConnection linesRemoved) {
    this.linesRemoved = linesRemoved;
  }

  /**
   * The next billing date for the subscription contract.
   */
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  /**
   * The note field that will be applied to the generated orders.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The original subscription contract.
   */
  public SubscriptionContract getOriginalContract() {
    return originalContract;
  }

  public void setOriginalContract(SubscriptionContract originalContract) {
    this.originalContract = originalContract;
  }

  /**
   * Available Shipping Options for a given delivery address. Returns NULL for pending requests.
   */
  public SubscriptionShippingOptionResult getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(SubscriptionShippingOptionResult shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  /**
   * The current status of the subscription contract.
   */
  public SubscriptionContractSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionContractSubscriptionStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "SubscriptionDraft{billingCycle='" + billingCycle + "', billingPolicy='" + billingPolicy + "', concatenatedBillingCycles='" + concatenatedBillingCycles + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryOptions='" + deliveryOptions + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', discountsAdded='" + discountsAdded + "', discountsRemoved='" + discountsRemoved + "', discountsUpdated='" + discountsUpdated + "', id='" + id + "', lines='" + lines + "', linesAdded='" + linesAdded + "', linesRemoved='" + linesRemoved + "', nextBillingDate='" + nextBillingDate + "', note='" + note + "', originalContract='" + originalContract + "', shippingOptions='" + shippingOptions + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDraft that = (SubscriptionDraft) o;
    return Objects.equals(billingCycle, that.billingCycle) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(concatenatedBillingCycles, that.concatenatedBillingCycles) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryOptions, that.deliveryOptions) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(discountsAdded, that.discountsAdded) &&
        Objects.equals(discountsRemoved, that.discountsRemoved) &&
        Objects.equals(discountsUpdated, that.discountsUpdated) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesAdded, that.linesAdded) &&
        Objects.equals(linesRemoved, that.linesRemoved) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(note, that.note) &&
        Objects.equals(originalContract, that.originalContract) &&
        Objects.equals(shippingOptions, that.shippingOptions) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycle, billingPolicy, concatenatedBillingCycles, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryOptions, deliveryPolicy, deliveryPrice, discounts, discountsAdded, discountsRemoved, discountsUpdated, id, lines, linesAdded, linesRemoved, nextBillingDate, note, originalContract, shippingOptions, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The billing cycle that the subscription contract will be associated with.
     */
    private SubscriptionBillingCycle billingCycle;

    /**
     * The billing policy for the subscription contract.
     */
    private SubscriptionBillingPolicy billingPolicy;

    /**
     * The billing cycles of the contracts that will be concatenated to the subscription contract.
     */
    private SubscriptionBillingCycleConnection concatenatedBillingCycles;

    /**
     * The currency used for the subscription contract.
     */
    private CurrencyCode currencyCode;

    /**
     * A list of the custom attributes to be added to the generated orders.
     */
    private List<Attribute> customAttributes;

    /**
     * The customer to whom the subscription contract belongs.
     */
    private Customer customer;

    /**
     * The customer payment method used for the subscription contract.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * The delivery method for each billing of the subscription contract.
     */
    private SubscriptionDeliveryMethod deliveryMethod;

    /**
     * The available delivery options for a given delivery address. Returns `null` for pending requests.
     */
    private SubscriptionDeliveryOptionResult deliveryOptions;

    /**
     * The delivery policy for the subscription contract.
     */
    private SubscriptionDeliveryPolicy deliveryPolicy;

    /**
     * The delivery price for each billing the subscription contract.
     */
    private MoneyV2 deliveryPrice;

    /**
     * The list of subscription discounts which will be associated with the subscription contract.
     */
    private SubscriptionDiscountConnection discounts;

    /**
     * The list of subscription discounts to be added to the subscription contract.
     */
    private SubscriptionDiscountConnection discountsAdded;

    /**
     * The list of subscription discounts to be removed from the subscription contract.
     */
    private SubscriptionDiscountConnection discountsRemoved;

    /**
     * The list of subscription discounts to be updated on the subscription contract.
     */
    private SubscriptionDiscountConnection discountsUpdated;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The list of subscription lines which will be associated with the subscription contract.
     */
    private SubscriptionLineConnection lines;

    /**
     * The list of subscription lines to be added to the subscription contract.
     */
    private SubscriptionLineConnection linesAdded;

    /**
     * The list of subscription lines to be removed from the subscription contract.
     */
    private SubscriptionLineConnection linesRemoved;

    /**
     * The next billing date for the subscription contract.
     */
    private OffsetDateTime nextBillingDate;

    /**
     * The note field that will be applied to the generated orders.
     */
    private String note;

    /**
     * The original subscription contract.
     */
    private SubscriptionContract originalContract;

    /**
     * Available Shipping Options for a given delivery address. Returns NULL for pending requests.
     */
    private SubscriptionShippingOptionResult shippingOptions;

    /**
     * The current status of the subscription contract.
     */
    private SubscriptionContractSubscriptionStatus status;

    public SubscriptionDraft build() {
      SubscriptionDraft result = new SubscriptionDraft();
      result.billingCycle = this.billingCycle;
      result.billingPolicy = this.billingPolicy;
      result.concatenatedBillingCycles = this.concatenatedBillingCycles;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryOptions = this.deliveryOptions;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.discountsAdded = this.discountsAdded;
      result.discountsRemoved = this.discountsRemoved;
      result.discountsUpdated = this.discountsUpdated;
      result.id = this.id;
      result.lines = this.lines;
      result.linesAdded = this.linesAdded;
      result.linesRemoved = this.linesRemoved;
      result.nextBillingDate = this.nextBillingDate;
      result.note = this.note;
      result.originalContract = this.originalContract;
      result.shippingOptions = this.shippingOptions;
      result.status = this.status;
      return result;
    }

    /**
     * The billing cycle that the subscription contract will be associated with.
     */
    public Builder billingCycle(SubscriptionBillingCycle billingCycle) {
      this.billingCycle = billingCycle;
      return this;
    }

    /**
     * The billing policy for the subscription contract.
     */
    public Builder billingPolicy(SubscriptionBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The billing cycles of the contracts that will be concatenated to the subscription contract.
     */
    public Builder concatenatedBillingCycles(
        SubscriptionBillingCycleConnection concatenatedBillingCycles) {
      this.concatenatedBillingCycles = concatenatedBillingCycles;
      return this;
    }

    /**
     * The currency used for the subscription contract.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * A list of the custom attributes to be added to the generated orders.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer to whom the subscription contract belongs.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The customer payment method used for the subscription contract.
     */
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * The delivery method for each billing of the subscription contract.
     */
    public Builder deliveryMethod(SubscriptionDeliveryMethod deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The available delivery options for a given delivery address. Returns `null` for pending requests.
     */
    public Builder deliveryOptions(SubscriptionDeliveryOptionResult deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    /**
     * The delivery policy for the subscription contract.
     */
    public Builder deliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The delivery price for each billing the subscription contract.
     */
    public Builder deliveryPrice(MoneyV2 deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    /**
     * The list of subscription discounts which will be associated with the subscription contract.
     */
    public Builder discounts(SubscriptionDiscountConnection discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The list of subscription discounts to be added to the subscription contract.
     */
    public Builder discountsAdded(SubscriptionDiscountConnection discountsAdded) {
      this.discountsAdded = discountsAdded;
      return this;
    }

    /**
     * The list of subscription discounts to be removed from the subscription contract.
     */
    public Builder discountsRemoved(SubscriptionDiscountConnection discountsRemoved) {
      this.discountsRemoved = discountsRemoved;
      return this;
    }

    /**
     * The list of subscription discounts to be updated on the subscription contract.
     */
    public Builder discountsUpdated(SubscriptionDiscountConnection discountsUpdated) {
      this.discountsUpdated = discountsUpdated;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The list of subscription lines which will be associated with the subscription contract.
     */
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The list of subscription lines to be added to the subscription contract.
     */
    public Builder linesAdded(SubscriptionLineConnection linesAdded) {
      this.linesAdded = linesAdded;
      return this;
    }

    /**
     * The list of subscription lines to be removed from the subscription contract.
     */
    public Builder linesRemoved(SubscriptionLineConnection linesRemoved) {
      this.linesRemoved = linesRemoved;
      return this;
    }

    /**
     * The next billing date for the subscription contract.
     */
    public Builder nextBillingDate(OffsetDateTime nextBillingDate) {
      this.nextBillingDate = nextBillingDate;
      return this;
    }

    /**
     * The note field that will be applied to the generated orders.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The original subscription contract.
     */
    public Builder originalContract(SubscriptionContract originalContract) {
      this.originalContract = originalContract;
      return this;
    }

    /**
     * Available Shipping Options for a given delivery address. Returns NULL for pending requests.
     */
    public Builder shippingOptions(SubscriptionShippingOptionResult shippingOptions) {
      this.shippingOptions = shippingOptions;
      return this;
    }

    /**
     * The current status of the subscription contract.
     */
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
      return this;
    }
  }
}
