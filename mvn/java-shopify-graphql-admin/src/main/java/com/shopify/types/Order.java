package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Order implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasLocalizationExtensions, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private List<AdditionalFee> additionalFees;

  
  private SalesAgreementConnection agreements;

  
  private List<ResourceAlert> alerts;

  
  private OrderApp app;

  
  private MailingAddress billingAddress;

  
  private boolean billingAddressMatchesShippingAddress;

  
  private boolean canMarkAsPaid;

  
  private boolean canNotifyCustomer;

  
  private OrderCancelReason cancelReason;

  
  private OrderCancellation cancellation;

  
  private OffsetDateTime cancelledAt;

  
  private boolean capturable;

  
  private String cartDiscountAmount;

  
  private MoneyBag cartDiscountAmountSet;

  
  private Channel channel;

  
  private ChannelInformation channelInformation;

  
  private String clientIp;

  
  private boolean closed;

  
  private OffsetDateTime closedAt;

  
  private String confirmationNumber;

  
  private boolean confirmed;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currencyCode;

  
  private MoneyBag currentCartDiscountAmountSet;

  
  private MoneyBag currentShippingPriceSet;

  
  private int currentSubtotalLineItemsQuantity;

  
  private MoneyBag currentSubtotalPriceSet;

  
  private List<TaxLine> currentTaxLines;

  
  private MoneyBag currentTotalAdditionalFeesSet;

  
  private MoneyBag currentTotalDiscountsSet;

  
  private MoneyBag currentTotalDutiesSet;

  
  private MoneyBag currentTotalPriceSet;

  
  private MoneyBag currentTotalTaxSet;

  
  private String currentTotalWeight;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private boolean customerAcceptsMarketing;

  
  private CustomerJourney customerJourney;

  
  private CustomerJourneySummary customerJourneySummary;

  
  private String customerLocale;

  
  private DiscountApplicationConnection discountApplications;

  
  private String discountCode;

  
  private List<String> discountCodes;

  
  private MailingAddress displayAddress;

  
  private OrderDisplayFinancialStatus displayFinancialStatus;

  
  private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

  
  private List<OrderDisputeSummary> disputes;

  
  private boolean dutiesIncluded;

  
  private boolean edited;

  
  private String email;

  
  private boolean estimatedTaxes;

  
  private EventConnection events;

  
  private ExchangeV2Connection exchangeV2s;

  
  private boolean fulfillable;

  
  private FulfillmentOrderConnection fulfillmentOrders;

  
  private List<Fulfillment> fulfillments;

  
  private Count fulfillmentsCount;

  
  private boolean fullyPaid;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private String landingPageDisplayText;

  
  private String landingPageUrl;

  
  private String legacyResourceId;

  
  private LineItemConnection lineItems;

  
  private LocalizationExtensionConnection localizationExtensions;

  
  private BusinessEntity merchantBusinessEntity;

  
  private boolean merchantEditable;

  
  private List<String> merchantEditableErrors;

  
  private OrderApp merchantOfRecordApp;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private String netPayment;

  
  private MoneyBag netPaymentSet;

  
  private LineItemConnection nonFulfillableLineItems;

  
  private String note;

  
  private MoneyBag originalTotalAdditionalFeesSet;

  
  private MoneyBag originalTotalDutiesSet;

  
  private MoneyBag originalTotalPriceSet;

  
  private OrderPaymentCollectionDetails paymentCollectionDetails;

  
  private List<String> paymentGatewayNames;

  
  private PaymentTerms paymentTerms;

  
  private String phone;

  
  private Location physicalLocation;

  
  private String poNumber;

  
  private CurrencyCode presentmentCurrencyCode;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private OffsetDateTime processedAt;

  
  private Publication publication;

  
  private PurchasingEntity purchasingEntity;

  
  private String referralCode;

  
  private String referrerDisplayText;

  
  private String referrerUrl;

  
  private MoneyBag refundDiscrepancySet;

  
  private boolean refundable;

  
  private List<Refund> refunds;

  
  private String registeredSourceUrl;

  
  private boolean requiresShipping;

  
  private boolean restockable;

  
  private Location retailLocation;

  
  private OrderReturnStatus returnStatus;

  
  private ReturnConnection returns;

  
  private OrderRiskSummary risk;

  
  private OrderRiskLevel riskLevel;

  
  private List<OrderRisk> risks;

  
  private MailingAddress shippingAddress;

  
  private ShippingLine shippingLine;

  
  private ShippingLineConnection shippingLines;

  
  private ShopifyProtectOrderSummary shopifyProtect;

  
  private String sourceIdentifier;

  
  private String sourceName;

  
  private StaffMember staffMember;

  
  private String statusPageUrl;

  
  private int subtotalLineItemsQuantity;

  
  private String subtotalPrice;

  
  private MoneyBag subtotalPriceSet;

  
  private SuggestedRefund suggestedRefund;

  
  private List<String> tags;

  
  private boolean taxExempt;

  
  private List<TaxLine> taxLines;

  
  private boolean taxesIncluded;

  
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

  
  private CashRoundingAdjustment totalCashRoundingAdjustment;

  
  private String totalDiscounts;

  
  private MoneyBag totalDiscountsSet;

  
  private MoneyBag totalOutstandingSet;

  
  private String totalPrice;

  
  private MoneyBag totalPriceSet;

  
  private String totalReceived;

  
  private MoneyBag totalReceivedSet;

  
  private String totalRefunded;

  
  private MoneyBag totalRefundedSet;

  
  private MoneyBag totalRefundedShippingSet;

  
  private String totalShippingPrice;

  
  private MoneyBag totalShippingPriceSet;

  
  private String totalTax;

  
  private MoneyBag totalTaxSet;

  
  private MoneyV2 totalTipReceived;

  
  private MoneyBag totalTipReceivedSet;

  
  private String totalWeight;

  
  private List<OrderTransaction> transactions;

  
  private Count transactionsCount;

  
  private boolean unpaid;

  
  private OffsetDateTime updatedAt;

  public Order() {
  }

  
  public List<AdditionalFee> getAdditionalFees() {
    return additionalFees;
  }

  public void setAdditionalFees(List<AdditionalFee> additionalFees) {
    this.additionalFees = additionalFees;
  }

  
  public SalesAgreementConnection getAgreements() {
    return agreements;
  }

  public void setAgreements(SalesAgreementConnection agreements) {
    this.agreements = agreements;
  }

  
  public List<ResourceAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ResourceAlert> alerts) {
    this.alerts = alerts;
  }

  
  public OrderApp getApp() {
    return app;
  }

  public void setApp(OrderApp app) {
    this.app = app;
  }

  
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  
  public boolean getCanMarkAsPaid() {
    return canMarkAsPaid;
  }

  public void setCanMarkAsPaid(boolean canMarkAsPaid) {
    this.canMarkAsPaid = canMarkAsPaid;
  }

  
  public boolean getCanNotifyCustomer() {
    return canNotifyCustomer;
  }

  public void setCanNotifyCustomer(boolean canNotifyCustomer) {
    this.canNotifyCustomer = canNotifyCustomer;
  }

  
  public OrderCancelReason getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(OrderCancelReason cancelReason) {
    this.cancelReason = cancelReason;
  }

  
  public OrderCancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(OrderCancellation cancellation) {
    this.cancellation = cancellation;
  }

  
  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  
  public boolean getCapturable() {
    return capturable;
  }

  public void setCapturable(boolean capturable) {
    this.capturable = capturable;
  }

  
  public String getCartDiscountAmount() {
    return cartDiscountAmount;
  }

  public void setCartDiscountAmount(String cartDiscountAmount) {
    this.cartDiscountAmount = cartDiscountAmount;
  }

  
  public MoneyBag getCartDiscountAmountSet() {
    return cartDiscountAmountSet;
  }

  public void setCartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
    this.cartDiscountAmountSet = cartDiscountAmountSet;
  }

  
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  
  public ChannelInformation getChannelInformation() {
    return channelInformation;
  }

  public void setChannelInformation(ChannelInformation channelInformation) {
    this.channelInformation = channelInformation;
  }

  
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  
  public boolean getClosed() {
    return closed;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  
  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public MoneyBag getCurrentCartDiscountAmountSet() {
    return currentCartDiscountAmountSet;
  }

  public void setCurrentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
    this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
  }

  
  public MoneyBag getCurrentShippingPriceSet() {
    return currentShippingPriceSet;
  }

  public void setCurrentShippingPriceSet(MoneyBag currentShippingPriceSet) {
    this.currentShippingPriceSet = currentShippingPriceSet;
  }

  
  public int getCurrentSubtotalLineItemsQuantity() {
    return currentSubtotalLineItemsQuantity;
  }

  public void setCurrentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
    this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
  }

  
  public MoneyBag getCurrentSubtotalPriceSet() {
    return currentSubtotalPriceSet;
  }

  public void setCurrentSubtotalPriceSet(MoneyBag currentSubtotalPriceSet) {
    this.currentSubtotalPriceSet = currentSubtotalPriceSet;
  }

  
  public List<TaxLine> getCurrentTaxLines() {
    return currentTaxLines;
  }

  public void setCurrentTaxLines(List<TaxLine> currentTaxLines) {
    this.currentTaxLines = currentTaxLines;
  }

  
  public MoneyBag getCurrentTotalAdditionalFeesSet() {
    return currentTotalAdditionalFeesSet;
  }

  public void setCurrentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
    this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
  }

  
  public MoneyBag getCurrentTotalDiscountsSet() {
    return currentTotalDiscountsSet;
  }

  public void setCurrentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
    this.currentTotalDiscountsSet = currentTotalDiscountsSet;
  }

  
  public MoneyBag getCurrentTotalDutiesSet() {
    return currentTotalDutiesSet;
  }

  public void setCurrentTotalDutiesSet(MoneyBag currentTotalDutiesSet) {
    this.currentTotalDutiesSet = currentTotalDutiesSet;
  }

  
  public MoneyBag getCurrentTotalPriceSet() {
    return currentTotalPriceSet;
  }

  public void setCurrentTotalPriceSet(MoneyBag currentTotalPriceSet) {
    this.currentTotalPriceSet = currentTotalPriceSet;
  }

  
  public MoneyBag getCurrentTotalTaxSet() {
    return currentTotalTaxSet;
  }

  public void setCurrentTotalTaxSet(MoneyBag currentTotalTaxSet) {
    this.currentTotalTaxSet = currentTotalTaxSet;
  }

  
  public String getCurrentTotalWeight() {
    return currentTotalWeight;
  }

  public void setCurrentTotalWeight(String currentTotalWeight) {
    this.currentTotalWeight = currentTotalWeight;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public boolean getCustomerAcceptsMarketing() {
    return customerAcceptsMarketing;
  }

  public void setCustomerAcceptsMarketing(boolean customerAcceptsMarketing) {
    this.customerAcceptsMarketing = customerAcceptsMarketing;
  }

  
  public CustomerJourney getCustomerJourney() {
    return customerJourney;
  }

  public void setCustomerJourney(CustomerJourney customerJourney) {
    this.customerJourney = customerJourney;
  }

  
  public CustomerJourneySummary getCustomerJourneySummary() {
    return customerJourneySummary;
  }

  public void setCustomerJourneySummary(CustomerJourneySummary customerJourneySummary) {
    this.customerJourneySummary = customerJourneySummary;
  }

  
  public String getCustomerLocale() {
    return customerLocale;
  }

  public void setCustomerLocale(String customerLocale) {
    this.customerLocale = customerLocale;
  }

  
  public DiscountApplicationConnection getDiscountApplications() {
    return discountApplications;
  }

  public void setDiscountApplications(DiscountApplicationConnection discountApplications) {
    this.discountApplications = discountApplications;
  }

  
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public MailingAddress getDisplayAddress() {
    return displayAddress;
  }

  public void setDisplayAddress(MailingAddress displayAddress) {
    this.displayAddress = displayAddress;
  }

  
  public OrderDisplayFinancialStatus getDisplayFinancialStatus() {
    return displayFinancialStatus;
  }

  public void setDisplayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
    this.displayFinancialStatus = displayFinancialStatus;
  }

  
  public OrderDisplayFulfillmentStatus getDisplayFulfillmentStatus() {
    return displayFulfillmentStatus;
  }

  public void setDisplayFulfillmentStatus(OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
    this.displayFulfillmentStatus = displayFulfillmentStatus;
  }

  
  public List<OrderDisputeSummary> getDisputes() {
    return disputes;
  }

  public void setDisputes(List<OrderDisputeSummary> disputes) {
    this.disputes = disputes;
  }

  
  public boolean getDutiesIncluded() {
    return dutiesIncluded;
  }

  public void setDutiesIncluded(boolean dutiesIncluded) {
    this.dutiesIncluded = dutiesIncluded;
  }

  
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public boolean getEstimatedTaxes() {
    return estimatedTaxes;
  }

  public void setEstimatedTaxes(boolean estimatedTaxes) {
    this.estimatedTaxes = estimatedTaxes;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public ExchangeV2Connection getExchangeV2s() {
    return exchangeV2s;
  }

  public void setExchangeV2s(ExchangeV2Connection exchangeV2s) {
    this.exchangeV2s = exchangeV2s;
  }

  
  public boolean getFulfillable() {
    return fulfillable;
  }

  public void setFulfillable(boolean fulfillable) {
    this.fulfillable = fulfillable;
  }

  
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  
  public List<Fulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  
  public Count getFulfillmentsCount() {
    return fulfillmentsCount;
  }

  public void setFulfillmentsCount(Count fulfillmentsCount) {
    this.fulfillmentsCount = fulfillmentsCount;
  }

  
  public boolean getFullyPaid() {
    return fullyPaid;
  }

  public void setFullyPaid(boolean fullyPaid) {
    this.fullyPaid = fullyPaid;
  }

  
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLandingPageDisplayText() {
    return landingPageDisplayText;
  }

  public void setLandingPageDisplayText(String landingPageDisplayText) {
    this.landingPageDisplayText = landingPageDisplayText;
  }

  
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public LineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public LocalizationExtensionConnection getLocalizationExtensions() {
    return localizationExtensions;
  }

  public void setLocalizationExtensions(LocalizationExtensionConnection localizationExtensions) {
    this.localizationExtensions = localizationExtensions;
  }

  
  public BusinessEntity getMerchantBusinessEntity() {
    return merchantBusinessEntity;
  }

  public void setMerchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
    this.merchantBusinessEntity = merchantBusinessEntity;
  }

  
  public boolean getMerchantEditable() {
    return merchantEditable;
  }

  public void setMerchantEditable(boolean merchantEditable) {
    this.merchantEditable = merchantEditable;
  }

  
  public List<String> getMerchantEditableErrors() {
    return merchantEditableErrors;
  }

  public void setMerchantEditableErrors(List<String> merchantEditableErrors) {
    this.merchantEditableErrors = merchantEditableErrors;
  }

  
  public OrderApp getMerchantOfRecordApp() {
    return merchantOfRecordApp;
  }

  public void setMerchantOfRecordApp(OrderApp merchantOfRecordApp) {
    this.merchantOfRecordApp = merchantOfRecordApp;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNetPayment() {
    return netPayment;
  }

  public void setNetPayment(String netPayment) {
    this.netPayment = netPayment;
  }

  
  public MoneyBag getNetPaymentSet() {
    return netPaymentSet;
  }

  public void setNetPaymentSet(MoneyBag netPaymentSet) {
    this.netPaymentSet = netPaymentSet;
  }

  
  public LineItemConnection getNonFulfillableLineItems() {
    return nonFulfillableLineItems;
  }

  public void setNonFulfillableLineItems(LineItemConnection nonFulfillableLineItems) {
    this.nonFulfillableLineItems = nonFulfillableLineItems;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public MoneyBag getOriginalTotalAdditionalFeesSet() {
    return originalTotalAdditionalFeesSet;
  }

  public void setOriginalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
    this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
  }

  
  public MoneyBag getOriginalTotalDutiesSet() {
    return originalTotalDutiesSet;
  }

  public void setOriginalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
    this.originalTotalDutiesSet = originalTotalDutiesSet;
  }

  
  public MoneyBag getOriginalTotalPriceSet() {
    return originalTotalPriceSet;
  }

  public void setOriginalTotalPriceSet(MoneyBag originalTotalPriceSet) {
    this.originalTotalPriceSet = originalTotalPriceSet;
  }

  
  public OrderPaymentCollectionDetails getPaymentCollectionDetails() {
    return paymentCollectionDetails;
  }

  public void setPaymentCollectionDetails(OrderPaymentCollectionDetails paymentCollectionDetails) {
    this.paymentCollectionDetails = paymentCollectionDetails;
  }

  
  public List<String> getPaymentGatewayNames() {
    return paymentGatewayNames;
  }

  public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
    this.paymentGatewayNames = paymentGatewayNames;
  }

  
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public Location getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(Location physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  
  public String getReferrerDisplayText() {
    return referrerDisplayText;
  }

  public void setReferrerDisplayText(String referrerDisplayText) {
    this.referrerDisplayText = referrerDisplayText;
  }

  
  public String getReferrerUrl() {
    return referrerUrl;
  }

  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }

  
  public MoneyBag getRefundDiscrepancySet() {
    return refundDiscrepancySet;
  }

  public void setRefundDiscrepancySet(MoneyBag refundDiscrepancySet) {
    this.refundDiscrepancySet = refundDiscrepancySet;
  }

  
  public boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(boolean refundable) {
    this.refundable = refundable;
  }

  
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  
  public String getRegisteredSourceUrl() {
    return registeredSourceUrl;
  }

  public void setRegisteredSourceUrl(String registeredSourceUrl) {
    this.registeredSourceUrl = registeredSourceUrl;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public boolean getRestockable() {
    return restockable;
  }

  public void setRestockable(boolean restockable) {
    this.restockable = restockable;
  }

  
  public Location getRetailLocation() {
    return retailLocation;
  }

  public void setRetailLocation(Location retailLocation) {
    this.retailLocation = retailLocation;
  }

  
  public OrderReturnStatus getReturnStatus() {
    return returnStatus;
  }

  public void setReturnStatus(OrderReturnStatus returnStatus) {
    this.returnStatus = returnStatus;
  }

  
  public ReturnConnection getReturns() {
    return returns;
  }

  public void setReturns(ReturnConnection returns) {
    this.returns = returns;
  }

  
  public OrderRiskSummary getRisk() {
    return risk;
  }

  public void setRisk(OrderRiskSummary risk) {
    this.risk = risk;
  }

  
  public OrderRiskLevel getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(OrderRiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }

  
  public List<OrderRisk> getRisks() {
    return risks;
  }

  public void setRisks(List<OrderRisk> risks) {
    this.risks = risks;
  }

  
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  
  public ShippingLineConnection getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(ShippingLineConnection shippingLines) {
    this.shippingLines = shippingLines;
  }

  
  public ShopifyProtectOrderSummary getShopifyProtect() {
    return shopifyProtect;
  }

  public void setShopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
    this.shopifyProtect = shopifyProtect;
  }

  
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  
  public String getStatusPageUrl() {
    return statusPageUrl;
  }

  public void setStatusPageUrl(String statusPageUrl) {
    this.statusPageUrl = statusPageUrl;
  }

  
  public int getSubtotalLineItemsQuantity() {
    return subtotalLineItemsQuantity;
  }

  public void setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
    this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
  }

  
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  
  public SuggestedRefund getSuggestedRefund() {
    return suggestedRefund;
  }

  public void setSuggestedRefund(SuggestedRefund suggestedRefund) {
    this.suggestedRefund = suggestedRefund;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  
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

  
  public CashRoundingAdjustment getTotalCashRoundingAdjustment() {
    return totalCashRoundingAdjustment;
  }

  public void setTotalCashRoundingAdjustment(CashRoundingAdjustment totalCashRoundingAdjustment) {
    this.totalCashRoundingAdjustment = totalCashRoundingAdjustment;
  }

  
  public String getTotalDiscounts() {
    return totalDiscounts;
  }

  public void setTotalDiscounts(String totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }

  
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  
  public MoneyBag getTotalOutstandingSet() {
    return totalOutstandingSet;
  }

  public void setTotalOutstandingSet(MoneyBag totalOutstandingSet) {
    this.totalOutstandingSet = totalOutstandingSet;
  }

  
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  
  public String getTotalReceived() {
    return totalReceived;
  }

  public void setTotalReceived(String totalReceived) {
    this.totalReceived = totalReceived;
  }

  
  public MoneyBag getTotalReceivedSet() {
    return totalReceivedSet;
  }

  public void setTotalReceivedSet(MoneyBag totalReceivedSet) {
    this.totalReceivedSet = totalReceivedSet;
  }

  
  public String getTotalRefunded() {
    return totalRefunded;
  }

  public void setTotalRefunded(String totalRefunded) {
    this.totalRefunded = totalRefunded;
  }

  
  public MoneyBag getTotalRefundedSet() {
    return totalRefundedSet;
  }

  public void setTotalRefundedSet(MoneyBag totalRefundedSet) {
    this.totalRefundedSet = totalRefundedSet;
  }

  
  public MoneyBag getTotalRefundedShippingSet() {
    return totalRefundedShippingSet;
  }

  public void setTotalRefundedShippingSet(MoneyBag totalRefundedShippingSet) {
    this.totalRefundedShippingSet = totalRefundedShippingSet;
  }

  
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  
  public MoneyV2 getTotalTipReceived() {
    return totalTipReceived;
  }

  public void setTotalTipReceived(MoneyV2 totalTipReceived) {
    this.totalTipReceived = totalTipReceived;
  }

  
  public MoneyBag getTotalTipReceivedSet() {
    return totalTipReceivedSet;
  }

  public void setTotalTipReceivedSet(MoneyBag totalTipReceivedSet) {
    this.totalTipReceivedSet = totalTipReceivedSet;
  }

  
  public String getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(String totalWeight) {
    this.totalWeight = totalWeight;
  }

  
  public List<OrderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransaction> transactions) {
    this.transactions = transactions;
  }

  
  public Count getTransactionsCount() {
    return transactionsCount;
  }

  public void setTransactionsCount(Count transactionsCount) {
    this.transactionsCount = transactionsCount;
  }

  
  public boolean getUnpaid() {
    return unpaid;
  }

  public void setUnpaid(boolean unpaid) {
    this.unpaid = unpaid;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Order{additionalFees='" + additionalFees + "', agreements='" + agreements + "', alerts='" + alerts + "', app='" + app + "', billingAddress='" + billingAddress + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', canMarkAsPaid='" + canMarkAsPaid + "', canNotifyCustomer='" + canNotifyCustomer + "', cancelReason='" + cancelReason + "', cancellation='" + cancellation + "', cancelledAt='" + cancelledAt + "', capturable='" + capturable + "', cartDiscountAmount='" + cartDiscountAmount + "', cartDiscountAmountSet='" + cartDiscountAmountSet + "', channel='" + channel + "', channelInformation='" + channelInformation + "', clientIp='" + clientIp + "', closed='" + closed + "', closedAt='" + closedAt + "', confirmationNumber='" + confirmationNumber + "', confirmed='" + confirmed + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', currentCartDiscountAmountSet='" + currentCartDiscountAmountSet + "', currentShippingPriceSet='" + currentShippingPriceSet + "', currentSubtotalLineItemsQuantity='" + currentSubtotalLineItemsQuantity + "', currentSubtotalPriceSet='" + currentSubtotalPriceSet + "', currentTaxLines='" + currentTaxLines + "', currentTotalAdditionalFeesSet='" + currentTotalAdditionalFeesSet + "', currentTotalDiscountsSet='" + currentTotalDiscountsSet + "', currentTotalDutiesSet='" + currentTotalDutiesSet + "', currentTotalPriceSet='" + currentTotalPriceSet + "', currentTotalTaxSet='" + currentTotalTaxSet + "', currentTotalWeight='" + currentTotalWeight + "', customAttributes='" + customAttributes + "', customer='" + customer + "', customerAcceptsMarketing='" + customerAcceptsMarketing + "', customerJourney='" + customerJourney + "', customerJourneySummary='" + customerJourneySummary + "', customerLocale='" + customerLocale + "', discountApplications='" + discountApplications + "', discountCode='" + discountCode + "', discountCodes='" + discountCodes + "', displayAddress='" + displayAddress + "', displayFinancialStatus='" + displayFinancialStatus + "', displayFulfillmentStatus='" + displayFulfillmentStatus + "', disputes='" + disputes + "', dutiesIncluded='" + dutiesIncluded + "', edited='" + edited + "', email='" + email + "', estimatedTaxes='" + estimatedTaxes + "', events='" + events + "', exchangeV2s='" + exchangeV2s + "', fulfillable='" + fulfillable + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillments='" + fulfillments + "', fulfillmentsCount='" + fulfillmentsCount + "', fullyPaid='" + fullyPaid + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', landingPageDisplayText='" + landingPageDisplayText + "', landingPageUrl='" + landingPageUrl + "', legacyResourceId='" + legacyResourceId + "', lineItems='" + lineItems + "', localizationExtensions='" + localizationExtensions + "', merchantBusinessEntity='" + merchantBusinessEntity + "', merchantEditable='" + merchantEditable + "', merchantEditableErrors='" + merchantEditableErrors + "', merchantOfRecordApp='" + merchantOfRecordApp + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', netPayment='" + netPayment + "', netPaymentSet='" + netPaymentSet + "', nonFulfillableLineItems='" + nonFulfillableLineItems + "', note='" + note + "', originalTotalAdditionalFeesSet='" + originalTotalAdditionalFeesSet + "', originalTotalDutiesSet='" + originalTotalDutiesSet + "', originalTotalPriceSet='" + originalTotalPriceSet + "', paymentCollectionDetails='" + paymentCollectionDetails + "', paymentGatewayNames='" + paymentGatewayNames + "', paymentTerms='" + paymentTerms + "', phone='" + phone + "', physicalLocation='" + physicalLocation + "', poNumber='" + poNumber + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', processedAt='" + processedAt + "', publication='" + publication + "', purchasingEntity='" + purchasingEntity + "', referralCode='" + referralCode + "', referrerDisplayText='" + referrerDisplayText + "', referrerUrl='" + referrerUrl + "', refundDiscrepancySet='" + refundDiscrepancySet + "', refundable='" + refundable + "', refunds='" + refunds + "', registeredSourceUrl='" + registeredSourceUrl + "', requiresShipping='" + requiresShipping + "', restockable='" + restockable + "', retailLocation='" + retailLocation + "', returnStatus='" + returnStatus + "', returns='" + returns + "', risk='" + risk + "', riskLevel='" + riskLevel + "', risks='" + risks + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', shippingLines='" + shippingLines + "', shopifyProtect='" + shopifyProtect + "', sourceIdentifier='" + sourceIdentifier + "', sourceName='" + sourceName + "', staffMember='" + staffMember + "', statusPageUrl='" + statusPageUrl + "', subtotalLineItemsQuantity='" + subtotalLineItemsQuantity + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', suggestedRefund='" + suggestedRefund + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', test='" + test + "', totalCapturable='" + totalCapturable + "', totalCapturableSet='" + totalCapturableSet + "', totalCashRoundingAdjustment='" + totalCashRoundingAdjustment + "', totalDiscounts='" + totalDiscounts + "', totalDiscountsSet='" + totalDiscountsSet + "', totalOutstandingSet='" + totalOutstandingSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalReceived='" + totalReceived + "', totalReceivedSet='" + totalReceivedSet + "', totalRefunded='" + totalRefunded + "', totalRefundedSet='" + totalRefundedSet + "', totalRefundedShippingSet='" + totalRefundedShippingSet + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', totalTipReceived='" + totalTipReceived + "', totalTipReceivedSet='" + totalTipReceivedSet + "', totalWeight='" + totalWeight + "', transactions='" + transactions + "', transactionsCount='" + transactionsCount + "', unpaid='" + unpaid + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
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
    return Objects.hash(additionalFees, agreements, alerts, app, billingAddress, billingAddressMatchesShippingAddress, canMarkAsPaid, canNotifyCustomer, cancelReason, cancellation, cancelledAt, capturable, cartDiscountAmount, cartDiscountAmountSet, channel, channelInformation, clientIp, closed, closedAt, confirmationNumber, confirmed, createdAt, currencyCode, currentCartDiscountAmountSet, currentShippingPriceSet, currentSubtotalLineItemsQuantity, currentSubtotalPriceSet, currentTaxLines, currentTotalAdditionalFeesSet, currentTotalDiscountsSet, currentTotalDutiesSet, currentTotalPriceSet, currentTotalTaxSet, currentTotalWeight, customAttributes, customer, customerAcceptsMarketing, customerJourney, customerJourneySummary, customerLocale, discountApplications, discountCode, discountCodes, displayAddress, displayFinancialStatus, displayFulfillmentStatus, disputes, dutiesIncluded, edited, email, estimatedTaxes, events, exchangeV2s, fulfillable, fulfillmentOrders, fulfillments, fulfillmentsCount, fullyPaid, hasTimelineComment, id, landingPageDisplayText, landingPageUrl, legacyResourceId, lineItems, localizationExtensions, merchantBusinessEntity, merchantEditable, merchantEditableErrors, merchantOfRecordApp, metafield, metafieldDefinitions, metafields, name, netPayment, netPaymentSet, nonFulfillableLineItems, note, originalTotalAdditionalFeesSet, originalTotalDutiesSet, originalTotalPriceSet, paymentCollectionDetails, paymentGatewayNames, paymentTerms, phone, physicalLocation, poNumber, presentmentCurrencyCode, privateMetafield, privateMetafields, processedAt, publication, purchasingEntity, referralCode, referrerDisplayText, referrerUrl, refundDiscrepancySet, refundable, refunds, registeredSourceUrl, requiresShipping, restockable, retailLocation, returnStatus, returns, risk, riskLevel, risks, shippingAddress, shippingLine, shippingLines, shopifyProtect, sourceIdentifier, sourceName, staffMember, statusPageUrl, subtotalLineItemsQuantity, subtotalPrice, subtotalPriceSet, suggestedRefund, tags, taxExempt, taxLines, taxesIncluded, test, totalCapturable, totalCapturableSet, totalCashRoundingAdjustment, totalDiscounts, totalDiscountsSet, totalOutstandingSet, totalPrice, totalPriceSet, totalReceived, totalReceivedSet, totalRefunded, totalRefundedSet, totalRefundedShippingSet, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, totalTipReceived, totalTipReceivedSet, totalWeight, transactions, transactionsCount, unpaid, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<AdditionalFee> additionalFees;

    
    private SalesAgreementConnection agreements;

    
    private List<ResourceAlert> alerts;

    
    private OrderApp app;

    
    private MailingAddress billingAddress;

    
    private boolean billingAddressMatchesShippingAddress;

    
    private boolean canMarkAsPaid;

    
    private boolean canNotifyCustomer;

    
    private OrderCancelReason cancelReason;

    
    private OrderCancellation cancellation;

    
    private OffsetDateTime cancelledAt;

    
    private boolean capturable;

    
    private String cartDiscountAmount;

    
    private MoneyBag cartDiscountAmountSet;

    
    private Channel channel;

    
    private ChannelInformation channelInformation;

    
    private String clientIp;

    
    private boolean closed;

    
    private OffsetDateTime closedAt;

    
    private String confirmationNumber;

    
    private boolean confirmed;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currencyCode;

    
    private MoneyBag currentCartDiscountAmountSet;

    
    private MoneyBag currentShippingPriceSet;

    
    private int currentSubtotalLineItemsQuantity;

    
    private MoneyBag currentSubtotalPriceSet;

    
    private List<TaxLine> currentTaxLines;

    
    private MoneyBag currentTotalAdditionalFeesSet;

    
    private MoneyBag currentTotalDiscountsSet;

    
    private MoneyBag currentTotalDutiesSet;

    
    private MoneyBag currentTotalPriceSet;

    
    private MoneyBag currentTotalTaxSet;

    
    private String currentTotalWeight;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private boolean customerAcceptsMarketing;

    
    private CustomerJourney customerJourney;

    
    private CustomerJourneySummary customerJourneySummary;

    
    private String customerLocale;

    
    private DiscountApplicationConnection discountApplications;

    
    private String discountCode;

    
    private List<String> discountCodes;

    
    private MailingAddress displayAddress;

    
    private OrderDisplayFinancialStatus displayFinancialStatus;

    
    private OrderDisplayFulfillmentStatus displayFulfillmentStatus;

    
    private List<OrderDisputeSummary> disputes;

    
    private boolean dutiesIncluded;

    
    private boolean edited;

    
    private String email;

    
    private boolean estimatedTaxes;

    
    private EventConnection events;

    
    private ExchangeV2Connection exchangeV2s;

    
    private boolean fulfillable;

    
    private FulfillmentOrderConnection fulfillmentOrders;

    
    private List<Fulfillment> fulfillments;

    
    private Count fulfillmentsCount;

    
    private boolean fullyPaid;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private String landingPageDisplayText;

    
    private String landingPageUrl;

    
    private String legacyResourceId;

    
    private LineItemConnection lineItems;

    
    private LocalizationExtensionConnection localizationExtensions;

    
    private BusinessEntity merchantBusinessEntity;

    
    private boolean merchantEditable;

    
    private List<String> merchantEditableErrors;

    
    private OrderApp merchantOfRecordApp;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private String netPayment;

    
    private MoneyBag netPaymentSet;

    
    private LineItemConnection nonFulfillableLineItems;

    
    private String note;

    
    private MoneyBag originalTotalAdditionalFeesSet;

    
    private MoneyBag originalTotalDutiesSet;

    
    private MoneyBag originalTotalPriceSet;

    
    private OrderPaymentCollectionDetails paymentCollectionDetails;

    
    private List<String> paymentGatewayNames;

    
    private PaymentTerms paymentTerms;

    
    private String phone;

    
    private Location physicalLocation;

    
    private String poNumber;

    
    private CurrencyCode presentmentCurrencyCode;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private OffsetDateTime processedAt;

    
    private Publication publication;

    
    private PurchasingEntity purchasingEntity;

    
    private String referralCode;

    
    private String referrerDisplayText;

    
    private String referrerUrl;

    
    private MoneyBag refundDiscrepancySet;

    
    private boolean refundable;

    
    private List<Refund> refunds;

    
    private String registeredSourceUrl;

    
    private boolean requiresShipping;

    
    private boolean restockable;

    
    private Location retailLocation;

    
    private OrderReturnStatus returnStatus;

    
    private ReturnConnection returns;

    
    private OrderRiskSummary risk;

    
    private OrderRiskLevel riskLevel;

    
    private List<OrderRisk> risks;

    
    private MailingAddress shippingAddress;

    
    private ShippingLine shippingLine;

    
    private ShippingLineConnection shippingLines;

    
    private ShopifyProtectOrderSummary shopifyProtect;

    
    private String sourceIdentifier;

    
    private String sourceName;

    
    private StaffMember staffMember;

    
    private String statusPageUrl;

    
    private int subtotalLineItemsQuantity;

    
    private String subtotalPrice;

    
    private MoneyBag subtotalPriceSet;

    
    private SuggestedRefund suggestedRefund;

    
    private List<String> tags;

    
    private boolean taxExempt;

    
    private List<TaxLine> taxLines;

    
    private boolean taxesIncluded;

    
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

    
    private CashRoundingAdjustment totalCashRoundingAdjustment;

    
    private String totalDiscounts;

    
    private MoneyBag totalDiscountsSet;

    
    private MoneyBag totalOutstandingSet;

    
    private String totalPrice;

    
    private MoneyBag totalPriceSet;

    
    private String totalReceived;

    
    private MoneyBag totalReceivedSet;

    
    private String totalRefunded;

    
    private MoneyBag totalRefundedSet;

    
    private MoneyBag totalRefundedShippingSet;

    
    private String totalShippingPrice;

    
    private MoneyBag totalShippingPriceSet;

    
    private String totalTax;

    
    private MoneyBag totalTaxSet;

    
    private MoneyV2 totalTipReceived;

    
    private MoneyBag totalTipReceivedSet;

    
    private String totalWeight;

    
    private List<OrderTransaction> transactions;

    
    private Count transactionsCount;

    
    private boolean unpaid;

    
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
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

    
    public Builder additionalFees(List<AdditionalFee> additionalFees) {
      this.additionalFees = additionalFees;
      return this;
    }

    
    public Builder agreements(SalesAgreementConnection agreements) {
      this.agreements = agreements;
      return this;
    }

    
    public Builder alerts(List<ResourceAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    
    public Builder app(OrderApp app) {
      this.app = app;
      return this;
    }

    
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    
    public Builder canMarkAsPaid(boolean canMarkAsPaid) {
      this.canMarkAsPaid = canMarkAsPaid;
      return this;
    }

    
    public Builder canNotifyCustomer(boolean canNotifyCustomer) {
      this.canNotifyCustomer = canNotifyCustomer;
      return this;
    }

    
    public Builder cancelReason(OrderCancelReason cancelReason) {
      this.cancelReason = cancelReason;
      return this;
    }

    
    public Builder cancellation(OrderCancellation cancellation) {
      this.cancellation = cancellation;
      return this;
    }

    
    public Builder cancelledAt(OffsetDateTime cancelledAt) {
      this.cancelledAt = cancelledAt;
      return this;
    }

    
    public Builder capturable(boolean capturable) {
      this.capturable = capturable;
      return this;
    }

    
    public Builder cartDiscountAmount(String cartDiscountAmount) {
      this.cartDiscountAmount = cartDiscountAmount;
      return this;
    }

    
    public Builder cartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
      this.cartDiscountAmountSet = cartDiscountAmountSet;
      return this;
    }

    
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    
    public Builder channelInformation(ChannelInformation channelInformation) {
      this.channelInformation = channelInformation;
      return this;
    }

    
    public Builder clientIp(String clientIp) {
      this.clientIp = clientIp;
      return this;
    }

    
    public Builder closed(boolean closed) {
      this.closed = closed;
      return this;
    }

    
    public Builder closedAt(OffsetDateTime closedAt) {
      this.closedAt = closedAt;
      return this;
    }

    
    public Builder confirmationNumber(String confirmationNumber) {
      this.confirmationNumber = confirmationNumber;
      return this;
    }

    
    public Builder confirmed(boolean confirmed) {
      this.confirmed = confirmed;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder currentCartDiscountAmountSet(MoneyBag currentCartDiscountAmountSet) {
      this.currentCartDiscountAmountSet = currentCartDiscountAmountSet;
      return this;
    }

    
    public Builder currentShippingPriceSet(MoneyBag currentShippingPriceSet) {
      this.currentShippingPriceSet = currentShippingPriceSet;
      return this;
    }

    
    public Builder currentSubtotalLineItemsQuantity(int currentSubtotalLineItemsQuantity) {
      this.currentSubtotalLineItemsQuantity = currentSubtotalLineItemsQuantity;
      return this;
    }

    
    public Builder currentSubtotalPriceSet(MoneyBag currentSubtotalPriceSet) {
      this.currentSubtotalPriceSet = currentSubtotalPriceSet;
      return this;
    }

    
    public Builder currentTaxLines(List<TaxLine> currentTaxLines) {
      this.currentTaxLines = currentTaxLines;
      return this;
    }

    
    public Builder currentTotalAdditionalFeesSet(MoneyBag currentTotalAdditionalFeesSet) {
      this.currentTotalAdditionalFeesSet = currentTotalAdditionalFeesSet;
      return this;
    }

    
    public Builder currentTotalDiscountsSet(MoneyBag currentTotalDiscountsSet) {
      this.currentTotalDiscountsSet = currentTotalDiscountsSet;
      return this;
    }

    
    public Builder currentTotalDutiesSet(MoneyBag currentTotalDutiesSet) {
      this.currentTotalDutiesSet = currentTotalDutiesSet;
      return this;
    }

    
    public Builder currentTotalPriceSet(MoneyBag currentTotalPriceSet) {
      this.currentTotalPriceSet = currentTotalPriceSet;
      return this;
    }

    
    public Builder currentTotalTaxSet(MoneyBag currentTotalTaxSet) {
      this.currentTotalTaxSet = currentTotalTaxSet;
      return this;
    }

    
    public Builder currentTotalWeight(String currentTotalWeight) {
      this.currentTotalWeight = currentTotalWeight;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder customerAcceptsMarketing(boolean customerAcceptsMarketing) {
      this.customerAcceptsMarketing = customerAcceptsMarketing;
      return this;
    }

    
    public Builder customerJourney(CustomerJourney customerJourney) {
      this.customerJourney = customerJourney;
      return this;
    }

    
    public Builder customerJourneySummary(CustomerJourneySummary customerJourneySummary) {
      this.customerJourneySummary = customerJourneySummary;
      return this;
    }

    
    public Builder customerLocale(String customerLocale) {
      this.customerLocale = customerLocale;
      return this;
    }

    
    public Builder discountApplications(DiscountApplicationConnection discountApplications) {
      this.discountApplications = discountApplications;
      return this;
    }

    
    public Builder discountCode(String discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder displayAddress(MailingAddress displayAddress) {
      this.displayAddress = displayAddress;
      return this;
    }

    
    public Builder displayFinancialStatus(OrderDisplayFinancialStatus displayFinancialStatus) {
      this.displayFinancialStatus = displayFinancialStatus;
      return this;
    }

    
    public Builder displayFulfillmentStatus(
        OrderDisplayFulfillmentStatus displayFulfillmentStatus) {
      this.displayFulfillmentStatus = displayFulfillmentStatus;
      return this;
    }

    
    public Builder disputes(List<OrderDisputeSummary> disputes) {
      this.disputes = disputes;
      return this;
    }

    
    public Builder dutiesIncluded(boolean dutiesIncluded) {
      this.dutiesIncluded = dutiesIncluded;
      return this;
    }

    
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder estimatedTaxes(boolean estimatedTaxes) {
      this.estimatedTaxes = estimatedTaxes;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder exchangeV2s(ExchangeV2Connection exchangeV2s) {
      this.exchangeV2s = exchangeV2s;
      return this;
    }

    
    public Builder fulfillable(boolean fulfillable) {
      this.fulfillable = fulfillable;
      return this;
    }

    
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    
    public Builder fulfillments(List<Fulfillment> fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    
    public Builder fulfillmentsCount(Count fulfillmentsCount) {
      this.fulfillmentsCount = fulfillmentsCount;
      return this;
    }

    
    public Builder fullyPaid(boolean fullyPaid) {
      this.fullyPaid = fullyPaid;
      return this;
    }

    
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder landingPageDisplayText(String landingPageDisplayText) {
      this.landingPageDisplayText = landingPageDisplayText;
      return this;
    }

    
    public Builder landingPageUrl(String landingPageUrl) {
      this.landingPageUrl = landingPageUrl;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder lineItems(LineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder localizationExtensions(LocalizationExtensionConnection localizationExtensions) {
      this.localizationExtensions = localizationExtensions;
      return this;
    }

    
    public Builder merchantBusinessEntity(BusinessEntity merchantBusinessEntity) {
      this.merchantBusinessEntity = merchantBusinessEntity;
      return this;
    }

    
    public Builder merchantEditable(boolean merchantEditable) {
      this.merchantEditable = merchantEditable;
      return this;
    }

    
    public Builder merchantEditableErrors(List<String> merchantEditableErrors) {
      this.merchantEditableErrors = merchantEditableErrors;
      return this;
    }

    
    public Builder merchantOfRecordApp(OrderApp merchantOfRecordApp) {
      this.merchantOfRecordApp = merchantOfRecordApp;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder netPayment(String netPayment) {
      this.netPayment = netPayment;
      return this;
    }

    
    public Builder netPaymentSet(MoneyBag netPaymentSet) {
      this.netPaymentSet = netPaymentSet;
      return this;
    }

    
    public Builder nonFulfillableLineItems(LineItemConnection nonFulfillableLineItems) {
      this.nonFulfillableLineItems = nonFulfillableLineItems;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder originalTotalAdditionalFeesSet(MoneyBag originalTotalAdditionalFeesSet) {
      this.originalTotalAdditionalFeesSet = originalTotalAdditionalFeesSet;
      return this;
    }

    
    public Builder originalTotalDutiesSet(MoneyBag originalTotalDutiesSet) {
      this.originalTotalDutiesSet = originalTotalDutiesSet;
      return this;
    }

    
    public Builder originalTotalPriceSet(MoneyBag originalTotalPriceSet) {
      this.originalTotalPriceSet = originalTotalPriceSet;
      return this;
    }

    
    public Builder paymentCollectionDetails(
        OrderPaymentCollectionDetails paymentCollectionDetails) {
      this.paymentCollectionDetails = paymentCollectionDetails;
      return this;
    }

    
    public Builder paymentGatewayNames(List<String> paymentGatewayNames) {
      this.paymentGatewayNames = paymentGatewayNames;
      return this;
    }

    
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder physicalLocation(Location physicalLocation) {
      this.physicalLocation = physicalLocation;
      return this;
    }

    
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    
    public Builder referralCode(String referralCode) {
      this.referralCode = referralCode;
      return this;
    }

    
    public Builder referrerDisplayText(String referrerDisplayText) {
      this.referrerDisplayText = referrerDisplayText;
      return this;
    }

    
    public Builder referrerUrl(String referrerUrl) {
      this.referrerUrl = referrerUrl;
      return this;
    }

    
    public Builder refundDiscrepancySet(MoneyBag refundDiscrepancySet) {
      this.refundDiscrepancySet = refundDiscrepancySet;
      return this;
    }

    
    public Builder refundable(boolean refundable) {
      this.refundable = refundable;
      return this;
    }

    
    public Builder refunds(List<Refund> refunds) {
      this.refunds = refunds;
      return this;
    }

    
    public Builder registeredSourceUrl(String registeredSourceUrl) {
      this.registeredSourceUrl = registeredSourceUrl;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder restockable(boolean restockable) {
      this.restockable = restockable;
      return this;
    }

    
    public Builder retailLocation(Location retailLocation) {
      this.retailLocation = retailLocation;
      return this;
    }

    
    public Builder returnStatus(OrderReturnStatus returnStatus) {
      this.returnStatus = returnStatus;
      return this;
    }

    
    public Builder returns(ReturnConnection returns) {
      this.returns = returns;
      return this;
    }

    
    public Builder risk(OrderRiskSummary risk) {
      this.risk = risk;
      return this;
    }

    
    public Builder riskLevel(OrderRiskLevel riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }

    
    public Builder risks(List<OrderRisk> risks) {
      this.risks = risks;
      return this;
    }

    
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    
    public Builder shippingLines(ShippingLineConnection shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    
    public Builder shopifyProtect(ShopifyProtectOrderSummary shopifyProtect) {
      this.shopifyProtect = shopifyProtect;
      return this;
    }

    
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    
    public Builder statusPageUrl(String statusPageUrl) {
      this.statusPageUrl = statusPageUrl;
      return this;
    }

    
    public Builder subtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
      this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
      return this;
    }

    
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    
    public Builder suggestedRefund(SuggestedRefund suggestedRefund) {
      this.suggestedRefund = suggestedRefund;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    
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

    
    public Builder totalCashRoundingAdjustment(CashRoundingAdjustment totalCashRoundingAdjustment) {
      this.totalCashRoundingAdjustment = totalCashRoundingAdjustment;
      return this;
    }

    
    public Builder totalDiscounts(String totalDiscounts) {
      this.totalDiscounts = totalDiscounts;
      return this;
    }

    
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    
    public Builder totalOutstandingSet(MoneyBag totalOutstandingSet) {
      this.totalOutstandingSet = totalOutstandingSet;
      return this;
    }

    
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    
    public Builder totalReceived(String totalReceived) {
      this.totalReceived = totalReceived;
      return this;
    }

    
    public Builder totalReceivedSet(MoneyBag totalReceivedSet) {
      this.totalReceivedSet = totalReceivedSet;
      return this;
    }

    
    public Builder totalRefunded(String totalRefunded) {
      this.totalRefunded = totalRefunded;
      return this;
    }

    
    public Builder totalRefundedSet(MoneyBag totalRefundedSet) {
      this.totalRefundedSet = totalRefundedSet;
      return this;
    }

    
    public Builder totalRefundedShippingSet(MoneyBag totalRefundedShippingSet) {
      this.totalRefundedShippingSet = totalRefundedShippingSet;
      return this;
    }

    
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    
    public Builder totalTipReceived(MoneyV2 totalTipReceived) {
      this.totalTipReceived = totalTipReceived;
      return this;
    }

    
    public Builder totalTipReceivedSet(MoneyBag totalTipReceivedSet) {
      this.totalTipReceivedSet = totalTipReceivedSet;
      return this;
    }

    
    public Builder totalWeight(String totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder transactionsCount(Count transactionsCount) {
      this.transactionsCount = transactionsCount;
      return this;
    }

    
    public Builder unpaid(boolean unpaid) {
      this.unpaid = unpaid;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
