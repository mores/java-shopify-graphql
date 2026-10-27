package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A calculated subscription contract that can be previewed before committing.
 */
public class SubscriptionCalculatedContract {
  /**
   * The billing policy associated with the subscription contract.
   */
  private SubscriptionBillingPolicy billingPolicy;

  /**
   * The currency that's used for the subscription contract.
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
   * The customer payment method that's used for the subscription contract.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * The delivery method for each billing of the subscription contract.
   */
  private SubscriptionDeliveryMethod deliveryMethod;

  /**
   * The delivery policy associated with the subscription contract.
   */
  private SubscriptionDeliveryPolicy deliveryPolicy;

  /**
   * The delivery price for each billing of the subscription contract.
   */
  private MoneyV2 deliveryPrice;

  /**
   * The list of subscription discounts associated with the subscription contract.
   */
  private SubscriptionManualDiscountConnection discounts;

  /**
   * The list of subscription lines grouped by bundle parent, with bundle components nested under their parent line.
   */
  private SubscriptionGroupedLineConnection groupedLines;

  /**
   * The list of subscription lines associated with the subscription contract.
   */
  private SubscriptionLineConnection lines;

  /**
   * The note field that will be applied to the generated orders.
   */
  private String note;

  public SubscriptionCalculatedContract() {
  }

  /**
   * The billing policy associated with the subscription contract.
   */
  public SubscriptionBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SubscriptionBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The currency that's used for the subscription contract.
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
   * The customer payment method that's used for the subscription contract.
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
   * The delivery policy associated with the subscription contract.
   */
  public SubscriptionDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * The delivery price for each billing of the subscription contract.
   */
  public MoneyV2 getDeliveryPrice() {
    return deliveryPrice;
  }

  public void setDeliveryPrice(MoneyV2 deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
  }

  /**
   * The list of subscription discounts associated with the subscription contract.
   */
  public SubscriptionManualDiscountConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(SubscriptionManualDiscountConnection discounts) {
    this.discounts = discounts;
  }

  /**
   * The list of subscription lines grouped by bundle parent, with bundle components nested under their parent line.
   */
  public SubscriptionGroupedLineConnection getGroupedLines() {
    return groupedLines;
  }

  public void setGroupedLines(SubscriptionGroupedLineConnection groupedLines) {
    this.groupedLines = groupedLines;
  }

  /**
   * The list of subscription lines associated with the subscription contract.
   */
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
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

  @Override
  public String toString() {
    return "SubscriptionCalculatedContract{billingPolicy='" + billingPolicy + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', groupedLines='" + groupedLines + "', lines='" + lines + "', note='" + note + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionCalculatedContract that = (SubscriptionCalculatedContract) o;
    return Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(groupedLines, that.groupedLines) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(note, that.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPolicy, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryPolicy, deliveryPrice, discounts, groupedLines, lines, note);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The billing policy associated with the subscription contract.
     */
    private SubscriptionBillingPolicy billingPolicy;

    /**
     * The currency that's used for the subscription contract.
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
     * The customer payment method that's used for the subscription contract.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * The delivery method for each billing of the subscription contract.
     */
    private SubscriptionDeliveryMethod deliveryMethod;

    /**
     * The delivery policy associated with the subscription contract.
     */
    private SubscriptionDeliveryPolicy deliveryPolicy;

    /**
     * The delivery price for each billing of the subscription contract.
     */
    private MoneyV2 deliveryPrice;

    /**
     * The list of subscription discounts associated with the subscription contract.
     */
    private SubscriptionManualDiscountConnection discounts;

    /**
     * The list of subscription lines grouped by bundle parent, with bundle components nested under their parent line.
     */
    private SubscriptionGroupedLineConnection groupedLines;

    /**
     * The list of subscription lines associated with the subscription contract.
     */
    private SubscriptionLineConnection lines;

    /**
     * The note field that will be applied to the generated orders.
     */
    private String note;

    public SubscriptionCalculatedContract build() {
      SubscriptionCalculatedContract result = new SubscriptionCalculatedContract();
      result.billingPolicy = this.billingPolicy;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.groupedLines = this.groupedLines;
      result.lines = this.lines;
      result.note = this.note;
      return result;
    }

    /**
     * The billing policy associated with the subscription contract.
     */
    public Builder billingPolicy(SubscriptionBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The currency that's used for the subscription contract.
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
     * The customer payment method that's used for the subscription contract.
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
     * The delivery policy associated with the subscription contract.
     */
    public Builder deliveryPolicy(SubscriptionDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * The delivery price for each billing of the subscription contract.
     */
    public Builder deliveryPrice(MoneyV2 deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    /**
     * The list of subscription discounts associated with the subscription contract.
     */
    public Builder discounts(SubscriptionManualDiscountConnection discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The list of subscription lines grouped by bundle parent, with bundle components nested under their parent line.
     */
    public Builder groupedLines(SubscriptionGroupedLineConnection groupedLines) {
      this.groupedLines = groupedLines;
      return this;
    }

    /**
     * The list of subscription lines associated with the subscription contract.
     */
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The note field that will be applied to the generated orders.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }
  }
}
