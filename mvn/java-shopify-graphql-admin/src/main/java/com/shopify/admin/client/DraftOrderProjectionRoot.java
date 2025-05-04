package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CountryCode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.LocalizationExtensionPurpose;
import com.shopify.admin.types.LocalizedFieldPurpose;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DraftOrderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrder"));
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> appliedDiscount(
      ) {
    DraftOrderAppliedDiscountProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderAppliedDiscountProjection<>(this, this);    
    getFields().put("appliedDiscount", projection);
    return projection;
  }

  public MailingAddressProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> billingAddress(
      ) {
    MailingAddressProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("billingAddress", projection);
    return projection;
  }

  public CurrencyCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public AttributeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> customAttributes(
      ) {
    AttributeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("customAttributes", projection);
    return projection;
  }

  public CustomerProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public EventConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public DraftOrderLineItemConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    DraftOrderLineItemConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public DraftOrderLineItemConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DraftOrderLineItemConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> lineItemsSubtotalPrice(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("lineItemsSubtotalPrice", projection);
    return projection;
  }

  public LocalizationExtensionConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> localizationExtensions(
      ) {
    LocalizationExtensionConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new LocalizationExtensionConnectionProjection<>(this, this);    
    getFields().put("localizationExtensions", projection);
    return projection;
  }

  public LocalizationExtensionConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> localizationExtensions(
      List<CountryCode> countryCodes, List<LocalizationExtensionPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizationExtensionConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new LocalizationExtensionConnectionProjection<>(this, this);    
    getFields().put("localizationExtensions", projection);
    getInputArguments().computeIfAbsent("localizationExtensions", k -> new ArrayList<>());                      
    InputArgument countryCodesArg = new InputArgument("countryCodes", countryCodes);
    getInputArguments().get("localizationExtensions").add(countryCodesArg);
    InputArgument purposesArg = new InputArgument("purposes", purposes);
    getInputArguments().get("localizationExtensions").add(purposesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("localizationExtensions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("localizationExtensions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("localizationExtensions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("localizationExtensions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("localizationExtensions").add(reverseArg);
    return projection;
  }

  public LocalizedFieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> localizedFields(
      ) {
    LocalizedFieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new LocalizedFieldConnectionProjection<>(this, this);    
    getFields().put("localizedFields", projection);
    return projection;
  }

  public LocalizedFieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> localizedFields(
      List<CountryCode> countryCodes, List<LocalizedFieldPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizedFieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new LocalizedFieldConnectionProjection<>(this, this);    
    getFields().put("localizedFields", projection);
    getInputArguments().computeIfAbsent("localizedFields", k -> new ArrayList<>());                      
    InputArgument countryCodesArg = new InputArgument("countryCodes", countryCodes);
    getInputArguments().get("localizedFields").add(countryCodesArg);
    InputArgument purposesArg = new InputArgument("purposes", purposes);
    getInputArguments().get("localizedFields").add(purposesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("localizedFields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("localizedFields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("localizedFields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("localizedFields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("localizedFields").add(reverseArg);
    return projection;
  }

  public CountryCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> marketRegionCountryCode(
      ) {
    CountryCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("marketRegionCountryCode", projection);
    return projection;
  }

  public MetafieldProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public OrderProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public PaymentTermsProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> paymentTerms(
      ) {
    PaymentTermsProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsProjection<>(this, this);    
    getFields().put("paymentTerms", projection);
    return projection;
  }

  public DraftOrderPlatformDiscountProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> platformDiscounts(
      ) {
    DraftOrderPlatformDiscountProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderPlatformDiscountProjection<>(this, this);    
    getFields().put("platformDiscounts", projection);
    return projection;
  }

  public CurrencyCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> presentmentCurrencyCode(
      ) {
    CurrencyCodeProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("presentmentCurrencyCode", projection);
    return projection;
  }

  public PurchasingEntityProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> purchasingEntity(
      ) {
    PurchasingEntityProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new PurchasingEntityProjection<>(this, this);    
    getFields().put("purchasingEntity", projection);
    return projection;
  }

  public MailingAddressProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> shippingAddress(
      ) {
    MailingAddressProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("shippingAddress", projection);
    return projection;
  }

  public ShippingLineProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> shippingLine(
      ) {
    ShippingLineProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new ShippingLineProjection<>(this, this);    
    getFields().put("shippingLine", projection);
    return projection;
  }

  public DraftOrderStatusProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> status(
      ) {
    DraftOrderStatusProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> subtotalPriceSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("subtotalPriceSet", projection);
    return projection;
  }

  public TaxLineProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> taxLines(
      ) {
    TaxLineProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new TaxLineProjection<>(this, this);    
    getFields().put("taxLines", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> totalDiscountsSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalDiscountsSet", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> totalLineItemsPriceSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalLineItemsPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> totalPriceSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> totalShippingPriceSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalShippingPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> totalTaxSet(
      ) {
    MoneyBagProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalTaxSet", projection);
    return projection;
  }

  public DraftOrderWarningProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    DraftOrderWarningProjection<DraftOrderProjectionRoot<PARENT, ROOT>, DraftOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> acceptAutomaticDiscounts() {
    getFields().put("acceptAutomaticDiscounts", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> allVariantPricesOverridden() {
    getFields().put("allVariantPricesOverridden", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> allowDiscountCodesInCheckout() {
    getFields().put("allowDiscountCodesInCheckout", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> anyVariantPricesOverridden() {
    getFields().put("anyVariantPricesOverridden", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> billingAddressMatchesShippingAddress() {
    getFields().put("billingAddressMatchesShippingAddress", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> invoiceEmailTemplateSubject() {
    getFields().put("invoiceEmailTemplateSubject", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> invoiceSentAt() {
    getFields().put("invoiceSentAt", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> invoiceUrl() {
    getFields().put("invoiceUrl", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> marketName() {
    getFields().put("marketName", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> note2() {
    getFields().put("note2", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> poNumber() {
    getFields().put("poNumber", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> reserveInventoryUntil() {
    getFields().put("reserveInventoryUntil", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> subtotalPrice() {
    getFields().put("subtotalPrice", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> totalPrice() {
    getFields().put("totalPrice", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> totalQuantityOfLineItems() {
    getFields().put("totalQuantityOfLineItems", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> totalShippingPrice() {
    getFields().put("totalShippingPrice", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> totalWeight() {
    getFields().put("totalWeight", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> transformerFingerprint() {
    getFields().put("transformerFingerprint", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DraftOrderProjectionRoot<PARENT, ROOT> visibleToCustomer() {
    getFields().put("visibleToCustomer", null);
    return this;
  }
}
