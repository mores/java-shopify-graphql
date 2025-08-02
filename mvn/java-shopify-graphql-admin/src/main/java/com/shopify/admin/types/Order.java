package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The `Order` object represents a customer's request to purchase one or more
 * products from a store. Use the `Order` object to handle the complete purchase
 * lifecycle from checkout to fulfillment.
 *
 * Use the `Order` object when you need to:
 *
 * - Display order details on customer account pages or admin dashboards.
 * - Create orders for phone sales, wholesale customers, or subscription services.
 * - Update order information like shipping addresses, notes, or fulfillment status.
 * - Process returns, exchanges, and partial refunds.
 * - Generate invoices, receipts, and shipping labels.
 *
 * The `Order` object serves as the central hub connecting customer information,
 * product details, payment processing, and fulfillment data within the GraphQL
 * Admin API schema.
 *
 * > Note:
 * > Only the last 60 days' worth of orders from a store are accessible from the
 * `Order` object by default. If you want to access older records,
 * > then you need to [request access to all
 * orders](https://shopify.dev/docs/api/usage/access-scopes#orders-permissions). If
 * your app is granted
 * > access, then you can add the `read_all_orders`, `read_orders`, and `write_orders` scopes.
 *
 * > Caution:
 * > Only use orders data if it's required for your app's functionality. Shopify
 * will restrict [access to scopes](https://shopify.dev/docs/api/usage/access-scopes#requesting-specific-permissions)
 * for apps that don't have a legitimate use for the associated data.
 *
 * Learn more about [building apps for orders and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Order implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.admin.types.CommentEventSubject, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasLocalizationExtensions, com.shopify.admin.types.HasLocalizedFields, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * A list of additional fees applied to an order, such as duties, import fees, or [tax lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additionalFees.taxLines).
   */
  private List<AdditionalFee> additionalFees;

  /**
   * A list of sales agreements associated with the order, such as contracts
   * defining payment terms, or delivery schedules between merchants and customers.
   */
  private SalesAgreementConnection agreements;

  /**
   * A list of messages that appear on the **Orders** page in the Shopify admin.
   * These alerts provide merchants with important information about an order's
   * status or required actions.
   */
  private List<ResourceAlert> alerts;

  /**
   * The application that created the order. For example, "Online Store", "Point of Sale", or a custom app name.
   * Use this to identify the order source for attribution and fulfillment workflows.
   * Learn more about [building apps for orders and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
   */
  private OrderApp app;

  /**
   * The billing address associated with the payment method selected by the customer for an order.
   * Returns `null` if no billing address was provided during checkout.
   */
  private MailingAddress billingAddress;

  /**
   * Whether the billing address matches the [shipping address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shippingAddress).
   * Returns `true` if both addresses are the same, and `false` if they're
   * different or if an address is missing.
   */
  private boolean billingAddressMatchesShippingAddress;

  /**
   * Whether an order can be manually marked as paid. Returns `false` if the order
   * is already paid, is canceled, has pending [Shopify Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts)
   * transactions, or has a negative payment amount.
   */
  private boolean canMarkAsPaid;

  /**
   * Whether order notifications can be sent to the customer.
   * Returns `true` if the customer has a valid [email address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
   */
  private boolean canNotifyCustomer;

  /**
   * The reason provided for an order cancellation. For example, a merchant might
   * cancel an order if there's insufficient inventory. Returns `null` if the order
   * hasn't been canceled.
   */
  private OrderCancelReason cancelReason;

  /**
   * Details of an order's cancellation, if it has been canceled. This includes the
   * reason, date, and any [staff notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellation.fields.staffNote).
   */
  private OrderCancellation cancellation;

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was canceled.
   * Returns `null` if the order hasn't been canceled.
   */
  private OffsetDateTime cancelledAt;

  /**
   * Whether an authorized payment for an order can be captured.
   * Returns `true` if an authorized payment exists that hasn't been fully captured
   * yet. Learn more about [capturing payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments).
   */
  private boolean capturable;

  /**
   * The total discount amount that applies to the entire order in shop currency,
   * before returns, refunds, order edits, and cancellations.
   */
  private String cartDiscountAmount;

  /**
   * The total discount amount applied at the time the order was created, displayed
   * in both shop and presentment currencies, before returns, refunds, order edits,
   * and cancellations. This field only includes discounts applied to the entire order.
   */
  private MoneyBag cartDiscountAmountSet;

  /**
   * The sales channel from which an order originated, such as the [Online
   * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
   * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
   */
  private Channel channel;

  /**
   * Details about the sales channel that created the order, such as the [channel app type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channelType)
   * and [channel name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefinition.fields.channelName), which helps to track order sources.
   */
  private ChannelInformation channelInformation;

  /**
   * The IP address of the customer who placed the order. Useful for fraud detection and geographic analysis.
   */
  private String clientIp;

  /**
   * Whether an order is closed. An order is considered closed if all its line
   * items have been fulfilled or canceled, and all financial transactions are complete.
   */
  private boolean closed;

  /**
   * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
   * when an order was closed. Shopify automatically records this timestamp when
   * all items have been fulfilled or canceled, and all financial transactions are
   * complete. Returns `null` if the order isn't closed.
   */
  private OffsetDateTime closedAt;

  /**
   * A customer-facing order identifier, often shown instead of the sequential order name.
   * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique across orders.
   */
  private String confirmationNumber;

  /**
   * Whether inventory has been reserved for an order. Returns `true` if inventory
   * quantities for an order's [line
   * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
   * have been reserved.
   * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
   */
  private boolean confirmed;

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
   * when an order was created. This timestamp is set when the customer completes
   * checkout and remains unchanged throughout an order's lifecycle.
   */
  private OffsetDateTime createdAt;

  /**
   * The shop currency when the order was placed. For example, "USD" or "CAD".
   */
  private CurrencyCode currencyCode;

  /**
   * The current total of all discounts applied to the entire order, after returns,
   * refunds, order edits, and cancellations. This includes discount codes,
   * automatic discounts, and other promotions that affect the whole order rather
   * than individual line items. To get the original discount amount at the time of
   * order creation, use the [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.cartDiscountAmountSet) field.
   */
  private MoneyBag currentCartDiscountAmountSet;

  /**
   * The current shipping price after applying refunds and discounts.
   * If the parent `order.taxesIncluded` field is true, then this price includes
   * taxes. Otherwise, this field is the pre-tax price.
   */
  private MoneyBag currentShippingPriceSet;

  /**
   * The current sum of the quantities for all line items that contribute to the
   * order's subtotal price, after returns, refunds, order edits, and cancellations.
   */
  private int currentSubtotalLineItemsQuantity;

  /**
   * The total price of the order, after returns and refunds, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  private MoneyBag currentSubtotalPriceSet;

  /**
   * A list of all tax lines applied to line items on the order, after returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  private List<TaxLine> currentTaxLines;

  /**
   * The current total of all additional fees for an order, after any returns or
   * modifications. Modifications include returns, refunds, order edits, and
   * cancellations. Additional fees can include charges such as duties, import
   * fees, and special handling.
   */
  private MoneyBag currentTotalAdditionalFeesSet;

  /**
   * The total amount discounted on the order after returns and refunds, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  private MoneyBag currentTotalDiscountsSet;

  /**
   * The current total duties amount for an order, after any returns or
   * modifications. Modifications include returns, refunds, order edits, and cancellations.
   */
  private MoneyBag currentTotalDutiesSet;

  /**
   * The total price of the order, after returns, in shop and presentment currencies.
   * This includes taxes and discounts.
   */
  private MoneyBag currentTotalPriceSet;

  /**
   * The sum of the prices of all tax lines applied to line items on the order,
   * after returns and refunds, in shop and presentment currencies.
   */
  private MoneyBag currentTotalTaxSet;

  /**
   * The total weight of the order after returns and refunds, in grams.
   */
  private String currentTotalWeight;

  /**
   * A list of additional information that has been attached to the order. For
   * example, gift message, delivery instructions, or internal notes.
   */
  private List<Attribute> customAttributes;

  /**
   * The customer who placed an order. Returns `null` if an order was created
   * through a checkout without customer authentication, such as a guest checkout.
   * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
   */
  private Customer customer;

  /**
   * Whether the customer agreed to receive marketing emails at the time of purchase.
   * Use this to ensure compliance with marketing consent laws and to segment customers for email campaigns.
   * Learn more about [building customer segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
   */
  private boolean customerAcceptsMarketing;

  /**
   * The customer's visits and interactions with the online store before placing the order.
   */
  private CustomerJourney customerJourney;

  /**
   * The customer's visits and interactions with the online store before placing the order.
   * Use this to understand customer behavior, attribution sources, and marketing effectiveness to optimize your sales funnel.
   */
  private CustomerJourneySummary customerJourneySummary;

  /**
   * The customer's language and region preference at the time of purchase. For
   * example, "en" for English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
   * Use this to provide localized customer service and targeted marketing in the customer's preferred language.
   */
  private String customerLocale;

  /**
   * A list of discounts that are applied to the order, excluding order edits and refunds.
   * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
   */
  private DiscountApplicationConnection discountApplications;

  /**
   * The discount code used for an order. Returns `null` if no discount code was applied.
   */
  private String discountCode;

  /**
   * The discount codes used for the order. Multiple codes can be applied to a single order.
   */
  private List<String> discountCodes;

  /**
   * The primary address of the customer, prioritizing shipping address over billing address when both are available.
   * Returns `null` if neither shipping address nor billing address was provided.
   */
  private MailingAddress displayAddress;

  /**
   * An order's financial status for display in the Shopify admin.
   */
  private OrderDisplayFinancialStatus displayFinancialStatus;

  /**
   * The order's fulfillment status that displays in the Shopify admin to
   * merchants. For example, an order might be unfulfilled or scheduled.
   * For detailed processing, use the [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

  /**
   * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
   * Disputes occur when customers challenge transactions with their bank or payment provider.
   */
  private List<OrderDisputeSummary> disputes;

  /**
   * Whether duties are included in the subtotal price of the order.
   * Duties are import taxes charged by customs authorities when goods cross international borders.
   */
  private boolean dutiesIncluded;

  /**
   * Whether the order has had any edits applied. For example, adding or removing
   * line items, updating quantities, or changing prices.
   */
  private boolean edited;

  /**
   * The email address associated with the customer for this order.
   * Used for sending order confirmations, shipping notifications, and other order-related communications.
   * Returns `null` if no email address was provided during checkout.
   */
  private String email;

  /**
   * Whether taxes on the order are estimated.
   * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
   */
  private boolean estimatedTaxes;

  /**
   * A list of events associated with the order. Events track significant changes
   * and activities related to the order, such as creation, payment, fulfillment,
   * and cancellation.
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
   * A list of [fulfillment orders](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) for an order.
   * Each fulfillment order groups [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.lineItems)
   * that are fulfilled together,
   * allowing an order to be processed in parts if needed.
   */
  private FulfillmentOrderConnection fulfillmentOrders;

  /**
   * A list of shipments for the order. Fulfillments represent the physical shipment of products to customers.
   */
  private List<Fulfillment> fulfillments;

  /**
   * The total number of fulfillments for the order, including canceled ones.
   */
  private Count fulfillmentsCount;

  /**
   * Whether the order has been paid in full. This field returns `true` when the
   * total amount received equals or exceeds the order total.
   */
  private boolean fullyPaid;

  /**
   * Whether the merchant has added a timeline comment to the order.
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
   * A list of the order's line items. Line items represent the individual products and quantities that make up the order.
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
   * The legal business structure that the merchant operates under for this order, such as an LLC, corporation, or partnership.
   * Used for tax reporting, legal compliance, and determining which business entity is responsible for the order.
   */
  private BusinessEntity merchantBusinessEntity;

  /**
   * Whether the order can be edited by the merchant. Returns `false` for orders
   * that can't be modified, such as canceled orders or orders with specific
   * payment statuses.
   */
  private boolean merchantEditable;

  /**
   * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
   */
  private List<String> merchantEditableErrors;

  /**
   * The application acting as the Merchant of Record for the order. The Merchant
   * of Record is responsible for tax collection and remittance.
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
   * The unique identifier for the order that appears on the order page in the Shopify admin and the **Order status** page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores. Use this field to identify
   * orders in the Shopify admin and for order tracking.
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
   * The note associated with the order.
   * Contains additional information or instructions added by merchants or customers during the order process.
   * Commonly used for special delivery instructions, gift messages, or internal processing notes.
   */
  private String note;

  /**
   * The order number used to generate the name using the store's configured order
   * number prefix/suffix. This number isn't guaranteed to follow a consecutive
   * integer sequence (e.g. 1, 2, 3..), nor is it guaranteed to be unique across
   * multiple stores, or even for a single store.
   */
  private int number;

  /**
   * The total amount of all additional fees, such as import fees or taxes, that were applied when an order was created.
   * Returns `null` if additional fees aren't applicable.
   */
  private MoneyBag originalTotalAdditionalFeesSet;

  /**
   * The total amount of duties calculated when an order was created, before any
   * modifications. Modifications include returns, refunds, order edits, and
   * cancellations. Use [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.currentTotalDutiesSet)
   * to retrieve the current duties amount after adjustments.
   */
  private MoneyBag originalTotalDutiesSet;

  /**
   * The total price of the order at the time of order creation, in shop and presentment currencies.
   * Use this to compare the original order value against the current total after edits, returns, or refunds.
   */
  private MoneyBag originalTotalPriceSet;

  /**
   * The payment collection details for the order, including payment status, outstanding amounts, and collection information.
   * Use this to understand when and how payments should be collected, especially
   * for orders with deferred or installment payment terms.
   */
  private OrderPaymentCollectionDetails paymentCollectionDetails;

  /**
   * A list of the names of all payment gateways used for the order.
   * For example, "Shopify Payments" and "Cash on Delivery (COD)".
   */
  private List<String> paymentGatewayNames;

  /**
   * The payment terms associated with the order, such as net payment due dates or
   * early payment discounts. Payment terms define when and how an order should be
   * paid. Returns `null` if no specific payment terms were set for the order.
   */
  private PaymentTerms paymentTerms;

  /**
   * The phone number associated with the customer for this order.
   * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
   * Returns `null` if no phone number was provided during checkout.
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
   * The purchase order (PO) number that's associated with an order.
   * This is typically provided by business customers who require a PO number for their procurement.
   */
  private String poNumber;

  /**
   * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
   * This may differ from the shop's base currency when serving international customers or using multi-currency pricing.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  private OffsetDateTime processedAt;

  /**
   * The sales channel that the order was created from, such as the [Online
   * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
   * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
   */
  private Publication publication;

  /**
   * The business entity that placed the order, including company details and purchasing relationships.
   * Used for B2B transactions to track which company or organization is responsible for the purchase and payment terms.
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
   * The difference between the suggested and actual refund amount of all refunds that have been applied to the order.
   * A positive value indicates a difference in the merchant's favor, and a
   * negative value indicates a difference in the customer's favor.
   */
  private MoneyBag refundDiscrepancySet;

  /**
   * Whether the order can be refunded based on its payment transactions.
   * Returns `false` for orders with no eligible payment transactions, such as
   * fully refunded orders or orders with non-refundable payment methods.
   */
  private boolean refundable;

  /**
   * A list of refunds that have been applied to the order.
   * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
   */
  private List<Refund> refunds;

  /**
   * The URL of the source that the order originated from, if found in the domain
   * registry. Returns `null` if the source URL isn't in the domain registry.
   */
  private String registeredSourceUrl;

  /**
   * Whether the order requires physical shipping to the customer.
   * Returns `false` for digital-only orders (such as gift cards or downloadable
   * products) and `true` for orders with physical products that need delivery.
   * Use this to determine shipping workflows and logistics requirements.
   */
  private boolean requiresShipping;

  /**
   * Whether any line items on the order can be restocked into inventory.
   * Returns `false` for digital products, custom items, or items that can't be resold.
   */
  private boolean restockable;

  /**
   * The physical location where a retail order is created or completed, except for
   * draft POS orders completed using the "mark as paid" flow in the Shopify admin,
   * which return `null`. Transactions associated with the order might have been
   * processed at a different location.
   */
  private Location retailLocation;

  /**
   * The order's aggregated return status for display purposes.
   * Indicates the overall state of returns for the order, helping merchants track and manage the return process.
   */
  private OrderReturnStatus returnStatus;

  /**
   * The returns associated with the order.
   * Contains information about items that customers have requested to return,
   * including return reasons, status, and refund details.
   * Use this to track and manage the return process for order items.
   */
  private ReturnConnection returns;

  /**
   * The risk assessment summary for the order.
   * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
   * Use this to make informed decisions about order fulfillment and payment processing.
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
   * The shipping address where the order will be delivered.
   * Contains the customer's delivery location for fulfillment and shipping label generation.
   * Returns `null` for digital orders or orders that don't require shipping.
   */
  private MailingAddress shippingAddress;

  /**
   * A summary of all shipping costs on the order.
   * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
   */
  private ShippingLine shippingLine;

  /**
   * The shipping methods applied to the order.
   * Each shipping line represents a shipping option chosen during checkout, including the carrier, service level, and cost.
   * Use this to understand shipping charges and delivery options for the order.
   */
  private ShippingLineConnection shippingLines;

  /**
   * The Shopify Protect details for the order, including fraud protection status and coverage information.
   * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
   * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for protection.
   * Learn more about [Shopify Protect](https://www.shopify.com/protect).
   */
  private ShopifyProtectOrderSummary shopifyProtect;

  /**
   * A unique POS or third party order identifier.
   * For example, "1234-12-1000" or "111-98567-54". The [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumber)
   * field is derived from this value for POS orders.
   */
  private String sourceIdentifier;

  /**
   * The name of the source associated with the order, such as "web", "mobile_app",
   * or "pos". Use this field to identify the platform where the order was placed.
   */
  private String sourceName;

  /**
   * The staff member who created or is responsible for the order.
   * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
   * Returns `null` for orders created directly by customers through the online store.
   */
  private StaffMember staffMember;

  /**
   * The URL where customers can check their order's current status, including tracking information and delivery updates.
   * Provides order tracking links in emails, apps, or customer communications.
   */
  private String statusPageUrl;

  /**
   * The sum of quantities for all line items that contribute to the order's subtotal price.
   * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the subtotal.
   * Use this to quickly understand the total item count for pricing calculations.
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
   * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
   * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
   * Returns `true` for orders where the customer or business has a valid tax
   * exemption, such as non-profit organizations or tax-free purchases.
   * Use this to understand if tax calculations were skipped during checkout.
   */
  private boolean taxExempt;

  /**
   * A list of all tax lines applied to line items on the order, before returns.
   * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether taxes are included in the subtotal price of the order.
   * When `true`, the subtotal and line item prices include tax amounts. When
   * `false`, taxes are calculated and displayed separately.
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
   * The total rounding adjustment applied to payments or refunds for an order
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
   * The total shipping costs returned to the customer, in shop and presentment
   * currencies. This includes fees and any related discounts that were refunded.
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
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was last modified.
   */
  private OffsetDateTime updatedAt;

  public Order() {
  }

  /**
   * A list of additional fees applied to an order, such as duties, import fees, or [tax lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additionalFees.taxLines).
   */
  public List<AdditionalFee> getAdditionalFees() {
    return additionalFees;
  }

  public void setAdditionalFees(List<AdditionalFee> additionalFees) {
    this.additionalFees = additionalFees;
  }

  /**
   * A list of sales agreements associated with the order, such as contracts
   * defining payment terms, or delivery schedules between merchants and customers.
   */
  public SalesAgreementConnection getAgreements() {
    return agreements;
  }

  public void setAgreements(SalesAgreementConnection agreements) {
    this.agreements = agreements;
  }

  /**
   * A list of messages that appear on the **Orders** page in the Shopify admin.
   * These alerts provide merchants with important information about an order's
   * status or required actions.
   */
  public List<ResourceAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ResourceAlert> alerts) {
    this.alerts = alerts;
  }

  /**
   * The application that created the order. For example, "Online Store", "Point of Sale", or a custom app name.
   * Use this to identify the order source for attribution and fulfillment workflows.
   * Learn more about [building apps for orders and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
   */
  public OrderApp getApp() {
    return app;
  }

  public void setApp(OrderApp app) {
    this.app = app;
  }

  /**
   * The billing address associated with the payment method selected by the customer for an order.
   * Returns `null` if no billing address was provided during checkout.
   */
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Whether the billing address matches the [shipping address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shippingAddress).
   * Returns `true` if both addresses are the same, and `false` if they're
   * different or if an address is missing.
   */
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  /**
   * Whether an order can be manually marked as paid. Returns `false` if the order
   * is already paid, is canceled, has pending [Shopify Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts)
   * transactions, or has a negative payment amount.
   */
  public boolean getCanMarkAsPaid() {
    return canMarkAsPaid;
  }

  public void setCanMarkAsPaid(boolean canMarkAsPaid) {
    this.canMarkAsPaid = canMarkAsPaid;
  }

  /**
   * Whether order notifications can be sent to the customer.
   * Returns `true` if the customer has a valid [email address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
   */
  public boolean getCanNotifyCustomer() {
    return canNotifyCustomer;
  }

  public void setCanNotifyCustomer(boolean canNotifyCustomer) {
    this.canNotifyCustomer = canNotifyCustomer;
  }

  /**
   * The reason provided for an order cancellation. For example, a merchant might
   * cancel an order if there's insufficient inventory. Returns `null` if the order
   * hasn't been canceled.
   */
  public OrderCancelReason getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(OrderCancelReason cancelReason) {
    this.cancelReason = cancelReason;
  }

  /**
   * Details of an order's cancellation, if it has been canceled. This includes the
   * reason, date, and any [staff notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellation.fields.staffNote).
   */
  public OrderCancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(OrderCancellation cancellation) {
    this.cancellation = cancellation;
  }

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was canceled.
   * Returns `null` if the order hasn't been canceled.
   */
  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * Whether an authorized payment for an order can be captured.
   * Returns `true` if an authorized payment exists that hasn't been fully captured
   * yet. Learn more about [capturing payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments).
   */
  public boolean getCapturable() {
    return capturable;
  }

  public void setCapturable(boolean capturable) {
    this.capturable = capturable;
  }

  /**
   * The total discount amount that applies to the entire order in shop currency,
   * before returns, refunds, order edits, and cancellations.
   */
  public String getCartDiscountAmount() {
    return cartDiscountAmount;
  }

  public void setCartDiscountAmount(String cartDiscountAmount) {
    this.cartDiscountAmount = cartDiscountAmount;
  }

  /**
   * The total discount amount applied at the time the order was created, displayed
   * in both shop and presentment currencies, before returns, refunds, order edits,
   * and cancellations. This field only includes discounts applied to the entire order.
   */
  public MoneyBag getCartDiscountAmountSet() {
    return cartDiscountAmountSet;
  }

  public void setCartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
    this.cartDiscountAmountSet = cartDiscountAmountSet;
  }

  /**
   * The sales channel from which an order originated, such as the [Online
   * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
   * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Details about the sales channel that created the order, such as the [channel app type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channelType)
   * and [channel name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefinition.fields.channelName), which helps to track order sources.
   */
  public ChannelInformation getChannelInformation() {
    return channelInformation;
  }

  public void setChannelInformation(ChannelInformation channelInformation) {
    this.channelInformation = channelInformation;
  }

  /**
   * The IP address of the customer who placed the order. Useful for fraud detection and geographic analysis.
   */
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * Whether an order is closed. An order is considered closed if all its line
   * items have been fulfilled or canceled, and all financial transactions are complete.
   */
  public boolean getClosed() {
    return closed;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  /**
   * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
   * when an order was closed. Shopify automatically records this timestamp when
   * all items have been fulfilled or canceled, and all financial transactions are
   * complete. Returns `null` if the order isn't closed.
   */
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  /**
   * A customer-facing order identifier, often shown instead of the sequential order name.
   * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique across orders.
   */
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  /**
   * Whether inventory has been reserved for an order. Returns `true` if inventory
   * quantities for an order's [line
   * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
   * have been reserved.
   * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
   */
  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
   * when an order was created. This timestamp is set when the customer completes
   * checkout and remains unchanged throughout an order's lifecycle.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The shop currency when the order was placed. For example, "USD" or "CAD".
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The current total of all discounts applied to the entire order, after returns,
   * refunds, order edits, and cancellations. This includes discount codes,
   * automatic discounts, and other promotions that affect the whole order rather
   * than individual line items. To get the original discount amount at the time of
   * order creation, use the [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.cartDiscountAmountSet) field.
   */
  public MoneyBag getCurrentCartDiscountAmountSet() {
    return currentCartDiscountAmountSet;
  }

  public void setCurrentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
    this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
  }

  /**
   * The current shipping price after applying refunds and discounts.
   * If the parent `order.taxesIncluded` field is true, then this price includes
   * taxes. Otherwise, this field is the pre-tax price.
   */
  public MoneyBag getCurrentShippingPriceSet() {
    return currentShippingPriceSet;
  }

  public void setCurrentShippingPriceSet(MoneyBag currentShippingPriceSet) {
    this.currentShippingPriceSet = currentShippingPriceSet;
  }

  /**
   * The current sum of the quantities for all line items that contribute to the
   * order's subtotal price, after returns, refunds, order edits, and cancellations.
   */
  public int getCurrentSubtotalLineItemsQuantity() {
    return currentSubtotalLineItemsQuantity;
  }

  public void setCurrentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
    this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
  }

  /**
   * The total price of the order, after returns and refunds, in shop and presentment currencies.
   * This includes taxes and discounts.
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
   * The current total of all additional fees for an order, after any returns or
   * modifications. Modifications include returns, refunds, order edits, and
   * cancellations. Additional fees can include charges such as duties, import
   * fees, and special handling.
   */
  public MoneyBag getCurrentTotalAdditionalFeesSet() {
    return currentTotalAdditionalFeesSet;
  }

  public void setCurrentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
    this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
  }

  /**
   * The total amount discounted on the order after returns and refunds, in shop and presentment currencies.
   * This includes both order and line level discounts.
   */
  public MoneyBag getCurrentTotalDiscountsSet() {
    return currentTotalDiscountsSet;
  }

  public void setCurrentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
    this.currentTotalDiscountsSet = currentTotalDiscountsSet;
  }

  /**
   * The current total duties amount for an order, after any returns or
   * modifications. Modifications include returns, refunds, order edits, and cancellations.
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
   * after returns and refunds, in shop and presentment currencies.
   */
  public MoneyBag getCurrentTotalTaxSet() {
    return currentTotalTaxSet;
  }

  public void setCurrentTotalTaxSet(MoneyBag currentTotalTaxSet) {
    this.currentTotalTaxSet = currentTotalTaxSet;
  }

  /**
   * The total weight of the order after returns and refunds, in grams.
   */
  public String getCurrentTotalWeight() {
    return currentTotalWeight;
  }

  public void setCurrentTotalWeight(String currentTotalWeight) {
    this.currentTotalWeight = currentTotalWeight;
  }

  /**
   * A list of additional information that has been attached to the order. For
   * example, gift message, delivery instructions, or internal notes.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer who placed an order. Returns `null` if an order was created
   * through a checkout without customer authentication, such as a guest checkout.
   * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Whether the customer agreed to receive marketing emails at the time of purchase.
   * Use this to ensure compliance with marketing consent laws and to segment customers for email campaigns.
   * Learn more about [building customer segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
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
   * Use this to understand customer behavior, attribution sources, and marketing effectiveness to optimize your sales funnel.
   */
  public CustomerJourneySummary getCustomerJourneySummary() {
    return customerJourneySummary;
  }

  public void setCustomerJourneySummary(CustomerJourneySummary customerJourneySummary) {
    this.customerJourneySummary = customerJourneySummary;
  }

  /**
   * The customer's language and region preference at the time of purchase. For
   * example, "en" for English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
   * Use this to provide localized customer service and targeted marketing in the customer's preferred language.
   */
  public String getCustomerLocale() {
    return customerLocale;
  }

  public void setCustomerLocale(String customerLocale) {
    this.customerLocale = customerLocale;
  }

  /**
   * A list of discounts that are applied to the order, excluding order edits and refunds.
   * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
   */
  public DiscountApplicationConnection getDiscountApplications() {
    return discountApplications;
  }

  public void setDiscountApplications(DiscountApplicationConnection discountApplications) {
    this.discountApplications = discountApplications;
  }

  /**
   * The discount code used for an order. Returns `null` if no discount code was applied.
   */
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  /**
   * The discount codes used for the order. Multiple codes can be applied to a single order.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The primary address of the customer, prioritizing shipping address over billing address when both are available.
   * Returns `null` if neither shipping address nor billing address was provided.
   */
  public MailingAddress getDisplayAddress() {
    return displayAddress;
  }

  public void setDisplayAddress(MailingAddress displayAddress) {
    this.displayAddress = displayAddress;
  }

  /**
   * An order's financial status for display in the Shopify admin.
   */
  public OrderDisplayFinancialStatus getDisplayFinancialStatus() {
    return displayFinancialStatus;
  }

  public void setDisplayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
    this.displayFinancialStatus = displayFinancialStatus;
  }

  /**
   * The order's fulfillment status that displays in the Shopify admin to
   * merchants. For example, an order might be unfulfilled or scheduled.
   * For detailed processing, use the [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object.
   */
  public OrderDisplayFulfillmentStatus getDisplayFulfillmentStatus() {
    return displayFulfillmentStatus;
  }

  public void setDisplayFulfillmentStatus(OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
    this.displayFulfillmentStatus = displayFulfillmentStatus;
  }

  /**
   * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
   * Disputes occur when customers challenge transactions with their bank or payment provider.
   */
  public List<OrderDisputeSummary> getDisputes() {
    return disputes;
  }

  public void setDisputes(List<OrderDisputeSummary> disputes) {
    this.disputes = disputes;
  }

  /**
   * Whether duties are included in the subtotal price of the order.
   * Duties are import taxes charged by customs authorities when goods cross international borders.
   */
  public boolean getDutiesIncluded() {
    return dutiesIncluded;
  }

  public void setDutiesIncluded(boolean dutiesIncluded) {
    this.dutiesIncluded = dutiesIncluded;
  }

  /**
   * Whether the order has had any edits applied. For example, adding or removing
   * line items, updating quantities, or changing prices.
   */
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  /**
   * The email address associated with the customer for this order.
   * Used for sending order confirmations, shipping notifications, and other order-related communications.
   * Returns `null` if no email address was provided during checkout.
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
   * A list of events associated with the order. Events track significant changes
   * and activities related to the order, such as creation, payment, fulfillment,
   * and cancellation.
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
   * A list of [fulfillment orders](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) for an order.
   * Each fulfillment order groups [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.lineItems)
   * that are fulfilled together,
   * allowing an order to be processed in parts if needed.
   */
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  /**
   * A list of shipments for the order. Fulfillments represent the physical shipment of products to customers.
   */
  public List<Fulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * The total number of fulfillments for the order, including canceled ones.
   */
  public Count getFulfillmentsCount() {
    return fulfillmentsCount;
  }

  public void setFulfillmentsCount(Count fulfillmentsCount) {
    this.fulfillmentsCount = fulfillmentsCount;
  }

  /**
   * Whether the order has been paid in full. This field returns `true` when the
   * total amount received equals or exceeds the order total.
   */
  public boolean getFullyPaid() {
    return fullyPaid;
  }

  public void setFullyPaid(boolean fullyPaid) {
    this.fullyPaid = fullyPaid;
  }

  /**
   * Whether the merchant has added a timeline comment to the order.
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
   * A list of the order's line items. Line items represent the individual products and quantities that make up the order.
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
   * The legal business structure that the merchant operates under for this order, such as an LLC, corporation, or partnership.
   * Used for tax reporting, legal compliance, and determining which business entity is responsible for the order.
   */
  public BusinessEntity getMerchantBusinessEntity() {
    return merchantBusinessEntity;
  }

  public void setMerchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
    this.merchantBusinessEntity = merchantBusinessEntity;
  }

  /**
   * Whether the order can be edited by the merchant. Returns `false` for orders
   * that can't be modified, such as canceled orders or orders with specific
   * payment statuses.
   */
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  /**
   * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
   */
  public List<String> getMerchantEditableErrors() {
    return merchantEditableErrors;
  }

  public void setMerchantEditableErrors(List<String> merchantEditableErrors) {
    this.merchantEditableErrors = merchantEditableErrors;
  }

  /**
   * The application acting as the Merchant of Record for the order. The Merchant
   * of Record is responsible for tax collection and remittance.
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
   * The unique identifier for the order that appears on the order page in the Shopify admin and the **Order status** page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores. Use this field to identify
   * orders in the Shopify admin and for order tracking.
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
   * The note associated with the order.
   * Contains additional information or instructions added by merchants or customers during the order process.
   * Commonly used for special delivery instructions, gift messages, or internal processing notes.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The order number used to generate the name using the store's configured order
   * number prefix/suffix. This number isn't guaranteed to follow a consecutive
   * integer sequence (e.g. 1, 2, 3..), nor is it guaranteed to be unique across
   * multiple stores, or even for a single store.
   */
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * The total amount of all additional fees, such as import fees or taxes, that were applied when an order was created.
   * Returns `null` if additional fees aren't applicable.
   */
  public MoneyBag getOriginalTotalAdditionalFeesSet() {
    return originalTotalAdditionalFeesSet;
  }

  public void setOriginalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
    this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
  }

  /**
   * The total amount of duties calculated when an order was created, before any
   * modifications. Modifications include returns, refunds, order edits, and
   * cancellations. Use [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.currentTotalDutiesSet)
   * to retrieve the current duties amount after adjustments.
   */
  public MoneyBag getOriginalTotalDutiesSet() {
    return originalTotalDutiesSet;
  }

  public void setOriginalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
    this.originalTotalDutiesSet = originalTotalDutiesSet;
  }

  /**
   * The total price of the order at the time of order creation, in shop and presentment currencies.
   * Use this to compare the original order value against the current total after edits, returns, or refunds.
   */
  public MoneyBag getOriginalTotalPriceSet() {
    return originalTotalPriceSet;
  }

  public void setOriginalTotalPriceSet(MoneyBag originalTotalPriceSet) {
    this.originalTotalPriceSet = originalTotalPriceSet;
  }

  /**
   * The payment collection details for the order, including payment status, outstanding amounts, and collection information.
   * Use this to understand when and how payments should be collected, especially
   * for orders with deferred or installment payment terms.
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
   * The payment terms associated with the order, such as net payment due dates or
   * early payment discounts. Payment terms define when and how an order should be
   * paid. Returns `null` if no specific payment terms were set for the order.
   */
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The phone number associated with the customer for this order.
   * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
   * Returns `null` if no phone number was provided during checkout.
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
   * The purchase order (PO) number that's associated with an order.
   * This is typically provided by business customers who require a PO number for their procurement.
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
   * This may differ from the shop's base currency when serving international customers or using multi-currency pricing.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The sales channel that the order was created from, such as the [Online
   * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
   * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The business entity that placed the order, including company details and purchasing relationships.
   * Used for B2B transactions to track which company or organization is responsible for the purchase and payment terms.
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
   * The difference between the suggested and actual refund amount of all refunds that have been applied to the order.
   * A positive value indicates a difference in the merchant's favor, and a
   * negative value indicates a difference in the customer's favor.
   */
  public MoneyBag getRefundDiscrepancySet() {
    return refundDiscrepancySet;
  }

  public void setRefundDiscrepancySet(MoneyBag refundDiscrepancySet) {
    this.refundDiscrepancySet = refundDiscrepancySet;
  }

  /**
   * Whether the order can be refunded based on its payment transactions.
   * Returns `false` for orders with no eligible payment transactions, such as
   * fully refunded orders or orders with non-refundable payment methods.
   */
  public boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(boolean refundable) {
    this.refundable = refundable;
  }

  /**
   * A list of refunds that have been applied to the order.
   * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
   */
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  /**
   * The URL of the source that the order originated from, if found in the domain
   * registry. Returns `null` if the source URL isn't in the domain registry.
   */
  public String getRegisteredSourceUrl() {
    return registeredSourceUrl;
  }

  public void setRegisteredSourceUrl(String registeredSourceUrl) {
    this.registeredSourceUrl = registeredSourceUrl;
  }

  /**
   * Whether the order requires physical shipping to the customer.
   * Returns `false` for digital-only orders (such as gift cards or downloadable
   * products) and `true` for orders with physical products that need delivery.
   * Use this to determine shipping workflows and logistics requirements.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Whether any line items on the order can be restocked into inventory.
   * Returns `false` for digital products, custom items, or items that can't be resold.
   */
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  /**
   * The physical location where a retail order is created or completed, except for
   * draft POS orders completed using the "mark as paid" flow in the Shopify admin,
   * which return `null`. Transactions associated with the order might have been
   * processed at a different location.
   */
  public Location getRetailLocation() {
    return retailLocation;
  }

  public void setRetailLocation(Location retailLocation) {
    this.retailLocation = retailLocation;
  }

  /**
   * The order's aggregated return status for display purposes.
   * Indicates the overall state of returns for the order, helping merchants track and manage the return process.
   */
  public OrderReturnStatus getReturnStatus() {
    return returnStatus;
  }

  public void setReturnStatus(OrderReturnStatus returnStatus) {
    this.returnStatus = returnStatus;
  }

  /**
   * The returns associated with the order.
   * Contains information about items that customers have requested to return,
   * including return reasons, status, and refund details.
   * Use this to track and manage the return process for order items.
   */
  public ReturnConnection getReturns() {
    return returns;
  }

  public void setReturns(ReturnConnection returns) {
    this.returns = returns;
  }

  /**
   * The risk assessment summary for the order.
   * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
   * Use this to make informed decisions about order fulfillment and payment processing.
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
   * The shipping address where the order will be delivered.
   * Contains the customer's delivery location for fulfillment and shipping label generation.
   * Returns `null` for digital orders or orders that don't require shipping.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * A summary of all shipping costs on the order.
   * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * The shipping methods applied to the order.
   * Each shipping line represents a shipping option chosen during checkout, including the carrier, service level, and cost.
   * Use this to understand shipping charges and delivery options for the order.
   */
  public ShippingLineConnection getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(ShippingLineConnection shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   * The Shopify Protect details for the order, including fraud protection status and coverage information.
   * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
   * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for protection.
   * Learn more about [Shopify Protect](https://www.shopify.com/protect).
   */
  public ShopifyProtectOrderSummary getShopifyProtect() {
    return shopifyProtect;
  }

  public void setShopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
    this.shopifyProtect = shopifyProtect;
  }

  /**
   * A unique POS or third party order identifier.
   * For example, "1234-12-1000" or "111-98567-54". The [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumber)
   * field is derived from this value for POS orders.
   */
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  /**
   * The name of the source associated with the order, such as "web", "mobile_app",
   * or "pos". Use this field to identify the platform where the order was placed.
   */
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  /**
   * The staff member who created or is responsible for the order.
   * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
   * Returns `null` for orders created directly by customers through the online store.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * The URL where customers can check their order's current status, including tracking information and delivery updates.
   * Provides order tracking links in emails, apps, or customer communications.
   */
  public String getStatusPageUrl() {
    return statusPageUrl;
  }

  public void setStatusPageUrl(String statusPageUrl) {
    this.statusPageUrl = statusPageUrl;
  }

  /**
   * The sum of quantities for all line items that contribute to the order's subtotal price.
   * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the subtotal.
   * Use this to quickly understand the total item count for pricing calculations.
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
   * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
   * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
   * Returns `true` for orders where the customer or business has a valid tax
   * exemption, such as non-profit organizations or tax-free purchases.
   * Use this to understand if tax calculations were skipped during checkout.
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
   * When `true`, the subtotal and line item prices include tax amounts. When
   * `false`, taxes are calculated and displayed separately.
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
   * The total rounding adjustment applied to payments or refunds for an order
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
   * The total shipping costs returned to the customer, in shop and presentment
   * currencies. This includes fees and any related discounts that were refunded.
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
   * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Order{additionalFees='" + additionalFees + "', agreements='" + agreements + "', alerts='" + alerts + "', app='" + app + "', billingAddress='" + billingAddress + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', canMarkAsPaid='" + canMarkAsPaid + "', canNotifyCustomer='" + canNotifyCustomer + "', cancelReason='" + cancelReason + "', cancellation='" + cancellation + "', cancelledAt='" + cancelledAt + "', capturable='" + capturable + "', cartDiscountAmount='" + cartDiscountAmount + "', cartDiscountAmountSet='" + cartDiscountAmountSet + "', channel='" + channel + "', channelInformation='" + channelInformation + "', clientIp='" + clientIp + "', closed='" + closed + "', closedAt='" + closedAt + "', confirmationNumber='" + confirmationNumber + "', confirmed='" + confirmed + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', currentCartDiscountAmountSet='" + currentCartDiscountAmountSet + "', currentShippingPriceSet='" + currentShippingPriceSet + "', currentSubtotalLineItemsQuantity='" + currentSubtotalLineItemsQuantity + "', currentSubtotalPriceSet='" + currentSubtotalPriceSet + "', currentTaxLines='" + currentTaxLines + "', currentTotalAdditionalFeesSet='" + currentTotalAdditionalFeesSet + "', currentTotalDiscountsSet='" + currentTotalDiscountsSet + "', currentTotalDutiesSet='" + currentTotalDutiesSet + "', currentTotalPriceSet='" + currentTotalPriceSet + "', currentTotalTaxSet='" + currentTotalTaxSet + "', currentTotalWeight='" + currentTotalWeight + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerAcceptsMarketing='" + customerAcceptsMarketing + "', customerJourney='" + customerJourney + "', customerJourneySummary='" + customerJourneySummary + "', customerLocale='" + customerLocale + "', discountApplications='" + discountApplications + "', discountCode='" + discountCode + "', discountCodes='" + discountCodes + "', displayAddress='" + displayAddress + "', displayFinancialStatus='" + displayFinancialStatus + "', displayFulfillmentStatus='" + displayFulfillmentStatus + "', disputes='" + disputes + "', dutiesIncluded='" + dutiesIncluded + "', edited='" + edited + "', email='" + email + "', estimatedTaxes='" + estimatedTaxes + "', events='" + events + "', exchangeV2s='" + exchangeV2s + "', fulfillable='" + fulfillable + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillments='" + fulfillments + "', fulfillmentsCount='" + fulfillmentsCount + "', fullyPaid='" + fullyPaid + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', landingPageDisplayText='" + landingPageDisplayText + "', landingPageUrl='" + landingPageUrl + "', legacyResourceId='" + legacyResourceId + "', lineItems='" + lineItems + "', localizationExtensions='" + localizationExtensions + "', localizedFields='" + localizedFields + "', merchantBusinessEntity='" + merchantBusinessEntity + "', merchantEditable='" + merchantEditable + "', merchantEditableErrors='" + merchantEditableErrors + "', merchantOfRecordApp='" + merchantOfRecordApp + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', netPayment='" + netPayment + "', netPaymentSet='" + netPaymentSet + "', nonFulfillableLineItems='" + nonFulfillableLineItems + "', note='" + note + "', number='" + number + "', originalTotalAdditionalFeesSet='" + originalTotalAdditionalFeesSet + "', originalTotalDutiesSet='" + originalTotalDutiesSet + "', originalTotalPriceSet='" + originalTotalPriceSet + "', paymentCollectionDetails='" + paymentCollectionDetails + "', paymentGatewayNames='" + paymentGatewayNames + "', paymentTerms='" + paymentTerms + "', phone='" + phone + "', physicalLocation='" + physicalLocation + "', poNumber='" + poNumber + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', processedAt='" + processedAt + "', publication='" + publication + "', purchasingEntity='" + purchasingEntity + "', referralCode='" + referralCode + "', referrerDisplayText='" + referrerDisplayText + "', referrerUrl='" + referrerUrl + "', refundDiscrepancySet='" + refundDiscrepancySet + "', refundable='" + refundable + "', refunds='" + refunds + "', registeredSourceUrl='" + registeredSourceUrl + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', retailLocation='" + retailLocation + "', returnStatus='" + returnStatus + "', returns='" + returns + "', risk='" + risk + "', riskLevel='" + riskLevel + "', risks='" + risks + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', shippingLines='" + shippingLines + "', shopifyProtect='" + shopifyProtect + "', sourceIdentifier='" + sourceIdentifier + "', sourceName='" + sourceName + "', staffMember='" + staffMember + "', statusPageUrl='" + statusPageUrl + "', subtotalLineItemsQuantity='" + subtotalLineItemsQuantity + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', suggestedRefund='" + suggestedRefund + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', test='" + test + "', totalCapturable='" + totalCapturable + "', totalCapturableSet='" + totalCapturableSet + "', totalCashRoundingAdjustment='" + totalCashRoundingAdjustment + "', totalDiscounts='" + totalDiscounts + "', totalDiscountsSet='" + totalDiscountsSet + "', totalOutstandingSet='" + totalOutstandingSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalReceived='" + totalReceived + "', totalReceivedSet='" + totalReceivedSet + "', totalRefunded='" + totalRefunded + "', totalRefundedSet='" + totalRefundedSet + "', totalRefundedShippingSet='" + totalRefundedShippingSet + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', totalTipReceived='" + totalTipReceived + "', totalTipReceivedSet='" + totalTipReceivedSet + "', totalWeight='" + totalWeight + "', transactions='" + transactions + "', transactionsCount='" + transactionsCount + "', unpaid='" + unpaid + "', updatedAt='" + updatedAt + "'}";
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
        number == that.number &&
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
    return Objects.hash(additionalFees, agreements, alerts, app, billingAddress, billingAddressMatchesShippingAddress, canMarkAsPaid, canNotifyCustomer, cancelReason, cancellation, cancelledAt, capturable, cartDiscountAmount, cartDiscountAmountSet, channel, channelInformation, clientIp, closed, closedAt, confirmationNumber, confirmed, createdAt, currencyCode, currentCartDiscountAmountSet, currentShippingPriceSet, currentSubtotalLineItemsQuantity, currentSubtotalPriceSet, currentTaxLines, currentTotalAdditionalFeesSet, currentTotalDiscountsSet, currentTotalDutiesSet, currentTotalPriceSet, currentTotalTaxSet, currentTotalWeight, customAttributes, customer, customerAcceptsMarketing, customerJourney, customerJourneySummary, customerLocale, discountApplications, discountCode, discountCodes, displayAddress, displayFinancialStatus, displayFulfillmentStatus, disputes, dutiesIncluded, edited, email, estimatedTaxes, events, exchangeV2s, fulfillable, fulfillmentOrders, fulfillments, fulfillmentsCount, fullyPaid, hasTimelineComment, id, landingPageDisplayText, landingPageUrl, legacyResourceId, lineItems, localizationExtensions, localizedFields, merchantBusinessEntity, merchantEditable, merchantEditableErrors, merchantOfRecordApp, metafield, metafieldDefinitions, metafields, name, netPayment, netPaymentSet, nonFulfillableLineItems, note, number, originalTotalAdditionalFeesSet, originalTotalDutiesSet, originalTotalPriceSet, paymentCollectionDetails, paymentGatewayNames, paymentTerms, phone, physicalLocation, poNumber, presentmentCurrencyCode, processedAt, publication, purchasingEntity, referralCode, referrerDisplayText, referrerUrl, refundDiscrepancySet, refundable, refunds, registeredSourceUrl, requiresShipping, restockable, retailLocation, returnStatus, returns, risk, riskLevel, risks, shippingAddress, shippingLine, shippingLines, shopifyProtect, sourceIdentifier, sourceName, staffMember, statusPageUrl, subtotalLineItemsQuantity, subtotalPrice, subtotalPriceSet, suggestedRefund, tags, taxExempt, taxLines, taxesIncluded, test, totalCapturable, totalCapturableSet, totalCashRoundingAdjustment, totalDiscounts, totalDiscountsSet, totalOutstandingSet, totalPrice, totalPriceSet, totalReceived, totalReceivedSet, totalRefunded, totalRefundedSet, totalRefundedShippingSet, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, totalTipReceived, totalTipReceivedSet, totalWeight, transactions, transactionsCount, unpaid, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of additional fees applied to an order, such as duties, import fees, or [tax lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additionalFees.taxLines).
     */
    private List<AdditionalFee> additionalFees;

    /**
     * A list of sales agreements associated with the order, such as contracts
     * defining payment terms, or delivery schedules between merchants and customers.
     */
    private SalesAgreementConnection agreements;

    /**
     * A list of messages that appear on the **Orders** page in the Shopify admin.
     * These alerts provide merchants with important information about an order's
     * status or required actions.
     */
    private List<ResourceAlert> alerts;

    /**
     * The application that created the order. For example, "Online Store", "Point of Sale", or a custom app name.
     * Use this to identify the order source for attribution and fulfillment workflows.
     * Learn more about [building apps for orders and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
     */
    private OrderApp app;

    /**
     * The billing address associated with the payment method selected by the customer for an order.
     * Returns `null` if no billing address was provided during checkout.
     */
    private MailingAddress billingAddress;

    /**
     * Whether the billing address matches the [shipping address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shippingAddress).
     * Returns `true` if both addresses are the same, and `false` if they're
     * different or if an address is missing.
     */
    private boolean billingAddressMatchesShippingAddress;

    /**
     * Whether an order can be manually marked as paid. Returns `false` if the order
     * is already paid, is canceled, has pending [Shopify Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts)
     * transactions, or has a negative payment amount.
     */
    private boolean canMarkAsPaid;

    /**
     * Whether order notifications can be sent to the customer.
     * Returns `true` if the customer has a valid [email address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
     */
    private boolean canNotifyCustomer;

    /**
     * The reason provided for an order cancellation. For example, a merchant might
     * cancel an order if there's insufficient inventory. Returns `null` if the order
     * hasn't been canceled.
     */
    private OrderCancelReason cancelReason;

    /**
     * Details of an order's cancellation, if it has been canceled. This includes the
     * reason, date, and any [staff notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellation.fields.staffNote).
     */
    private OrderCancellation cancellation;

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was canceled.
     * Returns `null` if the order hasn't been canceled.
     */
    private OffsetDateTime cancelledAt;

    /**
     * Whether an authorized payment for an order can be captured.
     * Returns `true` if an authorized payment exists that hasn't been fully captured
     * yet. Learn more about [capturing payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments).
     */
    private boolean capturable;

    /**
     * The total discount amount that applies to the entire order in shop currency,
     * before returns, refunds, order edits, and cancellations.
     */
    private String cartDiscountAmount;

    /**
     * The total discount amount applied at the time the order was created, displayed
     * in both shop and presentment currencies, before returns, refunds, order edits,
     * and cancellations. This field only includes discounts applied to the entire order.
     */
    private MoneyBag cartDiscountAmountSet;

    /**
     * The sales channel from which an order originated, such as the [Online
     * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
     * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
     */
    private Channel channel;

    /**
     * Details about the sales channel that created the order, such as the [channel app type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channelType)
     * and [channel name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefinition.fields.channelName), which helps to track order sources.
     */
    private ChannelInformation channelInformation;

    /**
     * The IP address of the customer who placed the order. Useful for fraud detection and geographic analysis.
     */
    private String clientIp;

    /**
     * Whether an order is closed. An order is considered closed if all its line
     * items have been fulfilled or canceled, and all financial transactions are complete.
     */
    private boolean closed;

    /**
     * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
     * when an order was closed. Shopify automatically records this timestamp when
     * all items have been fulfilled or canceled, and all financial transactions are
     * complete. Returns `null` if the order isn't closed.
     */
    private OffsetDateTime closedAt;

    /**
     * A customer-facing order identifier, often shown instead of the sequential order name.
     * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique across orders.
     */
    private String confirmationNumber;

    /**
     * Whether inventory has been reserved for an order. Returns `true` if inventory
     * quantities for an order's [line
     * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
     * have been reserved.
     * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
     */
    private boolean confirmed;

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
     * when an order was created. This timestamp is set when the customer completes
     * checkout and remains unchanged throughout an order's lifecycle.
     */
    private OffsetDateTime createdAt;

    /**
     * The shop currency when the order was placed. For example, "USD" or "CAD".
     */
    private CurrencyCode currencyCode;

    /**
     * The current total of all discounts applied to the entire order, after returns,
     * refunds, order edits, and cancellations. This includes discount codes,
     * automatic discounts, and other promotions that affect the whole order rather
     * than individual line items. To get the original discount amount at the time of
     * order creation, use the [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.cartDiscountAmountSet) field.
     */
    private MoneyBag currentCartDiscountAmountSet;

    /**
     * The current shipping price after applying refunds and discounts.
     * If the parent `order.taxesIncluded` field is true, then this price includes
     * taxes. Otherwise, this field is the pre-tax price.
     */
    private MoneyBag currentShippingPriceSet;

    /**
     * The current sum of the quantities for all line items that contribute to the
     * order's subtotal price, after returns, refunds, order edits, and cancellations.
     */
    private int currentSubtotalLineItemsQuantity;

    /**
     * The total price of the order, after returns and refunds, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    private MoneyBag currentSubtotalPriceSet;

    /**
     * A list of all tax lines applied to line items on the order, after returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    private List<TaxLine> currentTaxLines;

    /**
     * The current total of all additional fees for an order, after any returns or
     * modifications. Modifications include returns, refunds, order edits, and
     * cancellations. Additional fees can include charges such as duties, import
     * fees, and special handling.
     */
    private MoneyBag currentTotalAdditionalFeesSet;

    /**
     * The total amount discounted on the order after returns and refunds, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    private MoneyBag currentTotalDiscountsSet;

    /**
     * The current total duties amount for an order, after any returns or
     * modifications. Modifications include returns, refunds, order edits, and cancellations.
     */
    private MoneyBag currentTotalDutiesSet;

    /**
     * The total price of the order, after returns, in shop and presentment currencies.
     * This includes taxes and discounts.
     */
    private MoneyBag currentTotalPriceSet;

    /**
     * The sum of the prices of all tax lines applied to line items on the order,
     * after returns and refunds, in shop and presentment currencies.
     */
    private MoneyBag currentTotalTaxSet;

    /**
     * The total weight of the order after returns and refunds, in grams.
     */
    private String currentTotalWeight;

    /**
     * A list of additional information that has been attached to the order. For
     * example, gift message, delivery instructions, or internal notes.
     */
    private List<Attribute> customAttributes;

    /**
     * The customer who placed an order. Returns `null` if an order was created
     * through a checkout without customer authentication, such as a guest checkout.
     * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
     */
    private Customer customer;

    /**
     * Whether the customer agreed to receive marketing emails at the time of purchase.
     * Use this to ensure compliance with marketing consent laws and to segment customers for email campaigns.
     * Learn more about [building customer segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
     */
    private boolean customerAcceptsMarketing;

    /**
     * The customer's visits and interactions with the online store before placing the order.
     */
    private CustomerJourney customerJourney;

    /**
     * The customer's visits and interactions with the online store before placing the order.
     * Use this to understand customer behavior, attribution sources, and marketing effectiveness to optimize your sales funnel.
     */
    private CustomerJourneySummary customerJourneySummary;

    /**
     * The customer's language and region preference at the time of purchase. For
     * example, "en" for English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
     * Use this to provide localized customer service and targeted marketing in the customer's preferred language.
     */
    private String customerLocale;

    /**
     * A list of discounts that are applied to the order, excluding order edits and refunds.
     * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
     */
    private DiscountApplicationConnection discountApplications;

    /**
     * The discount code used for an order. Returns `null` if no discount code was applied.
     */
    private String discountCode;

    /**
     * The discount codes used for the order. Multiple codes can be applied to a single order.
     */
    private List<String> discountCodes;

    /**
     * The primary address of the customer, prioritizing shipping address over billing address when both are available.
     * Returns `null` if neither shipping address nor billing address was provided.
     */
    private MailingAddress displayAddress;

    /**
     * An order's financial status for display in the Shopify admin.
     */
    private OrderDisplayFinancialStatus displayFinancialStatus;

    /**
     * The order's fulfillment status that displays in the Shopify admin to
     * merchants. For example, an order might be unfulfilled or scheduled.
     * For detailed processing, use the [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

    /**
     * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
     * Disputes occur when customers challenge transactions with their bank or payment provider.
     */
    private List<OrderDisputeSummary> disputes;

    /**
     * Whether duties are included in the subtotal price of the order.
     * Duties are import taxes charged by customs authorities when goods cross international borders.
     */
    private boolean dutiesIncluded;

    /**
     * Whether the order has had any edits applied. For example, adding or removing
     * line items, updating quantities, or changing prices.
     */
    private boolean edited;

    /**
     * The email address associated with the customer for this order.
     * Used for sending order confirmations, shipping notifications, and other order-related communications.
     * Returns `null` if no email address was provided during checkout.
     */
    private String email;

    /**
     * Whether taxes on the order are estimated.
     * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
     */
    private boolean estimatedTaxes;

    /**
     * A list of events associated with the order. Events track significant changes
     * and activities related to the order, such as creation, payment, fulfillment,
     * and cancellation.
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
     * A list of [fulfillment orders](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) for an order.
     * Each fulfillment order groups [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.lineItems)
     * that are fulfilled together,
     * allowing an order to be processed in parts if needed.
     */
    private FulfillmentOrderConnection fulfillmentOrders;

    /**
     * A list of shipments for the order. Fulfillments represent the physical shipment of products to customers.
     */
    private List<Fulfillment> fulfillments;

    /**
     * The total number of fulfillments for the order, including canceled ones.
     */
    private Count fulfillmentsCount;

    /**
     * Whether the order has been paid in full. This field returns `true` when the
     * total amount received equals or exceeds the order total.
     */
    private boolean fullyPaid;

    /**
     * Whether the merchant has added a timeline comment to the order.
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
     * A list of the order's line items. Line items represent the individual products and quantities that make up the order.
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
     * The legal business structure that the merchant operates under for this order, such as an LLC, corporation, or partnership.
     * Used for tax reporting, legal compliance, and determining which business entity is responsible for the order.
     */
    private BusinessEntity merchantBusinessEntity;

    /**
     * Whether the order can be edited by the merchant. Returns `false` for orders
     * that can't be modified, such as canceled orders or orders with specific
     * payment statuses.
     */
    private boolean merchantEditable;

    /**
     * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
     */
    private List<String> merchantEditableErrors;

    /**
     * The application acting as the Merchant of Record for the order. The Merchant
     * of Record is responsible for tax collection and remittance.
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
     * The unique identifier for the order that appears on the order page in the Shopify admin and the **Order status** page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores. Use this field to identify
     * orders in the Shopify admin and for order tracking.
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
     * The note associated with the order.
     * Contains additional information or instructions added by merchants or customers during the order process.
     * Commonly used for special delivery instructions, gift messages, or internal processing notes.
     */
    private String note;

    /**
     * The order number used to generate the name using the store's configured order
     * number prefix/suffix. This number isn't guaranteed to follow a consecutive
     * integer sequence (e.g. 1, 2, 3..), nor is it guaranteed to be unique across
     * multiple stores, or even for a single store.
     */
    private int number;

    /**
     * The total amount of all additional fees, such as import fees or taxes, that were applied when an order was created.
     * Returns `null` if additional fees aren't applicable.
     */
    private MoneyBag originalTotalAdditionalFeesSet;

    /**
     * The total amount of duties calculated when an order was created, before any
     * modifications. Modifications include returns, refunds, order edits, and
     * cancellations. Use [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.currentTotalDutiesSet)
     * to retrieve the current duties amount after adjustments.
     */
    private MoneyBag originalTotalDutiesSet;

    /**
     * The total price of the order at the time of order creation, in shop and presentment currencies.
     * Use this to compare the original order value against the current total after edits, returns, or refunds.
     */
    private MoneyBag originalTotalPriceSet;

    /**
     * The payment collection details for the order, including payment status, outstanding amounts, and collection information.
     * Use this to understand when and how payments should be collected, especially
     * for orders with deferred or installment payment terms.
     */
    private OrderPaymentCollectionDetails paymentCollectionDetails;

    /**
     * A list of the names of all payment gateways used for the order.
     * For example, "Shopify Payments" and "Cash on Delivery (COD)".
     */
    private List<String> paymentGatewayNames;

    /**
     * The payment terms associated with the order, such as net payment due dates or
     * early payment discounts. Payment terms define when and how an order should be
     * paid. Returns `null` if no specific payment terms were set for the order.
     */
    private PaymentTerms paymentTerms;

    /**
     * The phone number associated with the customer for this order.
     * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
     * Returns `null` if no phone number was provided during checkout.
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
     * The purchase order (PO) number that's associated with an order.
     * This is typically provided by business customers who require a PO number for their procurement.
     */
    private String poNumber;

    /**
     * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
     * This may differ from the shop's base currency when serving international customers or using multi-currency pricing.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    private OffsetDateTime processedAt;

    /**
     * The sales channel that the order was created from, such as the [Online
     * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
     * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
     */
    private Publication publication;

    /**
     * The business entity that placed the order, including company details and purchasing relationships.
     * Used for B2B transactions to track which company or organization is responsible for the purchase and payment terms.
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
     * The difference between the suggested and actual refund amount of all refunds that have been applied to the order.
     * A positive value indicates a difference in the merchant's favor, and a
     * negative value indicates a difference in the customer's favor.
     */
    private MoneyBag refundDiscrepancySet;

    /**
     * Whether the order can be refunded based on its payment transactions.
     * Returns `false` for orders with no eligible payment transactions, such as
     * fully refunded orders or orders with non-refundable payment methods.
     */
    private boolean refundable;

    /**
     * A list of refunds that have been applied to the order.
     * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
     */
    private List<Refund> refunds;

    /**
     * The URL of the source that the order originated from, if found in the domain
     * registry. Returns `null` if the source URL isn't in the domain registry.
     */
    private String registeredSourceUrl;

    /**
     * Whether the order requires physical shipping to the customer.
     * Returns `false` for digital-only orders (such as gift cards or downloadable
     * products) and `true` for orders with physical products that need delivery.
     * Use this to determine shipping workflows and logistics requirements.
     */
    private boolean requiresShipping;

    /**
     * Whether any line items on the order can be restocked into inventory.
     * Returns `false` for digital products, custom items, or items that can't be resold.
     */
    private boolean restockable;

    /**
     * The physical location where a retail order is created or completed, except for
     * draft POS orders completed using the "mark as paid" flow in the Shopify admin,
     * which return `null`. Transactions associated with the order might have been
     * processed at a different location.
     */
    private Location retailLocation;

    /**
     * The order's aggregated return status for display purposes.
     * Indicates the overall state of returns for the order, helping merchants track and manage the return process.
     */
    private OrderReturnStatus returnStatus;

    /**
     * The returns associated with the order.
     * Contains information about items that customers have requested to return,
     * including return reasons, status, and refund details.
     * Use this to track and manage the return process for order items.
     */
    private ReturnConnection returns;

    /**
     * The risk assessment summary for the order.
     * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
     * Use this to make informed decisions about order fulfillment and payment processing.
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
     * The shipping address where the order will be delivered.
     * Contains the customer's delivery location for fulfillment and shipping label generation.
     * Returns `null` for digital orders or orders that don't require shipping.
     */
    private MailingAddress shippingAddress;

    /**
     * A summary of all shipping costs on the order.
     * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
     */
    private ShippingLine shippingLine;

    /**
     * The shipping methods applied to the order.
     * Each shipping line represents a shipping option chosen during checkout, including the carrier, service level, and cost.
     * Use this to understand shipping charges and delivery options for the order.
     */
    private ShippingLineConnection shippingLines;

    /**
     * The Shopify Protect details for the order, including fraud protection status and coverage information.
     * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
     * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for protection.
     * Learn more about [Shopify Protect](https://www.shopify.com/protect).
     */
    private ShopifyProtectOrderSummary shopifyProtect;

    /**
     * A unique POS or third party order identifier.
     * For example, "1234-12-1000" or "111-98567-54". The [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumber)
     * field is derived from this value for POS orders.
     */
    private String sourceIdentifier;

    /**
     * The name of the source associated with the order, such as "web", "mobile_app",
     * or "pos". Use this field to identify the platform where the order was placed.
     */
    private String sourceName;

    /**
     * The staff member who created or is responsible for the order.
     * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
     * Returns `null` for orders created directly by customers through the online store.
     */
    private StaffMember staffMember;

    /**
     * The URL where customers can check their order's current status, including tracking information and delivery updates.
     * Provides order tracking links in emails, apps, or customer communications.
     */
    private String statusPageUrl;

    /**
     * The sum of quantities for all line items that contribute to the order's subtotal price.
     * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the subtotal.
     * Use this to quickly understand the total item count for pricing calculations.
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
     * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
     * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
     * Returns `true` for orders where the customer or business has a valid tax
     * exemption, such as non-profit organizations or tax-free purchases.
     * Use this to understand if tax calculations were skipped during checkout.
     */
    private boolean taxExempt;

    /**
     * A list of all tax lines applied to line items on the order, before returns.
     * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether taxes are included in the subtotal price of the order.
     * When `true`, the subtotal and line item prices include tax amounts. When
     * `false`, taxes are calculated and displayed separately.
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
     * The total rounding adjustment applied to payments or refunds for an order
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
     * The total shipping costs returned to the customer, in shop and presentment
     * currencies. This includes fees and any related discounts that were refunded.
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
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was last modified.
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
      result.number = this.number;
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
     * A list of additional fees applied to an order, such as duties, import fees, or [tax lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additionalFees.taxLines).
     */
    public Builder additionalFees(List<AdditionalFee> additionalFees) {
      this.additionalFees = additionalFees;
      return this;
    }

    /**
     * A list of sales agreements associated with the order, such as contracts
     * defining payment terms, or delivery schedules between merchants and customers.
     */
    public Builder agreements(SalesAgreementConnection agreements) {
      this.agreements = agreements;
      return this;
    }

    /**
     * A list of messages that appear on the **Orders** page in the Shopify admin.
     * These alerts provide merchants with important information about an order's
     * status or required actions.
     */
    public Builder alerts(List<ResourceAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    /**
     * The application that created the order. For example, "Online Store", "Point of Sale", or a custom app name.
     * Use this to identify the order source for attribution and fulfillment workflows.
     * Learn more about [building apps for orders and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
     */
    public Builder app(OrderApp app) {
      this.app = app;
      return this;
    }

    /**
     * The billing address associated with the payment method selected by the customer for an order.
     * Returns `null` if no billing address was provided during checkout.
     */
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * Whether the billing address matches the [shipping address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shippingAddress).
     * Returns `true` if both addresses are the same, and `false` if they're
     * different or if an address is missing.
     */
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    /**
     * Whether an order can be manually marked as paid. Returns `false` if the order
     * is already paid, is canceled, has pending [Shopify Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts)
     * transactions, or has a negative payment amount.
     */
    public Builder canMarkAsPaid(boolean canMarkAsPaid) {
      this.canMarkAsPaid = canMarkAsPaid;
      return this;
    }

    /**
     * Whether order notifications can be sent to the customer.
     * Returns `true` if the customer has a valid [email address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
     */
    public Builder canNotifyCustomer(boolean canNotifyCustomer) {
      this.canNotifyCustomer = canNotifyCustomer;
      return this;
    }

    /**
     * The reason provided for an order cancellation. For example, a merchant might
     * cancel an order if there's insufficient inventory. Returns `null` if the order
     * hasn't been canceled.
     */
    public Builder cancelReason(OrderCancelReason cancelReason) {
      this.cancelReason = cancelReason;
      return this;
    }

    /**
     * Details of an order's cancellation, if it has been canceled. This includes the
     * reason, date, and any [staff notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellation.fields.staffNote).
     */
    public Builder cancellation(OrderCancellation cancellation) {
      this.cancellation = cancellation;
      return this;
    }

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was canceled.
     * Returns `null` if the order hasn't been canceled.
     */
    public Builder cancelledAt(OffsetDateTime cancelledAt) {
      this.cancelledAt = cancelledAt;
      return this;
    }

    /**
     * Whether an authorized payment for an order can be captured.
     * Returns `true` if an authorized payment exists that hasn't been fully captured
     * yet. Learn more about [capturing payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments).
     */
    public Builder capturable(boolean capturable) {
      this.capturable = capturable;
      return this;
    }

    /**
     * The total discount amount that applies to the entire order in shop currency,
     * before returns, refunds, order edits, and cancellations.
     */
    public Builder cartDiscountAmount(String cartDiscountAmount) {
      this.cartDiscountAmount = cartDiscountAmount;
      return this;
    }

    /**
     * The total discount amount applied at the time the order was created, displayed
     * in both shop and presentment currencies, before returns, refunds, order edits,
     * and cancellations. This field only includes discounts applied to the entire order.
     */
    public Builder cartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
      this.cartDiscountAmountSet = cartDiscountAmountSet;
      return this;
    }

    /**
     * The sales channel from which an order originated, such as the [Online
     * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
     * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Details about the sales channel that created the order, such as the [channel app type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channelType)
     * and [channel name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefinition.fields.channelName), which helps to track order sources.
     */
    public Builder channelInformation(ChannelInformation channelInformation) {
      this.channelInformation = channelInformation;
      return this;
    }

    /**
     * The IP address of the customer who placed the order. Useful for fraud detection and geographic analysis.
     */
    public Builder clientIp(String clientIp) {
      this.clientIp = clientIp;
      return this;
    }

    /**
     * Whether an order is closed. An order is considered closed if all its line
     * items have been fulfilled or canceled, and all financial transactions are complete.
     */
    public Builder closed(boolean closed) {
      this.closed = closed;
      return this;
    }

    /**
     * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
     * when an order was closed. Shopify automatically records this timestamp when
     * all items have been fulfilled or canceled, and all financial transactions are
     * complete. Returns `null` if the order isn't closed.
     */
    public Builder closedAt(OffsetDateTime closedAt) {
      this.closedAt = closedAt;
      return this;
    }

    /**
     * A customer-facing order identifier, often shown instead of the sequential order name.
     * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique across orders.
     */
    public Builder confirmationNumber(String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
      return this;
    }

    /**
     * Whether inventory has been reserved for an order. Returns `true` if inventory
     * quantities for an order's [line
     * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
     * have been reserved.
     * Learn more about [managing inventory quantities and states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
     */
    public Builder confirmed(boolean confirmed) {
      this.confirmed = confirmed;
      return this;
    }

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)
     * when an order was created. This timestamp is set when the customer completes
     * checkout and remains unchanged throughout an order's lifecycle.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The shop currency when the order was placed. For example, "USD" or "CAD".
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The current total of all discounts applied to the entire order, after returns,
     * refunds, order edits, and cancellations. This includes discount codes,
     * automatic discounts, and other promotions that affect the whole order rather
     * than individual line items. To get the original discount amount at the time of
     * order creation, use the [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.cartDiscountAmountSet) field.
     */
    public Builder currentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
      this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
      return this;
    }

    /**
     * The current shipping price after applying refunds and discounts.
     * If the parent `order.taxesIncluded` field is true, then this price includes
     * taxes. Otherwise, this field is the pre-tax price.
     */
    public Builder currentShippingPriceSet(MoneyBag currentShippingPriceSet) {
      this.currentShippingPriceSet = currentShippingPriceSet;
      return this;
    }

    /**
     * The current sum of the quantities for all line items that contribute to the
     * order's subtotal price, after returns, refunds, order edits, and cancellations.
     */
    public Builder currentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
      this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
      return this;
    }

    /**
     * The total price of the order, after returns and refunds, in shop and presentment currencies.
     * This includes taxes and discounts.
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
     * The current total of all additional fees for an order, after any returns or
     * modifications. Modifications include returns, refunds, order edits, and
     * cancellations. Additional fees can include charges such as duties, import
     * fees, and special handling.
     */
    public Builder currentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
      this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
      return this;
    }

    /**
     * The total amount discounted on the order after returns and refunds, in shop and presentment currencies.
     * This includes both order and line level discounts.
     */
    public Builder currentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
      this.currentTotalDiscountsSet = currentTotalDiscountsSet;
      return this;
    }

    /**
     * The current total duties amount for an order, after any returns or
     * modifications. Modifications include returns, refunds, order edits, and cancellations.
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
     * after returns and refunds, in shop and presentment currencies.
     */
    public Builder currentTotalTaxSet(MoneyBag currentTotalTaxSet) {
      this.currentTotalTaxSet = currentTotalTaxSet;
      return this;
    }

    /**
     * The total weight of the order after returns and refunds, in grams.
     */
    public Builder currentTotalWeight(String currentTotalWeight) {
      this.currentTotalWeight = currentTotalWeight;
      return this;
    }

    /**
     * A list of additional information that has been attached to the order. For
     * example, gift message, delivery instructions, or internal notes.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer who placed an order. Returns `null` if an order was created
     * through a checkout without customer authentication, such as a guest checkout.
     * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Whether the customer agreed to receive marketing emails at the time of purchase.
     * Use this to ensure compliance with marketing consent laws and to segment customers for email campaigns.
     * Learn more about [building customer segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
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
     * Use this to understand customer behavior, attribution sources, and marketing effectiveness to optimize your sales funnel.
     */
    public Builder customerJourneySummary(CustomerJourneySummary customerJourneySummary) {
      this.customerJourneySummary = customerJourneySummary;
      return this;
    }

    /**
     * The customer's language and region preference at the time of purchase. For
     * example, "en" for English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
     * Use this to provide localized customer service and targeted marketing in the customer's preferred language.
     */
    public Builder customerLocale(String customerLocale) {
      this.customerLocale = customerLocale;
      return this;
    }

    /**
     * A list of discounts that are applied to the order, excluding order edits and refunds.
     * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
     */
    public Builder discountApplications(DiscountApplicationConnection discountApplications) {
      this.discountApplications = discountApplications;
      return this;
    }

    /**
     * The discount code used for an order. Returns `null` if no discount code was applied.
     */
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    /**
     * The discount codes used for the order. Multiple codes can be applied to a single order.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The primary address of the customer, prioritizing shipping address over billing address when both are available.
     * Returns `null` if neither shipping address nor billing address was provided.
     */
    public Builder displayAddress(MailingAddress displayAddress) {
      this.displayAddress = displayAddress;
      return this;
    }

    /**
     * An order's financial status for display in the Shopify admin.
     */
    public Builder displayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
      this.displayFinancialStatus = displayFinancialStatus;
      return this;
    }

    /**
     * The order's fulfillment status that displays in the Shopify admin to
     * merchants. For example, an order might be unfulfilled or scheduled.
     * For detailed processing, use the [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object.
     */
    public Builder displayFulfillmentStatus(
        OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
      this.displayFulfillmentStatus = displayFulfillmentStatus;
      return this;
    }

    /**
     * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
     * Disputes occur when customers challenge transactions with their bank or payment provider.
     */
    public Builder disputes(List<OrderDisputeSummary> disputes) {
      this.disputes = disputes;
      return this;
    }

    /**
     * Whether duties are included in the subtotal price of the order.
     * Duties are import taxes charged by customs authorities when goods cross international borders.
     */
    public Builder dutiesIncluded(boolean dutiesIncluded) {
      this.dutiesIncluded = dutiesIncluded;
      return this;
    }

    /**
     * Whether the order has had any edits applied. For example, adding or removing
     * line items, updating quantities, or changing prices.
     */
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The email address associated with the customer for this order.
     * Used for sending order confirmations, shipping notifications, and other order-related communications.
     * Returns `null` if no email address was provided during checkout.
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
     * A list of events associated with the order. Events track significant changes
     * and activities related to the order, such as creation, payment, fulfillment,
     * and cancellation.
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
     * A list of [fulfillment orders](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) for an order.
     * Each fulfillment order groups [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.lineItems)
     * that are fulfilled together,
     * allowing an order to be processed in parts if needed.
     */
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    /**
     * A list of shipments for the order. Fulfillments represent the physical shipment of products to customers.
     */
    public Builder fulfillments(List<Fulfillment> fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    /**
     * The total number of fulfillments for the order, including canceled ones.
     */
    public Builder fulfillmentsCount(Count fulfillmentsCount) {
      this.fulfillmentsCount = fulfillmentsCount;
      return this;
    }

    /**
     * Whether the order has been paid in full. This field returns `true` when the
     * total amount received equals or exceeds the order total.
     */
    public Builder fullyPaid(boolean fullyPaid) {
      this.fullyPaid = fullyPaid;
      return this;
    }

    /**
     * Whether the merchant has added a timeline comment to the order.
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
     * A list of the order's line items. Line items represent the individual products and quantities that make up the order.
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
     * The legal business structure that the merchant operates under for this order, such as an LLC, corporation, or partnership.
     * Used for tax reporting, legal compliance, and determining which business entity is responsible for the order.
     */
    public Builder merchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
      this.merchantBusinessEntity = merchantBusinessEntity;
      return this;
    }

    /**
     * Whether the order can be edited by the merchant. Returns `false` for orders
     * that can't be modified, such as canceled orders or orders with specific
     * payment statuses.
     */
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    /**
     * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
     */
    public Builder merchantEditableErrors(List<String> merchantEditableErrors) {
      this.merchantEditableErrors = merchantEditableErrors;
      return this;
    }

    /**
     * The application acting as the Merchant of Record for the order. The Merchant
     * of Record is responsible for tax collection and remittance.
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
     * The unique identifier for the order that appears on the order page in the Shopify admin and the **Order status** page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores. Use this field to identify
     * orders in the Shopify admin and for order tracking.
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
     * The note associated with the order.
     * Contains additional information or instructions added by merchants or customers during the order process.
     * Commonly used for special delivery instructions, gift messages, or internal processing notes.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The order number used to generate the name using the store's configured order
     * number prefix/suffix. This number isn't guaranteed to follow a consecutive
     * integer sequence (e.g. 1, 2, 3..), nor is it guaranteed to be unique across
     * multiple stores, or even for a single store.
     */
    public Builder number(int number) {
      this.number = number;
      return this;
    }

    /**
     * The total amount of all additional fees, such as import fees or taxes, that were applied when an order was created.
     * Returns `null` if additional fees aren't applicable.
     */
    public Builder originalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
      this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
      return this;
    }

    /**
     * The total amount of duties calculated when an order was created, before any
     * modifications. Modifications include returns, refunds, order edits, and
     * cancellations. Use [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.currentTotalDutiesSet)
     * to retrieve the current duties amount after adjustments.
     */
    public Builder originalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
      this.originalTotalDutiesSet = originalTotalDutiesSet;
      return this;
    }

    /**
     * The total price of the order at the time of order creation, in shop and presentment currencies.
     * Use this to compare the original order value against the current total after edits, returns, or refunds.
     */
    public Builder originalTotalPriceSet(MoneyBag originalTotalPriceSet) {
      this.originalTotalPriceSet = originalTotalPriceSet;
      return this;
    }

    /**
     * The payment collection details for the order, including payment status, outstanding amounts, and collection information.
     * Use this to understand when and how payments should be collected, especially
     * for orders with deferred or installment payment terms.
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
     * The payment terms associated with the order, such as net payment due dates or
     * early payment discounts. Payment terms define when and how an order should be
     * paid. Returns `null` if no specific payment terms were set for the order.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The phone number associated with the customer for this order.
     * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
     * Returns `null` if no phone number was provided during checkout.
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
     * The purchase order (PO) number that's associated with an order.
     * This is typically provided by business customers who require a PO number for their procurement.
     */
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    /**
     * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
     * This may differ from the shop's base currency when serving international customers or using multi-currency pricing.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The sales channel that the order was created from, such as the [Online
     * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or
     * [Shopify POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The business entity that placed the order, including company details and purchasing relationships.
     * Used for B2B transactions to track which company or organization is responsible for the purchase and payment terms.
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
     * The difference between the suggested and actual refund amount of all refunds that have been applied to the order.
     * A positive value indicates a difference in the merchant's favor, and a
     * negative value indicates a difference in the customer's favor.
     */
    public Builder refundDiscrepancySet(MoneyBag refundDiscrepancySet) {
      this.refundDiscrepancySet = refundDiscrepancySet;
      return this;
    }

    /**
     * Whether the order can be refunded based on its payment transactions.
     * Returns `false` for orders with no eligible payment transactions, such as
     * fully refunded orders or orders with non-refundable payment methods.
     */
    public Builder refundable(boolean refundable) {
      this.refundable = refundable;
      return this;
    }

    /**
     * A list of refunds that have been applied to the order.
     * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
     */
    public Builder refunds(List<Refund> refunds) {
      this.refunds = refunds;
      return this;
    }

    /**
     * The URL of the source that the order originated from, if found in the domain
     * registry. Returns `null` if the source URL isn't in the domain registry.
     */
    public Builder registeredSourceUrl(String registeredSourceUrl) {
      this.registeredSourceUrl = registeredSourceUrl;
      return this;
    }

    /**
     * Whether the order requires physical shipping to the customer.
     * Returns `false` for digital-only orders (such as gift cards or downloadable
     * products) and `true` for orders with physical products that need delivery.
     * Use this to determine shipping workflows and logistics requirements.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Whether any line items on the order can be restocked into inventory.
     * Returns `false` for digital products, custom items, or items that can't be resold.
     */
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    /**
     * The physical location where a retail order is created or completed, except for
     * draft POS orders completed using the "mark as paid" flow in the Shopify admin,
     * which return `null`. Transactions associated with the order might have been
     * processed at a different location.
     */
    public Builder retailLocation(Location retailLocation) {
      this.retailLocation = retailLocation;
      return this;
    }

    /**
     * The order's aggregated return status for display purposes.
     * Indicates the overall state of returns for the order, helping merchants track and manage the return process.
     */
    public Builder returnStatus(OrderReturnStatus returnStatus) {
      this.returnStatus = returnStatus;
      return this;
    }

    /**
     * The returns associated with the order.
     * Contains information about items that customers have requested to return,
     * including return reasons, status, and refund details.
     * Use this to track and manage the return process for order items.
     */
    public Builder returns(ReturnConnection returns) {
      this.returns = returns;
      return this;
    }

    /**
     * The risk assessment summary for the order.
     * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
     * Use this to make informed decisions about order fulfillment and payment processing.
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
     * The shipping address where the order will be delivered.
     * Contains the customer's delivery location for fulfillment and shipping label generation.
     * Returns `null` for digital orders or orders that don't require shipping.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * A summary of all shipping costs on the order.
     * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * The shipping methods applied to the order.
     * Each shipping line represents a shipping option chosen during checkout, including the carrier, service level, and cost.
     * Use this to understand shipping charges and delivery options for the order.
     */
    public Builder shippingLines(ShippingLineConnection shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    /**
     * The Shopify Protect details for the order, including fraud protection status and coverage information.
     * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
     * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for protection.
     * Learn more about [Shopify Protect](https://www.shopify.com/protect).
     */
    public Builder shopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
      this.shopifyProtect = shopifyProtect;
      return this;
    }

    /**
     * A unique POS or third party order identifier.
     * For example, "1234-12-1000" or "111-98567-54". The [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumber)
     * field is derived from this value for POS orders.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    /**
     * The name of the source associated with the order, such as "web", "mobile_app",
     * or "pos". Use this field to identify the platform where the order was placed.
     */
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    /**
     * The staff member who created or is responsible for the order.
     * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
     * Returns `null` for orders created directly by customers through the online store.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * The URL where customers can check their order's current status, including tracking information and delivery updates.
     * Provides order tracking links in emails, apps, or customer communications.
     */
    public Builder statusPageUrl(String statusPageUrl) {
      this.statusPageUrl = statusPageUrl;
      return this;
    }

    /**
     * The sum of quantities for all line items that contribute to the order's subtotal price.
     * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the subtotal.
     * Use this to quickly understand the total item count for pricing calculations.
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
     * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
     * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
     * Returns `true` for orders where the customer or business has a valid tax
     * exemption, such as non-profit organizations or tax-free purchases.
     * Use this to understand if tax calculations were skipped during checkout.
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
     * When `true`, the subtotal and line item prices include tax amounts. When
     * `false`, taxes are calculated and displayed separately.
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
     * The total rounding adjustment applied to payments or refunds for an order
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
     * The total shipping costs returned to the customer, in shop and presentment
     * currencies. This includes fees and any related discounts that were refunded.
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
     * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
