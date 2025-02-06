package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CountryCode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.LocalizationExtensionPurpose;
import com.shopify.types.LocalizedFieldPurpose;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.RefundDutyInput;
import com.shopify.types.RefundLineItemInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Order"));
  }

  public OrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AdditionalFeeProjection<OrderProjection<PARENT, ROOT>, ROOT> additionalFees() {
     AdditionalFeeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new AdditionalFeeProjection<>(this, getRoot());
     getFields().put("additionalFees", projection);
     return projection;
  }

  public SalesAgreementConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> agreements() {
     SalesAgreementConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new SalesAgreementConnectionProjection<>(this, getRoot());
     getFields().put("agreements", projection);
     return projection;
  }

  public SalesAgreementConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> agreements(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    SalesAgreementConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new SalesAgreementConnectionProjection<>(this, getRoot());    
    getFields().put("agreements", projection);
    getInputArguments().computeIfAbsent("agreements", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("agreements").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("agreements").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("agreements").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("agreements").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("agreements").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("agreements").add(queryArg);
    return projection;
  }

  public ResourceAlertProjection<OrderProjection<PARENT, ROOT>, ROOT> alerts() {
     ResourceAlertProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ResourceAlertProjection<>(this, getRoot());
     getFields().put("alerts", projection);
     return projection;
  }

  public OrderAppProjection<OrderProjection<PARENT, ROOT>, ROOT> app() {
     OrderAppProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderAppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> billingAddress() {
     MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public OrderCancelReasonProjection<OrderProjection<PARENT, ROOT>, ROOT> cancelReason() {
     OrderCancelReasonProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelReasonProjection<>(this, getRoot());
     getFields().put("cancelReason", projection);
     return projection;
  }

  public OrderCancellationProjection<OrderProjection<PARENT, ROOT>, ROOT> cancellation() {
     OrderCancellationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderCancellationProjection<>(this, getRoot());
     getFields().put("cancellation", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> cartDiscountAmountSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("cartDiscountAmountSet", projection);
     return projection;
  }

  public ChannelProjection<OrderProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public ChannelInformationProjection<OrderProjection<PARENT, ROOT>, ROOT> channelInformation() {
     ChannelInformationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ChannelInformationProjection<>(this, getRoot());
     getFields().put("channelInformation", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentCartDiscountAmountSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentCartDiscountAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentShippingPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentShippingPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentSubtotalPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentSubtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTaxLines() {
     TaxLineProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("currentTaxLines", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalAdditionalFeesSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentTotalAdditionalFeesSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalDiscountsSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentTotalDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalDutiesSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentTotalDutiesSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentTotalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalTaxSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentTotalTaxSet", projection);
     return projection;
  }

  public AttributeProjection<OrderProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<OrderProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerJourneyProjection<OrderProjection<PARENT, ROOT>, ROOT> customerJourney() {
     CustomerJourneyProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CustomerJourneyProjection<>(this, getRoot());
     getFields().put("customerJourney", projection);
     return projection;
  }

  public CustomerJourneySummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> customerJourneySummary(
      ) {
     CustomerJourneySummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CustomerJourneySummaryProjection<>(this, getRoot());
     getFields().put("customerJourneySummary", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> discountApplications(
      ) {
     DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());
     getFields().put("discountApplications", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> discountApplications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("discountApplications", projection);
    getInputArguments().computeIfAbsent("discountApplications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountApplications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountApplications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountApplications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountApplications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountApplications").add(reverseArg);
    return projection;
  }

  public MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> displayAddress() {
     MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("displayAddress", projection);
     return projection;
  }

  public OrderDisplayFinancialStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> displayFinancialStatus(
      ) {
     OrderDisplayFinancialStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderDisplayFinancialStatusProjection<>(this, getRoot());
     getFields().put("displayFinancialStatus", projection);
     return projection;
  }

  public OrderDisplayFulfillmentStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> displayFulfillmentStatus(
      ) {
     OrderDisplayFulfillmentStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderDisplayFulfillmentStatusProjection<>(this, getRoot());
     getFields().put("displayFulfillmentStatus", projection);
     return projection;
  }

  public OrderDisputeSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> disputes() {
     OrderDisputeSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderDisputeSummaryProjection<>(this, getRoot());
     getFields().put("disputes", projection);
     return projection;
  }

  public EventConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public ExchangeV2ConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> exchangeV2s() {
     ExchangeV2ConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2ConnectionProjection<>(this, getRoot());
     getFields().put("exchangeV2s", projection);
     return projection;
  }

  public ExchangeV2ConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> exchangeV2s(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ExchangeV2ConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2ConnectionProjection<>(this, getRoot());    
    getFields().put("exchangeV2s", projection);
    getInputArguments().computeIfAbsent("exchangeV2s", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("exchangeV2s").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("exchangeV2s").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("exchangeV2s").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("exchangeV2s").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("exchangeV2s").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("exchangeV2s").add(queryArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Boolean displayable, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    FulfillmentOrderConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument displayableArg = new InputArgument("displayable", displayable);
    getInputArguments().get("fulfillmentOrders").add(displayableArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillments() {
     FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillments", projection);
     return projection;
  }

  public FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillments(Integer first) {
    FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("fulfillments", projection);
    getInputArguments().computeIfAbsent("fulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillments").add(firstArg);
    return projection;
  }

  public CountProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillmentsCount() {
     CountProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("fulfillmentsCount", projection);
     return projection;
  }

  public LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> lineItems() {
     LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> lineItems(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LineItemConnectionProjection<>(this, getRoot());    
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

  public LocalizationExtensionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> localizationExtensions(
      ) {
     LocalizationExtensionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionConnectionProjection<>(this, getRoot());
     getFields().put("localizationExtensions", projection);
     return projection;
  }

  public LocalizationExtensionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> localizationExtensions(
      List<CountryCode> countryCodes, List<LocalizationExtensionPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizationExtensionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionConnectionProjection<>(this, getRoot());    
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

  public LocalizedFieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> localizedFields() {
     LocalizedFieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldConnectionProjection<>(this, getRoot());
     getFields().put("localizedFields", projection);
     return projection;
  }

  public LocalizedFieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> localizedFields(
      List<CountryCode> countryCodes, List<LocalizedFieldPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizedFieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldConnectionProjection<>(this, getRoot());    
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

  public BusinessEntityProjection<OrderProjection<PARENT, ROOT>, ROOT> merchantBusinessEntity() {
     BusinessEntityProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());
     getFields().put("merchantBusinessEntity", projection);
     return projection;
  }

  public OrderAppProjection<OrderProjection<PARENT, ROOT>, ROOT> merchantOfRecordApp() {
     OrderAppProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderAppProjection<>(this, getRoot());
     getFields().put("merchantOfRecordApp", projection);
     return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> netPaymentSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("netPaymentSet", projection);
     return projection;
  }

  public LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> nonFulfillableLineItems(
      ) {
     LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LineItemConnectionProjection<>(this, getRoot());
     getFields().put("nonFulfillableLineItems", projection);
     return projection;
  }

  public LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> nonFulfillableLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LineItemConnectionProjection<>(this, getRoot());    
    getFields().put("nonFulfillableLineItems", projection);
    getInputArguments().computeIfAbsent("nonFulfillableLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("nonFulfillableLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("nonFulfillableLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("nonFulfillableLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("nonFulfillableLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("nonFulfillableLineItems").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> originalTotalAdditionalFeesSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalAdditionalFeesSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> originalTotalDutiesSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalDutiesSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> originalTotalPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalPriceSet", projection);
     return projection;
  }

  public OrderPaymentCollectionDetailsProjection<OrderProjection<PARENT, ROOT>, ROOT> paymentCollectionDetails(
      ) {
     OrderPaymentCollectionDetailsProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentCollectionDetailsProjection<>(this, getRoot());
     getFields().put("paymentCollectionDetails", projection);
     return projection;
  }

  public PaymentTermsProjection<OrderProjection<PARENT, ROOT>, ROOT> paymentTerms() {
     PaymentTermsProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsProjection<>(this, getRoot());
     getFields().put("paymentTerms", projection);
     return projection;
  }

  public LocationProjection<OrderProjection<PARENT, ROOT>, ROOT> physicalLocation() {
     LocationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("physicalLocation", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> presentmentCurrencyCode() {
     CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("presentmentCurrencyCode", projection);
     return projection;
  }

  public PublicationProjection<OrderProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public PurchasingEntityProjection<OrderProjection<PARENT, ROOT>, ROOT> purchasingEntity() {
     PurchasingEntityProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new PurchasingEntityProjection<>(this, getRoot());
     getFields().put("purchasingEntity", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> refundDiscrepancySet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("refundDiscrepancySet", projection);
     return projection;
  }

  public RefundProjection<OrderProjection<PARENT, ROOT>, ROOT> refunds() {
     RefundProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refunds", projection);
     return projection;
  }

  public RefundProjection<OrderProjection<PARENT, ROOT>, ROOT> refunds(Integer first) {
    RefundProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());    
    getFields().put("refunds", projection);
    getInputArguments().computeIfAbsent("refunds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refunds").add(firstArg);
    return projection;
  }

  public LocationProjection<OrderProjection<PARENT, ROOT>, ROOT> retailLocation() {
     LocationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("retailLocation", projection);
     return projection;
  }

  public OrderReturnStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> returnStatus() {
     OrderReturnStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderReturnStatusProjection<>(this, getRoot());
     getFields().put("returnStatus", projection);
     return projection;
  }

  public ReturnConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> returns() {
     ReturnConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ReturnConnectionProjection<>(this, getRoot());
     getFields().put("returns", projection);
     return projection;
  }

  public ReturnConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> returns(Integer first,
      String after, Integer last, String before, Boolean reverse, String query) {
    ReturnConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ReturnConnectionProjection<>(this, getRoot());    
    getFields().put("returns", projection);
    getInputArguments().computeIfAbsent("returns", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returns").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returns").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returns").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returns").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returns").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("returns").add(queryArg);
    return projection;
  }

  public OrderRiskSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> risk() {
     OrderRiskSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskSummaryProjection<>(this, getRoot());
     getFields().put("risk", projection);
     return projection;
  }

  public OrderRiskLevelProjection<OrderProjection<PARENT, ROOT>, ROOT> riskLevel() {
     OrderRiskLevelProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskLevelProjection<>(this, getRoot());
     getFields().put("riskLevel", projection);
     return projection;
  }

  public OrderRiskProjection<OrderProjection<PARENT, ROOT>, ROOT> risks() {
     OrderRiskProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskProjection<>(this, getRoot());
     getFields().put("risks", projection);
     return projection;
  }

  public OrderRiskProjection<OrderProjection<PARENT, ROOT>, ROOT> risks(Integer first) {
    OrderRiskProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderRiskProjection<>(this, getRoot());    
    getFields().put("risks", projection);
    getInputArguments().computeIfAbsent("risks", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("risks").add(firstArg);
    return projection;
  }

  public MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingAddress() {
     MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public ShippingLineProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingLine() {
     ShippingLineProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public ShippingLineConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingLines() {
     ShippingLineConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineConnectionProjection<>(this, getRoot());
     getFields().put("shippingLines", projection);
     return projection;
  }

  public ShippingLineConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingLines(
      Boolean includeRemovals, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ShippingLineConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineConnectionProjection<>(this, getRoot());    
    getFields().put("shippingLines", projection);
    getInputArguments().computeIfAbsent("shippingLines", k -> new ArrayList<>());                      
    InputArgument includeRemovalsArg = new InputArgument("includeRemovals", includeRemovals);
    getInputArguments().get("shippingLines").add(includeRemovalsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("shippingLines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("shippingLines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("shippingLines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("shippingLines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("shippingLines").add(reverseArg);
    return projection;
  }

  public ShopifyProtectOrderSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> shopifyProtect(
      ) {
     ShopifyProtectOrderSummaryProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new ShopifyProtectOrderSummaryProjection<>(this, getRoot());
     getFields().put("shopifyProtect", projection);
     return projection;
  }

  public StaffMemberProjection<OrderProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public SuggestedRefundProjection<OrderProjection<PARENT, ROOT>, ROOT> suggestedRefund() {
     SuggestedRefundProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new SuggestedRefundProjection<>(this, getRoot());
     getFields().put("suggestedRefund", projection);
     return projection;
  }

  public SuggestedRefundProjection<OrderProjection<PARENT, ROOT>, ROOT> suggestedRefund(
      String shippingAmount, Boolean refundShipping, List<RefundLineItemInput> refundLineItems,
      List<RefundDutyInput> refundDuties, Boolean suggestFullRefund) {
    SuggestedRefundProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new SuggestedRefundProjection<>(this, getRoot());    
    getFields().put("suggestedRefund", projection);
    getInputArguments().computeIfAbsent("suggestedRefund", k -> new ArrayList<>());                      
    InputArgument shippingAmountArg = new InputArgument("shippingAmount", shippingAmount);
    getInputArguments().get("suggestedRefund").add(shippingAmountArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping);
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundLineItemsArg = new InputArgument("refundLineItems", refundLineItems);
    getInputArguments().get("suggestedRefund").add(refundLineItemsArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties);
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    InputArgument suggestFullRefundArg = new InputArgument("suggestFullRefund", suggestFullRefund);
    getInputArguments().get("suggestedRefund").add(suggestFullRefundArg);
    return projection;
  }

  public TaxLineProjection<OrderProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalCapturableSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalCapturableSet", projection);
     return projection;
  }

  public CashRoundingAdjustmentProjection<OrderProjection<PARENT, ROOT>, ROOT> totalCashRoundingAdjustment(
      ) {
     CashRoundingAdjustmentProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CashRoundingAdjustmentProjection<>(this, getRoot());
     getFields().put("totalCashRoundingAdjustment", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalDiscountsSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalOutstandingSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalOutstandingSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalReceivedSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalReceivedSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalRefundedSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalRefundedSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalRefundedShippingSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalRefundedShippingSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalShippingPriceSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalShippingPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalTipReceived() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTipReceived", projection);
     return projection;
  }

  public MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> totalTipReceivedSet() {
     MoneyBagProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTipReceivedSet", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderProjection<PARENT, ROOT>, ROOT> transactions() {
     OrderTransactionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderProjection<PARENT, ROOT>, ROOT> transactions(Integer first,
      Boolean capturable, Boolean manuallyResolvable) {
    OrderTransactionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument capturableArg = new InputArgument("capturable", capturable);
    getInputArguments().get("transactions").add(capturableArg);
    InputArgument manuallyResolvableArg = new InputArgument("manuallyResolvable", manuallyResolvable);
    getInputArguments().get("transactions").add(manuallyResolvableArg);
    return projection;
  }

  public CountProjection<OrderProjection<PARENT, ROOT>, ROOT> transactionsCount() {
     CountProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("transactionsCount", projection);
     return projection;
  }

  public OrderProjection<PARENT, ROOT> billingAddressMatchesShippingAddress() {
    getFields().put("billingAddressMatchesShippingAddress", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> canMarkAsPaid() {
    getFields().put("canMarkAsPaid", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> canNotifyCustomer() {
    getFields().put("canNotifyCustomer", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> cancelledAt() {
    getFields().put("cancelledAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> capturable() {
    getFields().put("capturable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> cartDiscountAmount() {
    getFields().put("cartDiscountAmount", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> clientIp() {
    getFields().put("clientIp", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> closed() {
    getFields().put("closed", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> closedAt() {
    getFields().put("closedAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> confirmationNumber() {
    getFields().put("confirmationNumber", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> confirmed() {
    getFields().put("confirmed", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> currentSubtotalLineItemsQuantity() {
    getFields().put("currentSubtotalLineItemsQuantity", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> currentTotalWeight() {
    getFields().put("currentTotalWeight", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> customerAcceptsMarketing() {
    getFields().put("customerAcceptsMarketing", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> customerLocale() {
    getFields().put("customerLocale", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> discountCode() {
    getFields().put("discountCode", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> dutiesIncluded() {
    getFields().put("dutiesIncluded", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> estimatedTaxes() {
    getFields().put("estimatedTaxes", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> fulfillable() {
    getFields().put("fulfillable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> fullyPaid() {
    getFields().put("fullyPaid", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> landingPageDisplayText() {
    getFields().put("landingPageDisplayText", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> landingPageUrl() {
    getFields().put("landingPageUrl", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> merchantEditableErrors() {
    getFields().put("merchantEditableErrors", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> netPayment() {
    getFields().put("netPayment", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> paymentGatewayNames() {
    getFields().put("paymentGatewayNames", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> poNumber() {
    getFields().put("poNumber", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> referralCode() {
    getFields().put("referralCode", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> referrerDisplayText() {
    getFields().put("referrerDisplayText", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> referrerUrl() {
    getFields().put("referrerUrl", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> refundable() {
    getFields().put("refundable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> registeredSourceUrl() {
    getFields().put("registeredSourceUrl", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> sourceIdentifier() {
    getFields().put("sourceIdentifier", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> sourceName() {
    getFields().put("sourceName", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> statusPageUrl() {
    getFields().put("statusPageUrl", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> subtotalLineItemsQuantity() {
    getFields().put("subtotalLineItemsQuantity", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> subtotalPrice() {
    getFields().put("subtotalPrice", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalCapturable() {
    getFields().put("totalCapturable", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalDiscounts() {
    getFields().put("totalDiscounts", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalPrice() {
    getFields().put("totalPrice", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalReceived() {
    getFields().put("totalReceived", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalRefunded() {
    getFields().put("totalRefunded", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalShippingPrice() {
    getFields().put("totalShippingPrice", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> totalWeight() {
    getFields().put("totalWeight", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> unpaid() {
    getFields().put("unpaid", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
