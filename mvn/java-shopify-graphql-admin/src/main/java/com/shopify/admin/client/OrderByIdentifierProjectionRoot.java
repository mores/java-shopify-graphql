package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.Audience;
import com.shopify.admin.types.CountryCode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.LocalizationExtensionPurpose;
import com.shopify.admin.types.LocalizedFieldPurpose;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.NotificationUsage;
import com.shopify.admin.types.RefundDutyInput;
import com.shopify.admin.types.RefundLineItemInput;
import com.shopify.admin.types.RefundMethodAllocation;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OrderByIdentifierProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderByIdentifierProjectionRoot() {
    super(null, null, java.util.Optional.of("Order"));
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AdditionalFeeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> additionalFees(
      ) {
    AdditionalFeeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new AdditionalFeeProjection<>(this, this);    
    getFields().put("additionalFees", projection);
    return projection;
  }

  public SalesAgreementConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> agreements(
      ) {
    SalesAgreementConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SalesAgreementConnectionProjection<>(this, this);    
    getFields().put("agreements", projection);
    return projection;
  }

  public SalesAgreementConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> agreements(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    SalesAgreementConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SalesAgreementConnectionProjection<>(this, this);    
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

  public ResourceAlertProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> alerts(
      ) {
    ResourceAlertProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourceAlertProjection<>(this, this);    
    getFields().put("alerts", projection);
    return projection;
  }

  public OrderAppProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> app(
      ) {
    OrderAppProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderAppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> billingAddress(
      ) {
    MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("billingAddress", projection);
    return projection;
  }

  public OrderCancelReasonProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> cancelReason(
      ) {
    OrderCancelReasonProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderCancelReasonProjection<>(this, this);    
    getFields().put("cancelReason", projection);
    return projection;
  }

  public OrderCancellationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> cancellation(
      ) {
    OrderCancellationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderCancellationProjection<>(this, this);    
    getFields().put("cancellation", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> cartDiscountAmountSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("cartDiscountAmountSet", projection);
    return projection;
  }

  public ChannelProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> channel(
      ) {
    ChannelProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public ChannelInformationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> channelInformation(
      ) {
    ChannelInformationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelInformationProjection<>(this, this);    
    getFields().put("channelInformation", projection);
    return projection;
  }

  public CurrencyCodeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentCartDiscountAmountSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentCartDiscountAmountSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentShippingPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentShippingPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentSubtotalPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentSubtotalPriceSet", projection);
    return projection;
  }

  public TaxLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTaxLines(
      ) {
    TaxLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TaxLineProjection<>(this, this);    
    getFields().put("currentTaxLines", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTotalAdditionalFeesSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentTotalAdditionalFeesSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTotalDiscountsSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentTotalDiscountsSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTotalDutiesSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentTotalDutiesSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTotalPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentTotalPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> currentTotalTaxSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("currentTotalTaxSet", projection);
    return projection;
  }

  public AttributeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> customAttributes(
      ) {
    AttributeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("customAttributes", projection);
    return projection;
  }

  public CustomerProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerJourneyProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> customerJourney(
      ) {
    CustomerJourneyProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CustomerJourneyProjection<>(this, this);    
    getFields().put("customerJourney", projection);
    return projection;
  }

  public CustomerJourneySummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> customerJourneySummary(
      ) {
    CustomerJourneySummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CustomerJourneySummaryProjection<>(this, this);    
    getFields().put("customerJourneySummary", projection);
    return projection;
  }

  public DiscountApplicationConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> discountApplications(
      ) {
    DiscountApplicationConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new DiscountApplicationConnectionProjection<>(this, this);    
    getFields().put("discountApplications", projection);
    return projection;
  }

  public DiscountApplicationConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> discountApplications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountApplicationConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new DiscountApplicationConnectionProjection<>(this, this);    
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

  public MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> displayAddress(
      ) {
    MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("displayAddress", projection);
    return projection;
  }

  public OrderDisplayFinancialStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> displayFinancialStatus(
      ) {
    OrderDisplayFinancialStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderDisplayFinancialStatusProjection<>(this, this);    
    getFields().put("displayFinancialStatus", projection);
    return projection;
  }

  public OrderDisplayFulfillmentStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> displayFulfillmentStatus(
      ) {
    OrderDisplayFulfillmentStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderDisplayFulfillmentStatusProjection<>(this, this);    
    getFields().put("displayFulfillmentStatus", projection);
    return projection;
  }

  public OrderDisputeSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> disputes(
      ) {
    OrderDisputeSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderDisputeSummaryProjection<>(this, this);    
    getFields().put("disputes", projection);
    return projection;
  }

  public EventConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ExchangeV2ConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> exchangeV2s(
      ) {
    ExchangeV2ConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ExchangeV2ConnectionProjection<>(this, this);    
    getFields().put("exchangeV2s", projection);
    return projection;
  }

  public ExchangeV2ConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> exchangeV2s(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ExchangeV2ConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ExchangeV2ConnectionProjection<>(this, this);    
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

  public FulfillmentOrderConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      ) {
    FulfillmentOrderConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      Boolean displayable, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    FulfillmentOrderConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
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

  public FulfillmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> fulfillments(
      ) {
    FulfillmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillments", projection);
    return projection;
  }

  public FulfillmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> fulfillments(
      Integer first, String query) {
    FulfillmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillments", projection);
    getInputArguments().computeIfAbsent("fulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillments").add(firstArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("fulfillments").add(queryArg);
    return projection;
  }

  public CountProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> fulfillmentsCount(
      ) {
    CountProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("fulfillmentsCount", projection);
    return projection;
  }

  public LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LineItemConnectionProjection<>(this, this);    
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

  public LocalizationExtensionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> localizationExtensions(
      ) {
    LocalizationExtensionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocalizationExtensionConnectionProjection<>(this, this);    
    getFields().put("localizationExtensions", projection);
    return projection;
  }

  public LocalizationExtensionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> localizationExtensions(
      List<CountryCode> countryCodes, List<LocalizationExtensionPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizationExtensionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocalizationExtensionConnectionProjection<>(this, this);    
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

  public LocalizedFieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> localizedFields(
      ) {
    LocalizedFieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocalizedFieldConnectionProjection<>(this, this);    
    getFields().put("localizedFields", projection);
    return projection;
  }

  public LocalizedFieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> localizedFields(
      List<CountryCode> countryCodes, List<LocalizedFieldPurpose> purposes, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    LocalizedFieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocalizedFieldConnectionProjection<>(this, this);    
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

  public BusinessEntityProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> merchantBusinessEntity(
      ) {
    BusinessEntityProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BusinessEntityProjection<>(this, this);    
    getFields().put("merchantBusinessEntity", projection);
    return projection;
  }

  public OrderAppProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> merchantOfRecordApp(
      ) {
    OrderAppProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderAppProjection<>(this, this);    
    getFields().put("merchantOfRecordApp", projection);
    return projection;
  }

  public MetafieldProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> netPaymentSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("netPaymentSet", projection);
    return projection;
  }

  public LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> nonFulfillableLineItems(
      ) {
    LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LineItemConnectionProjection<>(this, this);    
    getFields().put("nonFulfillableLineItems", projection);
    return projection;
  }

  public LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> nonFulfillableLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LineItemConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LineItemConnectionProjection<>(this, this);    
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

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> originalTotalAdditionalFeesSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("originalTotalAdditionalFeesSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> originalTotalDutiesSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("originalTotalDutiesSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> originalTotalPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("originalTotalPriceSet", projection);
    return projection;
  }

  public OrderPaymentCollectionDetailsProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> paymentCollectionDetails(
      ) {
    OrderPaymentCollectionDetailsProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderPaymentCollectionDetailsProjection<>(this, this);    
    getFields().put("paymentCollectionDetails", projection);
    return projection;
  }

  public PaymentTermsProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> paymentTerms(
      ) {
    PaymentTermsProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsProjection<>(this, this);    
    getFields().put("paymentTerms", projection);
    return projection;
  }

  public LocationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> physicalLocation(
      ) {
    LocationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("physicalLocation", projection);
    return projection;
  }

  public CurrencyCodeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> presentmentCurrencyCode(
      ) {
    CurrencyCodeProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("presentmentCurrencyCode", projection);
    return projection;
  }

  public PublicationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public PurchasingEntityProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> purchasingEntity(
      ) {
    PurchasingEntityProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PurchasingEntityProjection<>(this, this);    
    getFields().put("purchasingEntity", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> refundDiscrepancySet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("refundDiscrepancySet", projection);
    return projection;
  }

  public RefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> refunds(
      ) {
    RefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new RefundProjection<>(this, this);    
    getFields().put("refunds", projection);
    return projection;
  }

  public RefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> refunds(
      Integer first) {
    RefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new RefundProjection<>(this, this);    
    getFields().put("refunds", projection);
    getInputArguments().computeIfAbsent("refunds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refunds").add(firstArg);
    return projection;
  }

  public LocationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> retailLocation(
      ) {
    LocationProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("retailLocation", projection);
    return projection;
  }

  public OrderReturnStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> returnStatus(
      ) {
    OrderReturnStatusProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderReturnStatusProjection<>(this, this);    
    getFields().put("returnStatus", projection);
    return projection;
  }

  public ReturnConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> returns(
      ) {
    ReturnConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ReturnConnectionProjection<>(this, this);    
    getFields().put("returns", projection);
    return projection;
  }

  public ReturnConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> returns(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ReturnConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ReturnConnectionProjection<>(this, this);    
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

  public OrderRiskSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> risk(
      ) {
    OrderRiskSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderRiskSummaryProjection<>(this, this);    
    getFields().put("risk", projection);
    return projection;
  }

  public OrderRiskLevelProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> riskLevel(
      ) {
    OrderRiskLevelProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderRiskLevelProjection<>(this, this);    
    getFields().put("riskLevel", projection);
    return projection;
  }

  public OrderRiskProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> risks(
      ) {
    OrderRiskProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderRiskProjection<>(this, this);    
    getFields().put("risks", projection);
    return projection;
  }

  public OrderRiskProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> risks(
      Integer first) {
    OrderRiskProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderRiskProjection<>(this, this);    
    getFields().put("risks", projection);
    getInputArguments().computeIfAbsent("risks", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("risks").add(firstArg);
    return projection;
  }

  public MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> shippingAddress(
      ) {
    MailingAddressProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("shippingAddress", projection);
    return projection;
  }

  public ShippingLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> shippingLine(
      ) {
    ShippingLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ShippingLineProjection<>(this, this);    
    getFields().put("shippingLine", projection);
    return projection;
  }

  public ShippingLineConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> shippingLines(
      ) {
    ShippingLineConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ShippingLineConnectionProjection<>(this, this);    
    getFields().put("shippingLines", projection);
    return projection;
  }

  public ShippingLineConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> shippingLines(
      Boolean includeRemovals, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ShippingLineConnectionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ShippingLineConnectionProjection<>(this, this);    
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

  public ShopifyProtectOrderSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> shopifyProtect(
      ) {
    ShopifyProtectOrderSummaryProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ShopifyProtectOrderSummaryProjection<>(this, this);    
    getFields().put("shopifyProtect", projection);
    return projection;
  }

  public StaffMemberProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> staffMember(
      ) {
    StaffMemberProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("staffMember", projection);
    return projection;
  }

  public URLProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> statusPageUrl(
      Audience audience, NotificationUsage notificationUsage) {
    URLProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new URLProjection<>(this, this);    
    getFields().put("statusPageUrl", projection);
    getInputArguments().computeIfAbsent("statusPageUrl", k -> new ArrayList<>());                      
    InputArgument audienceArg = new InputArgument("audience", audience);
    getInputArguments().get("statusPageUrl").add(audienceArg);
    InputArgument notificationUsageArg = new InputArgument("notificationUsage", notificationUsage);
    getInputArguments().get("statusPageUrl").add(notificationUsageArg);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> subtotalPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("subtotalPriceSet", projection);
    return projection;
  }

  public SuggestedRefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> suggestedRefund(
      ) {
    SuggestedRefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SuggestedRefundProjection<>(this, this);    
    getFields().put("suggestedRefund", projection);
    return projection;
  }

  public SuggestedRefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> suggestedRefund(
      String shippingAmount, Boolean refundShipping, List<RefundLineItemInput> refundLineItems,
      List<RefundDutyInput> refundDuties, Boolean suggestFullRefund,
      RefundMethodAllocation refundMethodAllocation) {
    SuggestedRefundProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SuggestedRefundProjection<>(this, this);    
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
    InputArgument refundMethodAllocationArg = new InputArgument("refundMethodAllocation", refundMethodAllocation);
    getInputArguments().get("suggestedRefund").add(refundMethodAllocationArg);
    return projection;
  }

  public TaxLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> taxLines(
      ) {
    TaxLineProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TaxLineProjection<>(this, this);    
    getFields().put("taxLines", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalCapturableSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalCapturableSet", projection);
    return projection;
  }

  public CashRoundingAdjustmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalCashRoundingAdjustment(
      ) {
    CashRoundingAdjustmentProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CashRoundingAdjustmentProjection<>(this, this);    
    getFields().put("totalCashRoundingAdjustment", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalDiscountsSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalDiscountsSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalOutstandingSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalOutstandingSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalReceivedSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalReceivedSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalRefundedSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalRefundedSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalRefundedShippingSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalRefundedShippingSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalShippingPriceSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalShippingPriceSet", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalTaxSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalTaxSet", projection);
    return projection;
  }

  public MoneyV2Projection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalTipReceived(
      ) {
    MoneyV2Projection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalTipReceived", projection);
    return projection;
  }

  public MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> totalTipReceivedSet(
      ) {
    MoneyBagProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalTipReceivedSet", projection);
    return projection;
  }

  public OrderTransactionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    OrderTransactionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public OrderTransactionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, Boolean capturable, Boolean manuallyResolvable) {
    OrderTransactionProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionProjection<>(this, this);    
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

  public CountProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> transactionsCount(
      ) {
    CountProjection<OrderByIdentifierProjectionRoot<PARENT, ROOT>, OrderByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("transactionsCount", projection);
    return projection;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> billingAddressMatchesShippingAddress() {
    getFields().put("billingAddressMatchesShippingAddress", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> canMarkAsPaid() {
    getFields().put("canMarkAsPaid", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> canNotifyCustomer() {
    getFields().put("canNotifyCustomer", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> cancelledAt() {
    getFields().put("cancelledAt", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> capturable() {
    getFields().put("capturable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> cartDiscountAmount() {
    getFields().put("cartDiscountAmount", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> clientIp() {
    getFields().put("clientIp", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> closed() {
    getFields().put("closed", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> closedAt() {
    getFields().put("closedAt", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> confirmationNumber() {
    getFields().put("confirmationNumber", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> confirmed() {
    getFields().put("confirmed", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> currentSubtotalLineItemsQuantity() {
    getFields().put("currentSubtotalLineItemsQuantity", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> currentTotalWeight() {
    getFields().put("currentTotalWeight", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> customerAcceptsMarketing() {
    getFields().put("customerAcceptsMarketing", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> customerLocale() {
    getFields().put("customerLocale", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> discountCode() {
    getFields().put("discountCode", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> dutiesIncluded() {
    getFields().put("dutiesIncluded", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> estimatedTaxes() {
    getFields().put("estimatedTaxes", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> fulfillable() {
    getFields().put("fulfillable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> fullyPaid() {
    getFields().put("fullyPaid", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> landingPageDisplayText() {
    getFields().put("landingPageDisplayText", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> landingPageUrl() {
    getFields().put("landingPageUrl", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> merchantEditableErrors() {
    getFields().put("merchantEditableErrors", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> netPayment() {
    getFields().put("netPayment", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> number() {
    getFields().put("number", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> paymentGatewayNames() {
    getFields().put("paymentGatewayNames", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> poNumber() {
    getFields().put("poNumber", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> referralCode() {
    getFields().put("referralCode", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> referrerDisplayText() {
    getFields().put("referrerDisplayText", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> referrerUrl() {
    getFields().put("referrerUrl", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> refundable() {
    getFields().put("refundable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> registeredSourceUrl() {
    getFields().put("registeredSourceUrl", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> sourceIdentifier() {
    getFields().put("sourceIdentifier", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> sourceName() {
    getFields().put("sourceName", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> statusPageUrl() {
    getFields().put("statusPageUrl", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> subtotalLineItemsQuantity() {
    getFields().put("subtotalLineItemsQuantity", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> subtotalPrice() {
    getFields().put("subtotalPrice", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalCapturable() {
    getFields().put("totalCapturable", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalDiscounts() {
    getFields().put("totalDiscounts", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalPrice() {
    getFields().put("totalPrice", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalReceived() {
    getFields().put("totalReceived", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalRefunded() {
    getFields().put("totalRefunded", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalShippingPrice() {
    getFields().put("totalShippingPrice", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> totalWeight() {
    getFields().put("totalWeight", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> unpaid() {
    getFields().put("unpaid", null);
    return this;
  }

  public OrderByIdentifierProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
