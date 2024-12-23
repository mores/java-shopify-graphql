package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CountryCode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.LocalizationExtensionPurpose;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DraftOrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DraftOrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrder"));
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public MailingAddressProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> billingAddress(
      ) {
     MailingAddressProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public CurrencyCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public EventConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public DraftOrderLineItemConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     DraftOrderLineItemConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public DraftOrderLineItemConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DraftOrderLineItemConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemConnectionProjection<>(this, getRoot());    
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

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItemsSubtotalPrice(
      ) {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("lineItemsSubtotalPrice", projection);
     return projection;
  }

  public LocalizationExtensionConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> localizationExtensions(
      ) {
     LocalizationExtensionConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionConnectionProjection<>(this, getRoot());
     getFields().put("localizationExtensions", projection);
     return projection;
  }

  public LocalizationExtensionConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> localizationExtensions(
      List<CountryCode> countryCodes, List<LocalizationExtensionPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizationExtensionConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionConnectionProjection<>(this, getRoot());    
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

  public CountryCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> marketRegionCountryCode(
      ) {
     CountryCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("marketRegionCountryCode", projection);
     return projection;
  }

  public MetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public OrderProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public PaymentTermsProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> paymentTerms() {
     PaymentTermsProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsProjection<>(this, getRoot());
     getFields().put("paymentTerms", projection);
     return projection;
  }

  public DraftOrderPlatformDiscountProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> platformDiscounts(
      ) {
     DraftOrderPlatformDiscountProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderPlatformDiscountProjection<>(this, getRoot());
     getFields().put("platformDiscounts", projection);
     return projection;
  }

  public CurrencyCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> presentmentCurrencyCode(
      ) {
     CurrencyCodeProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("presentmentCurrencyCode", projection);
     return projection;
  }

  public PrivateMetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      ) {
     PrivateMetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public PurchasingEntityProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> purchasingEntity(
      ) {
     PurchasingEntityProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new PurchasingEntityProjection<>(this, getRoot());
     getFields().put("purchasingEntity", projection);
     return projection;
  }

  public MailingAddressProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     MailingAddressProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public ShippingLineProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> shippingLine() {
     ShippingLineProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public DraftOrderStatusProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> status() {
     DraftOrderStatusProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountsSet() {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> totalLineItemsPriceSet(
      ) {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalLineItemsPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> totalShippingPriceSet(
      ) {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalShippingPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public DraftOrderWarningProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> warnings() {
     DraftOrderWarningProjection<DraftOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderWarningProjection<>(this, getRoot());
     getFields().put("warnings", projection);
     return projection;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> acceptAutomaticDiscounts() {
    getFields().put("acceptAutomaticDiscounts", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> allowDiscountCodesInCheckout() {
    getFields().put("allowDiscountCodesInCheckout", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> billingAddressMatchesShippingAddress() {
    getFields().put("billingAddressMatchesShippingAddress", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> invoiceEmailTemplateSubject() {
    getFields().put("invoiceEmailTemplateSubject", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> invoiceSentAt() {
    getFields().put("invoiceSentAt", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> invoiceUrl() {
    getFields().put("invoiceUrl", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> marketName() {
    getFields().put("marketName", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> note2() {
    getFields().put("note2", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> poNumber() {
    getFields().put("poNumber", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> reserveInventoryUntil() {
    getFields().put("reserveInventoryUntil", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> subtotalPrice() {
    getFields().put("subtotalPrice", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> totalPrice() {
    getFields().put("totalPrice", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> totalQuantityOfLineItems() {
    getFields().put("totalQuantityOfLineItems", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> totalShippingPrice() {
    getFields().put("totalShippingPrice", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> totalWeight() {
    getFields().put("totalWeight", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> transformerFingerprint() {
    getFields().put("transformerFingerprint", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DraftOrderFragmentProjection<PARENT, ROOT> visibleToCustomer() {
    getFields().put("visibleToCustomer", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DraftOrder {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
