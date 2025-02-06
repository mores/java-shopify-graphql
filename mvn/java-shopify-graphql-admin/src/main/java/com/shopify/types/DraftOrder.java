package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An order that a merchant creates on behalf of a customer. Draft orders are
 * useful for merchants that need to do the following tasks:
 *
 * - Create new orders for sales made by phone, in person, by chat, or elsewhere.
 * When a merchant accepts payment for a draft order, an order is created.
 * - Send invoices to customers to pay with a secure checkout link.
 * - Use custom items to represent additional costs or products that aren't displayed in a shop's inventory.
 * - Re-create orders manually from active sales channels.
 * - Sell products at discount or wholesale rates.
 * - Take pre-orders.
 * - Save an order as a draft and resume working on it later.
 *
 * For draft orders in multiple currencies `presentment_money` is the source of
 * truth for what a customer is going to be charged and `shop_money` is an estimate
 * of what the merchant might receive in their shop currency.
 *
 * **Caution:** Only use this data if it's required for your app's functionality.
 * Shopify will restrict [access to
 * scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
 * legitimate use for the associated data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrder implements CommentEventEmbed, MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasLocalizationExtensions, com.shopify.types.HasLocalizedFields, com.shopify.types.HasMetafields, com.shopify.types.LegacyInteroperability, com.shopify.types.Navigable, com.shopify.types.Node {
  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  private Boolean acceptAutomaticDiscounts;

  /**
   * Whether all variant prices have been overridden.
   */
  private boolean allVariantPricesOverridden;

  /**
   * Whether discount codes are allowed during checkout of this draft order.
   */
  private boolean allowDiscountCodesInCheckout;

  /**
   * Whether any variant prices have been overridden.
   */
  private boolean anyVariantPricesOverridden;

  /**
   * The custom order-level discount applied.
   */
  private DraftOrderAppliedDiscount appliedDiscount;

  /**
   * The billing address of the customer.
   */
  private MailingAddress billingAddress;

  /**
   * Whether the billing address matches the shipping address.
   */
  private boolean billingAddressMatchesShippingAddress;

  /**
   * The date and time when the draft order was converted to a new order,
   * and had it's status changed to **Completed**.
   */
  private OffsetDateTime completedAt;

  /**
   * The date and time when the draft order was created in Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * The shop currency used for calculation.
   */
  private CurrencyCode currencyCode;

  /**
   * The custom information added to the draft order on behalf of the customer.
   */
  private List<Attribute> customAttributes;

  /**
   * The customer who will be sent an invoice.
   */
  private Customer customer;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * All discount codes applied.
   */
  private List<String> discountCodes;

  /**
   * The email address of the customer, which is used to send notifications.
   */
  private String email;

  /**
   * The list of events associated with the draft order.
   */
  private EventConnection events;

  /**
   * Whether the merchant has added timeline comments to the draft order.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The subject defined for the draft invoice email template.
   */
  private String invoiceEmailTemplateSubject;

  /**
   * The date and time when the invoice was last emailed to the customer.
   */
  private OffsetDateTime invoiceSentAt;

  /**
   * The link to the checkout, which is sent to the customer in the invoice email.
   */
  private String invoiceUrl;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The list of the line items in the draft order.
   */
  private DraftOrderLineItemConnection lineItems;

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  private MoneyBag lineItemsSubtotalPrice;

  /**
   * List of localization extensions for the resource.
   */
  private LocalizationExtensionConnection localizationExtensions;

  /**
   * List of localized fields for the resource.
   */
  private LocalizedFieldConnection localizedFields;

  /**
   * The name of the selected market.
   */
  private String marketName;

  /**
   * The selected country code that determines the pricing.
   */
  private CountryCode marketRegionCountryCode;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
   */
  private String name;

  /**
   * The text from an optional note attached to the draft order.
   */
  private String note2;

  /**
   * The order that was created from the draft order.
   */
  private Order order;

  /**
   * The associated payment terms for this draft order.
   */
  private PaymentTerms paymentTerms;

  /**
   * The assigned phone number.
   */
  private String phone;

  /**
   * The list of platform discounts applied.
   */
  private List<DraftOrderPlatformDiscount> platformDiscounts;

  /**
   * The purchase order number.
   */
  private String poNumber;

  /**
   * The payment currency used for calculation.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The purchasing entity.
   */
  private PurchasingEntity purchasingEntity;

  /**
   * Whether the draft order is ready and can be completed.
   * Draft orders might have asynchronous operations that can take time to finish.
   */
  private boolean ready;

  /**
   * The time after which inventory will automatically be restocked.
   */
  private OffsetDateTime reserveInventoryUntil;

  /**
   * The shipping address of the customer.
   */
  private MailingAddress shippingAddress;

  /**
   * The line item containing the shipping information and costs.
   */
  private ShippingLine shippingLine;

  /**
   * The status of the draft order.
   */
  private DraftOrderStatus status;

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  private String subtotalPrice;

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * The comma separated list of tags associated with the draft order.
   * Updating `tags` overwrites any existing tags that were previously added to the draft order.
   * To add new tags without overwriting existing tags, use the
   * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
   */
  private List<String> tags;

  /**
   * Whether the draft order is tax exempt.
   */
  private boolean taxExempt;

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether the line item prices include taxes.
   */
  private boolean taxesIncluded;

  /**
   * Total discounts.
   */
  private MoneyBag totalDiscountsSet;

  /**
   * Total price of line items.
   */
  private MoneyBag totalLineItemsPriceSet;

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  private String totalPrice;

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  private MoneyBag totalPriceSet;

  /**
   * The sum of individual line item quantities.
   * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
   */
  private int totalQuantityOfLineItems;

  /**
   * The total shipping price in shop currency.
   */
  private String totalShippingPrice;

  /**
   * The total shipping price.
   */
  private MoneyBag totalShippingPriceSet;

  /**
   * The total tax in shop currency.
   */
  private String totalTax;

  /**
   * The total tax.
   */
  private MoneyBag totalTaxSet;

  /**
   * The total weight in grams of the draft order.
   */
  private String totalWeight;

  /**
   * Fingerprint of the current cart.
   * In order to have bundles work, the fingerprint must be passed to
   * each request as it was previously returned, unmodified.
   */
  private String transformerFingerprint;

  /**
   * The date and time when the draft order was last changed.
   * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
   */
  private OffsetDateTime updatedAt;

  /**
   * Whether the draft order will be visible to the customer on the self-serve portal.
   */
  private boolean visibleToCustomer;

  /**
   * The list of warnings raised while calculating.
   */
  private List<DraftOrderWarning> warnings;

  public DraftOrder() {
  }

  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  /**
   * Whether all variant prices have been overridden.
   */
  public boolean getAllVariantPricesOverridden() {
    return allVariantPricesOverridden;
  }

  public void setAllVariantPricesOverridden(boolean allVariantPricesOverridden) {
    this.allVariantPricesOverridden = allVariantPricesOverridden;
  }

  /**
   * Whether discount codes are allowed during checkout of this draft order.
   */
  public boolean getAllowDiscountCodesInCheckout() {
    return allowDiscountCodesInCheckout;
  }

  public void setAllowDiscountCodesInCheckout(boolean allowDiscountCodesInCheckout) {
    this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
  }

  /**
   * Whether any variant prices have been overridden.
   */
  public boolean getAnyVariantPricesOverridden() {
    return anyVariantPricesOverridden;
  }

  public void setAnyVariantPricesOverridden(boolean anyVariantPricesOverridden) {
    this.anyVariantPricesOverridden = anyVariantPricesOverridden;
  }

  /**
   * The custom order-level discount applied.
   */
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
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
   * The date and time when the draft order was converted to a new order,
   * and had it's status changed to **Completed**.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The date and time when the draft order was created in Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The shop currency used for calculation.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The custom information added to the draft order on behalf of the customer.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer who will be sent an invoice.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * All discount codes applied.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The email address of the customer, which is used to send notifications.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The list of events associated with the draft order.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * Whether the merchant has added timeline comments to the draft order.
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
   * The subject defined for the draft invoice email template.
   */
  public String getInvoiceEmailTemplateSubject() {
    return invoiceEmailTemplateSubject;
  }

  public void setInvoiceEmailTemplateSubject(String invoiceEmailTemplateSubject) {
    this.invoiceEmailTemplateSubject = invoiceEmailTemplateSubject;
  }

  /**
   * The date and time when the invoice was last emailed to the customer.
   */
  public OffsetDateTime getInvoiceSentAt() {
    return invoiceSentAt;
  }

  public void setInvoiceSentAt(OffsetDateTime invoiceSentAt) {
    this.invoiceSentAt = invoiceSentAt;
  }

  /**
   * The link to the checkout, which is sent to the customer in the invoice email.
   */
  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
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
   * The list of the line items in the draft order.
   */
  public DraftOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(DraftOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  public MoneyBag getLineItemsSubtotalPrice() {
    return lineItemsSubtotalPrice;
  }

  public void setLineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
    this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
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
   * The name of the selected market.
   */
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  /**
   * The selected country code that determines the pricing.
   */
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
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
   * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The text from an optional note attached to the draft order.
   */
  public String getNote2() {
    return note2;
  }

  public void setNote2(String note2) {
    this.note2 = note2;
  }

  /**
   * The order that was created from the draft order.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The associated payment terms for this draft order.
   */
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The assigned phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The list of platform discounts applied.
   */
  public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
    return platformDiscounts;
  }

  public void setPlatformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
    this.platformDiscounts = platformDiscounts;
  }

  /**
   * The purchase order number.
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * The payment currency used for calculation.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The purchasing entity.
   */
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  /**
   * Whether the draft order is ready and can be completed.
   * Draft orders might have asynchronous operations that can take time to finish.
   */
  public boolean getReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  /**
   * The time after which inventory will automatically be restocked.
   */
  public OffsetDateTime getReserveInventoryUntil() {
    return reserveInventoryUntil;
  }

  public void setReserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
    this.reserveInventoryUntil = reserveInventoryUntil;
  }

  /**
   * The shipping address of the customer.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The line item containing the shipping information and costs.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * The status of the draft order.
   */
  public DraftOrderStatus getStatus() {
    return status;
  }

  public void setStatus(DraftOrderStatus status) {
    this.status = status;
  }

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * The comma separated list of tags associated with the draft order.
   * Updating `tags` overwrites any existing tags that were previously added to the draft order.
   * To add new tags without overwriting existing tags, use the
   * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Whether the draft order is tax exempt.
   */
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether the line item prices include taxes.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  /**
   * Total discounts.
   */
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  /**
   * Total price of line items.
   */
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The sum of individual line item quantities.
   * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
   */
  public int getTotalQuantityOfLineItems() {
    return totalQuantityOfLineItems;
  }

  public void setTotalQuantityOfLineItems(int totalQuantityOfLineItems) {
    this.totalQuantityOfLineItems = totalQuantityOfLineItems;
  }

  /**
   * The total shipping price in shop currency.
   */
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total shipping price.
   */
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  /**
   * The total tax in shop currency.
   */
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total tax.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * The total weight in grams of the draft order.
   */
  public String getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(String totalWeight) {
    this.totalWeight = totalWeight;
  }

  /**
   * Fingerprint of the current cart.
   * In order to have bundles work, the fingerprint must be passed to
   * each request as it was previously returned, unmodified.
   */
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  /**
   * The date and time when the draft order was last changed.
   * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Whether the draft order will be visible to the customer on the self-serve portal.
   */
  public boolean getVisibleToCustomer() {
    return visibleToCustomer;
  }

  public void setVisibleToCustomer(boolean visibleToCustomer) {
    this.visibleToCustomer = visibleToCustomer;
  }

  /**
   * The list of warnings raised while calculating.
   */
  public List<DraftOrderWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<DraftOrderWarning> warnings) {
    this.warnings = warnings;
  }

  @Override
  public String toString() {
    return "DraftOrder{acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', allVariantPricesOverridden='" + allVariantPricesOverridden + "', allowDiscountCodesInCheckout='" + allowDiscountCodesInCheckout + "', anyVariantPricesOverridden='" + anyVariantPricesOverridden + "', appliedDiscount='" + appliedDiscount + "', billingAddress='" + billingAddress + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', completedAt='" + completedAt + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', defaultCursor='" + defaultCursor + "', discountCodes='" + discountCodes + "', email='" + email + "', events='" + events + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', invoiceEmailTemplateSubject='" + invoiceEmailTemplateSubject + "', invoiceSentAt='" + invoiceSentAt + "', invoiceUrl='" + invoiceUrl + "', legacyResourceId='" + legacyResourceId + "', lineItems='" + lineItems + "', lineItemsSubtotalPrice='" + lineItemsSubtotalPrice + "', localizationExtensions='" + localizationExtensions + "', localizedFields='" + localizedFields + "', marketName='" + marketName + "', marketRegionCountryCode='" + marketRegionCountryCode + "', metafield='" + metafield + "', metafields='" + metafields + "', name='" + name + "', note2='" + note2 + "', order='" + order + "', paymentTerms='" + paymentTerms + "', phone='" + phone + "', platformDiscounts='" + platformDiscounts + "', poNumber='" + poNumber + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', purchasingEntity='" + purchasingEntity + "', ready='" + ready + "', reserveInventoryUntil='" + reserveInventoryUntil + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', status='" + status + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountsSet='" + totalDiscountsSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalQuantityOfLineItems='" + totalQuantityOfLineItems + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', totalWeight='" + totalWeight + "', transformerFingerprint='" + transformerFingerprint + "', updatedAt='" + updatedAt + "', visibleToCustomer='" + visibleToCustomer + "', warnings='" + warnings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrder that = (DraftOrder) o;
    return Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        allVariantPricesOverridden == that.allVariantPricesOverridden &&
        allowDiscountCodesInCheckout == that.allowDiscountCodesInCheckout &&
        anyVariantPricesOverridden == that.anyVariantPricesOverridden &&
        Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        billingAddressMatchesShippingAddress == that.billingAddressMatchesShippingAddress &&
        Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(email, that.email) &&
        Objects.equals(events, that.events) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(invoiceEmailTemplateSubject, that.invoiceEmailTemplateSubject) &&
        Objects.equals(invoiceSentAt, that.invoiceSentAt) &&
        Objects.equals(invoiceUrl, that.invoiceUrl) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(lineItemsSubtotalPrice, that.lineItemsSubtotalPrice) &&
        Objects.equals(localizationExtensions, that.localizationExtensions) &&
        Objects.equals(localizedFields, that.localizedFields) &&
        Objects.equals(marketName, that.marketName) &&
        Objects.equals(marketRegionCountryCode, that.marketRegionCountryCode) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note2, that.note2) &&
        Objects.equals(order, that.order) &&
        Objects.equals(paymentTerms, that.paymentTerms) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(platformDiscounts, that.platformDiscounts) &&
        Objects.equals(poNumber, that.poNumber) &&
        Objects.equals(presentmentCurrencyCode, that.presentmentCurrencyCode) &&
        Objects.equals(purchasingEntity, that.purchasingEntity) &&
        ready == that.ready &&
        Objects.equals(reserveInventoryUntil, that.reserveInventoryUntil) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(status, that.status) &&
        Objects.equals(subtotalPrice, that.subtotalPrice) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(tags, that.tags) &&
        taxExempt == that.taxExempt &&
        Objects.equals(taxLines, that.taxLines) &&
        taxesIncluded == that.taxesIncluded &&
        Objects.equals(totalDiscountsSet, that.totalDiscountsSet) &&
        Objects.equals(totalLineItemsPriceSet, that.totalLineItemsPriceSet) &&
        Objects.equals(totalPrice, that.totalPrice) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        totalQuantityOfLineItems == that.totalQuantityOfLineItems &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalShippingPriceSet, that.totalShippingPriceSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(totalWeight, that.totalWeight) &&
        Objects.equals(transformerFingerprint, that.transformerFingerprint) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        visibleToCustomer == that.visibleToCustomer &&
        Objects.equals(warnings, that.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptAutomaticDiscounts, allVariantPricesOverridden, allowDiscountCodesInCheckout, anyVariantPricesOverridden, appliedDiscount, billingAddress, billingAddressMatchesShippingAddress, completedAt, createdAt, currencyCode, customAttributes, customer, defaultCursor, discountCodes, email, events, hasTimelineComment, id, invoiceEmailTemplateSubject, invoiceSentAt, invoiceUrl, legacyResourceId, lineItems, lineItemsSubtotalPrice, localizationExtensions, localizedFields, marketName, marketRegionCountryCode, metafield, metafields, name, note2, order, paymentTerms, phone, platformDiscounts, poNumber, presentmentCurrencyCode, purchasingEntity, ready, reserveInventoryUntil, shippingAddress, shippingLine, status, subtotalPrice, subtotalPriceSet, tags, taxExempt, taxLines, taxesIncluded, totalDiscountsSet, totalLineItemsPriceSet, totalPrice, totalPriceSet, totalQuantityOfLineItems, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, totalWeight, transformerFingerprint, updatedAt, visibleToCustomer, warnings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    private Boolean acceptAutomaticDiscounts;

    /**
     * Whether all variant prices have been overridden.
     */
    private boolean allVariantPricesOverridden;

    /**
     * Whether discount codes are allowed during checkout of this draft order.
     */
    private boolean allowDiscountCodesInCheckout;

    /**
     * Whether any variant prices have been overridden.
     */
    private boolean anyVariantPricesOverridden;

    /**
     * The custom order-level discount applied.
     */
    private DraftOrderAppliedDiscount appliedDiscount;

    /**
     * The billing address of the customer.
     */
    private MailingAddress billingAddress;

    /**
     * Whether the billing address matches the shipping address.
     */
    private boolean billingAddressMatchesShippingAddress;

    /**
     * The date and time when the draft order was converted to a new order,
     * and had it's status changed to **Completed**.
     */
    private OffsetDateTime completedAt;

    /**
     * The date and time when the draft order was created in Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * The shop currency used for calculation.
     */
    private CurrencyCode currencyCode;

    /**
     * The custom information added to the draft order on behalf of the customer.
     */
    private List<Attribute> customAttributes;

    /**
     * The customer who will be sent an invoice.
     */
    private Customer customer;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * All discount codes applied.
     */
    private List<String> discountCodes;

    /**
     * The email address of the customer, which is used to send notifications.
     */
    private String email;

    /**
     * The list of events associated with the draft order.
     */
    private EventConnection events;

    /**
     * Whether the merchant has added timeline comments to the draft order.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The subject defined for the draft invoice email template.
     */
    private String invoiceEmailTemplateSubject;

    /**
     * The date and time when the invoice was last emailed to the customer.
     */
    private OffsetDateTime invoiceSentAt;

    /**
     * The link to the checkout, which is sent to the customer in the invoice email.
     */
    private String invoiceUrl;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The list of the line items in the draft order.
     */
    private DraftOrderLineItemConnection lineItems;

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    private MoneyBag lineItemsSubtotalPrice;

    /**
     * List of localization extensions for the resource.
     */
    private LocalizationExtensionConnection localizationExtensions;

    /**
     * List of localized fields for the resource.
     */
    private LocalizedFieldConnection localizedFields;

    /**
     * The name of the selected market.
     */
    private String marketName;

    /**
     * The selected country code that determines the pricing.
     */
    private CountryCode marketRegionCountryCode;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
     */
    private String name;

    /**
     * The text from an optional note attached to the draft order.
     */
    private String note2;

    /**
     * The order that was created from the draft order.
     */
    private Order order;

    /**
     * The associated payment terms for this draft order.
     */
    private PaymentTerms paymentTerms;

    /**
     * The assigned phone number.
     */
    private String phone;

    /**
     * The list of platform discounts applied.
     */
    private List<DraftOrderPlatformDiscount> platformDiscounts;

    /**
     * The purchase order number.
     */
    private String poNumber;

    /**
     * The payment currency used for calculation.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The purchasing entity.
     */
    private PurchasingEntity purchasingEntity;

    /**
     * Whether the draft order is ready and can be completed.
     * Draft orders might have asynchronous operations that can take time to finish.
     */
    private boolean ready;

    /**
     * The time after which inventory will automatically be restocked.
     */
    private OffsetDateTime reserveInventoryUntil;

    /**
     * The shipping address of the customer.
     */
    private MailingAddress shippingAddress;

    /**
     * The line item containing the shipping information and costs.
     */
    private ShippingLine shippingLine;

    /**
     * The status of the draft order.
     */
    private DraftOrderStatus status;

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    private String subtotalPrice;

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * The comma separated list of tags associated with the draft order.
     * Updating `tags` overwrites any existing tags that were previously added to the draft order.
     * To add new tags without overwriting existing tags, use the
     * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
     */
    private List<String> tags;

    /**
     * Whether the draft order is tax exempt.
     */
    private boolean taxExempt;

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether the line item prices include taxes.
     */
    private boolean taxesIncluded;

    /**
     * Total discounts.
     */
    private MoneyBag totalDiscountsSet;

    /**
     * Total price of line items.
     */
    private MoneyBag totalLineItemsPriceSet;

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    private String totalPrice;

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    private MoneyBag totalPriceSet;

    /**
     * The sum of individual line item quantities.
     * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
     */
    private int totalQuantityOfLineItems;

    /**
     * The total shipping price in shop currency.
     */
    private String totalShippingPrice;

    /**
     * The total shipping price.
     */
    private MoneyBag totalShippingPriceSet;

    /**
     * The total tax in shop currency.
     */
    private String totalTax;

    /**
     * The total tax.
     */
    private MoneyBag totalTaxSet;

    /**
     * The total weight in grams of the draft order.
     */
    private String totalWeight;

    /**
     * Fingerprint of the current cart.
     * In order to have bundles work, the fingerprint must be passed to
     * each request as it was previously returned, unmodified.
     */
    private String transformerFingerprint;

    /**
     * The date and time when the draft order was last changed.
     * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
     */
    private OffsetDateTime updatedAt;

    /**
     * Whether the draft order will be visible to the customer on the self-serve portal.
     */
    private boolean visibleToCustomer;

    /**
     * The list of warnings raised while calculating.
     */
    private List<DraftOrderWarning> warnings;

    public DraftOrder build() {
      DraftOrder result = new DraftOrder();
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.allVariantPricesOverridden = this.allVariantPricesOverridden;
      result.allowDiscountCodesInCheckout = this.allowDiscountCodesInCheckout;
      result.anyVariantPricesOverridden = this.anyVariantPricesOverridden;
      result.appliedDiscount = this.appliedDiscount;
      result.billingAddress = this.billingAddress;
      result.billingAddressMatchesShippingAddress = this.billingAddressMatchesShippingAddress;
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.defaultCursor = this.defaultCursor;
      result.discountCodes = this.discountCodes;
      result.email = this.email;
      result.events = this.events;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.invoiceEmailTemplateSubject = this.invoiceEmailTemplateSubject;
      result.invoiceSentAt = this.invoiceSentAt;
      result.invoiceUrl = this.invoiceUrl;
      result.legacyResourceId = this.legacyResourceId;
      result.lineItems = this.lineItems;
      result.lineItemsSubtotalPrice = this.lineItemsSubtotalPrice;
      result.localizationExtensions = this.localizationExtensions;
      result.localizedFields = this.localizedFields;
      result.marketName = this.marketName;
      result.marketRegionCountryCode = this.marketRegionCountryCode;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note2 = this.note2;
      result.order = this.order;
      result.paymentTerms = this.paymentTerms;
      result.phone = this.phone;
      result.platformDiscounts = this.platformDiscounts;
      result.poNumber = this.poNumber;
      result.presentmentCurrencyCode = this.presentmentCurrencyCode;
      result.purchasingEntity = this.purchasingEntity;
      result.ready = this.ready;
      result.reserveInventoryUntil = this.reserveInventoryUntil;
      result.shippingAddress = this.shippingAddress;
      result.shippingLine = this.shippingLine;
      result.status = this.status;
      result.subtotalPrice = this.subtotalPrice;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      result.taxLines = this.taxLines;
      result.taxesIncluded = this.taxesIncluded;
      result.totalDiscountsSet = this.totalDiscountsSet;
      result.totalLineItemsPriceSet = this.totalLineItemsPriceSet;
      result.totalPrice = this.totalPrice;
      result.totalPriceSet = this.totalPriceSet;
      result.totalQuantityOfLineItems = this.totalQuantityOfLineItems;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalShippingPriceSet = this.totalShippingPriceSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      result.totalWeight = this.totalWeight;
      result.transformerFingerprint = this.transformerFingerprint;
      result.updatedAt = this.updatedAt;
      result.visibleToCustomer = this.visibleToCustomer;
      result.warnings = this.warnings;
      return result;
    }

    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    /**
     * Whether all variant prices have been overridden.
     */
    public Builder allVariantPricesOverridden(boolean allVariantPricesOverridden) {
      this.allVariantPricesOverridden = allVariantPricesOverridden;
      return this;
    }

    /**
     * Whether discount codes are allowed during checkout of this draft order.
     */
    public Builder allowDiscountCodesInCheckout(boolean allowDiscountCodesInCheckout) {
      this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
      return this;
    }

    /**
     * Whether any variant prices have been overridden.
     */
    public Builder anyVariantPricesOverridden(boolean anyVariantPricesOverridden) {
      this.anyVariantPricesOverridden = anyVariantPricesOverridden;
      return this;
    }

    /**
     * The custom order-level discount applied.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
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
     * The date and time when the draft order was converted to a new order,
     * and had it's status changed to **Completed**.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * The date and time when the draft order was created in Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The shop currency used for calculation.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The custom information added to the draft order on behalf of the customer.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer who will be sent an invoice.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * All discount codes applied.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The email address of the customer, which is used to send notifications.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The list of events associated with the draft order.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * Whether the merchant has added timeline comments to the draft order.
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
     * The subject defined for the draft invoice email template.
     */
    public Builder invoiceEmailTemplateSubject(String invoiceEmailTemplateSubject) {
      this.invoiceEmailTemplateSubject = invoiceEmailTemplateSubject;
      return this;
    }

    /**
     * The date and time when the invoice was last emailed to the customer.
     */
    public Builder invoiceSentAt(OffsetDateTime invoiceSentAt) {
      this.invoiceSentAt = invoiceSentAt;
      return this;
    }

    /**
     * The link to the checkout, which is sent to the customer in the invoice email.
     */
    public Builder invoiceUrl(String invoiceUrl) {
      this.invoiceUrl = invoiceUrl;
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
     * The list of the line items in the draft order.
     */
    public Builder lineItems(DraftOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    public Builder lineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
      this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
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
     * The name of the selected market.
     */
    public Builder marketName(String marketName) {
      this.marketName = marketName;
      return this;
    }

    /**
     * The selected country code that determines the pricing.
     */
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
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
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The text from an optional note attached to the draft order.
     */
    public Builder note2(String note2) {
      this.note2 = note2;
      return this;
    }

    /**
     * The order that was created from the draft order.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The associated payment terms for this draft order.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The assigned phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The list of platform discounts applied.
     */
    public Builder platformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
      this.platformDiscounts = platformDiscounts;
      return this;
    }

    /**
     * The purchase order number.
     */
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    /**
     * The payment currency used for calculation.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The purchasing entity.
     */
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    /**
     * Whether the draft order is ready and can be completed.
     * Draft orders might have asynchronous operations that can take time to finish.
     */
    public Builder ready(boolean ready) {
      this.ready = ready;
      return this;
    }

    /**
     * The time after which inventory will automatically be restocked.
     */
    public Builder reserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
      this.reserveInventoryUntil = reserveInventoryUntil;
      return this;
    }

    /**
     * The shipping address of the customer.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The line item containing the shipping information and costs.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * The status of the draft order.
     */
    public Builder status(DraftOrderStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * The comma separated list of tags associated with the draft order.
     * Updating `tags` overwrites any existing tags that were previously added to the draft order.
     * To add new tags without overwriting existing tags, use the
     * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Whether the draft order is tax exempt.
     */
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether the line item prices include taxes.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    /**
     * Total discounts.
     */
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    /**
     * Total price of line items.
     */
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The sum of individual line item quantities.
     * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
     */
    public Builder totalQuantityOfLineItems(int totalQuantityOfLineItems) {
      this.totalQuantityOfLineItems = totalQuantityOfLineItems;
      return this;
    }

    /**
     * The total shipping price in shop currency.
     */
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total shipping price.
     */
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    /**
     * The total tax in shop currency.
     */
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total tax.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * The total weight in grams of the draft order.
     */
    public Builder totalWeight(String totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    /**
     * Fingerprint of the current cart.
     * In order to have bundles work, the fingerprint must be passed to
     * each request as it was previously returned, unmodified.
     */
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }

    /**
     * The date and time when the draft order was last changed.
     * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Whether the draft order will be visible to the customer on the self-serve portal.
     */
    public Builder visibleToCustomer(boolean visibleToCustomer) {
      this.visibleToCustomer = visibleToCustomer;
      return this;
    }

    /**
     * The list of warnings raised while calculating.
     */
    public Builder warnings(List<DraftOrderWarning> warnings) {
      this.warnings = warnings;
      return this;
    }
  }
}
