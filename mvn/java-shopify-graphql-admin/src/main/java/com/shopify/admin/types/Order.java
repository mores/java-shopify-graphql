package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An order is a customer's request to purchase one or more products from a shop.
 * You can retrieve and update orders using the `Order` object.
 * Learn more about
 * [editing an existing order with the GraphQL Admin
 * API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
 *
 * Only the last 60 days' worth of orders from a store are accessible from the
 * `Order` object by default. If you want to access older orders,
 * then you need to [request access to all
 * orders](https://shopify.dev/api/usage/access-scopes#orders-permissions). If your app is granted
 * access, then you can add the `read_all_orders` scope to your app along with `read_orders` or `write_orders`.
 * [Private apps](https://shopify.dev/apps/auth/basic-http) are not affected by
 * this change and are automatically granted the scope.
 *
 * **Caution:** Only use this data if it's required for your app's functionality.
 * Shopify will restrict [access to
 * scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
 * legitimate use for the associated data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Order implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.admin.types.CommentEventSubject, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasLocalizationExtensions, com.shopify.admin.types.HasLocalizedFields, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * A list of additional fees applied to the order.
   */
  private List<AdditionalFee> additionalFees;

  /**
   * A list of sales agreements associated with the order.
   */
  private SalesAgreementConnection agreements;

  /**
   * A list of messages that appear on the order page in the Shopify admin.
   */
  private List<ResourceAlert> alerts;

  /**
   * The application that created the order.
   */
  private OrderApp app;

  /**
   * The billing address of the customer.
   */
  private MailingAddress billingAddress;

  /**
   * Whether the billing address matches the shipping address.
   */
  private boolean billingAddressMatchesShippingAddress;

  /**
   * Whether the order can be manually marked as paid.
   */
  private boolean canMarkAsPaid;

  /**
   * Whether a customer email exists for the order.
   */
  private boolean canNotifyCustomer;

  /**
   * The reason provided when the order was canceled.
   * Returns `null` if the order wasn't canceled.
   */
  private OrderCancelReason cancelReason;

  /**
   * Cancellation details for the order.
   */
  private OrderCancellation cancellation;

  /**
   * The date and time when the order was canceled.
   * Returns `null` if the order wasn't canceled.
   */
  private OffsetDateTime cancelledAt;

  /**
   * Whether payment for the order can be captured.
   */
  private boolean capturable;

  /**
   * The total order-level discount amount, before returns, in shop currency.
   */
  private String cartDiscountAmount;

  /**
   * The total order-level discount amount, before returns, in shop and presentment currencies.
   */
  private MoneyBag cartDiscountAmountSet;

  /**
   * The channel that created the order.
   */
  private Channel channel;

  /**
   * Details about the channel that created the order.
   */
  private ChannelInformation channelInformation;

  /**
   * The IP address of the API client that created the order.
   */
  private String clientIp;

  /**
   * Whether the order is closed.
   */
  private boolean closed;

  /**
   * The date and time when the order was closed.
   * Returns `null` if the order isn't closed.
   */
  private OffsetDateTime closedAt;

  /**
   * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
   * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
   * This value isn't guaranteed to be unique.
   */
  private String confirmationNumber;

  /**
   * Whether inventory has been reserved for the order.
   */
  private boolean confirmed;

  /**
   * Date and time when the order was created in Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * The shop currency when the order was placed.
   */
  private CurrencyCode currencyCode;

  /**
   * The current order-level discount amount after all order updates, in shop and presentment currencies.
   */
  private MoneyBag currentCartDiscountAmountSet;

  /**
   * The current shipping price after applying refunds and discounts. If the parent
   * `order.taxesIncluded` field is true, then this price includes taxes.
   * Otherwise, this field is the pre-tax price.
   */
  private MoneyBag currentShippingPriceSet;

  /**
   * The sum of the quantities for all line items that contribute to the order's current subtotal price.
   */
  private int currentSubtotalLineItemsQuantity;

  /**
   * The sum of the prices for all line items after discounts and returns, in shop and presentment currencies.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  private MoneyBag currentSubtotalPriceSet;

  /**
   * A list of all tax lines applied to line items on the order, after returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  private List<TaxLine> currentTaxLines;

  /**
   * The total amount of additional fees after returns, in shop and presentment currencies.
   * Returns `null` if there are no additional fees for the order.
   */
  private MoneyBag currentTotalAdditionalFeesSet;

  /**
   * The total amount discounted on the order after returns, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  private MoneyBag currentTotalDiscountsSet;

  /**
   * The total amount of duties after returns, in shop and presentment currencies.
   * Returns `null` if duties aren't applicable.
   */
  private MoneyBag currentTotalDutiesSet;

  /**
   * The total price of the order, after returns, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  private MoneyBag currentTotalPriceSet;

  /**
   * The sum of the prices of all tax lines applied to line items on the order,
   * after returns, in shop and presentment currencies.
   */
  private MoneyBag currentTotalTaxSet;

  /**
   * The total weight of the order after returns, in grams.
   */
  private String currentTotalWeight;

  /**
   * A list of additional merchant-facing details that have been added to the
   * order. For example, whether an order is a customer's first.
   */
  private List<Attribute> customAttributes;

  /**
   * The customer that placed the order.
   */
  private Customer customer;

  /**
   * Whether the customer agreed to receive marketing materials.
   */
  private boolean customerAcceptsMarketing;

  /**
   * The customer's visits and interactions with the online store before placing the order.
   */
  private CustomerJourney customerJourney;

  /**
   * The customer's visits and interactions with the online store before placing the order.
   */
  private CustomerJourneySummary customerJourneySummary;

  /**
   * A two-letter or three-letter language code, optionally followed by a region modifier.
   */
  private String customerLocale;

  /**
   * A list of discounts that are applied to the order, not including order edits and refunds.
   */
  private DiscountApplicationConnection discountApplications;

  /**
   * The discount code used for the order.
   */
  private String discountCode;

  /**
   * The discount codes used for the order.
   */
  private List<String> discountCodes;

  /**
   * The primary address of the customer.
   * Returns `null` if neither the shipping address nor the billing address was provided.
   */
  private MailingAddress displayAddress;

  /**
   * The financial status of the order that can be shown to the merchant.
   * This field doesn't capture all the details of an order's financial state. It
   * should only be used for display summary purposes.
   */
  private OrderDisplayFinancialStatus displayFinancialStatus;

  /**
   * The fulfillment status for the order that can be shown to the merchant.
   * This field does not capture all the details of an order's fulfillment state.
   * It should only be used for display summary purposes.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

  /**
   * A list of the disputes associated with the order.
   */
  private List<OrderDisputeSummary> disputes;

  /**
   * Whether duties are included in the subtotal price of the order.
   */
  private boolean dutiesIncluded;

  /**
   * Whether the order has had any edits applied.
   */
  private boolean edited;

  /**
   * The email address associated with the customer.
   */
  private String email;

  /**
   * Whether taxes on the order are estimated.
   * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
   */
  private boolean estimatedTaxes;

  /**
   * A list of events associated with the order.
   */
  private EventConnection events;

  /**
   * A list of ExchangeV2s for the order.
   */
  private ExchangeV2Connection exchangeV2s;

  /**
   * Whether there are line items that can be fulfilled.
   * This field returns `false` when the order has no fulfillable line items.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  private boolean fulfillable;

  /**
   * A list of fulfillment orders for a specific order.
   *   
   * [FulfillmentOrder API access scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
   * govern which fulfillments orders are returned.
   * An API client will only receive a subset of the fulfillment orders which belong to an order
   * if they don't have the necessary access scopes to view all of the fulfillment orders.
   * In the case that an API client does not have the access scopes necessary to view
   * any of the fulfillment orders that belong to an order, an empty array will be returned.
   */
  private FulfillmentOrderConnection fulfillmentOrders;

  /**
   * List of shipments for the order.
   */
  private List<Fulfillment> fulfillments;

  /**
   * The count of fulfillments including the cancelled fulfillments.
   */
  private Count fulfillmentsCount;

  /**
   * Whether the order has been paid in full.
   */
  private boolean fullyPaid;

  /**
   * Whether the merchant added a timeline comment to the order.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The URL of the first page of the online store that the customer visited before they submitted the order.
   */
  private String landingPageDisplayText;

  /**
   * The first page of the online store that the customer visited before they submitted the order.
   */
  private String landingPageUrl;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * A list of the order's line items.
   */
  private LineItemConnection lineItems;

  /**
   * List of localization extensions for the resource.
   */
  private LocalizationExtensionConnection localizationExtensions;

  /**
   * List of localized fields for the resource.
   */
  private LocalizedFieldConnection localizedFields;

  /**
   * The merchant's business entity associated with the order.
   */
  private BusinessEntity merchantBusinessEntity;

  /**
   * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
   */
  private boolean merchantEditable;

  /**
   * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
   */
  private List<String> merchantEditableErrors;

  /**
   * The application acting as the Merchant of Record for the order.
   */
  private OrderApp merchantOfRecordApp;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores.
   */
  private String name;

  /**
   * The net payment for the order, based on the total amount received minus the total amount refunded, in shop currency.
   */
  private String netPayment;

  /**
   * The net payment for the order, based on the total amount received minus the
   * total amount refunded, in shop and presentment currencies.
   */
  private MoneyBag netPaymentSet;

  /**
   * A list of line items that can't be fulfilled.
   * For example, tips and fully refunded line items can't be fulfilled.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  private LineItemConnection nonFulfillableLineItems;

  /**
   * The contents of the note associated with the order.
   */
  private String note;

  /**
   * The total amount of additional fees at the time of order creation, in shop and presentment currencies.
   * Returns `null` if additional fees aren't applicable.
   */
  private MoneyBag originalTotalAdditionalFeesSet;

  /**
   * The total amount of duties at the time of order creation, in shop and presentment currencies.
   * Returns `null` if duties aren't applicable.
   */
  private MoneyBag originalTotalDutiesSet;

  /**
   * The total price of the order at the time of order creation, in shop and presentment currencies.
   */
  private MoneyBag originalTotalPriceSet;

  /**
   * The payment collection details for the order.
   */
  private OrderPaymentCollectionDetails paymentCollectionDetails;

  /**
   * A list of the names of all payment gateways used for the order.
   * For example, "Shopify Payments" and "Cash on Delivery (COD)".
   */
  private List<String> paymentGatewayNames;

  /**
   * The payment terms associated with the order.
   */
  private PaymentTerms paymentTerms;

  /**
   * The phone number associated with the customer.
   */
  private String phone;

  /**
   * The fulfillment location that was assigned when the order was created.
   * Orders can have multiple fulfillment orders. These fulfillment orders can each
   * be assigned to a different location which is responsible for fulfilling a
   * subset of the items in an order. The `Order.physicalLocation` field will only
   * point to one of these locations.
   * Use the [`FulfillmentOrder`](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder)
   * object for up to date fulfillment location information.
   */
  private Location physicalLocation;

  /**
   * The PO number associated with the order.
   */
  private String poNumber;

  /**
   * The payment `CurrencyCode` of the customer for the order.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The date and time when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  private OffsetDateTime processedAt;

  /**
   * The publication that the order was created from.
   */
  private Publication publication;

  /**
   * The purchasing entity for the order.
   */
  private PurchasingEntity purchasingEntity;

  /**
   * The marketing referral code from the link that the customer clicked to visit the store.
   * Supports the following URL attributes: "ref", "source", or "r".
   * For example, if the URL is `{shop}.myshopify.com/products/slide?ref=j2tj1tn2`, then this value is `j2tj1tn2`.
   */
  private String referralCode;

  /**
   * A web domain or short description of the source that sent the customer to your
   * online store. For example, "shopify.com" or "email".
   */
  private String referrerDisplayText;

  /**
   * The URL of the webpage where the customer clicked a link that sent them to your online store.
   */
  private String referrerUrl;

  /**
   * The difference between the suggested and actual refund amount of all refunds
   * that have been applied to the order. A positive value indicates a difference
   * in the merchant's favor, and a negative value indicates a difference in the
   * customer's favor.
   */
  private MoneyBag refundDiscrepancySet;

  /**
   * Whether the order can be refunded.
   */
  private boolean refundable;

  /**
   * A list of refunds that have been applied to the order.
   */
  private List<Refund> refunds;

  /**
   * The URL of the source that the order originated from, if found in the domain registry.
   */
  private String registeredSourceUrl;

  /**
   * Whether the order has shipping lines or at least one line item on the order that requires shipping.
   */
  private boolean requiresShipping;

  /**
   * Whether any line item on the order can be restocked.
   */
  private boolean restockable;

  /**
   * The physical location where a retail order is created or completed, except for
   * draft POS orders completed via the “mark as paid” flow in Admin, which return
   * null. Transactions associated with the order might have been processed at a
   * different location.
   */
  private Location retailLocation;

  /**
   * The order's aggregated return status for display purposes.
   */
  private OrderReturnStatus returnStatus;

  /**
   * A list of returns for the order.
   */
  private ReturnConnection returns;

  /**
   * The risk characteristics for the order.
   */
  private OrderRiskSummary risk;

  /**
   * The fraud risk level of the order.
   */
  private OrderRiskLevel riskLevel;

  /**
   * A list of risks associated with the order.
   */
  private List<OrderRisk> risks;

  /**
   * The mailing address of the customer.
   */
  private MailingAddress shippingAddress;

  /**
   * A summary of all shipping costs on the order.
   */
  private ShippingLine shippingLine;

  /**
   * A list of the order's shipping lines.
   */
  private ShippingLineConnection shippingLines;

  /**
   * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this will be null.
   */
  private ShopifyProtectOrderSummary shopifyProtect;

  /**
   * A unique POS or third party order identifier.
   * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value for POS orders.
   */
  private String sourceIdentifier;

  /**
   * The name of the source associated with the order.
   */
  private String sourceName;

  /**
   * The staff member associated with the order.
   */
  private StaffMember staffMember;

  /**
   * The URL where the customer can check the order's current status.
   */
  private String statusPageUrl;

  /**
   * The sum of the quantities for all line items that contribute to the order's subtotal price.
   */
  private int subtotalLineItemsQuantity;

  /**
   * The sum of the prices for all line items after discounts and before returns, in shop currency.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  private String subtotalPrice;

  /**
   * The sum of the prices for all line items after discounts and before returns, in shop and presentment currencies.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * A suggested refund for the order.
   */
  private SuggestedRefund suggestedRefund;

  /**
   * A comma separated list of tags associated with the order. Updating `tags` overwrites
   * any existing tags that were previously added to the order. To add new tags without overwriting
   * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  private List<String> tags;

  /**
   * Whether taxes are exempt on the order.
   */
  private boolean taxExempt;

  /**
   * A list of all tax lines applied to line items on the order, before returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether taxes are included in the subtotal price of the order.
   */
  private boolean taxesIncluded;

  /**
   * Whether the order is a test.
   * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
   * A test order can't be converted into a real order and vice versa.
   */
  private boolean test;

  /**
   * The authorized amount that's uncaptured or undercaptured, in shop currency.
   * This amount isn't adjusted for returns.
   */
  private String totalCapturable;

  /**
   * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
   * This amount isn't adjusted for returns.
   */
  private MoneyBag totalCapturableSet;

  /**
   * The total rounding adjustment applied to payments or refunds for an Order
   * involving cash payments. Applies to some countries where cash transactions are
   * rounded to the nearest currency denomination.
   */
  private CashRoundingAdjustment totalCashRoundingAdjustment;

  /**
   * The total amount discounted on the order before returns, in shop currency.
   * This includes both order and line level discounts.
   */
  private String totalDiscounts;

  /**
   * The total amount discounted on the order before returns, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  private MoneyBag totalDiscountsSet;

  /**
   * The total amount not yet transacted for the order, in shop and presentment currencies.
   * A positive value indicates a difference in the merchant's favor (payment from
   * customer to merchant) and a negative value indicates a difference in the
   * customer's favor (refund from merchant to customer).
   */
  private MoneyBag totalOutstandingSet;

  /**
   * The total price of the order, before returns, in shop currency.
   * This includes taxes and discounts.
   */
  private String totalPrice;

  /**
   * The total price of the order, before returns, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  private MoneyBag totalPriceSet;

  /**
   * The total amount received from the customer before returns, in shop currency.
   */
  private String totalReceived;

  /**
   * The total amount received from the customer before returns, in shop and presentment currencies.
   */
  private MoneyBag totalReceivedSet;

  /**
   * The total amount that was refunded, in shop currency.
   */
  private String totalRefunded;

  /**
   * The total amount that was refunded, in shop and presentment currencies.
   */
  private MoneyBag totalRefundedSet;

  /**
   * The total amount of shipping that was refunded, in shop and presentment currencies.
   */
  private MoneyBag totalRefundedShippingSet;

  /**
   * The total shipping amount before discounts and returns, in shop currency.
   */
  private String totalShippingPrice;

  /**
   * The total shipping amount before discounts and returns, in shop and presentment currencies.
   */
  private MoneyBag totalShippingPriceSet;

  /**
   * The total tax amount before returns, in shop currency.
   */
  private String totalTax;

  /**
   * The total tax amount before returns, in shop and presentment currencies.
   */
  private MoneyBag totalTaxSet;

  /**
   * The sum of all tip amounts for the order, in shop currency.
   */
  private MoneyV2 totalTipReceived;

  /**
   * The sum of all tip amounts for the order, in shop and presentment currencies.
   */
  private MoneyBag totalTipReceivedSet;

  /**
   * The total weight of the order before returns, in grams.
   */
  private String totalWeight;

  /**
   * A list of transactions associated with the order.
   */
  private List<OrderTransaction> transactions;

  /**
   * The number of transactions associated with the order.
   */
  private Count transactionsCount;

  /**
   * Whether no payments have been made for the order.
   */
  private boolean unpaid;

  /**
   * The date and time when the order was modified last.
   */
  private OffsetDateTime updatedAt;

  public Order() {
  }

  /**
   * A list of additional fees applied to the order.
   */
  public List<AdditionalFee> getAdditionalFees() {
    return additionalFees;
  }

  public void setAdditionalFees(List<AdditionalFee> additionalFees) {
    this.additionalFees = additionalFees;
  }

  /**
   * A list of sales agreements associated with the order.
   */
  public SalesAgreementConnection getAgreements() {
    return agreements;
  }

  public void setAgreements(SalesAgreementConnection agreements) {
    this.agreements = agreements;
  }

  /**
   * A list of messages that appear on the order page in the Shopify admin.
   */
  public List<ResourceAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ResourceAlert> alerts) {
    this.alerts = alerts;
  }

  /**
   * The application that created the order.
   */
  public OrderApp getApp() {
    return app;
  }

  public void setApp(OrderApp app) {
    this.app = app;
  }

  /**
   * The billing address of the customer.
   */
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Whether the billing address matches the shipping address.
   */
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  /**
   * Whether the order can be manually marked as paid.
   */
  public boolean getCanMarkAsPaid() {
    return canMarkAsPaid;
  }

  public void setCanMarkAsPaid(boolean canMarkAsPaid) {
    this.canMarkAsPaid = canMarkAsPaid;
  }

  /**
   * Whether a customer email exists for the order.
   */
  public boolean getCanNotifyCustomer() {
    return canNotifyCustomer;
  }

  public void setCanNotifyCustomer(boolean canNotifyCustomer) {
    this.canNotifyCustomer = canNotifyCustomer;
  }

  /**
   * The reason provided when the order was canceled.
   * Returns `null` if the order wasn't canceled.
   */
  public OrderCancelReason getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(OrderCancelReason cancelReason) {
    this.cancelReason = cancelReason;
  }

  /**
   * Cancellation details for the order.
   */
  public OrderCancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(OrderCancellation cancellation) {
    this.cancellation = cancellation;
  }

  /**
   * The date and time when the order was canceled.
   * Returns `null` if the order wasn't canceled.
   */
  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * Whether payment for the order can be captured.
   */
  public boolean getCapturable() {
    return capturable;
  }

  public void setCapturable(boolean capturable) {
    this.capturable = capturable;
  }

  /**
   * The total order-level discount amount, before returns, in shop currency.
   */
  public String getCartDiscountAmount() {
    return cartDiscountAmount;
  }

  public void setCartDiscountAmount(String cartDiscountAmount) {
    this.cartDiscountAmount = cartDiscountAmount;
  }

  /**
   * The total order-level discount amount, before returns, in shop and presentment currencies.
   */
  public MoneyBag getCartDiscountAmountSet() {
    return cartDiscountAmountSet;
  }

  public void setCartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
    this.cartDiscountAmountSet = cartDiscountAmountSet;
  }

  /**
   * The channel that created the order.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Details about the channel that created the order.
   */
  public ChannelInformation getChannelInformation() {
    return channelInformation;
  }

  public void setChannelInformation(ChannelInformation channelInformation) {
    this.channelInformation = channelInformation;
  }

  /**
   * The IP address of the API client that created the order.
   */
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * Whether the order is closed.
   */
  public boolean getClosed() {
    return closed;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  /**
   * The date and time when the order was closed.
   * Returns `null` if the order isn't closed.
   */
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  /**
   * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
   * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
   * This value isn't guaranteed to be unique.
   */
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  /**
   * Whether inventory has been reserved for the order.
   */
  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }

  /**
   * Date and time when the order was created in Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The shop currency when the order was placed.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The current order-level discount amount after all order updates, in shop and presentment currencies.
   */
  public MoneyBag getCurrentCartDiscountAmountSet() {
    return currentCartDiscountAmountSet;
  }

  public void setCurrentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
    this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
  }

  /**
   * The current shipping price after applying refunds and discounts. If the parent
   * `order.taxesIncluded` field is true, then this price includes taxes.
   * Otherwise, this field is the pre-tax price.
   */
  public MoneyBag getCurrentShippingPriceSet() {
    return currentShippingPriceSet;
  }

  public void setCurrentShippingPriceSet(MoneyBag currentShippingPriceSet) {
    this.currentShippingPriceSet = currentShippingPriceSet;
  }

  /**
   * The sum of the quantities for all line items that contribute to the order's current subtotal price.
   */
  public int getCurrentSubtotalLineItemsQuantity() {
    return currentSubtotalLineItemsQuantity;
  }

  public void setCurrentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
    this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
  }

  /**
   * The sum of the prices for all line items after discounts and returns, in shop and presentment currencies.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  public MoneyBag getCurrentSubtotalPriceSet() {
    return currentSubtotalPriceSet;
  }

  public void setCurrentSubtotalPriceSet(MoneyBag currentSubtotalPriceSet) {
    this.currentSubtotalPriceSet = currentSubtotalPriceSet;
  }

  /**
   * A list of all tax lines applied to line items on the order, after returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  public List<TaxLine> getCurrentTaxLines() {
    return currentTaxLines;
  }

  public void setCurrentTaxLines(List<TaxLine> currentTaxLines) {
    this.currentTaxLines = currentTaxLines;
  }

  /**
   * The total amount of additional fees after returns, in shop and presentment currencies.
   * Returns `null` if there are no additional fees for the order.
   */
  public MoneyBag getCurrentTotalAdditionalFeesSet() {
    return currentTotalAdditionalFeesSet;
  }

  public void setCurrentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
    this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
  }

  /**
   * The total amount discounted on the order after returns, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  public MoneyBag getCurrentTotalDiscountsSet() {
    return currentTotalDiscountsSet;
  }

  public void setCurrentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
    this.currentTotalDiscountsSet = currentTotalDiscountsSet;
  }

  /**
   * The total amount of duties after returns, in shop and presentment currencies.
   * Returns `null` if duties aren't applicable.
   */
  public MoneyBag getCurrentTotalDutiesSet() {
    return currentTotalDutiesSet;
  }

  public void setCurrentTotalDutiesSet(MoneyBag currentTotalDutiesSet) {
    this.currentTotalDutiesSet = currentTotalDutiesSet;
  }

  /**
   * The total price of the order, after returns, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  public MoneyBag getCurrentTotalPriceSet() {
    return currentTotalPriceSet;
  }

  public void setCurrentTotalPriceSet(MoneyBag currentTotalPriceSet) {
    this.currentTotalPriceSet = currentTotalPriceSet;
  }

  /**
   * The sum of the prices of all tax lines applied to line items on the order,
   * after returns, in shop and presentment currencies.
   */
  public MoneyBag getCurrentTotalTaxSet() {
    return currentTotalTaxSet;
  }

  public void setCurrentTotalTaxSet(MoneyBag currentTotalTaxSet) {
    this.currentTotalTaxSet = currentTotalTaxSet;
  }

  /**
   * The total weight of the order after returns, in grams.
   */
  public String getCurrentTotalWeight() {
    return currentTotalWeight;
  }

  public void setCurrentTotalWeight(String currentTotalWeight) {
    this.currentTotalWeight = currentTotalWeight;
  }

  /**
   * A list of additional merchant-facing details that have been added to the
   * order. For example, whether an order is a customer's first.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer that placed the order.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Whether the customer agreed to receive marketing materials.
   */
  public boolean getCustomerAcceptsMarketing() {
    return customerAcceptsMarketing;
  }

  public void setCustomerAcceptsMarketing(boolean customerAcceptsMarketing) {
    this.customerAcceptsMarketing = customerAcceptsMarketing;
  }

  /**
   * The customer's visits and interactions with the online store before placing the order.
   */
  public CustomerJourney getCustomerJourney() {
    return customerJourney;
  }

  public void setCustomerJourney(CustomerJourney customerJourney) {
    this.customerJourney = customerJourney;
  }

  /**
   * The customer's visits and interactions with the online store before placing the order.
   */
  public CustomerJourneySummary getCustomerJourneySummary() {
    return customerJourneySummary;
  }

  public void setCustomerJourneySummary(CustomerJourneySummary customerJourneySummary) {
    this.customerJourneySummary = customerJourneySummary;
  }

  /**
   * A two-letter or three-letter language code, optionally followed by a region modifier.
   */
  public String getCustomerLocale() {
    return customerLocale;
  }

  public void setCustomerLocale(String customerLocale) {
    this.customerLocale = customerLocale;
  }

  /**
   * A list of discounts that are applied to the order, not including order edits and refunds.
   */
  public DiscountApplicationConnection getDiscountApplications() {
    return discountApplications;
  }

  public void setDiscountApplications(DiscountApplicationConnection discountApplications) {
    this.discountApplications = discountApplications;
  }

  /**
   * The discount code used for the order.
   */
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  /**
   * The discount codes used for the order.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The primary address of the customer.
   * Returns `null` if neither the shipping address nor the billing address was provided.
   */
  public MailingAddress getDisplayAddress() {
    return displayAddress;
  }

  public void setDisplayAddress(MailingAddress displayAddress) {
    this.displayAddress = displayAddress;
  }

  /**
   * The financial status of the order that can be shown to the merchant.
   * This field doesn't capture all the details of an order's financial state. It
   * should only be used for display summary purposes.
   */
  public OrderDisplayFinancialStatus getDisplayFinancialStatus() {
    return displayFinancialStatus;
  }

  public void setDisplayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
    this.displayFinancialStatus = displayFinancialStatus;
  }

  /**
   * The fulfillment status for the order that can be shown to the merchant.
   * This field does not capture all the details of an order's fulfillment state.
   * It should only be used for display summary purposes.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  public OrderDisplayFulfillmentStatus getDisplayFulfillmentStatus() {
    return displayFulfillmentStatus;
  }

  public void setDisplayFulfillmentStatus(OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
    this.displayFulfillmentStatus = displayFulfillmentStatus;
  }

  /**
   * A list of the disputes associated with the order.
   */
  public List<OrderDisputeSummary> getDisputes() {
    return disputes;
  }

  public void setDisputes(List<OrderDisputeSummary> disputes) {
    this.disputes = disputes;
  }

  /**
   * Whether duties are included in the subtotal price of the order.
   */
  public boolean getDutiesIncluded() {
    return dutiesIncluded;
  }

  public void setDutiesIncluded(boolean dutiesIncluded) {
    this.dutiesIncluded = dutiesIncluded;
  }

  /**
   * Whether the order has had any edits applied.
   */
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  /**
   * The email address associated with the customer.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Whether taxes on the order are estimated.
   * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
   */
  public boolean getEstimatedTaxes() {
    return estimatedTaxes;
  }

  public void setEstimatedTaxes(boolean estimatedTaxes) {
    this.estimatedTaxes = estimatedTaxes;
  }

  /**
   * A list of events associated with the order.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * A list of ExchangeV2s for the order.
   */
  public ExchangeV2Connection getExchangeV2s() {
    return exchangeV2s;
  }

  public void setExchangeV2s(ExchangeV2Connection exchangeV2s) {
    this.exchangeV2s = exchangeV2s;
  }

  /**
   * Whether there are line items that can be fulfilled.
   * This field returns `false` when the order has no fulfillable line items.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  public boolean getFulfillable() {
    return fulfillable;
  }

  public void setFulfillable(boolean fulfillable) {
    this.fulfillable = fulfillable;
  }

  /**
   * A list of fulfillment orders for a specific order.
   *   
   * [FulfillmentOrder API access scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
   * govern which fulfillments orders are returned.
   * An API client will only receive a subset of the fulfillment orders which belong to an order
   * if they don't have the necessary access scopes to view all of the fulfillment orders.
   * In the case that an API client does not have the access scopes necessary to view
   * any of the fulfillment orders that belong to an order, an empty array will be returned.
   */
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  /**
   * List of shipments for the order.
   */
  public List<Fulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * The count of fulfillments including the cancelled fulfillments.
   */
  public Count getFulfillmentsCount() {
    return fulfillmentsCount;
  }

  public void setFulfillmentsCount(Count fulfillmentsCount) {
    this.fulfillmentsCount = fulfillmentsCount;
  }

  /**
   * Whether the order has been paid in full.
   */
  public boolean getFullyPaid() {
    return fullyPaid;
  }

  public void setFullyPaid(boolean fullyPaid) {
    this.fullyPaid = fullyPaid;
  }

  /**
   * Whether the merchant added a timeline comment to the order.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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
   * The URL of the first page of the online store that the customer visited before they submitted the order.
   */
  public String getLandingPageDisplayText() {
    return landingPageDisplayText;
  }

  public void setLandingPageDisplayText(String landingPageDisplayText) {
    this.landingPageDisplayText = landingPageDisplayText;
  }

  /**
   * The first page of the online store that the customer visited before they submitted the order.
   */
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * A list of the order's line items.
   */
  public LineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * List of localization extensions for the resource.
   */
  public LocalizationExtensionConnection getLocalizationExtensions() {
    return localizationExtensions;
  }

  public void setLocalizationExtensions(LocalizationExtensionConnection localizationExtensions) {
    this.localizationExtensions = localizationExtensions;
  }

  /**
   * List of localized fields for the resource.
   */
  public LocalizedFieldConnection getLocalizedFields() {
    return localizedFields;
  }

  public void setLocalizedFields(LocalizedFieldConnection localizedFields) {
    this.localizedFields = localizedFields;
  }

  /**
   * The merchant's business entity associated with the order.
   */
  public BusinessEntity getMerchantBusinessEntity() {
    return merchantBusinessEntity;
  }

  public void setMerchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
    this.merchantBusinessEntity = merchantBusinessEntity;
  }

  /**
   * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
   */
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  /**
   * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
   */
  public List<String> getMerchantEditableErrors() {
    return merchantEditableErrors;
  }

  public void setMerchantEditableErrors(List<String> merchantEditableErrors) {
    this.merchantEditableErrors = merchantEditableErrors;
  }

  /**
   * The application acting as the Merchant of Record for the order.
   */
  public OrderApp getMerchantOfRecordApp() {
    return merchantOfRecordApp;
  }

  public void setMerchantOfRecordApp(OrderApp merchantOfRecordApp) {
    this.merchantOfRecordApp = merchantOfRecordApp;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The net payment for the order, based on the total amount received minus the total amount refunded, in shop currency.
   */
  public String getNetPayment() {
    return netPayment;
  }

  public void setNetPayment(String netPayment) {
    this.netPayment = netPayment;
  }

  /**
   * The net payment for the order, based on the total amount received minus the
   * total amount refunded, in shop and presentment currencies.
   */
  public MoneyBag getNetPaymentSet() {
    return netPaymentSet;
  }

  public void setNetPaymentSet(MoneyBag netPaymentSet) {
    this.netPaymentSet = netPaymentSet;
  }

  /**
   * A list of line items that can't be fulfilled.
   * For example, tips and fully refunded line items can't be fulfilled.
   * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  public LineItemConnection getNonFulfillableLineItems() {
    return nonFulfillableLineItems;
  }

  public void setNonFulfillableLineItems(LineItemConnection nonFulfillableLineItems) {
    this.nonFulfillableLineItems = nonFulfillableLineItems;
  }

  /**
   * The contents of the note associated with the order.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total amount of additional fees at the time of order creation, in shop and presentment currencies.
   * Returns `null` if additional fees aren't applicable.
   */
  public MoneyBag getOriginalTotalAdditionalFeesSet() {
    return originalTotalAdditionalFeesSet;
  }

  public void setOriginalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
    this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
  }

  /**
   * The total amount of duties at the time of order creation, in shop and presentment currencies.
   * Returns `null` if duties aren't applicable.
   */
  public MoneyBag getOriginalTotalDutiesSet() {
    return originalTotalDutiesSet;
  }

  public void setOriginalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
    this.originalTotalDutiesSet = originalTotalDutiesSet;
  }

  /**
   * The total price of the order at the time of order creation, in shop and presentment currencies.
   */
  public MoneyBag getOriginalTotalPriceSet() {
    return originalTotalPriceSet;
  }

  public void setOriginalTotalPriceSet(MoneyBag originalTotalPriceSet) {
    this.originalTotalPriceSet = originalTotalPriceSet;
  }

  /**
   * The payment collection details for the order.
   */
  public OrderPaymentCollectionDetails getPaymentCollectionDetails() {
    return paymentCollectionDetails;
  }

  public void setPaymentCollectionDetails(OrderPaymentCollectionDetails paymentCollectionDetails) {
    this.paymentCollectionDetails = paymentCollectionDetails;
  }

  /**
   * A list of the names of all payment gateways used for the order.
   * For example, "Shopify Payments" and "Cash on Delivery (COD)".
   */
  public List<String> getPaymentGatewayNames() {
    return paymentGatewayNames;
  }

  public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
    this.paymentGatewayNames = paymentGatewayNames;
  }

  /**
   * The payment terms associated with the order.
   */
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The phone number associated with the customer.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The fulfillment location that was assigned when the order was created.
   * Orders can have multiple fulfillment orders. These fulfillment orders can each
   * be assigned to a different location which is responsible for fulfilling a
   * subset of the items in an order. The `Order.physicalLocation` field will only
   * point to one of these locations.
   * Use the [`FulfillmentOrder`](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder)
   * object for up to date fulfillment location information.
   */
  public Location getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  /**
   * The PO number associated with the order.
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * The payment `CurrencyCode` of the customer for the order.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The date and time when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The publication that the order was created from.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The purchasing entity for the order.
   */
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  /**
   * The marketing referral code from the link that the customer clicked to visit the store.
   * Supports the following URL attributes: "ref", "source", or "r".
   * For example, if the URL is `{shop}.myshopify.com/products/slide?ref=j2tj1tn2`, then this value is `j2tj1tn2`.
   */
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  /**
   * A web domain or short description of the source that sent the customer to your
   * online store. For example, "shopify.com" or "email".
   */
  public String getReferrerDisplayText() {
    return referrerDisplayText;
  }

  public void setReferrerDisplayText(String referrerDisplayText) {
    this.referrerDisplayText = referrerDisplayText;
  }

  /**
   * The URL of the webpage where the customer clicked a link that sent them to your online store.
   */
  public String getReferrerUrl() {
    return referrerUrl;
  }

  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }

  /**
   * The difference between the suggested and actual refund amount of all refunds
   * that have been applied to the order. A positive value indicates a difference
   * in the merchant's favor, and a negative value indicates a difference in the
   * customer's favor.
   */
  public MoneyBag getRefundDiscrepancySet() {
    return refundDiscrepancySet;
  }

  public void setRefundDiscrepancySet(MoneyBag refundDiscrepancySet) {
    this.refundDiscrepancySet = refundDiscrepancySet;
  }

  /**
   * Whether the order can be refunded.
   */
  public boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(boolean refundable) {
    this.refundable = refundable;
  }

  /**
   * A list of refunds that have been applied to the order.
   */
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  /**
   * The URL of the source that the order originated from, if found in the domain registry.
   */
  public String getRegisteredSourceUrl() {
    return registeredSourceUrl;
  }

  public void setRegisteredSourceUrl(String registeredSourceUrl) {
    this.registeredSourceUrl = registeredSourceUrl;
  }

  /**
   * Whether the order has shipping lines or at least one line item on the order that requires shipping.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Whether any line item on the order can be restocked.
   */
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  /**
   * The physical location where a retail order is created or completed, except for
   * draft POS orders completed via the “mark as paid” flow in Admin, which return
   * null. Transactions associated with the order might have been processed at a
   * different location.
   */
  public Location getRetailLocation() {
    return retailLocation;
  }

  public void setRetailLocation(Location retailLocation) {
    this.retailLocation = retailLocation;
  }

  /**
   * The order's aggregated return status for display purposes.
   */
  public OrderReturnStatus getReturnStatus() {
    return returnStatus;
  }

  public void setReturnStatus(OrderReturnStatus returnStatus) {
    this.returnStatus = returnStatus;
  }

  /**
   * A list of returns for the order.
   */
  public ReturnConnection getReturns() {
    return returns;
  }

  public void setReturns(ReturnConnection returns) {
    this.returns = returns;
  }

  /**
   * The risk characteristics for the order.
   */
  public OrderRiskSummary getRisk() {
    return risk;
  }

  public void setRisk(OrderRiskSummary risk) {
    this.risk = risk;
  }

  /**
   * The fraud risk level of the order.
   */
  public OrderRiskLevel getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(OrderRiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }

  /**
   * A list of risks associated with the order.
   */
  public List<OrderRisk> getRisks() {
    return risks;
  }

  public void setRisks(List<OrderRisk> risks) {
    this.risks = risks;
  }

  /**
   * The mailing address of the customer.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * A summary of all shipping costs on the order.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * A list of the order's shipping lines.
   */
  public ShippingLineConnection getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(ShippingLineConnection shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this will be null.
   */
  public ShopifyProtectOrderSummary getShopifyProtect() {
    return shopifyProtect;
  }

  public void setShopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
    this.shopifyProtect = shopifyProtect;
  }

  /**
   * A unique POS or third party order identifier.
   * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value for POS orders.
   */
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  /**
   * The name of the source associated with the order.
   */
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  /**
   * The staff member associated with the order.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The URL where the customer can check the order's current status.
   */
  public String getStatusPageUrl() {
    return statusPageUrl;
  }

  public void setStatusPageUrl(String statusPageUrl) {
    this.statusPageUrl = statusPageUrl;
  }

  /**
   * The sum of the quantities for all line items that contribute to the order's subtotal price.
   */
  public int getSubtotalLineItemsQuantity() {
    return subtotalLineItemsQuantity;
  }

  public void setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
    this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
  }

  /**
   * The sum of the prices for all line items after discounts and before returns, in shop currency.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  /**
   * The sum of the prices for all line items after discounts and before returns, in shop and presentment currencies.
   * If `taxesIncluded` is `true`, then the subtotal also includes tax.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * A suggested refund for the order.
   */
  public SuggestedRefund getSuggestedRefund() {
    return suggestedRefund;
  }

  public void setSuggestedRefund(SuggestedRefund suggestedRefund) {
    this.suggestedRefund = suggestedRefund;
  }

  /**
   * A comma separated list of tags associated with the order. Updating `tags` overwrites
   * any existing tags that were previously added to the order. To add new tags without overwriting
   * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * mutation.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Whether taxes are exempt on the order.
   */
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * A list of all tax lines applied to line items on the order, before returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether taxes are included in the subtotal price of the order.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  /**
   * Whether the order is a test.
   * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
   * A test order can't be converted into a real order and vice versa.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * The authorized amount that's uncaptured or undercaptured, in shop currency.
   * This amount isn't adjusted for returns.
   */
  public String getTotalCapturable() {
    return totalCapturable;
  }

  public void setTotalCapturable(String totalCapturable) {
    this.totalCapturable = totalCapturable;
  }

  /**
   * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
   * This amount isn't adjusted for returns.
   */
  public MoneyBag getTotalCapturableSet() {
    return totalCapturableSet;
  }

  public void setTotalCapturableSet(MoneyBag totalCapturableSet) {
    this.totalCapturableSet = totalCapturableSet;
  }

  /**
   * The total rounding adjustment applied to payments or refunds for an Order
   * involving cash payments. Applies to some countries where cash transactions are
   * rounded to the nearest currency denomination.
   */
  public CashRoundingAdjustment getTotalCashRoundingAdjustment() {
    return totalCashRoundingAdjustment;
  }

  public void setTotalCashRoundingAdjustment(CashRoundingAdjustment totalCashRoundingAdjustment) {
    this.totalCashRoundingAdjustment = totalCashRoundingAdjustment;
  }

  /**
   * The total amount discounted on the order before returns, in shop currency.
   * This includes both order and line level discounts.
   */
  public String getTotalDiscounts() {
    return totalDiscounts;
  }

  public void setTotalDiscounts(String totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }

  /**
   * The total amount discounted on the order before returns, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  /**
   * The total amount not yet transacted for the order, in shop and presentment currencies.
   * A positive value indicates a difference in the merchant's favor (payment from
   * customer to merchant) and a negative value indicates a difference in the
   * customer's favor (refund from merchant to customer).
   */
  public MoneyBag getTotalOutstandingSet() {
    return totalOutstandingSet;
  }

  public void setTotalOutstandingSet(MoneyBag totalOutstandingSet) {
    this.totalOutstandingSet = totalOutstandingSet;
  }

  /**
   * The total price of the order, before returns, in shop currency.
   * This includes taxes and discounts.
   */
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The total price of the order, before returns, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The total amount received from the customer before returns, in shop currency.
   */
  public String getTotalReceived() {
    return totalReceived;
  }

  public void setTotalReceived(String totalReceived) {
    this.totalReceived = totalReceived;
  }

  /**
   * The total amount received from the customer before returns, in shop and presentment currencies.
   */
  public MoneyBag getTotalReceivedSet() {
    return totalReceivedSet;
  }

  public void setTotalReceivedSet(MoneyBag totalReceivedSet) {
    this.totalReceivedSet = totalReceivedSet;
  }

  /**
   * The total amount that was refunded, in shop currency.
   */
  public String getTotalRefunded() {
    return totalRefunded;
  }

  public void setTotalRefunded(String totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  /**
   * The total amount that was refunded, in shop and presentment currencies.
   */
  public MoneyBag getTotalRefundedSet() {
    return totalRefundedSet;
  }

  public void setTotalRefundedSet(MoneyBag totalRefundedSet) {
    this.totalRefundedSet = totalRefundedSet;
  }

  /**
   * The total amount of shipping that was refunded, in shop and presentment currencies.
   */
  public MoneyBag getTotalRefundedShippingSet() {
    return totalRefundedShippingSet;
  }

  public void setTotalRefundedShippingSet(MoneyBag totalRefundedShippingSet) {
    this.totalRefundedShippingSet = totalRefundedShippingSet;
  }

  /**
   * The total shipping amount before discounts and returns, in shop currency.
   */
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total shipping amount before discounts and returns, in shop and presentment currencies.
   */
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  /**
   * The total tax amount before returns, in shop currency.
   */
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total tax amount before returns, in shop and presentment currencies.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * The sum of all tip amounts for the order, in shop currency.
   */
  public MoneyV2 getTotalTipReceived() {
    return totalTipReceived;
  }

  public void setTotalTipReceived(MoneyV2 totalTipReceived) {
    this.totalTipReceived = totalTipReceived;
  }

  /**
   * The sum of all tip amounts for the order, in shop and presentment currencies.
   */
  public MoneyBag getTotalTipReceivedSet() {
    return totalTipReceivedSet;
  }

  public void setTotalTipReceivedSet(MoneyBag totalTipReceivedSet) {
    this.totalTipReceivedSet = totalTipReceivedSet;
  }

  /**
   * The total weight of the order before returns, in grams.
   */
  public String getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(String totalWeight) {
    this.totalWeight = totalWeight;
  }

  /**
   * A list of transactions associated with the order.
   */
  public List<OrderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransaction> transactions) {
    this.transactions = transactions;
  }

  /**
   * The number of transactions associated with the order.
   */
  public Count getTransactionsCount() {
    return transactionsCount;
  }

  public void setTransactionsCount(Count transactionsCount) {
    this.transactionsCount = transactionsCount;
  }

  /**
   * Whether no payments have been made for the order.
   */
  public boolean getUnpaid() {
    return unpaid;
  }

  public void setUnpaid(boolean unpaid) {
    this.unpaid = unpaid;
  }

  /**
   * The date and time when the order was modified last.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Order{additionalFees='" + additionalFees + "', agreements='" + agreements + "', alerts='" + alerts + "', app='" + app + "', billingAddress='" + billingAddress + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', canMarkAsPaid='" + canMarkAsPaid + "', canNotifyCustomer='" + canNotifyCustomer + "', cancelReason='" + cancelReason + "', cancellation='" + cancellation + "', cancelledAt='" + cancelledAt + "', capturable='" + capturable + "', cartDiscountAmount='" + cartDiscountAmount + "', cartDiscountAmountSet='" + cartDiscountAmountSet + "', channel='" + channel + "', channelInformation='" + channelInformation + "', clientIp='" + clientIp + "', closed='" + closed + "', closedAt='" + closedAt + "', confirmationNumber='" + confirmationNumber + "', confirmed='" + confirmed + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', currentCartDiscountAmountSet='" + currentCartDiscountAmountSet + "', currentShippingPriceSet='" + currentShippingPriceSet + "', currentSubtotalLineItemsQuantity='" + currentSubtotalLineItemsQuantity + "', currentSubtotalPriceSet='" + currentSubtotalPriceSet + "', currentTaxLines='" + currentTaxLines + "', currentTotalAdditionalFeesSet='" + currentTotalAdditionalFeesSet + "', currentTotalDiscountsSet='" + currentTotalDiscountsSet + "', currentTotalDutiesSet='" + currentTotalDutiesSet + "', currentTotalPriceSet='" + currentTotalPriceSet + "', currentTotalTaxSet='" + currentTotalTaxSet + "', currentTotalWeight='" + currentTotalWeight + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerAcceptsMarketing='" + customerAcceptsMarketing + "', customerJourney='" + customerJourney + "', customerJourneySummary='" + customerJourneySummary + "', customerLocale='" + customerLocale + "', discountApplications='" + discountApplications + "', discountCode='" + discountCode + "', discountCodes='" + discountCodes + "', displayAddress='" + displayAddress + "', displayFinancialStatus='" + displayFinancialStatus + "', displayFulfillmentStatus='" + displayFulfillmentStatus + "', disputes='" + disputes + "', dutiesIncluded='" + dutiesIncluded + "', edited='" + edited + "', email='" + email + "', estimatedTaxes='" + estimatedTaxes + "', events='" + events + "', exchangeV2s='" + exchangeV2s + "', fulfillable='" + fulfillable + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillments='" + fulfillments + "', fulfillmentsCount='" + fulfillmentsCount + "', fullyPaid='" + fullyPaid + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', landingPageDisplayText='" + landingPageDisplayText + "', landingPageUrl='" + landingPageUrl + "', legacyResourceId='" + legacyResourceId + "', lineItems='" + lineItems + "', localizationExtensions='" + localizationExtensions + "', localizedFields='" + localizedFields + "', merchantBusinessEntity='" + merchantBusinessEntity + "', merchantEditable='" + merchantEditable + "', merchantEditableErrors='" + merchantEditableErrors + "', merchantOfRecordApp='" + merchantOfRecordApp + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', netPayment='" + netPayment + "', netPaymentSet='" + netPaymentSet + "', nonFulfillableLineItems='" + nonFulfillableLineItems + "', note='" + note + "', originalTotalAdditionalFeesSet='" + originalTotalAdditionalFeesSet + "', originalTotalDutiesSet='" + originalTotalDutiesSet + "', originalTotalPriceSet='" + originalTotalPriceSet + "', paymentCollectionDetails='" + paymentCollectionDetails + "', paymentGatewayNames='" + paymentGatewayNames + "', paymentTerms='" + paymentTerms + "', phone='" + phone + "', physicalLocation='" + physicalLocation + "', poNumber='" + poNumber + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', processedAt='" + processedAt + "', publication='" + publication + "', purchasingEntity='" + purchasingEntity + "', referralCode='" + referralCode + "', referrerDisplayText='" + referrerDisplayText + "', referrerUrl='" + referrerUrl + "', refundDiscrepancySet='" + refundDiscrepancySet + "', refundable='" + refundable + "', refunds='" + refunds + "', registeredSourceUrl='" + registeredSourceUrl + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', retailLocation='" + retailLocation + "', returnStatus='" + returnStatus + "', returns='" + returns + "', risk='" + risk + "', riskLevel='" + riskLevel + "', risks='" + risks + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', shippingLines='" + shippingLines + "', shopifyProtect='" + shopifyProtect + "', sourceIdentifier='" + sourceIdentifier + "', sourceName='" + sourceName + "', staffMember='" + staffMember + "', statusPageUrl='" + statusPageUrl + "', subtotalLineItemsQuantity='" + subtotalLineItemsQuantity + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', suggestedRefund='" + suggestedRefund + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', test='" + test + "', totalCapturable='" + totalCapturable + "', totalCapturableSet='" + totalCapturableSet + "', totalCashRoundingAdjustment='" + totalCashRoundingAdjustment + "', totalDiscounts='" + totalDiscounts + "', totalDiscountsSet='" + totalDiscountsSet + "', totalOutstandingSet='" + totalOutstandingSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalReceived='" + totalReceived + "', totalReceivedSet='" + totalReceivedSet + "', totalRefunded='" + totalRefunded + "', totalRefundedSet='" + totalRefundedSet + "', totalRefundedShippingSet='" + totalRefundedShippingSet + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', totalTipReceived='" + totalTipReceived + "', totalTipReceivedSet='" + totalTipReceivedSet + "', totalWeight='" + totalWeight + "', transactions='" + transactions + "', transactionsCount='" + transactionsCount + "', unpaid='" + unpaid + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order that = (Order) o;
    return Objects.equals(additionalFees, that.additionalFees) &&
        Objects.equals(agreements, that.agreements) &&
        Objects.equals(alerts, that.alerts) &&
        Objects.equals(app, that.app) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        billingAddressMatchesShippingAddress == that.billingAddressMatchesShippingAddress &&
        canMarkAsPaid == that.canMarkAsPaid &&
        canNotifyCustomer == that.canNotifyCustomer &&
        Objects.equals(cancelReason, that.cancelReason) &&
        Objects.equals(cancellation, that.cancellation) &&
        Objects.equals(cancelledAt, that.cancelledAt) &&
        capturable == that.capturable &&
        Objects.equals(cartDiscountAmount, that.cartDiscountAmount) &&
        Objects.equals(cartDiscountAmountSet, that.cartDiscountAmountSet) &&
        Objects.equals(channel, that.channel) &&
        Objects.equals(channelInformation, that.channelInformation) &&
        Objects.equals(clientIp, that.clientIp) &&
        closed == that.closed &&
        Objects.equals(closedAt, that.closedAt) &&
        Objects.equals(confirmationNumber, that.confirmationNumber) &&
        confirmed == that.confirmed &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currentCartDiscountAmountSet, that.currentCartDiscountAmountSet) &&
        Objects.equals(currentShippingPriceSet, that.currentShippingPriceSet) &&
        currentSubtotalLineItemsQuantity == that.currentSubtotalLineItemsQuantity &&
        Objects.equals(currentSubtotalPriceSet, that.currentSubtotalPriceSet) &&
        Objects.equals(currentTaxLines, that.currentTaxLines) &&
        Objects.equals(currentTotalAdditionalFeesSet, that.currentTotalAdditionalFeesSet) &&
        Objects.equals(currentTotalDiscountsSet, that.currentTotalDiscountsSet) &&
        Objects.equals(currentTotalDutiesSet, that.currentTotalDutiesSet) &&
        Objects.equals(currentTotalPriceSet, that.currentTotalPriceSet) &&
        Objects.equals(currentTotalTaxSet, that.currentTotalTaxSet) &&
        Objects.equals(currentTotalWeight, that.currentTotalWeight) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        customerAcceptsMarketing == that.customerAcceptsMarketing &&
        Objects.equals(customerJourney, that.customerJourney) &&
        Objects.equals(customerJourneySummary, that.customerJourneySummary) &&
        Objects.equals(customerLocale, that.customerLocale) &&
        Objects.equals(discountApplications, that.discountApplications) &&
        Objects.equals(discountCode, that.discountCode) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(displayAddress, that.displayAddress) &&
        Objects.equals(displayFinancialStatus, that.displayFinancialStatus) &&
        Objects.equals(displayFulfillmentStatus, that.displayFulfillmentStatus) &&
        Objects.equals(disputes, that.disputes) &&
        dutiesIncluded == that.dutiesIncluded &&
        edited == that.edited &&
        Objects.equals(email, that.email) &&
        estimatedTaxes == that.estimatedTaxes &&
        Objects.equals(events, that.events) &&
        Objects.equals(exchangeV2s, that.exchangeV2s) &&
        fulfillable == that.fulfillable &&
        Objects.equals(fulfillmentOrders, that.fulfillmentOrders) &&
        Objects.equals(fulfillments, that.fulfillments) &&
        Objects.equals(fulfillmentsCount, that.fulfillmentsCount) &&
        fullyPaid == that.fullyPaid &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(landingPageDisplayText, that.landingPageDisplayText) &&
        Objects.equals(landingPageUrl, that.landingPageUrl) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(localizationExtensions, that.localizationExtensions) &&
        Objects.equals(localizedFields, that.localizedFields) &&
        Objects.equals(merchantBusinessEntity, that.merchantBusinessEntity) &&
        merchantEditable == that.merchantEditable &&
        Objects.equals(merchantEditableErrors, that.merchantEditableErrors) &&
        Objects.equals(merchantOfRecordApp, that.merchantOfRecordApp) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(netPayment, that.netPayment) &&
        Objects.equals(netPaymentSet, that.netPaymentSet) &&
        Objects.equals(nonFulfillableLineItems, that.nonFulfillableLineItems) &&
        Objects.equals(note, that.note) &&
        Objects.equals(originalTotalAdditionalFeesSet, that.originalTotalAdditionalFeesSet) &&
        Objects.equals(originalTotalDutiesSet, that.originalTotalDutiesSet) &&
        Objects.equals(originalTotalPriceSet, that.originalTotalPriceSet) &&
        Objects.equals(paymentCollectionDetails, that.paymentCollectionDetails) &&
        Objects.equals(paymentGatewayNames, that.paymentGatewayNames) &&
        Objects.equals(paymentTerms, that.paymentTerms) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(physicalLocation, that.physicalLocation) &&
        Objects.equals(poNumber, that.poNumber) &&
        Objects.equals(presentmentCurrencyCode, that.presentmentCurrencyCode) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(purchasingEntity, that.purchasingEntity) &&
        Objects.equals(referralCode, that.referralCode) &&
        Objects.equals(referrerDisplayText, that.referrerDisplayText) &&
        Objects.equals(referrerUrl, that.referrerUrl) &&
        Objects.equals(refundDiscrepancySet, that.refundDiscrepancySet) &&
        refundable == that.refundable &&
        Objects.equals(refunds, that.refunds) &&
        Objects.equals(registeredSourceUrl, that.registeredSourceUrl) &&
        requiresShipping == that.requiresShipping &&
        restockable == that.restockable &&
        Objects.equals(retailLocation, that.retailLocation) &&
        Objects.equals(returnStatus, that.returnStatus) &&
        Objects.equals(returns, that.returns) &&
        Objects.equals(risk, that.risk) &&
        Objects.equals(riskLevel, that.riskLevel) &&
        Objects.equals(risks, that.risks) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(shopifyProtect, that.shopifyProtect) &&
        Objects.equals(sourceIdentifier, that.sourceIdentifier) &&
        Objects.equals(sourceName, that.sourceName) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(statusPageUrl, that.statusPageUrl) &&
        subtotalLineItemsQuantity == that.subtotalLineItemsQuantity &&
        Objects.equals(subtotalPrice, that.subtotalPrice) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(suggestedRefund, that.suggestedRefund) &&
        Objects.equals(tags, that.tags) &&
        taxExempt == that.taxExempt &&
        Objects.equals(taxLines, that.taxLines) &&
        taxesIncluded == that.taxesIncluded &&
        test == that.test &&
        Objects.equals(totalCapturable, that.totalCapturable) &&
        Objects.equals(totalCapturableSet, that.totalCapturableSet) &&
        Objects.equals(totalCashRoundingAdjustment, that.totalCashRoundingAdjustment) &&
        Objects.equals(totalDiscounts, that.totalDiscounts) &&
        Objects.equals(totalDiscountsSet, that.totalDiscountsSet) &&
        Objects.equals(totalOutstandingSet, that.totalOutstandingSet) &&
        Objects.equals(totalPrice, that.totalPrice) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        Objects.equals(totalReceived, that.totalReceived) &&
        Objects.equals(totalReceivedSet, that.totalReceivedSet) &&
        Objects.equals(totalRefunded, that.totalRefunded) &&
        Objects.equals(totalRefundedSet, that.totalRefundedSet) &&
        Objects.equals(totalRefundedShippingSet, that.totalRefundedShippingSet) &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalShippingPriceSet, that.totalShippingPriceSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(totalTipReceived, that.totalTipReceived) &&
        Objects.equals(totalTipReceivedSet, that.totalTipReceivedSet) &&
        Objects.equals(totalWeight, that.totalWeight) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(transactionsCount, that.transactionsCount) &&
        unpaid == that.unpaid &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalFees, agreements, alerts, app, billingAddress, billingAddressMatchesShippingAddress, canMarkAsPaid, canNotifyCustomer, cancelReason, cancellation, cancelledAt, capturable, cartDiscountAmount, cartDiscountAmountSet, channel, channelInformation, clientIp, closed, closedAt, confirmationNumber, confirmed, createdAt, currencyCode, currentCartDiscountAmountSet, currentShippingPriceSet, currentSubtotalLineItemsQuantity, currentSubtotalPriceSet, currentTaxLines, currentTotalAdditionalFeesSet, currentTotalDiscountsSet, currentTotalDutiesSet, currentTotalPriceSet, currentTotalTaxSet, currentTotalWeight, customAttributes, customer, customerAcceptsMarketing, customerJourney, customerJourneySummary, customerLocale, discountApplications, discountCode, discountCodes, displayAddress, displayFinancialStatus, displayFulfillmentStatus, disputes, dutiesIncluded, edited, email, estimatedTaxes, events, exchangeV2s, fulfillable, fulfillmentOrders, fulfillments, fulfillmentsCount, fullyPaid, hasTimelineComment, id, landingPageDisplayText, landingPageUrl, legacyResourceId, lineItems, localizationExtensions, localizedFields, merchantBusinessEntity, merchantEditable, merchantEditableErrors, merchantOfRecordApp, metafield, metafieldDefinitions, metafields, name, netPayment, netPaymentSet, nonFulfillableLineItems, note, originalTotalAdditionalFeesSet, originalTotalDutiesSet, originalTotalPriceSet, paymentCollectionDetails, paymentGatewayNames, paymentTerms, phone, physicalLocation, poNumber, presentmentCurrencyCode, processedAt, publication, purchasingEntity, referralCode, referrerDisplayText, referrerUrl, refundDiscrepancySet, refundable, refunds, registeredSourceUrl, requiresShipping, restockable, retailLocation, returnStatus, returns, risk, riskLevel, risks, shippingAddress, shippingLine, shippingLines, shopifyProtect, sourceIdentifier, sourceName, staffMember, statusPageUrl, subtotalLineItemsQuantity, subtotalPrice, subtotalPriceSet, suggestedRefund, tags, taxExempt, taxLines, taxesIncluded, test, totalCapturable, totalCapturableSet, totalCashRoundingAdjustment, totalDiscounts, totalDiscountsSet, totalOutstandingSet, totalPrice, totalPriceSet, totalReceived, totalReceivedSet, totalRefunded, totalRefundedSet, totalRefundedShippingSet, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, totalTipReceived, totalTipReceivedSet, totalWeight, transactions, transactionsCount, unpaid, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of additional fees applied to the order.
     */
    private List<AdditionalFee> additionalFees;

    /**
     * A list of sales agreements associated with the order.
     */
    private SalesAgreementConnection agreements;

    /**
     * A list of messages that appear on the order page in the Shopify admin.
     */
    private List<ResourceAlert> alerts;

    /**
     * The application that created the order.
     */
    private OrderApp app;

    /**
     * The billing address of the customer.
     */
    private MailingAddress billingAddress;

    /**
     * Whether the billing address matches the shipping address.
     */
    private boolean billingAddressMatchesShippingAddress;

    /**
     * Whether the order can be manually marked as paid.
     */
    private boolean canMarkAsPaid;

    /**
     * Whether a customer email exists for the order.
     */
    private boolean canNotifyCustomer;

    /**
     * The reason provided when the order was canceled.
     * Returns `null` if the order wasn't canceled.
     */
    private OrderCancelReason cancelReason;

    /**
     * Cancellation details for the order.
     */
    private OrderCancellation cancellation;

    /**
     * The date and time when the order was canceled.
     * Returns `null` if the order wasn't canceled.
     */
    private OffsetDateTime cancelledAt;

    /**
     * Whether payment for the order can be captured.
     */
    private boolean capturable;

    /**
     * The total order-level discount amount, before returns, in shop currency.
     */
    private String cartDiscountAmount;

    /**
     * The total order-level discount amount, before returns, in shop and presentment currencies.
     */
    private MoneyBag cartDiscountAmountSet;

    /**
     * The channel that created the order.
     */
    private Channel channel;

    /**
     * Details about the channel that created the order.
     */
    private ChannelInformation channelInformation;

    /**
     * The IP address of the API client that created the order.
     */
    private String clientIp;

    /**
     * Whether the order is closed.
     */
    private boolean closed;

    /**
     * The date and time when the order was closed.
     * Returns `null` if the order isn't closed.
     */
    private OffsetDateTime closedAt;

    /**
     * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
     * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
     * This value isn't guaranteed to be unique.
     */
    private String confirmationNumber;

    /**
     * Whether inventory has been reserved for the order.
     */
    private boolean confirmed;

    /**
     * Date and time when the order was created in Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * The shop currency when the order was placed.
     */
    private CurrencyCode currencyCode;

    /**
     * The current order-level discount amount after all order updates, in shop and presentment currencies.
     */
    private MoneyBag currentCartDiscountAmountSet;

    /**
     * The current shipping price after applying refunds and discounts. If the parent
     * `order.taxesIncluded` field is true, then this price includes taxes.
     * Otherwise, this field is the pre-tax price.
     */
    private MoneyBag currentShippingPriceSet;

    /**
     * The sum of the quantities for all line items that contribute to the order's current subtotal price.
     */
    private int currentSubtotalLineItemsQuantity;

    /**
     * The sum of the prices for all line items after discounts and returns, in shop and presentment currencies.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    private MoneyBag currentSubtotalPriceSet;

    /**
     * A list of all tax lines applied to line items on the order, after returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    private List<TaxLine> currentTaxLines;

    /**
     * The total amount of additional fees after returns, in shop and presentment currencies.
     * Returns `null` if there are no additional fees for the order.
     */
    private MoneyBag currentTotalAdditionalFeesSet;

    /**
     * The total amount discounted on the order after returns, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    private MoneyBag currentTotalDiscountsSet;

    /**
     * The total amount of duties after returns, in shop and presentment currencies.
     * Returns `null` if duties aren't applicable.
     */
    private MoneyBag currentTotalDutiesSet;

    /**
     * The total price of the order, after returns, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    private MoneyBag currentTotalPriceSet;

    /**
     * The sum of the prices of all tax lines applied to line items on the order,
     * after returns, in shop and presentment currencies.
     */
    private MoneyBag currentTotalTaxSet;

    /**
     * The total weight of the order after returns, in grams.
     */
    private String currentTotalWeight;

    /**
     * A list of additional merchant-facing details that have been added to the
     * order. For example, whether an order is a customer's first.
     */
    private List<Attribute> customAttributes;

    /**
     * The customer that placed the order.
     */
    private Customer customer;

    /**
     * Whether the customer agreed to receive marketing materials.
     */
    private boolean customerAcceptsMarketing;

    /**
     * The customer's visits and interactions with the online store before placing the order.
     */
    private CustomerJourney customerJourney;

    /**
     * The customer's visits and interactions with the online store before placing the order.
     */
    private CustomerJourneySummary customerJourneySummary;

    /**
     * A two-letter or three-letter language code, optionally followed by a region modifier.
     */
    private String customerLocale;

    /**
     * A list of discounts that are applied to the order, not including order edits and refunds.
     */
    private DiscountApplicationConnection discountApplications;

    /**
     * The discount code used for the order.
     */
    private String discountCode;

    /**
     * The discount codes used for the order.
     */
    private List<String> discountCodes;

    /**
     * The primary address of the customer.
     * Returns `null` if neither the shipping address nor the billing address was provided.
     */
    private MailingAddress displayAddress;

    /**
     * The financial status of the order that can be shown to the merchant.
     * This field doesn't capture all the details of an order's financial state. It
     * should only be used for display summary purposes.
     */
    private OrderDisplayFinancialStatus displayFinancialStatus;

    /**
     * The fulfillment status for the order that can be shown to the merchant.
     * This field does not capture all the details of an order's fulfillment state.
     * It should only be used for display summary purposes.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

    /**
     * A list of the disputes associated with the order.
     */
    private List<OrderDisputeSummary> disputes;

    /**
     * Whether duties are included in the subtotal price of the order.
     */
    private boolean dutiesIncluded;

    /**
     * Whether the order has had any edits applied.
     */
    private boolean edited;

    /**
     * The email address associated with the customer.
     */
    private String email;

    /**
     * Whether taxes on the order are estimated.
     * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
     */
    private boolean estimatedTaxes;

    /**
     * A list of events associated with the order.
     */
    private EventConnection events;

    /**
     * A list of ExchangeV2s for the order.
     */
    private ExchangeV2Connection exchangeV2s;

    /**
     * Whether there are line items that can be fulfilled.
     * This field returns `false` when the order has no fulfillable line items.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    private boolean fulfillable;

    /**
     * A list of fulfillment orders for a specific order.
     *   
     * [FulfillmentOrder API access scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
     * govern which fulfillments orders are returned.
     * An API client will only receive a subset of the fulfillment orders which belong to an order
     * if they don't have the necessary access scopes to view all of the fulfillment orders.
     * In the case that an API client does not have the access scopes necessary to view
     * any of the fulfillment orders that belong to an order, an empty array will be returned.
     */
    private FulfillmentOrderConnection fulfillmentOrders;

    /**
     * List of shipments for the order.
     */
    private List<Fulfillment> fulfillments;

    /**
     * The count of fulfillments including the cancelled fulfillments.
     */
    private Count fulfillmentsCount;

    /**
     * Whether the order has been paid in full.
     */
    private boolean fullyPaid;

    /**
     * Whether the merchant added a timeline comment to the order.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The URL of the first page of the online store that the customer visited before they submitted the order.
     */
    private String landingPageDisplayText;

    /**
     * The first page of the online store that the customer visited before they submitted the order.
     */
    private String landingPageUrl;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * A list of the order's line items.
     */
    private LineItemConnection lineItems;

    /**
     * List of localization extensions for the resource.
     */
    private LocalizationExtensionConnection localizationExtensions;

    /**
     * List of localized fields for the resource.
     */
    private LocalizedFieldConnection localizedFields;

    /**
     * The merchant's business entity associated with the order.
     */
    private BusinessEntity merchantBusinessEntity;

    /**
     * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
     */
    private boolean merchantEditable;

    /**
     * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
     */
    private List<String> merchantEditableErrors;

    /**
     * The application acting as the Merchant of Record for the order.
     */
    private OrderApp merchantOfRecordApp;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores.
     */
    private String name;

    /**
     * The net payment for the order, based on the total amount received minus the total amount refunded, in shop currency.
     */
    private String netPayment;

    /**
     * The net payment for the order, based on the total amount received minus the
     * total amount refunded, in shop and presentment currencies.
     */
    private MoneyBag netPaymentSet;

    /**
     * A list of line items that can't be fulfilled.
     * For example, tips and fully refunded line items can't be fulfilled.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    private LineItemConnection nonFulfillableLineItems;

    /**
     * The contents of the note associated with the order.
     */
    private String note;

    /**
     * The total amount of additional fees at the time of order creation, in shop and presentment currencies.
     * Returns `null` if additional fees aren't applicable.
     */
    private MoneyBag originalTotalAdditionalFeesSet;

    /**
     * The total amount of duties at the time of order creation, in shop and presentment currencies.
     * Returns `null` if duties aren't applicable.
     */
    private MoneyBag originalTotalDutiesSet;

    /**
     * The total price of the order at the time of order creation, in shop and presentment currencies.
     */
    private MoneyBag originalTotalPriceSet;

    /**
     * The payment collection details for the order.
     */
    private OrderPaymentCollectionDetails paymentCollectionDetails;

    /**
     * A list of the names of all payment gateways used for the order.
     * For example, "Shopify Payments" and "Cash on Delivery (COD)".
     */
    private List<String> paymentGatewayNames;

    /**
     * The payment terms associated with the order.
     */
    private PaymentTerms paymentTerms;

    /**
     * The phone number associated with the customer.
     */
    private String phone;

    /**
     * The fulfillment location that was assigned when the order was created.
     * Orders can have multiple fulfillment orders. These fulfillment orders can each
     * be assigned to a different location which is responsible for fulfilling a
     * subset of the items in an order. The `Order.physicalLocation` field will only
     * point to one of these locations.
     * Use the [`FulfillmentOrder`](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder)
     * object for up to date fulfillment location information.
     */
    private Location physicalLocation;

    /**
     * The PO number associated with the order.
     */
    private String poNumber;

    /**
     * The payment `CurrencyCode` of the customer for the order.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The date and time when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    private OffsetDateTime processedAt;

    /**
     * The publication that the order was created from.
     */
    private Publication publication;

    /**
     * The purchasing entity for the order.
     */
    private PurchasingEntity purchasingEntity;

    /**
     * The marketing referral code from the link that the customer clicked to visit the store.
     * Supports the following URL attributes: "ref", "source", or "r".
     * For example, if the URL is `{shop}.myshopify.com/products/slide?ref=j2tj1tn2`, then this value is `j2tj1tn2`.
     */
    private String referralCode;

    /**
     * A web domain or short description of the source that sent the customer to your
     * online store. For example, "shopify.com" or "email".
     */
    private String referrerDisplayText;

    /**
     * The URL of the webpage where the customer clicked a link that sent them to your online store.
     */
    private String referrerUrl;

    /**
     * The difference between the suggested and actual refund amount of all refunds
     * that have been applied to the order. A positive value indicates a difference
     * in the merchant's favor, and a negative value indicates a difference in the
     * customer's favor.
     */
    private MoneyBag refundDiscrepancySet;

    /**
     * Whether the order can be refunded.
     */
    private boolean refundable;

    /**
     * A list of refunds that have been applied to the order.
     */
    private List<Refund> refunds;

    /**
     * The URL of the source that the order originated from, if found in the domain registry.
     */
    private String registeredSourceUrl;

    /**
     * Whether the order has shipping lines or at least one line item on the order that requires shipping.
     */
    private boolean requiresShipping;

    /**
     * Whether any line item on the order can be restocked.
     */
    private boolean restockable;

    /**
     * The physical location where a retail order is created or completed, except for
     * draft POS orders completed via the “mark as paid” flow in Admin, which return
     * null. Transactions associated with the order might have been processed at a
     * different location.
     */
    private Location retailLocation;

    /**
     * The order's aggregated return status for display purposes.
     */
    private OrderReturnStatus returnStatus;

    /**
     * A list of returns for the order.
     */
    private ReturnConnection returns;

    /**
     * The risk characteristics for the order.
     */
    private OrderRiskSummary risk;

    /**
     * The fraud risk level of the order.
     */
    private OrderRiskLevel riskLevel;

    /**
     * A list of risks associated with the order.
     */
    private List<OrderRisk> risks;

    /**
     * The mailing address of the customer.
     */
    private MailingAddress shippingAddress;

    /**
     * A summary of all shipping costs on the order.
     */
    private ShippingLine shippingLine;

    /**
     * A list of the order's shipping lines.
     */
    private ShippingLineConnection shippingLines;

    /**
     * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this will be null.
     */
    private ShopifyProtectOrderSummary shopifyProtect;

    /**
     * A unique POS or third party order identifier.
     * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value for POS orders.
     */
    private String sourceIdentifier;

    /**
     * The name of the source associated with the order.
     */
    private String sourceName;

    /**
     * The staff member associated with the order.
     */
    private StaffMember staffMember;

    /**
     * The URL where the customer can check the order's current status.
     */
    private String statusPageUrl;

    /**
     * The sum of the quantities for all line items that contribute to the order's subtotal price.
     */
    private int subtotalLineItemsQuantity;

    /**
     * The sum of the prices for all line items after discounts and before returns, in shop currency.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    private String subtotalPrice;

    /**
     * The sum of the prices for all line items after discounts and before returns, in shop and presentment currencies.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * A suggested refund for the order.
     */
    private SuggestedRefund suggestedRefund;

    /**
     * A comma separated list of tags associated with the order. Updating `tags` overwrites
     * any existing tags that were previously added to the order. To add new tags without overwriting
     * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    private List<String> tags;

    /**
     * Whether taxes are exempt on the order.
     */
    private boolean taxExempt;

    /**
     * A list of all tax lines applied to line items on the order, before returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether taxes are included in the subtotal price of the order.
     */
    private boolean taxesIncluded;

    /**
     * Whether the order is a test.
     * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
     * A test order can't be converted into a real order and vice versa.
     */
    private boolean test;

    /**
     * The authorized amount that's uncaptured or undercaptured, in shop currency.
     * This amount isn't adjusted for returns.
     */
    private String totalCapturable;

    /**
     * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
     * This amount isn't adjusted for returns.
     */
    private MoneyBag totalCapturableSet;

    /**
     * The total rounding adjustment applied to payments or refunds for an Order
     * involving cash payments. Applies to some countries where cash transactions are
     * rounded to the nearest currency denomination.
     */
    private CashRoundingAdjustment totalCashRoundingAdjustment;

    /**
     * The total amount discounted on the order before returns, in shop currency.
     * This includes both order and line level discounts.
     */
    private String totalDiscounts;

    /**
     * The total amount discounted on the order before returns, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    private MoneyBag totalDiscountsSet;

    /**
     * The total amount not yet transacted for the order, in shop and presentment currencies.
     * A positive value indicates a difference in the merchant's favor (payment from
     * customer to merchant) and a negative value indicates a difference in the
     * customer's favor (refund from merchant to customer).
     */
    private MoneyBag totalOutstandingSet;

    /**
     * The total price of the order, before returns, in shop currency.
     * This includes taxes and discounts.
     */
    private String totalPrice;

    /**
     * The total price of the order, before returns, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    private MoneyBag totalPriceSet;

    /**
     * The total amount received from the customer before returns, in shop currency.
     */
    private String totalReceived;

    /**
     * The total amount received from the customer before returns, in shop and presentment currencies.
     */
    private MoneyBag totalReceivedSet;

    /**
     * The total amount that was refunded, in shop currency.
     */
    private String totalRefunded;

    /**
     * The total amount that was refunded, in shop and presentment currencies.
     */
    private MoneyBag totalRefundedSet;

    /**
     * The total amount of shipping that was refunded, in shop and presentment currencies.
     */
    private MoneyBag totalRefundedShippingSet;

    /**
     * The total shipping amount before discounts and returns, in shop currency.
     */
    private String totalShippingPrice;

    /**
     * The total shipping amount before discounts and returns, in shop and presentment currencies.
     */
    private MoneyBag totalShippingPriceSet;

    /**
     * The total tax amount before returns, in shop currency.
     */
    private String totalTax;

    /**
     * The total tax amount before returns, in shop and presentment currencies.
     */
    private MoneyBag totalTaxSet;

    /**
     * The sum of all tip amounts for the order, in shop currency.
     */
    private MoneyV2 totalTipReceived;

    /**
     * The sum of all tip amounts for the order, in shop and presentment currencies.
     */
    private MoneyBag totalTipReceivedSet;

    /**
     * The total weight of the order before returns, in grams.
     */
    private String totalWeight;

    /**
     * A list of transactions associated with the order.
     */
    private List<OrderTransaction> transactions;

    /**
     * The number of transactions associated with the order.
     */
    private Count transactionsCount;

    /**
     * Whether no payments have been made for the order.
     */
    private boolean unpaid;

    /**
     * The date and time when the order was modified last.
     */
    private OffsetDateTime updatedAt;

    public Order build() {
      Order result = new Order();
      result.additionalFees = this.additionalFees;
      result.agreements = this.agreements;
      result.alerts = this.alerts;
      result.app = this.app;
      result.billingAddress = this.billingAddress;
      result.billingAddressMatchesShippingAddress = this.billingAddressMatchesShippingAddress;
      result.canMarkAsPaid = this.canMarkAsPaid;
      result.canNotifyCustomer = this.canNotifyCustomer;
      result.cancelReason = this.cancelReason;
      result.cancellation = this.cancellation;
      result.cancelledAt = this.cancelledAt;
      result.capturable = this.capturable;
      result.cartDiscountAmount = this.cartDiscountAmount;
      result.cartDiscountAmountSet = this.cartDiscountAmountSet;
      result.channel = this.channel;
      result.channelInformation = this.channelInformation;
      result.clientIp = this.clientIp;
      result.closed = this.closed;
      result.closedAt = this.closedAt;
      result.confirmationNumber = this.confirmationNumber;
      result.confirmed = this.confirmed;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.currentCartDiscountAmountSet = this.currentCartDiscountAmountSet;
      result.currentShippingPriceSet = this.currentShippingPriceSet;
      result.currentSubtotalLineItemsQuantity = this.currentSubtotalLineItemsQuantity;
      result.currentSubtotalPriceSet = this.currentSubtotalPriceSet;
      result.currentTaxLines = this.currentTaxLines;
      result.currentTotalAdditionalFeesSet = this.currentTotalAdditionalFeesSet;
      result.currentTotalDiscountsSet = this.currentTotalDiscountsSet;
      result.currentTotalDutiesSet = this.currentTotalDutiesSet;
      result.currentTotalPriceSet = this.currentTotalPriceSet;
      result.currentTotalTaxSet = this.currentTotalTaxSet;
      result.currentTotalWeight = this.currentTotalWeight;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.customerAcceptsMarketing = this.customerAcceptsMarketing;
      result.customerJourney = this.customerJourney;
      result.customerJourneySummary = this.customerJourneySummary;
      result.customerLocale = this.customerLocale;
      result.discountApplications = this.discountApplications;
      result.discountCode = this.discountCode;
      result.discountCodes = this.discountCodes;
      result.displayAddress = this.displayAddress;
      result.displayFinancialStatus = this.displayFinancialStatus;
      result.displayFulfillmentStatus = this.displayFulfillmentStatus;
      result.disputes = this.disputes;
      result.dutiesIncluded = this.dutiesIncluded;
      result.edited = this.edited;
      result.email = this.email;
      result.estimatedTaxes = this.estimatedTaxes;
      result.events = this.events;
      result.exchangeV2s = this.exchangeV2s;
      result.fulfillable = this.fulfillable;
      result.fulfillmentOrders = this.fulfillmentOrders;
      result.fulfillments = this.fulfillments;
      result.fulfillmentsCount = this.fulfillmentsCount;
      result.fullyPaid = this.fullyPaid;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.landingPageDisplayText = this.landingPageDisplayText;
      result.landingPageUrl = this.landingPageUrl;
      result.legacyResourceId = this.legacyResourceId;
      result.lineItems = this.lineItems;
      result.localizationExtensions = this.localizationExtensions;
      result.localizedFields = this.localizedFields;
      result.merchantBusinessEntity = this.merchantBusinessEntity;
      result.merchantEditable = this.merchantEditable;
      result.merchantEditableErrors = this.merchantEditableErrors;
      result.merchantOfRecordApp = this.merchantOfRecordApp;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.netPayment = this.netPayment;
      result.netPaymentSet = this.netPaymentSet;
      result.nonFulfillableLineItems = this.nonFulfillableLineItems;
      result.note = this.note;
      result.originalTotalAdditionalFeesSet = this.originalTotalAdditionalFeesSet;
      result.originalTotalDutiesSet = this.originalTotalDutiesSet;
      result.originalTotalPriceSet = this.originalTotalPriceSet;
      result.paymentCollectionDetails = this.paymentCollectionDetails;
      result.paymentGatewayNames = this.paymentGatewayNames;
      result.paymentTerms = this.paymentTerms;
      result.phone = this.phone;
      result.physicalLocation = this.physicalLocation;
      result.poNumber = this.poNumber;
      result.presentmentCurrencyCode = this.presentmentCurrencyCode;
      result.processedAt = this.processedAt;
      result.publication = this.publication;
      result.purchasingEntity = this.purchasingEntity;
      result.referralCode = this.referralCode;
      result.referrerDisplayText = this.referrerDisplayText;
      result.referrerUrl = this.referrerUrl;
      result.refundDiscrepancySet = this.refundDiscrepancySet;
      result.refundable = this.refundable;
      result.refunds = this.refunds;
      result.registeredSourceUrl = this.registeredSourceUrl;
      result.requiresShipping = this.requiresShipping;
      result.restockable = this.restockable;
      result.retailLocation = this.retailLocation;
      result.returnStatus = this.returnStatus;
      result.returns = this.returns;
      result.risk = this.risk;
      result.riskLevel = this.riskLevel;
      result.risks = this.risks;
      result.shippingAddress = this.shippingAddress;
      result.shippingLine = this.shippingLine;
      result.shippingLines = this.shippingLines;
      result.shopifyProtect = this.shopifyProtect;
      result.sourceIdentifier = this.sourceIdentifier;
      result.sourceName = this.sourceName;
      result.staffMember = this.staffMember;
      result.statusPageUrl = this.statusPageUrl;
      result.subtotalLineItemsQuantity = this.subtotalLineItemsQuantity;
      result.subtotalPrice = this.subtotalPrice;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.suggestedRefund = this.suggestedRefund;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      result.taxLines = this.taxLines;
      result.taxesIncluded = this.taxesIncluded;
      result.test = this.test;
      result.totalCapturable = this.totalCapturable;
      result.totalCapturableSet = this.totalCapturableSet;
      result.totalCashRoundingAdjustment = this.totalCashRoundingAdjustment;
      result.totalDiscounts = this.totalDiscounts;
      result.totalDiscountsSet = this.totalDiscountsSet;
      result.totalOutstandingSet = this.totalOutstandingSet;
      result.totalPrice = this.totalPrice;
      result.totalPriceSet = this.totalPriceSet;
      result.totalReceived = this.totalReceived;
      result.totalReceivedSet = this.totalReceivedSet;
      result.totalRefunded = this.totalRefunded;
      result.totalRefundedSet = this.totalRefundedSet;
      result.totalRefundedShippingSet = this.totalRefundedShippingSet;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalShippingPriceSet = this.totalShippingPriceSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      result.totalTipReceived = this.totalTipReceived;
      result.totalTipReceivedSet = this.totalTipReceivedSet;
      result.totalWeight = this.totalWeight;
      result.transactions = this.transactions;
      result.transactionsCount = this.transactionsCount;
      result.unpaid = this.unpaid;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * A list of additional fees applied to the order.
     */
    public Builder additionalFees(List<AdditionalFee> additionalFees) {
      this.additionalFees = additionalFees;
      return this;
    }

    /**
     * A list of sales agreements associated with the order.
     */
    public Builder agreements(SalesAgreementConnection agreements) {
      this.agreements = agreements;
      return this;
    }

    /**
     * A list of messages that appear on the order page in the Shopify admin.
     */
    public Builder alerts(List<ResourceAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    /**
     * The application that created the order.
     */
    public Builder app(OrderApp app) {
      this.app = app;
      return this;
    }

    /**
     * The billing address of the customer.
     */
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * Whether the billing address matches the shipping address.
     */
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    /**
     * Whether the order can be manually marked as paid.
     */
    public Builder canMarkAsPaid(boolean canMarkAsPaid) {
      this.canMarkAsPaid = canMarkAsPaid;
      return this;
    }

    /**
     * Whether a customer email exists for the order.
     */
    public Builder canNotifyCustomer(boolean canNotifyCustomer) {
      this.canNotifyCustomer = canNotifyCustomer;
      return this;
    }

    /**
     * The reason provided when the order was canceled.
     * Returns `null` if the order wasn't canceled.
     */
    public Builder cancelReason(OrderCancelReason cancelReason) {
      this.cancelReason = cancelReason;
      return this;
    }

    /**
     * Cancellation details for the order.
     */
    public Builder cancellation(OrderCancellation cancellation) {
      this.cancellation = cancellation;
      return this;
    }

    /**
     * The date and time when the order was canceled.
     * Returns `null` if the order wasn't canceled.
     */
    public Builder cancelledAt(OffsetDateTime cancelledAt) {
      this.cancelledAt = cancelledAt;
      return this;
    }

    /**
     * Whether payment for the order can be captured.
     */
    public Builder capturable(boolean capturable) {
      this.capturable = capturable;
      return this;
    }

    /**
     * The total order-level discount amount, before returns, in shop currency.
     */
    public Builder cartDiscountAmount(String cartDiscountAmount) {
      this.cartDiscountAmount = cartDiscountAmount;
      return this;
    }

    /**
     * The total order-level discount amount, before returns, in shop and presentment currencies.
     */
    public Builder cartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
      this.cartDiscountAmountSet = cartDiscountAmountSet;
      return this;
    }

    /**
     * The channel that created the order.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Details about the channel that created the order.
     */
    public Builder channelInformation(ChannelInformation channelInformation) {
      this.channelInformation = channelInformation;
      return this;
    }

    /**
     * The IP address of the API client that created the order.
     */
    public Builder clientIp(String clientIp) {
      this.clientIp = clientIp;
      return this;
    }

    /**
     * Whether the order is closed.
     */
    public Builder closed(boolean closed) {
      this.closed = closed;
      return this;
    }

    /**
     * The date and time when the order was closed.
     * Returns `null` if the order isn't closed.
     */
    public Builder closedAt(OffsetDateTime closedAt) {
      this.closedAt = closedAt;
      return this;
    }

    /**
     * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
     * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
     * This value isn't guaranteed to be unique.
     */
    public Builder confirmationNumber(String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
      return this;
    }

    /**
     * Whether inventory has been reserved for the order.
     */
    public Builder confirmed(boolean confirmed) {
      this.confirmed = confirmed;
      return this;
    }

    /**
     * Date and time when the order was created in Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The shop currency when the order was placed.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The current order-level discount amount after all order updates, in shop and presentment currencies.
     */
    public Builder currentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
      this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
      return this;
    }

    /**
     * The current shipping price after applying refunds and discounts. If the parent
     * `order.taxesIncluded` field is true, then this price includes taxes.
     * Otherwise, this field is the pre-tax price.
     */
    public Builder currentShippingPriceSet(MoneyBag currentShippingPriceSet) {
      this.currentShippingPriceSet = currentShippingPriceSet;
      return this;
    }

    /**
     * The sum of the quantities for all line items that contribute to the order's current subtotal price.
     */
    public Builder currentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
      this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
      return this;
    }

    /**
     * The sum of the prices for all line items after discounts and returns, in shop and presentment currencies.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    public Builder currentSubtotalPriceSet(MoneyBag currentSubtotalPriceSet) {
      this.currentSubtotalPriceSet = currentSubtotalPriceSet;
      return this;
    }

    /**
     * A list of all tax lines applied to line items on the order, after returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    public Builder currentTaxLines(List<TaxLine> currentTaxLines) {
      this.currentTaxLines = currentTaxLines;
      return this;
    }

    /**
     * The total amount of additional fees after returns, in shop and presentment currencies.
     * Returns `null` if there are no additional fees for the order.
     */
    public Builder currentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
      this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
      return this;
    }

    /**
     * The total amount discounted on the order after returns, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    public Builder currentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
      this.currentTotalDiscountsSet = currentTotalDiscountsSet;
      return this;
    }

    /**
     * The total amount of duties after returns, in shop and presentment currencies.
     * Returns `null` if duties aren't applicable.
     */
    public Builder currentTotalDutiesSet(MoneyBag currentTotalDutiesSet) {
      this.currentTotalDutiesSet = currentTotalDutiesSet;
      return this;
    }

    /**
     * The total price of the order, after returns, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    public Builder currentTotalPriceSet(MoneyBag currentTotalPriceSet) {
      this.currentTotalPriceSet = currentTotalPriceSet;
      return this;
    }

    /**
     * The sum of the prices of all tax lines applied to line items on the order,
     * after returns, in shop and presentment currencies.
     */
    public Builder currentTotalTaxSet(MoneyBag currentTotalTaxSet) {
      this.currentTotalTaxSet = currentTotalTaxSet;
      return this;
    }

    /**
     * The total weight of the order after returns, in grams.
     */
    public Builder currentTotalWeight(String currentTotalWeight) {
      this.currentTotalWeight = currentTotalWeight;
      return this;
    }

    /**
     * A list of additional merchant-facing details that have been added to the
     * order. For example, whether an order is a customer's first.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer that placed the order.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Whether the customer agreed to receive marketing materials.
     */
    public Builder customerAcceptsMarketing(boolean customerAcceptsMarketing) {
      this.customerAcceptsMarketing = customerAcceptsMarketing;
      return this;
    }

    /**
     * The customer's visits and interactions with the online store before placing the order.
     */
    public Builder customerJourney(CustomerJourney customerJourney) {
      this.customerJourney = customerJourney;
      return this;
    }

    /**
     * The customer's visits and interactions with the online store before placing the order.
     */
    public Builder customerJourneySummary(CustomerJourneySummary customerJourneySummary) {
      this.customerJourneySummary = customerJourneySummary;
      return this;
    }

    /**
     * A two-letter or three-letter language code, optionally followed by a region modifier.
     */
    public Builder customerLocale(String customerLocale) {
      this.customerLocale = customerLocale;
      return this;
    }

    /**
     * A list of discounts that are applied to the order, not including order edits and refunds.
     */
    public Builder discountApplications(DiscountApplicationConnection discountApplications) {
      this.discountApplications = discountApplications;
      return this;
    }

    /**
     * The discount code used for the order.
     */
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    /**
     * The discount codes used for the order.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The primary address of the customer.
     * Returns `null` if neither the shipping address nor the billing address was provided.
     */
    public Builder displayAddress(MailingAddress displayAddress) {
      this.displayAddress = displayAddress;
      return this;
    }

    /**
     * The financial status of the order that can be shown to the merchant.
     * This field doesn't capture all the details of an order's financial state. It
     * should only be used for display summary purposes.
     */
    public Builder displayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
      this.displayFinancialStatus = displayFinancialStatus;
      return this;
    }

    /**
     * The fulfillment status for the order that can be shown to the merchant.
     * This field does not capture all the details of an order's fulfillment state.
     * It should only be used for display summary purposes.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    public Builder displayFulfillmentStatus(
        OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
      this.displayFulfillmentStatus = displayFulfillmentStatus;
      return this;
    }

    /**
     * A list of the disputes associated with the order.
     */
    public Builder disputes(List<OrderDisputeSummary> disputes) {
      this.disputes = disputes;
      return this;
    }

    /**
     * Whether duties are included in the subtotal price of the order.
     */
    public Builder dutiesIncluded(boolean dutiesIncluded) {
      this.dutiesIncluded = dutiesIncluded;
      return this;
    }

    /**
     * Whether the order has had any edits applied.
     */
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The email address associated with the customer.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Whether taxes on the order are estimated.
     * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
     */
    public Builder estimatedTaxes(boolean estimatedTaxes) {
      this.estimatedTaxes = estimatedTaxes;
      return this;
    }

    /**
     * A list of events associated with the order.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * A list of ExchangeV2s for the order.
     */
    public Builder exchangeV2s(ExchangeV2Connection exchangeV2s) {
      this.exchangeV2s = exchangeV2s;
      return this;
    }

    /**
     * Whether there are line items that can be fulfilled.
     * This field returns `false` when the order has no fulfillable line items.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    public Builder fulfillable(boolean fulfillable) {
      this.fulfillable = fulfillable;
      return this;
    }

    /**
     * A list of fulfillment orders for a specific order.
     *   
     * [FulfillmentOrder API access scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
     * govern which fulfillments orders are returned.
     * An API client will only receive a subset of the fulfillment orders which belong to an order
     * if they don't have the necessary access scopes to view all of the fulfillment orders.
     * In the case that an API client does not have the access scopes necessary to view
     * any of the fulfillment orders that belong to an order, an empty array will be returned.
     */
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    /**
     * List of shipments for the order.
     */
    public Builder fulfillments(List<Fulfillment> fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    /**
     * The count of fulfillments including the cancelled fulfillments.
     */
    public Builder fulfillmentsCount(Count fulfillmentsCount) {
      this.fulfillmentsCount = fulfillmentsCount;
      return this;
    }

    /**
     * Whether the order has been paid in full.
     */
    public Builder fullyPaid(boolean fullyPaid) {
      this.fullyPaid = fullyPaid;
      return this;
    }

    /**
     * Whether the merchant added a timeline comment to the order.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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
     * The URL of the first page of the online store that the customer visited before they submitted the order.
     */
    public Builder landingPageDisplayText(String landingPageDisplayText) {
      this.landingPageDisplayText = landingPageDisplayText;
      return this;
    }

    /**
     * The first page of the online store that the customer visited before they submitted the order.
     */
    public Builder landingPageUrl(String landingPageUrl) {
      this.landingPageUrl = landingPageUrl;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * A list of the order's line items.
     */
    public Builder lineItems(LineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * List of localization extensions for the resource.
     */
    public Builder localizationExtensions(LocalizationExtensionConnection localizationExtensions) {
      this.localizationExtensions = localizationExtensions;
      return this;
    }

    /**
     * List of localized fields for the resource.
     */
    public Builder localizedFields(LocalizedFieldConnection localizedFields) {
      this.localizedFields = localizedFields;
      return this;
    }

    /**
     * The merchant's business entity associated with the order.
     */
    public Builder merchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
      this.merchantBusinessEntity = merchantBusinessEntity;
      return this;
    }

    /**
     * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
     */
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    /**
     * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
     */
    public Builder merchantEditableErrors(List<String> merchantEditableErrors) {
      this.merchantEditableErrors = merchantEditableErrors;
      return this;
    }

    /**
     * The application acting as the Merchant of Record for the order.
     */
    public Builder merchantOfRecordApp(OrderApp merchantOfRecordApp) {
      this.merchantOfRecordApp = merchantOfRecordApp;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The net payment for the order, based on the total amount received minus the total amount refunded, in shop currency.
     */
    public Builder netPayment(String netPayment) {
      this.netPayment = netPayment;
      return this;
    }

    /**
     * The net payment for the order, based on the total amount received minus the
     * total amount refunded, in shop and presentment currencies.
     */
    public Builder netPaymentSet(MoneyBag netPaymentSet) {
      this.netPaymentSet = netPaymentSet;
      return this;
    }

    /**
     * A list of line items that can't be fulfilled.
     * For example, tips and fully refunded line items can't be fulfilled.
     * For a more granular view of the fulfillment status, refer to the [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    public Builder nonFulfillableLineItems(LineItemConnection nonFulfillableLineItems) {
      this.nonFulfillableLineItems = nonFulfillableLineItems;
      return this;
    }

    /**
     * The contents of the note associated with the order.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The total amount of additional fees at the time of order creation, in shop and presentment currencies.
     * Returns `null` if additional fees aren't applicable.
     */
    public Builder originalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
      this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
      return this;
    }

    /**
     * The total amount of duties at the time of order creation, in shop and presentment currencies.
     * Returns `null` if duties aren't applicable.
     */
    public Builder originalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
      this.originalTotalDutiesSet = originalTotalDutiesSet;
      return this;
    }

    /**
     * The total price of the order at the time of order creation, in shop and presentment currencies.
     */
    public Builder originalTotalPriceSet(MoneyBag originalTotalPriceSet) {
      this.originalTotalPriceSet = originalTotalPriceSet;
      return this;
    }

    /**
     * The payment collection details for the order.
     */
    public Builder paymentCollectionDetails(
        OrderPaymentCollectionDetails paymentCollectionDetails) {
      this.paymentCollectionDetails = paymentCollectionDetails;
      return this;
    }

    /**
     * A list of the names of all payment gateways used for the order.
     * For example, "Shopify Payments" and "Cash on Delivery (COD)".
     */
    public Builder paymentGatewayNames(List<String> paymentGatewayNames) {
      this.paymentGatewayNames = paymentGatewayNames;
      return this;
    }

    /**
     * The payment terms associated with the order.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The phone number associated with the customer.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The fulfillment location that was assigned when the order was created.
     * Orders can have multiple fulfillment orders. These fulfillment orders can each
     * be assigned to a different location which is responsible for fulfilling a
     * subset of the items in an order. The `Order.physicalLocation` field will only
     * point to one of these locations.
     * Use the [`FulfillmentOrder`](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder)
     * object for up to date fulfillment location information.
     */
    public Builder physicalLocation(Location physicalLocation) {
      this.physicalLocation = physicalLocation;
      return this;
    }

    /**
     * The PO number associated with the order.
     */
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    /**
     * The payment `CurrencyCode` of the customer for the order.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The date and time when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The publication that the order was created from.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The purchasing entity for the order.
     */
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    /**
     * The marketing referral code from the link that the customer clicked to visit the store.
     * Supports the following URL attributes: "ref", "source", or "r".
     * For example, if the URL is `{shop}.myshopify.com/products/slide?ref=j2tj1tn2`, then this value is `j2tj1tn2`.
     */
    public Builder referralCode(String referralCode) {
      this.referralCode = referralCode;
      return this;
    }

    /**
     * A web domain or short description of the source that sent the customer to your
     * online store. For example, "shopify.com" or "email".
     */
    public Builder referrerDisplayText(String referrerDisplayText) {
      this.referrerDisplayText = referrerDisplayText;
      return this;
    }

    /**
     * The URL of the webpage where the customer clicked a link that sent them to your online store.
     */
    public Builder referrerUrl(String referrerUrl) {
      this.referrerUrl = referrerUrl;
      return this;
    }

    /**
     * The difference between the suggested and actual refund amount of all refunds
     * that have been applied to the order. A positive value indicates a difference
     * in the merchant's favor, and a negative value indicates a difference in the
     * customer's favor.
     */
    public Builder refundDiscrepancySet(MoneyBag refundDiscrepancySet) {
      this.refundDiscrepancySet = refundDiscrepancySet;
      return this;
    }

    /**
     * Whether the order can be refunded.
     */
    public Builder refundable(boolean refundable) {
      this.refundable = refundable;
      return this;
    }

    /**
     * A list of refunds that have been applied to the order.
     */
    public Builder refunds(List<Refund> refunds) {
      this.refunds = refunds;
      return this;
    }

    /**
     * The URL of the source that the order originated from, if found in the domain registry.
     */
    public Builder registeredSourceUrl(String registeredSourceUrl) {
      this.registeredSourceUrl = registeredSourceUrl;
      return this;
    }

    /**
     * Whether the order has shipping lines or at least one line item on the order that requires shipping.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Whether any line item on the order can be restocked.
     */
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    /**
     * The physical location where a retail order is created or completed, except for
     * draft POS orders completed via the “mark as paid” flow in Admin, which return
     * null. Transactions associated with the order might have been processed at a
     * different location.
     */
    public Builder retailLocation(Location retailLocation) {
      this.retailLocation = retailLocation;
      return this;
    }

    /**
     * The order's aggregated return status for display purposes.
     */
    public Builder returnStatus(OrderReturnStatus returnStatus) {
      this.returnStatus = returnStatus;
      return this;
    }

    /**
     * A list of returns for the order.
     */
    public Builder returns(ReturnConnection returns) {
      this.returns = returns;
      return this;
    }

    /**
     * The risk characteristics for the order.
     */
    public Builder risk(OrderRiskSummary risk) {
      this.risk = risk;
      return this;
    }

    /**
     * The fraud risk level of the order.
     */
    public Builder riskLevel(OrderRiskLevel riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }

    /**
     * A list of risks associated with the order.
     */
    public Builder risks(List<OrderRisk> risks) {
      this.risks = risks;
      return this;
    }

    /**
     * The mailing address of the customer.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * A summary of all shipping costs on the order.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * A list of the order's shipping lines.
     */
    public Builder shippingLines(ShippingLineConnection shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    /**
     * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this will be null.
     */
    public Builder shopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
      this.shopifyProtect = shopifyProtect;
      return this;
    }

    /**
     * A unique POS or third party order identifier.
     * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value for POS orders.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    /**
     * The name of the source associated with the order.
     */
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    /**
     * The staff member associated with the order.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The URL where the customer can check the order's current status.
     */
    public Builder statusPageUrl(String statusPageUrl) {
      this.statusPageUrl = statusPageUrl;
      return this;
    }

    /**
     * The sum of the quantities for all line items that contribute to the order's subtotal price.
     */
    public Builder subtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
      this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
      return this;
    }

    /**
     * The sum of the prices for all line items after discounts and before returns, in shop currency.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    /**
     * The sum of the prices for all line items after discounts and before returns, in shop and presentment currencies.
     * If `taxesIncluded` is `true`, then the subtotal also includes tax.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * A suggested refund for the order.
     */
    public Builder suggestedRefund(SuggestedRefund suggestedRefund) {
      this.suggestedRefund = suggestedRefund;
      return this;
    }

    /**
     * A comma separated list of tags associated with the order. Updating `tags` overwrites
     * any existing tags that were previously added to the order. To add new tags without overwriting
     * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Whether taxes are exempt on the order.
     */
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * A list of all tax lines applied to line items on the order, before returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether taxes are included in the subtotal price of the order.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    /**
     * Whether the order is a test.
     * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
     * A test order can't be converted into a real order and vice versa.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * The authorized amount that's uncaptured or undercaptured, in shop currency.
     * This amount isn't adjusted for returns.
     */
    public Builder totalCapturable(String totalCapturable) {
      this.totalCapturable = totalCapturable;
      return this;
    }

    /**
     * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
     * This amount isn't adjusted for returns.
     */
    public Builder totalCapturableSet(MoneyBag totalCapturableSet) {
      this.totalCapturableSet = totalCapturableSet;
      return this;
    }

    /**
     * The total rounding adjustment applied to payments or refunds for an Order
     * involving cash payments. Applies to some countries where cash transactions are
     * rounded to the nearest currency denomination.
     */
    public Builder totalCashRoundingAdjustment(CashRoundingAdjustment totalCashRoundingAdjustment) {
      this.totalCashRoundingAdjustment = totalCashRoundingAdjustment;
      return this;
    }

    /**
     * The total amount discounted on the order before returns, in shop currency.
     * This includes both order and line level discounts.
     */
    public Builder totalDiscounts(String totalDiscounts) {
      this.totalDiscounts = totalDiscounts;
      return this;
    }

    /**
     * The total amount discounted on the order before returns, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    /**
     * The total amount not yet transacted for the order, in shop and presentment currencies.
     * A positive value indicates a difference in the merchant's favor (payment from
     * customer to merchant) and a negative value indicates a difference in the
     * customer's favor (refund from merchant to customer).
     */
    public Builder totalOutstandingSet(MoneyBag totalOutstandingSet) {
      this.totalOutstandingSet = totalOutstandingSet;
      return this;
    }

    /**
     * The total price of the order, before returns, in shop currency.
     * This includes taxes and discounts.
     */
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The total price of the order, before returns, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The total amount received from the customer before returns, in shop currency.
     */
    public Builder totalReceived(String totalReceived) {
      this.totalReceived = totalReceived;
      return this;
    }

    /**
     * The total amount received from the customer before returns, in shop and presentment currencies.
     */
    public Builder totalReceivedSet(MoneyBag totalReceivedSet) {
      this.totalReceivedSet = totalReceivedSet;
      return this;
    }

    /**
     * The total amount that was refunded, in shop currency.
     */
    public Builder totalRefunded(String totalRefunded) {
      this.totalRefunded = totalRefunded;
      return this;
    }

    /**
     * The total amount that was refunded, in shop and presentment currencies.
     */
    public Builder totalRefundedSet(MoneyBag totalRefundedSet) {
      this.totalRefundedSet = totalRefundedSet;
      return this;
    }

    /**
     * The total amount of shipping that was refunded, in shop and presentment currencies.
     */
    public Builder totalRefundedShippingSet(MoneyBag totalRefundedShippingSet) {
      this.totalRefundedShippingSet = totalRefundedShippingSet;
      return this;
    }

    /**
     * The total shipping amount before discounts and returns, in shop currency.
     */
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total shipping amount before discounts and returns, in shop and presentment currencies.
     */
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    /**
     * The total tax amount before returns, in shop currency.
     */
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total tax amount before returns, in shop and presentment currencies.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * The sum of all tip amounts for the order, in shop currency.
     */
    public Builder totalTipReceived(MoneyV2 totalTipReceived) {
      this.totalTipReceived = totalTipReceived;
      return this;
    }

    /**
     * The sum of all tip amounts for the order, in shop and presentment currencies.
     */
    public Builder totalTipReceivedSet(MoneyBag totalTipReceivedSet) {
      this.totalTipReceivedSet = totalTipReceivedSet;
      return this;
    }

    /**
     * The total weight of the order before returns, in grams.
     */
    public Builder totalWeight(String totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    /**
     * A list of transactions associated with the order.
     */
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * The number of transactions associated with the order.
     */
    public Builder transactionsCount(Count transactionsCount) {
      this.transactionsCount = transactionsCount;
      return this;
    }

    /**
     * Whether no payments have been made for the order.
     */
    public Builder unpaid(boolean unpaid) {
      this.unpaid = unpaid;
      return this;
    }

    /**
     * The date and time when the order was modified last.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
