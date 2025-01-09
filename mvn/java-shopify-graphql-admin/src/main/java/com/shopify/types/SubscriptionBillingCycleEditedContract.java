package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a subscription contract with billing cycles.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingCycleEditedContract implements com.shopify.types.SubscriptionContractBase {
  /**
   * The subscription app that the subscription contract is registered to.
   */
  private App app;

  /**
   * The URL of the subscription contract page on the subscription app.
   */
  private String appAdminUrl;

  /**
   * The billing cycles that the edited contract belongs to.
   */
  private SubscriptionBillingCycleConnection billingCycles;

  /**
   * The date and time when the subscription contract was created.
   */
  private OffsetDateTime createdAt;

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
   * The delivery price for each billing of the subscription contract.
   */
  private MoneyV2 deliveryPrice;

  /**
   * The list of subscription discounts associated with the subscription contract.
   */
  private SubscriptionManualDiscountConnection discounts;

  /**
   * The number of lines associated with the subscription contract.
   */
  private int lineCount;

  /**
   * The list of subscription lines associated with the subscription contract.
   */
  private SubscriptionLineConnection lines;

  /**
   * The number of lines associated with the subscription contract.
   */
  private Count linesCount;

  /**
   * The note field that will be applied to the generated orders.
   */
  private String note;

  /**
   * A list of the subscription contract's orders.
   */
  private OrderConnection orders;

  /**
   * The date and time when the subscription contract was updated.
   */
  private OffsetDateTime updatedAt;

  public SubscriptionBillingCycleEditedContract() {
  }

  /**
   * The subscription app that the subscription contract is registered to.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The URL of the subscription contract page on the subscription app.
   */
  public String getAppAdminUrl() {
    return appAdminUrl;
  }

  public void setAppAdminUrl(String appAdminUrl) {
    this.appAdminUrl = appAdminUrl;
  }

  /**
   * The billing cycles that the edited contract belongs to.
   */
  public SubscriptionBillingCycleConnection getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(SubscriptionBillingCycleConnection billingCycles) {
    this.billingCycles = billingCycles;
  }

  /**
   * The date and time when the subscription contract was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * The number of lines associated with the subscription contract.
   */
  public int getLineCount() {
    return lineCount;
  }

  public void setLineCount(int lineCount) {
    this.lineCount = lineCount;
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
   * The number of lines associated with the subscription contract.
   */
  public Count getLinesCount() {
    return linesCount;
  }

  public void setLinesCount(Count linesCount) {
    this.linesCount = linesCount;
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
   * A list of the subscription contract's orders.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The date and time when the subscription contract was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleEditedContract{app='" + app + "', appAdminUrl='" + appAdminUrl + "', billingCycles='" + billingCycles + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', lineCount='" + lineCount + "', lines='" + lines + "', linesCount='" + linesCount + "', note='" + note + "', orders='" + orders + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleEditedContract that = (SubscriptionBillingCycleEditedContract) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appAdminUrl, that.appAdminUrl) &&
        Objects.equals(billingCycles, that.billingCycles) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        lineCount == that.lineCount &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesCount, that.linesCount) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appAdminUrl, billingCycles, createdAt, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryPrice, discounts, lineCount, lines, linesCount, note, orders, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The subscription app that the subscription contract is registered to.
     */
    private App app;

    /**
     * The URL of the subscription contract page on the subscription app.
     */
    private String appAdminUrl;

    /**
     * The billing cycles that the edited contract belongs to.
     */
    private SubscriptionBillingCycleConnection billingCycles;

    /**
     * The date and time when the subscription contract was created.
     */
    private OffsetDateTime createdAt;

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
     * The delivery price for each billing of the subscription contract.
     */
    private MoneyV2 deliveryPrice;

    /**
     * The list of subscription discounts associated with the subscription contract.
     */
    private SubscriptionManualDiscountConnection discounts;

    /**
     * The number of lines associated with the subscription contract.
     */
    private int lineCount;

    /**
     * The list of subscription lines associated with the subscription contract.
     */
    private SubscriptionLineConnection lines;

    /**
     * The number of lines associated with the subscription contract.
     */
    private Count linesCount;

    /**
     * The note field that will be applied to the generated orders.
     */
    private String note;

    /**
     * A list of the subscription contract's orders.
     */
    private OrderConnection orders;

    /**
     * The date and time when the subscription contract was updated.
     */
    private OffsetDateTime updatedAt;

    public SubscriptionBillingCycleEditedContract build() {
      SubscriptionBillingCycleEditedContract result = new SubscriptionBillingCycleEditedContract();
      result.app = this.app;
      result.appAdminUrl = this.appAdminUrl;
      result.billingCycles = this.billingCycles;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.lineCount = this.lineCount;
      result.lines = this.lines;
      result.linesCount = this.linesCount;
      result.note = this.note;
      result.orders = this.orders;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The subscription app that the subscription contract is registered to.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The URL of the subscription contract page on the subscription app.
     */
    public Builder appAdminUrl(String appAdminUrl) {
      this.appAdminUrl = appAdminUrl;
      return this;
    }

    /**
     * The billing cycles that the edited contract belongs to.
     */
    public Builder billingCycles(SubscriptionBillingCycleConnection billingCycles) {
      this.billingCycles = billingCycles;
      return this;
    }

    /**
     * The date and time when the subscription contract was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * The number of lines associated with the subscription contract.
     */
    public Builder lineCount(int lineCount) {
      this.lineCount = lineCount;
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
     * The number of lines associated with the subscription contract.
     */
    public Builder linesCount(Count linesCount) {
      this.linesCount = linesCount;
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
     * A list of the subscription contract's orders.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The date and time when the subscription contract was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
