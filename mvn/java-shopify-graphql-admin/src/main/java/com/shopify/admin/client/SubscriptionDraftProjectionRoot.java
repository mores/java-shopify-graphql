package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MailingAddressInput;
import com.shopify.admin.types.SubscriptionBillingCyclesSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionDraftProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraft"));
  }

  public SubscriptionDraftProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> billingCycle(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycle", projection);
    return projection;
  }

  public SubscriptionBillingPolicyProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> billingPolicy(
      ) {
    SubscriptionBillingPolicyProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingPolicyProjection<>(this, this);    
    getFields().put("billingPolicy", projection);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> concatenatedBillingCycles(
      ) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleConnectionProjection<>(this, this);    
    getFields().put("concatenatedBillingCycles", projection);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> concatenatedBillingCycles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleConnectionProjection<>(this, this);    
    getFields().put("concatenatedBillingCycles", projection);
    getInputArguments().computeIfAbsent("concatenatedBillingCycles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("concatenatedBillingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("concatenatedBillingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("concatenatedBillingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("concatenatedBillingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("concatenatedBillingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("concatenatedBillingCycles").add(sortKeyArg);
    return projection;
  }

  public CurrencyCodeProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public AttributeProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> customAttributes(
      ) {
    AttributeProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("customAttributes", projection);
    return projection;
  }

  public CustomerProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> deliveryMethod(
      ) {
    SubscriptionDeliveryMethodProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryMethodProjection<>(this, this);    
    getFields().put("deliveryMethod", projection);
    return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> deliveryOptions(
      ) {
    SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryOptionResultProjection<>(this, this);    
    getFields().put("deliveryOptions", projection);
    return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> deliveryOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryOptionResultProjection<>(this, this);    
    getFields().put("deliveryOptions", projection);
    getInputArguments().computeIfAbsent("deliveryOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress);
    getInputArguments().get("deliveryOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> deliveryPolicy(
      ) {
    SubscriptionDeliveryPolicyProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryPolicyProjection<>(this, this);    
    getFields().put("deliveryPolicy", projection);
    return projection;
  }

  public MoneyV2Projection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> deliveryPrice(
      ) {
    MoneyV2Projection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("deliveryPrice", projection);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discounts(
      ) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    getInputArguments().computeIfAbsent("discounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discounts").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsAdded(
      ) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsAdded", projection);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsAdded", projection);
    getInputArguments().computeIfAbsent("discountsAdded", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountsAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountsAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountsAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountsAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountsAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsRemoved(
      ) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsRemoved", projection);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsRemoved", projection);
    getInputArguments().computeIfAbsent("discountsRemoved", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountsRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountsRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountsRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountsRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountsRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsUpdated(
      ) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsUpdated", projection);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> discountsUpdated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountConnectionProjection<>(this, this);    
    getFields().put("discountsUpdated", projection);
    getInputArguments().computeIfAbsent("discountsUpdated", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountsUpdated").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountsUpdated").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountsUpdated").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountsUpdated").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountsUpdated").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> lines(
      ) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("lines", projection);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> linesAdded(
      ) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("linesAdded", projection);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> linesAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("linesAdded", projection);
    getInputArguments().computeIfAbsent("linesAdded", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("linesAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("linesAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("linesAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("linesAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("linesAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> linesRemoved(
      ) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("linesRemoved", projection);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> linesRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("linesRemoved", projection);
    getInputArguments().computeIfAbsent("linesRemoved", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("linesRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("linesRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("linesRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("linesRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("linesRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionContractProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> originalContract(
      ) {
    SubscriptionContractProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("originalContract", projection);
    return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> shippingOptions(
      ) {
    SubscriptionShippingOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionShippingOptionResultProjection<>(this, this);    
    getFields().put("shippingOptions", projection);
    return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> shippingOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionShippingOptionResultProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionShippingOptionResultProjection<>(this, this);    
    getFields().put("shippingOptions", projection);
    getInputArguments().computeIfAbsent("shippingOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress);
    getInputArguments().get("shippingOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> status(
      ) {
    SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftProjectionRoot<PARENT, ROOT>, SubscriptionDraftProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public SubscriptionDraftProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionDraftProjectionRoot<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionDraftProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
