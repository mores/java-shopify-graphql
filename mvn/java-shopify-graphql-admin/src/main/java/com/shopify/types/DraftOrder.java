package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DraftOrder implements CommentEventEmbed, MetafieldReferencer, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasLocalizationExtensions, com.shopify.types.HasMetafields, com.shopify.types.LegacyInteroperability, com.shopify.types.Navigable, com.shopify.types.Node {
  
  private Boolean acceptAutomaticDiscounts;

  
  private boolean allowDiscountCodesInCheckout;

  
  private DraftOrderAppliedDiscount appliedDiscount;

  
  private MailingAddress billingAddress;

  
  private boolean billingAddressMatchesShippingAddress;

  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currencyCode;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private String defaultCursor;

  
  private List<String> discountCodes;

  
  private String email;

  
  private EventConnection events;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private String invoiceEmailTemplateSubject;

  
  private OffsetDateTime invoiceSentAt;

  
  private String invoiceUrl;

  
  private String legacyResourceId;

  
  private DraftOrderLineItemConnection lineItems;

  
  private MoneyBag lineItemsSubtotalPrice;

  
  private LocalizationExtensionConnection localizationExtensions;

  
  private String marketName;

  
  private CountryCode marketRegionCountryCode;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private String note2;

  
  private Order order;

  
  private PaymentTerms paymentTerms;

  
  private String phone;

  
  private List<DraftOrderPlatformDiscount> platformDiscounts;

  
  private String poNumber;

  
  private CurrencyCode presentmentCurrencyCode;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private PurchasingEntity purchasingEntity;

  
  private boolean ready;

  
  private OffsetDateTime reserveInventoryUntil;

  
  private MailingAddress shippingAddress;

  
  private ShippingLine shippingLine;

  
  private DraftOrderStatus status;

  
  private String subtotalPrice;

  
  private MoneyBag subtotalPriceSet;

  
  private List<String> tags;

  
  private boolean taxExempt;

  
  private List<TaxLine> taxLines;

  
  private boolean taxesIncluded;

  
  private MoneyBag totalDiscountsSet;

  
  private MoneyBag totalLineItemsPriceSet;

  
  private String totalPrice;

  
  private MoneyBag totalPriceSet;

  
  private int totalQuantityOfLineItems;

  
  private String totalShippingPrice;

  
  private MoneyBag totalShippingPriceSet;

  
  private String totalTax;

  
  private MoneyBag totalTaxSet;

  
  private String totalWeight;

  
  private String transformerFingerprint;

  
  private OffsetDateTime updatedAt;

  
  private boolean visibleToCustomer;

  
  private List<DraftOrderWarning> warnings;

  public DraftOrder() {
  }

  
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  
  public boolean getAllowDiscountCodesInCheckout() {
    return allowDiscountCodesInCheckout;
  }

  public void setAllowDiscountCodesInCheckout(boolean allowDiscountCodesInCheckout) {
    this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
  }

  
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
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

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
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

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
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

  
  public String getInvoiceEmailTemplateSubject() {
    return invoiceEmailTemplateSubject;
  }

  public void setInvoiceEmailTemplateSubject(String invoiceEmailTemplateSubject) {
    this.invoiceEmailTemplateSubject = invoiceEmailTemplateSubject;
  }

  
  public OffsetDateTime getInvoiceSentAt() {
    return invoiceSentAt;
  }

  public void setInvoiceSentAt(OffsetDateTime invoiceSentAt) {
    this.invoiceSentAt = invoiceSentAt;
  }

  
  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public DraftOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(DraftOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public MoneyBag getLineItemsSubtotalPrice() {
    return lineItemsSubtotalPrice;
  }

  public void setLineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
    this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
  }

  
  public LocalizationExtensionConnection getLocalizationExtensions() {
    return localizationExtensions;
  }

  public void setLocalizationExtensions(LocalizationExtensionConnection localizationExtensions) {
    this.localizationExtensions = localizationExtensions;
  }

  
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
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

  
  public String getNote2() {
    return note2;
  }

  public void setNote2(String note2) {
    this.note2 = note2;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
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

  
  public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
    return platformDiscounts;
  }

  public void setPlatformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
    this.platformDiscounts = platformDiscounts;
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

  
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  
  public boolean getReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  
  public OffsetDateTime getReserveInventoryUntil() {
    return reserveInventoryUntil;
  }

  public void setReserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
    this.reserveInventoryUntil = reserveInventoryUntil;
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

  
  public DraftOrderStatus getStatus() {
    return status;
  }

  public void setStatus(DraftOrderStatus status) {
    this.status = status;
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

  
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
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

  
  public int getTotalQuantityOfLineItems() {
    return totalQuantityOfLineItems;
  }

  public void setTotalQuantityOfLineItems(int totalQuantityOfLineItems) {
    this.totalQuantityOfLineItems = totalQuantityOfLineItems;
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

  
  public String getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(String totalWeight) {
    this.totalWeight = totalWeight;
  }

  
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public boolean getVisibleToCustomer() {
    return visibleToCustomer;
  }

  public void setVisibleToCustomer(boolean visibleToCustomer) {
    this.visibleToCustomer = visibleToCustomer;
  }

  
  public List<DraftOrderWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<DraftOrderWarning> warnings) {
    this.warnings = warnings;
  }

  @Override
  public String toString() {
    return "DraftOrder{acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', allowDiscountCodesInCheckout='" + allowDiscountCodesInCheckout + "', appliedDiscount='" + appliedDiscount + "', billingAddress='" + billingAddress + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', completedAt='" + completedAt + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', customAttributes='" + customAttributes + "', customer='" + customer + "', defaultCursor='" + defaultCursor + "', discountCodes='" + discountCodes + "', email='" + email + "', events='" + events + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', invoiceEmailTemplateSubject='" + invoiceEmailTemplateSubject + "', invoiceSentAt='" + invoiceSentAt + "', invoiceUrl='" + invoiceUrl + "', legacyResourceId='" + legacyResourceId + "', lineItems='" + lineItems + "', lineItemsSubtotalPrice='" + lineItemsSubtotalPrice + "', localizationExtensions='" + localizationExtensions + "', marketName='" + marketName + "', marketRegionCountryCode='" + marketRegionCountryCode + "', metafield='" + metafield + "', metafields='" + metafields + "', name='" + name + "', note2='" + note2 + "', order='" + order + "', paymentTerms='" + paymentTerms + "', phone='" + phone + "', platformDiscounts='" + platformDiscounts + "', poNumber='" + poNumber + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', purchasingEntity='" + purchasingEntity + "', ready='" + ready + "', reserveInventoryUntil='" + reserveInventoryUntil + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', status='" + status + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountsSet='" + totalDiscountsSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalQuantityOfLineItems='" + totalQuantityOfLineItems + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', totalWeight='" + totalWeight + "', transformerFingerprint='" + transformerFingerprint + "', updatedAt='" + updatedAt + "', visibleToCustomer='" + visibleToCustomer + "', warnings='" + warnings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrder that = (DraftOrder) o;
    return Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        allowDiscountCodesInCheckout == that.allowDiscountCodesInCheckout &&
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
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
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
    return Objects.hash(acceptAutomaticDiscounts, allowDiscountCodesInCheckout, appliedDiscount, billingAddress, billingAddressMatchesShippingAddress, completedAt, createdAt, currencyCode, customAttributes, customer, defaultCursor, discountCodes, email, events, hasTimelineComment, id, invoiceEmailTemplateSubject, invoiceSentAt, invoiceUrl, legacyResourceId, lineItems, lineItemsSubtotalPrice, localizationExtensions, marketName, marketRegionCountryCode, metafield, metafields, name, note2, order, paymentTerms, phone, platformDiscounts, poNumber, presentmentCurrencyCode, privateMetafield, privateMetafields, purchasingEntity, ready, reserveInventoryUntil, shippingAddress, shippingLine, status, subtotalPrice, subtotalPriceSet, tags, taxExempt, taxLines, taxesIncluded, totalDiscountsSet, totalLineItemsPriceSet, totalPrice, totalPriceSet, totalQuantityOfLineItems, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, totalWeight, transformerFingerprint, updatedAt, visibleToCustomer, warnings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean acceptAutomaticDiscounts;

    
    private boolean allowDiscountCodesInCheckout;

    
    private DraftOrderAppliedDiscount appliedDiscount;

    
    private MailingAddress billingAddress;

    
    private boolean billingAddressMatchesShippingAddress;

    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currencyCode;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private String defaultCursor;

    
    private List<String> discountCodes;

    
    private String email;

    
    private EventConnection events;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private String invoiceEmailTemplateSubject;

    
    private OffsetDateTime invoiceSentAt;

    
    private String invoiceUrl;

    
    private String legacyResourceId;

    
    private DraftOrderLineItemConnection lineItems;

    
    private MoneyBag lineItemsSubtotalPrice;

    
    private LocalizationExtensionConnection localizationExtensions;

    
    private String marketName;

    
    private CountryCode marketRegionCountryCode;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private String note2;

    
    private Order order;

    
    private PaymentTerms paymentTerms;

    
    private String phone;

    
    private List<DraftOrderPlatformDiscount> platformDiscounts;

    
    private String poNumber;

    
    private CurrencyCode presentmentCurrencyCode;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private PurchasingEntity purchasingEntity;

    
    private boolean ready;

    
    private OffsetDateTime reserveInventoryUntil;

    
    private MailingAddress shippingAddress;

    
    private ShippingLine shippingLine;

    
    private DraftOrderStatus status;

    
    private String subtotalPrice;

    
    private MoneyBag subtotalPriceSet;

    
    private List<String> tags;

    
    private boolean taxExempt;

    
    private List<TaxLine> taxLines;

    
    private boolean taxesIncluded;

    
    private MoneyBag totalDiscountsSet;

    
    private MoneyBag totalLineItemsPriceSet;

    
    private String totalPrice;

    
    private MoneyBag totalPriceSet;

    
    private int totalQuantityOfLineItems;

    
    private String totalShippingPrice;

    
    private MoneyBag totalShippingPriceSet;

    
    private String totalTax;

    
    private MoneyBag totalTaxSet;

    
    private String totalWeight;

    
    private String transformerFingerprint;

    
    private OffsetDateTime updatedAt;

    
    private boolean visibleToCustomer;

    
    private List<DraftOrderWarning> warnings;

    public DraftOrder build() {
      DraftOrder result = new DraftOrder();
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.allowDiscountCodesInCheckout = this.allowDiscountCodesInCheckout;
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
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
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

    
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    
    public Builder allowDiscountCodesInCheckout(boolean allowDiscountCodesInCheckout) {
      this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
      return this;
    }

    
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
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

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
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

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
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

    
    public Builder invoiceEmailTemplateSubject(String invoiceEmailTemplateSubject) {
      this.invoiceEmailTemplateSubject = invoiceEmailTemplateSubject;
      return this;
    }

    
    public Builder invoiceSentAt(OffsetDateTime invoiceSentAt) {
      this.invoiceSentAt = invoiceSentAt;
      return this;
    }

    
    public Builder invoiceUrl(String invoiceUrl) {
      this.invoiceUrl = invoiceUrl;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder lineItems(DraftOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder lineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
      this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
      return this;
    }

    
    public Builder localizationExtensions(LocalizationExtensionConnection localizationExtensions) {
      this.localizationExtensions = localizationExtensions;
      return this;
    }

    
    public Builder marketName(String marketName) {
      this.marketName = marketName;
      return this;
    }

    
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
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

    
    public Builder note2(String note2) {
      this.note2 = note2;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
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

    
    public Builder platformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
      this.platformDiscounts = platformDiscounts;
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

    
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    
    public Builder ready(boolean ready) {
      this.ready = ready;
      return this;
    }

    
    public Builder reserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
      this.reserveInventoryUntil = reserveInventoryUntil;
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

    
    public Builder status(DraftOrderStatus status) {
      this.status = status;
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

    
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
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

    
    public Builder totalQuantityOfLineItems(int totalQuantityOfLineItems) {
      this.totalQuantityOfLineItems = totalQuantityOfLineItems;
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

    
    public Builder totalWeight(String totalWeight) {
      this.totalWeight = totalWeight;
      return this;
    }

    
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder visibleToCustomer(boolean visibleToCustomer) {
      this.visibleToCustomer = visibleToCustomer;
      return this;
    }

    
    public Builder warnings(List<DraftOrderWarning> warnings) {
      this.warnings = warnings;
      return this;
    }
  }
}
