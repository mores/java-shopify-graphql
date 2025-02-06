package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Contract.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionContract implements com.shopify.types.Node, com.shopify.types.SubscriptionContractBase {
  /**
   * The subscription app that the subscription contract is registered to.
   */
  private App app;

  /**
   * The URL of the subscription contract page on the subscription app.
   */
  private String appAdminUrl;

  /**
   * The list of billing attempts associated with the subscription contract.
   */
  private SubscriptionBillingAttemptConnection billingAttempts;

  /**
   * The billing policy associated with the subscription contract.
   */
  private SubscriptionBillingPolicy billingPolicy;

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
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last billing error type of the contract.
   */
  private SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType;

  /**
   * The current status of the last payment.
   */
  private SubscriptionContractLastPaymentStatus lastPaymentStatus;

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
   * The next billing date for the subscription contract. This field is managed by the apps.
   *         Alternatively you can utilize our
   *         [Billing Cycles APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
   *         which provide auto-computed billing dates and additional functionalities.
   */
  private OffsetDateTime nextBillingDate;

  /**
   * The note field that will be applied to the generated orders.
   */
  private String note;

  /**
   * A list of the subscription contract's orders.
   */
  private OrderConnection orders;

  /**
   * The order from which this contract originated.
   */
  private Order originOrder;

  /**
   * The revision id of the contract.
   */
  private String revisionId;

  /**
   * The current status of the subscription contract.
   */
  private SubscriptionContractSubscriptionStatus status;

  /**
   * The date and time when the subscription contract was updated.
   */
  private OffsetDateTime updatedAt;

  public SubscriptionContract() {
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
   * The list of billing attempts associated with the subscription contract.
   */
  public SubscriptionBillingAttemptConnection getBillingAttempts() {
    return billingAttempts;
  }

  public void setBillingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
    this.billingAttempts = billingAttempts;
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
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The last billing error type of the contract.
   */
  public SubscriptionContractLastBillingErrorType getLastBillingAttemptErrorType() {
    return lastBillingAttemptErrorType;
  }

  public void setLastBillingAttemptErrorType(
      SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType) {
    this.lastBillingAttemptErrorType = lastBillingAttemptErrorType;
  }

  /**
   * The current status of the last payment.
   */
  public SubscriptionContractLastPaymentStatus getLastPaymentStatus() {
    return lastPaymentStatus;
  }

  public void setLastPaymentStatus(SubscriptionContractLastPaymentStatus lastPaymentStatus) {
    this.lastPaymentStatus = lastPaymentStatus;
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
   * The next billing date for the subscription contract. This field is managed by the apps.
   *         Alternatively you can utilize our
   *         [Billing Cycles APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
   *         which provide auto-computed billing dates and additional functionalities.
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
   * A list of the subscription contract's orders.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The order from which this contract originated.
   */
  public Order getOriginOrder() {
    return originOrder;
  }

  public void setOriginOrder(Order originOrder) {
    this.originOrder = originOrder;
  }

  /**
   * The revision id of the contract.
   */
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
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
    return "SubscriptionContract{app='" + app + "', appAdminUrl='" + appAdminUrl + "', billingAttempts='" + billingAttempts + "', billingPolicy='" + billingPolicy + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerPaymentMethod='" + customerPaymentMethod + "', deliveryMethod='" + deliveryMethod + "', deliveryPolicy='" + deliveryPolicy + "', deliveryPrice='" + deliveryPrice + "', discounts='" + discounts + "', id='" + id + "', lastBillingAttemptErrorType='" + lastBillingAttemptErrorType + "', lastPaymentStatus='" + lastPaymentStatus + "', lineCount='" + lineCount + "', lines='" + lines + "', linesCount='" + linesCount + "', nextBillingDate='" + nextBillingDate + "', note='" + note + "', orders='" + orders + "', originOrder='" + originOrder + "', revisionId='" + revisionId + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContract that = (SubscriptionContract) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appAdminUrl, that.appAdminUrl) &&
        Objects.equals(billingAttempts, that.billingAttempts) &&
        Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(deliveryPrice, that.deliveryPrice) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastBillingAttemptErrorType, that.lastBillingAttemptErrorType) &&
        Objects.equals(lastPaymentStatus, that.lastPaymentStatus) &&
        lineCount == that.lineCount &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(linesCount, that.linesCount) &&
        Objects.equals(nextBillingDate, that.nextBillingDate) &&
        Objects.equals(note, that.note) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(originOrder, that.originOrder) &&
        Objects.equals(revisionId, that.revisionId) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appAdminUrl, billingAttempts, billingPolicy, createdAt, currencyCode, customAttributes, customer, customerPaymentMethod, deliveryMethod, deliveryPolicy, deliveryPrice, discounts, id, lastBillingAttemptErrorType, lastPaymentStatus, lineCount, lines, linesCount, nextBillingDate, note, orders, originOrder, revisionId, status, updatedAt);
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
     * The list of billing attempts associated with the subscription contract.
     */
    private SubscriptionBillingAttemptConnection billingAttempts;

    /**
     * The billing policy associated with the subscription contract.
     */
    private SubscriptionBillingPolicy billingPolicy;

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
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last billing error type of the contract.
     */
    private SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType;

    /**
     * The current status of the last payment.
     */
    private SubscriptionContractLastPaymentStatus lastPaymentStatus;

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
     * The next billing date for the subscription contract. This field is managed by the apps.
     *         Alternatively you can utilize our
     *         [Billing Cycles APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
     *         which provide auto-computed billing dates and additional functionalities.
     */
    private OffsetDateTime nextBillingDate;

    /**
     * The note field that will be applied to the generated orders.
     */
    private String note;

    /**
     * A list of the subscription contract's orders.
     */
    private OrderConnection orders;

    /**
     * The order from which this contract originated.
     */
    private Order originOrder;

    /**
     * The revision id of the contract.
     */
    private String revisionId;

    /**
     * The current status of the subscription contract.
     */
    private SubscriptionContractSubscriptionStatus status;

    /**
     * The date and time when the subscription contract was updated.
     */
    private OffsetDateTime updatedAt;

    public SubscriptionContract build() {
      SubscriptionContract result = new SubscriptionContract();
      result.app = this.app;
      result.appAdminUrl = this.appAdminUrl;
      result.billingAttempts = this.billingAttempts;
      result.billingPolicy = this.billingPolicy;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.deliveryMethod = this.deliveryMethod;
      result.deliveryPolicy = this.deliveryPolicy;
      result.deliveryPrice = this.deliveryPrice;
      result.discounts = this.discounts;
      result.id = this.id;
      result.lastBillingAttemptErrorType = this.lastBillingAttemptErrorType;
      result.lastPaymentStatus = this.lastPaymentStatus;
      result.lineCount = this.lineCount;
      result.lines = this.lines;
      result.linesCount = this.linesCount;
      result.nextBillingDate = this.nextBillingDate;
      result.note = this.note;
      result.orders = this.orders;
      result.originOrder = this.originOrder;
      result.revisionId = this.revisionId;
      result.status = this.status;
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
     * The list of billing attempts associated with the subscription contract.
     */
    public Builder billingAttempts(SubscriptionBillingAttemptConnection billingAttempts) {
      this.billingAttempts = billingAttempts;
      return this;
    }

    /**
     * The billing policy associated with the subscription contract.
     */
    public Builder billingPolicy(SubscriptionBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
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
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The last billing error type of the contract.
     */
    public Builder lastBillingAttemptErrorType(
        SubscriptionContractLastBillingErrorType lastBillingAttemptErrorType) {
      this.lastBillingAttemptErrorType = lastBillingAttemptErrorType;
      return this;
    }

    /**
     * The current status of the last payment.
     */
    public Builder lastPaymentStatus(SubscriptionContractLastPaymentStatus lastPaymentStatus) {
      this.lastPaymentStatus = lastPaymentStatus;
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
     * The next billing date for the subscription contract. This field is managed by the apps.
     *         Alternatively you can utilize our
     *         [Billing Cycles APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
     *         which provide auto-computed billing dates and additional functionalities.
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
     * A list of the subscription contract's orders.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The order from which this contract originated.
     */
    public Builder originOrder(Order originOrder) {
      this.originOrder = originOrder;
      return this;
    }

    /**
     * The revision id of the contract.
     */
    public Builder revisionId(String revisionId) {
      this.revisionId = revisionId;
      return this;
    }

    /**
     * The current status of the subscription contract.
     */
    public Builder status(SubscriptionContractSubscriptionStatus status) {
      this.status = status;
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
