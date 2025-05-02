package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An order is a customer’s completed request to purchase one or more products from
 * a shop. An order is created when a customer completes the checkout process,
 * during which time they provides an email address, billing address and payment information.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Order implements MetafieldParentResource, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The address associated with the payment method.
   */
  private MailingAddress billingAddress;

  /**
   * The reason for the order's cancellation. Returns `null` if the order wasn't canceled.
   */
  private OrderCancelReason cancelReason;

  /**
   * The date and time when the order was canceled. Returns null if the order wasn't canceled.
   */
  private OffsetDateTime canceledAt;

  /**
   * The code of the currency used for the payment.
   */
  private CurrencyCode currencyCode;

  /**
   * The subtotal of line items and their discounts, excluding line items that have
   * been removed. Does not contain order-level discounts, duties, shipping costs,
   * or shipping discounts. Taxes aren't included unless the order is a
   * taxes-included order.
   */
  private MoneyV2 currentSubtotalPrice;

  /**
   * The total cost of duties for the order, including refunds.
   */
  private MoneyV2 currentTotalDuties;

  /**
   * The total amount of the order, including duties, taxes and discounts, minus amounts for line items that have been removed.
   */
  private MoneyV2 currentTotalPrice;

  /**
   * The total cost of shipping, excluding shipping lines that have been refunded
   * or removed. Taxes aren't included unless the order is a taxes-included order.
   */
  private MoneyV2 currentTotalShippingPrice;

  /**
   * The total of all taxes applied to the order, excluding taxes for returned line items.
   */
  private MoneyV2 currentTotalTax;

  /**
   * A list of the custom attributes added to the order. For example, whether an order is a customer's first.
   */
  private List<Attribute> customAttributes;

  /**
   * The locale code in which this specific order happened.
   */
  private String customerLocale;

  /**
   * The unique URL that the customer can use to access the order.
   */
  private String customerUrl;

  /**
   * Discounts that have been applied on the order.
   */
  private DiscountApplicationConnection discountApplications;

  /**
   * Whether the order has had any edits applied or not.
   */
  private boolean edited;

  /**
   * The customer's email address.
   */
  private String email;

  /**
   * The financial status of the order.
   */
  private OrderFinancialStatus financialStatus;

  /**
   * The fulfillment status for the order.
   */
  private OrderFulfillmentStatus fulfillmentStatus;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * List of the order’s line items.
   */
  private OrderLineItemConnection lineItems;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * Unique identifier for the order that appears on the order.
   * For example, _#1000_ or _Store1001.
   */
  private String name;

  /**
   * A unique numeric identifier for the order for use by shop owner and customer.
   */
  private int orderNumber;

  /**
   * The total cost of duties charged at checkout.
   */
  private MoneyV2 originalTotalDuties;

  /**
   * The total price of the order before any applied edits.
   */
  private MoneyV2 originalTotalPrice;

  /**
   * The customer's phone number for receiving SMS notifications.
   */
  private String phone;

  /**
   * The date and time when the order was imported.
   * This value can be set to dates in the past when importing from other systems.
   * If no value is provided, it will be auto-generated based on current date and time.
   */
  private OffsetDateTime processedAt;

  /**
   * The address to where the order will be shipped.
   */
  private MailingAddress shippingAddress;

  /**
   * The discounts that have been allocated onto the shipping line by discount applications.
   */
  private List<DiscountAllocation> shippingDiscountAllocations;

  /**
   * The unique URL for the order's status page.
   */
  private String statusUrl;

  /**
   * Price of the order before shipping and taxes.
   */
  private MoneyV2 subtotalPrice;

  /**
   * Price of the order before duties, shipping and taxes.
   */
  private MoneyV2 subtotalPriceV2;

  /**
   * List of the order’s successful fulfillments.
   */
  private List<Fulfillment> successfulFulfillments;

  /**
   * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
   */
  private MoneyV2 totalPrice;

  /**
   * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
   */
  private MoneyV2 totalPriceV2;

  /**
   * The total amount that has been refunded.
   */
  private MoneyV2 totalRefunded;

  /**
   * The total amount that has been refunded.
   */
  private MoneyV2 totalRefundedV2;

  /**
   * The total cost of shipping.
   */
  private MoneyV2 totalShippingPrice;

  /**
   * The total cost of shipping.
   */
  private MoneyV2 totalShippingPriceV2;

  /**
   * The total cost of taxes.
   */
  private MoneyV2 totalTax;

  /**
   * The total cost of taxes.
   */
  private MoneyV2 totalTaxV2;

  public Order() {
  }

  /**
   * The address associated with the payment method.
   */
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The reason for the order's cancellation. Returns `null` if the order wasn't canceled.
   */
  public OrderCancelReason getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(OrderCancelReason cancelReason) {
    this.cancelReason = cancelReason;
  }

  /**
   * The date and time when the order was canceled. Returns null if the order wasn't canceled.
   */
  public OffsetDateTime getCanceledAt() {
    return canceledAt;
  }

  public void setCanceledAt(OffsetDateTime canceledAt) {
    this.canceledAt = canceledAt;
  }

  /**
   * The code of the currency used for the payment.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The subtotal of line items and their discounts, excluding line items that have
   * been removed. Does not contain order-level discounts, duties, shipping costs,
   * or shipping discounts. Taxes aren't included unless the order is a
   * taxes-included order.
   */
  public MoneyV2 getCurrentSubtotalPrice() {
    return currentSubtotalPrice;
  }

  public void setCurrentSubtotalPrice(MoneyV2 currentSubtotalPrice) {
    this.currentSubtotalPrice = currentSubtotalPrice;
  }

  /**
   * The total cost of duties for the order, including refunds.
   */
  public MoneyV2 getCurrentTotalDuties() {
    return currentTotalDuties;
  }

  public void setCurrentTotalDuties(MoneyV2 currentTotalDuties) {
    this.currentTotalDuties = currentTotalDuties;
  }

  /**
   * The total amount of the order, including duties, taxes and discounts, minus amounts for line items that have been removed.
   */
  public MoneyV2 getCurrentTotalPrice() {
    return currentTotalPrice;
  }

  public void setCurrentTotalPrice(MoneyV2 currentTotalPrice) {
    this.currentTotalPrice = currentTotalPrice;
  }

  /**
   * The total cost of shipping, excluding shipping lines that have been refunded
   * or removed. Taxes aren't included unless the order is a taxes-included order.
   */
  public MoneyV2 getCurrentTotalShippingPrice() {
    return currentTotalShippingPrice;
  }

  public void setCurrentTotalShippingPrice(MoneyV2 currentTotalShippingPrice) {
    this.currentTotalShippingPrice = currentTotalShippingPrice;
  }

  /**
   * The total of all taxes applied to the order, excluding taxes for returned line items.
   */
  public MoneyV2 getCurrentTotalTax() {
    return currentTotalTax;
  }

  public void setCurrentTotalTax(MoneyV2 currentTotalTax) {
    this.currentTotalTax = currentTotalTax;
  }

  /**
   * A list of the custom attributes added to the order. For example, whether an order is a customer's first.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The locale code in which this specific order happened.
   */
  public String getCustomerLocale() {
    return customerLocale;
  }

  public void setCustomerLocale(String customerLocale) {
    this.customerLocale = customerLocale;
  }

  /**
   * The unique URL that the customer can use to access the order.
   */
  public String getCustomerUrl() {
    return customerUrl;
  }

  public void setCustomerUrl(String customerUrl) {
    this.customerUrl = customerUrl;
  }

  /**
   * Discounts that have been applied on the order.
   */
  public DiscountApplicationConnection getDiscountApplications() {
    return discountApplications;
  }

  public void setDiscountApplications(DiscountApplicationConnection discountApplications) {
    this.discountApplications = discountApplications;
  }

  /**
   * Whether the order has had any edits applied or not.
   */
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  /**
   * The customer's email address.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The financial status of the order.
   */
  public OrderFinancialStatus getFinancialStatus() {
    return financialStatus;
  }

  public void setFinancialStatus(OrderFinancialStatus financialStatus) {
    this.financialStatus = financialStatus;
  }

  /**
   * The fulfillment status for the order.
   */
  public OrderFulfillmentStatus getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(OrderFulfillmentStatus fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
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
   * List of the order’s line items.
   */
  public OrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(OrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * Unique identifier for the order that appears on the order.
   * For example, _#1000_ or _Store1001.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A unique numeric identifier for the order for use by shop owner and customer.
   */
  public int getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * The total cost of duties charged at checkout.
   */
  public MoneyV2 getOriginalTotalDuties() {
    return originalTotalDuties;
  }

  public void setOriginalTotalDuties(MoneyV2 originalTotalDuties) {
    this.originalTotalDuties = originalTotalDuties;
  }

  /**
   * The total price of the order before any applied edits.
   */
  public MoneyV2 getOriginalTotalPrice() {
    return originalTotalPrice;
  }

  public void setOriginalTotalPrice(MoneyV2 originalTotalPrice) {
    this.originalTotalPrice = originalTotalPrice;
  }

  /**
   * The customer's phone number for receiving SMS notifications.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The date and time when the order was imported.
   * This value can be set to dates in the past when importing from other systems.
   * If no value is provided, it will be auto-generated based on current date and time.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The address to where the order will be shipped.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The discounts that have been allocated onto the shipping line by discount applications.
   */
  public List<DiscountAllocation> getShippingDiscountAllocations() {
    return shippingDiscountAllocations;
  }

  public void setShippingDiscountAllocations(List<DiscountAllocation> shippingDiscountAllocations) {
    this.shippingDiscountAllocations = shippingDiscountAllocations;
  }

  /**
   * The unique URL for the order's status page.
   */
  public String getStatusUrl() {
    return statusUrl;
  }

  public void setStatusUrl(String statusUrl) {
    this.statusUrl = statusUrl;
  }

  /**
   * Price of the order before shipping and taxes.
   */
  public MoneyV2 getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(MoneyV2 subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  /**
   * Price of the order before duties, shipping and taxes.
   */
  public MoneyV2 getSubtotalPriceV2() {
    return subtotalPriceV2;
  }

  public void setSubtotalPriceV2(MoneyV2 subtotalPriceV2) {
    this.subtotalPriceV2 = subtotalPriceV2;
  }

  /**
   * List of the order’s successful fulfillments.
   */
  public List<Fulfillment> getSuccessfulFulfillments() {
    return successfulFulfillments;
  }

  public void setSuccessfulFulfillments(List<Fulfillment> successfulFulfillments) {
    this.successfulFulfillments = successfulFulfillments;
  }

  /**
   * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
   */
  public MoneyV2 getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(MoneyV2 totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
   */
  public MoneyV2 getTotalPriceV2() {
    return totalPriceV2;
  }

  public void setTotalPriceV2(MoneyV2 totalPriceV2) {
    this.totalPriceV2 = totalPriceV2;
  }

  /**
   * The total amount that has been refunded.
   */
  public MoneyV2 getTotalRefunded() {
    return totalRefunded;
  }

  public void setTotalRefunded(MoneyV2 totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  /**
   * The total amount that has been refunded.
   */
  public MoneyV2 getTotalRefundedV2() {
    return totalRefundedV2;
  }

  public void setTotalRefundedV2(MoneyV2 totalRefundedV2) {
    this.totalRefundedV2 = totalRefundedV2;
  }

  /**
   * The total cost of shipping.
   */
  public MoneyV2 getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(MoneyV2 totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total cost of shipping.
   */
  public MoneyV2 getTotalShippingPriceV2() {
    return totalShippingPriceV2;
  }

  public void setTotalShippingPriceV2(MoneyV2 totalShippingPriceV2) {
    this.totalShippingPriceV2 = totalShippingPriceV2;
  }

  /**
   * The total cost of taxes.
   */
  public MoneyV2 getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyV2 totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total cost of taxes.
   */
  public MoneyV2 getTotalTaxV2() {
    return totalTaxV2;
  }

  public void setTotalTaxV2(MoneyV2 totalTaxV2) {
    this.totalTaxV2 = totalTaxV2;
  }

  @Override
  public String toString() {
    return "Order{billingAddress='" + billingAddress + "', cancelReason='" + cancelReason + "', canceledAt='" + canceledAt + "', currencyCode='" + currencyCode + "', currentSubtotalPrice='" + currentSubtotalPrice + "', currentTotalDuties='" + currentTotalDuties + "', currentTotalPrice='" + currentTotalPrice + "', currentTotalShippingPrice='" + currentTotalShippingPrice + "', currentTotalTax='" + currentTotalTax + "', customAttributes='" + customAttributes + "', customerLocale='" + customerLocale + "', customerUrl='" + customerUrl + "', discountApplications='" + discountApplications + "', edited='" + edited + "', email='" + email + "', financialStatus='" + financialStatus + "', fulfillmentStatus='" + fulfillmentStatus + "', id='" + id + "', lineItems='" + lineItems + "', metafield='" + metafield + "', metafields='" + metafields + "', name='" + name + "', orderNumber='" + orderNumber + "', originalTotalDuties='" + originalTotalDuties + "', originalTotalPrice='" + originalTotalPrice + "', phone='" + phone + "', processedAt='" + processedAt + "', shippingAddress='" + shippingAddress + "', shippingDiscountAllocations='" + shippingDiscountAllocations + "', statusUrl='" + statusUrl + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceV2='" + subtotalPriceV2 + "', successfulFulfillments='" + successfulFulfillments + "', totalPrice='" + totalPrice + "', totalPriceV2='" + totalPriceV2 + "', totalRefunded='" + totalRefunded + "', totalRefundedV2='" + totalRefundedV2 + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceV2='" + totalShippingPriceV2 + "', totalTax='" + totalTax + "', totalTaxV2='" + totalTaxV2 + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order that = (Order) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(cancelReason, that.cancelReason) &&
        Objects.equals(canceledAt, that.canceledAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currentSubtotalPrice, that.currentSubtotalPrice) &&
        Objects.equals(currentTotalDuties, that.currentTotalDuties) &&
        Objects.equals(currentTotalPrice, that.currentTotalPrice) &&
        Objects.equals(currentTotalShippingPrice, that.currentTotalShippingPrice) &&
        Objects.equals(currentTotalTax, that.currentTotalTax) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customerLocale, that.customerLocale) &&
        Objects.equals(customerUrl, that.customerUrl) &&
        Objects.equals(discountApplications, that.discountApplications) &&
        edited == that.edited &&
        Objects.equals(email, that.email) &&
        Objects.equals(financialStatus, that.financialStatus) &&
        Objects.equals(fulfillmentStatus, that.fulfillmentStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        orderNumber == that.orderNumber &&
        Objects.equals(originalTotalDuties, that.originalTotalDuties) &&
        Objects.equals(originalTotalPrice, that.originalTotalPrice) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingDiscountAllocations, that.shippingDiscountAllocations) &&
        Objects.equals(statusUrl, that.statusUrl) &&
        Objects.equals(subtotalPrice, that.subtotalPrice) &&
        Objects.equals(subtotalPriceV2, that.subtotalPriceV2) &&
        Objects.equals(successfulFulfillments, that.successfulFulfillments) &&
        Objects.equals(totalPrice, that.totalPrice) &&
        Objects.equals(totalPriceV2, that.totalPriceV2) &&
        Objects.equals(totalRefunded, that.totalRefunded) &&
        Objects.equals(totalRefundedV2, that.totalRefundedV2) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalShippingPriceV2, that.totalShippingPriceV2) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxV2, that.totalTaxV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, cancelReason, canceledAt, currencyCode, currentSubtotalPrice, currentTotalDuties, currentTotalPrice, currentTotalShippingPrice, currentTotalTax, customAttributes, customerLocale, customerUrl, discountApplications, edited, email, financialStatus, fulfillmentStatus, id, lineItems, metafield, metafields, name, orderNumber, originalTotalDuties, originalTotalPrice, phone, processedAt, shippingAddress, shippingDiscountAllocations, statusUrl, subtotalPrice, subtotalPriceV2, successfulFulfillments, totalPrice, totalPriceV2, totalRefunded, totalRefundedV2, totalShippingPrice, totalShippingPriceV2, totalTax, totalTaxV2);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address associated with the payment method.
     */
    private MailingAddress billingAddress;

    /**
     * The reason for the order's cancellation. Returns `null` if the order wasn't canceled.
     */
    private OrderCancelReason cancelReason;

    /**
     * The date and time when the order was canceled. Returns null if the order wasn't canceled.
     */
    private OffsetDateTime canceledAt;

    /**
     * The code of the currency used for the payment.
     */
    private CurrencyCode currencyCode;

    /**
     * The subtotal of line items and their discounts, excluding line items that have
     * been removed. Does not contain order-level discounts, duties, shipping costs,
     * or shipping discounts. Taxes aren't included unless the order is a
     * taxes-included order.
     */
    private MoneyV2 currentSubtotalPrice;

    /**
     * The total cost of duties for the order, including refunds.
     */
    private MoneyV2 currentTotalDuties;

    /**
     * The total amount of the order, including duties, taxes and discounts, minus amounts for line items that have been removed.
     */
    private MoneyV2 currentTotalPrice;

    /**
     * The total cost of shipping, excluding shipping lines that have been refunded
     * or removed. Taxes aren't included unless the order is a taxes-included order.
     */
    private MoneyV2 currentTotalShippingPrice;

    /**
     * The total of all taxes applied to the order, excluding taxes for returned line items.
     */
    private MoneyV2 currentTotalTax;

    /**
     * A list of the custom attributes added to the order. For example, whether an order is a customer's first.
     */
    private List<Attribute> customAttributes;

    /**
     * The locale code in which this specific order happened.
     */
    private String customerLocale;

    /**
     * The unique URL that the customer can use to access the order.
     */
    private String customerUrl;

    /**
     * Discounts that have been applied on the order.
     */
    private DiscountApplicationConnection discountApplications;

    /**
     * Whether the order has had any edits applied or not.
     */
    private boolean edited;

    /**
     * The customer's email address.
     */
    private String email;

    /**
     * The financial status of the order.
     */
    private OrderFinancialStatus financialStatus;

    /**
     * The fulfillment status for the order.
     */
    private OrderFulfillmentStatus fulfillmentStatus;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * List of the order’s line items.
     */
    private OrderLineItemConnection lineItems;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * Unique identifier for the order that appears on the order.
     * For example, _#1000_ or _Store1001.
     */
    private String name;

    /**
     * A unique numeric identifier for the order for use by shop owner and customer.
     */
    private int orderNumber;

    /**
     * The total cost of duties charged at checkout.
     */
    private MoneyV2 originalTotalDuties;

    /**
     * The total price of the order before any applied edits.
     */
    private MoneyV2 originalTotalPrice;

    /**
     * The customer's phone number for receiving SMS notifications.
     */
    private String phone;

    /**
     * The date and time when the order was imported.
     * This value can be set to dates in the past when importing from other systems.
     * If no value is provided, it will be auto-generated based on current date and time.
     */
    private OffsetDateTime processedAt;

    /**
     * The address to where the order will be shipped.
     */
    private MailingAddress shippingAddress;

    /**
     * The discounts that have been allocated onto the shipping line by discount applications.
     */
    private List<DiscountAllocation> shippingDiscountAllocations;

    /**
     * The unique URL for the order's status page.
     */
    private String statusUrl;

    /**
     * Price of the order before shipping and taxes.
     */
    private MoneyV2 subtotalPrice;

    /**
     * Price of the order before duties, shipping and taxes.
     */
    private MoneyV2 subtotalPriceV2;

    /**
     * List of the order’s successful fulfillments.
     */
    private List<Fulfillment> successfulFulfillments;

    /**
     * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
     */
    private MoneyV2 totalPrice;

    /**
     * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
     */
    private MoneyV2 totalPriceV2;

    /**
     * The total amount that has been refunded.
     */
    private MoneyV2 totalRefunded;

    /**
     * The total amount that has been refunded.
     */
    private MoneyV2 totalRefundedV2;

    /**
     * The total cost of shipping.
     */
    private MoneyV2 totalShippingPrice;

    /**
     * The total cost of shipping.
     */
    private MoneyV2 totalShippingPriceV2;

    /**
     * The total cost of taxes.
     */
    private MoneyV2 totalTax;

    /**
     * The total cost of taxes.
     */
    private MoneyV2 totalTaxV2;

    public Order build() {
      Order result = new Order();
      result.billingAddress = this.billingAddress;
      result.cancelReason = this.cancelReason;
      result.canceledAt = this.canceledAt;
      result.currencyCode = this.currencyCode;
      result.currentSubtotalPrice = this.currentSubtotalPrice;
      result.currentTotalDuties = this.currentTotalDuties;
      result.currentTotalPrice = this.currentTotalPrice;
      result.currentTotalShippingPrice = this.currentTotalShippingPrice;
      result.currentTotalTax = this.currentTotalTax;
      result.customAttributes = this.customAttributes;
      result.customerLocale = this.customerLocale;
      result.customerUrl = this.customerUrl;
      result.discountApplications = this.discountApplications;
      result.edited = this.edited;
      result.email = this.email;
      result.financialStatus = this.financialStatus;
      result.fulfillmentStatus = this.fulfillmentStatus;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.name = this.name;
      result.orderNumber = this.orderNumber;
      result.originalTotalDuties = this.originalTotalDuties;
      result.originalTotalPrice = this.originalTotalPrice;
      result.phone = this.phone;
      result.processedAt = this.processedAt;
      result.shippingAddress = this.shippingAddress;
      result.shippingDiscountAllocations = this.shippingDiscountAllocations;
      result.statusUrl = this.statusUrl;
      result.subtotalPrice = this.subtotalPrice;
      result.subtotalPriceV2 = this.subtotalPriceV2;
      result.successfulFulfillments = this.successfulFulfillments;
      result.totalPrice = this.totalPrice;
      result.totalPriceV2 = this.totalPriceV2;
      result.totalRefunded = this.totalRefunded;
      result.totalRefundedV2 = this.totalRefundedV2;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalShippingPriceV2 = this.totalShippingPriceV2;
      result.totalTax = this.totalTax;
      result.totalTaxV2 = this.totalTaxV2;
      return result;
    }

    /**
     * The address associated with the payment method.
     */
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The reason for the order's cancellation. Returns `null` if the order wasn't canceled.
     */
    public Builder cancelReason(OrderCancelReason cancelReason) {
      this.cancelReason = cancelReason;
      return this;
    }

    /**
     * The date and time when the order was canceled. Returns null if the order wasn't canceled.
     */
    public Builder canceledAt(OffsetDateTime canceledAt) {
      this.canceledAt = canceledAt;
      return this;
    }

    /**
     * The code of the currency used for the payment.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The subtotal of line items and their discounts, excluding line items that have
     * been removed. Does not contain order-level discounts, duties, shipping costs,
     * or shipping discounts. Taxes aren't included unless the order is a
     * taxes-included order.
     */
    public Builder currentSubtotalPrice(MoneyV2 currentSubtotalPrice) {
      this.currentSubtotalPrice = currentSubtotalPrice;
      return this;
    }

    /**
     * The total cost of duties for the order, including refunds.
     */
    public Builder currentTotalDuties(MoneyV2 currentTotalDuties) {
      this.currentTotalDuties = currentTotalDuties;
      return this;
    }

    /**
     * The total amount of the order, including duties, taxes and discounts, minus amounts for line items that have been removed.
     */
    public Builder currentTotalPrice(MoneyV2 currentTotalPrice) {
      this.currentTotalPrice = currentTotalPrice;
      return this;
    }

    /**
     * The total cost of shipping, excluding shipping lines that have been refunded
     * or removed. Taxes aren't included unless the order is a taxes-included order.
     */
    public Builder currentTotalShippingPrice(MoneyV2 currentTotalShippingPrice) {
      this.currentTotalShippingPrice = currentTotalShippingPrice;
      return this;
    }

    /**
     * The total of all taxes applied to the order, excluding taxes for returned line items.
     */
    public Builder currentTotalTax(MoneyV2 currentTotalTax) {
      this.currentTotalTax = currentTotalTax;
      return this;
    }

    /**
     * A list of the custom attributes added to the order. For example, whether an order is a customer's first.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The locale code in which this specific order happened.
     */
    public Builder customerLocale(String customerLocale) {
      this.customerLocale = customerLocale;
      return this;
    }

    /**
     * The unique URL that the customer can use to access the order.
     */
    public Builder customerUrl(String customerUrl) {
      this.customerUrl = customerUrl;
      return this;
    }

    /**
     * Discounts that have been applied on the order.
     */
    public Builder discountApplications(DiscountApplicationConnection discountApplications) {
      this.discountApplications = discountApplications;
      return this;
    }

    /**
     * Whether the order has had any edits applied or not.
     */
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The customer's email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The financial status of the order.
     */
    public Builder financialStatus(OrderFinancialStatus financialStatus) {
      this.financialStatus = financialStatus;
      return this;
    }

    /**
     * The fulfillment status for the order.
     */
    public Builder fulfillmentStatus(OrderFulfillmentStatus fulfillmentStatus) {
      this.fulfillmentStatus = fulfillmentStatus;
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
     * List of the order’s line items.
     */
    public Builder lineItems(OrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * Unique identifier for the order that appears on the order.
     * For example, _#1000_ or _Store1001.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A unique numeric identifier for the order for use by shop owner and customer.
     */
    public Builder orderNumber(int orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }

    /**
     * The total cost of duties charged at checkout.
     */
    public Builder originalTotalDuties(MoneyV2 originalTotalDuties) {
      this.originalTotalDuties = originalTotalDuties;
      return this;
    }

    /**
     * The total price of the order before any applied edits.
     */
    public Builder originalTotalPrice(MoneyV2 originalTotalPrice) {
      this.originalTotalPrice = originalTotalPrice;
      return this;
    }

    /**
     * The customer's phone number for receiving SMS notifications.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The date and time when the order was imported.
     * This value can be set to dates in the past when importing from other systems.
     * If no value is provided, it will be auto-generated based on current date and time.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The address to where the order will be shipped.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The discounts that have been allocated onto the shipping line by discount applications.
     */
    public Builder shippingDiscountAllocations(
        List<DiscountAllocation> shippingDiscountAllocations) {
      this.shippingDiscountAllocations = shippingDiscountAllocations;
      return this;
    }

    /**
     * The unique URL for the order's status page.
     */
    public Builder statusUrl(String statusUrl) {
      this.statusUrl = statusUrl;
      return this;
    }

    /**
     * Price of the order before shipping and taxes.
     */
    public Builder subtotalPrice(MoneyV2 subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    /**
     * Price of the order before duties, shipping and taxes.
     */
    public Builder subtotalPriceV2(MoneyV2 subtotalPriceV2) {
      this.subtotalPriceV2 = subtotalPriceV2;
      return this;
    }

    /**
     * List of the order’s successful fulfillments.
     */
    public Builder successfulFulfillments(List<Fulfillment> successfulFulfillments) {
      this.successfulFulfillments = successfulFulfillments;
      return this;
    }

    /**
     * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
     */
    public Builder totalPrice(MoneyV2 totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The sum of all the prices of all the items in the order, duties, taxes and discounts included (must be positive).
     */
    public Builder totalPriceV2(MoneyV2 totalPriceV2) {
      this.totalPriceV2 = totalPriceV2;
      return this;
    }

    /**
     * The total amount that has been refunded.
     */
    public Builder totalRefunded(MoneyV2 totalRefunded) {
      this.totalRefunded = totalRefunded;
      return this;
    }

    /**
     * The total amount that has been refunded.
     */
    public Builder totalRefundedV2(MoneyV2 totalRefundedV2) {
      this.totalRefundedV2 = totalRefundedV2;
      return this;
    }

    /**
     * The total cost of shipping.
     */
    public Builder totalShippingPrice(MoneyV2 totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total cost of shipping.
     */
    public Builder totalShippingPriceV2(MoneyV2 totalShippingPriceV2) {
      this.totalShippingPriceV2 = totalShippingPriceV2;
      return this;
    }

    /**
     * The total cost of taxes.
     */
    public Builder totalTax(MoneyV2 totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total cost of taxes.
     */
    public Builder totalTaxV2(MoneyV2 totalTaxV2) {
      this.totalTaxV2 = totalTaxV2;
      return this;
    }
  }
}
