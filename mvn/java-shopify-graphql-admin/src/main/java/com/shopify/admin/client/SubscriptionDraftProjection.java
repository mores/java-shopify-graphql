package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MailingAddressInput;
import com.shopify.admin.types.SubscriptionBillingCyclesSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionDraftProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDraft"));
  }

  public SubscriptionDraftProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> billingCycle(
      ) {
     SubscriptionBillingCycleProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("billingCycle", projection);
     return projection;
  }

  public SubscriptionBillingPolicyProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SubscriptionBillingPolicyProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> concatenatedBillingCycles(
      ) {
     SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("concatenatedBillingCycles", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> concatenatedBillingCycles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("concatenatedBillingCycles", projection);
    getInputArguments().computeIfAbsent("concatenatedBillingCycles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("concatenatedBillingCycles").add(sortKeyArg);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> concatenatedBillingCyclesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("concatenatedBillingCycles", projection);
    getInputArguments().computeIfAbsent("concatenatedBillingCycles", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("concatenatedBillingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("concatenatedBillingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("concatenatedBillingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("concatenatedBillingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("concatenatedBillingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("SubscriptionBillingCyclesSortKeys"));
    getInputArguments().get("concatenatedBillingCycles").add(sortKeyArg);
    return projection;
  }

  public CurrencyCodeProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked, false, null);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> customerPaymentMethodWithVariableReferences(
      String showRevokedReference) {
    CustomerPaymentMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());              
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevokedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      ) {
     SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionResultProjection<>(this, getRoot());
     getFields().put("deliveryOptions", projection);
     return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionResultProjection<>(this, getRoot());    
    getFields().put("deliveryOptions", projection);
    getInputArguments().computeIfAbsent("deliveryOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress, false, null);
    getInputArguments().get("deliveryOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryOptionsWithVariableReferences(
      String deliveryAddressReference) {
    SubscriptionDeliveryOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionResultProjection<>(this, getRoot());    
    getFields().put("deliveryOptions", projection);
    getInputArguments().computeIfAbsent("deliveryOptions", k -> new ArrayList<>());              
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddressReference, true, new graphql.language.TypeName("MailingAddressInput"));
    getInputArguments().get("deliveryOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SubscriptionDeliveryPolicyProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> deliveryPrice() {
     MoneyV2Projection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discounts", projection);
    getInputArguments().computeIfAbsent("discounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discounts").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discounts", projection);
    getInputArguments().computeIfAbsent("discounts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discounts").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsAdded(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsAdded", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsAdded", projection);
    getInputArguments().computeIfAbsent("discountsAdded", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discountsAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discountsAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discountsAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discountsAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discountsAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsAddedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsAdded", projection);
    getInputArguments().computeIfAbsent("discountsAdded", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discountsAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsRemoved(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsRemoved", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsRemoved", projection);
    getInputArguments().computeIfAbsent("discountsRemoved", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discountsRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discountsRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discountsRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discountsRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discountsRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsRemovedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsRemoved", projection);
    getInputArguments().computeIfAbsent("discountsRemoved", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discountsRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsUpdated(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsUpdated", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsUpdated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsUpdated", projection);
    getInputArguments().computeIfAbsent("discountsUpdated", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discountsUpdated").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discountsUpdated").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discountsUpdated").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discountsUpdated").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discountsUpdated").add(reverseArg);
    return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> discountsUpdatedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
    getFields().put("discountsUpdated", projection);
    getInputArguments().computeIfAbsent("discountsUpdated", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsUpdated").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsUpdated").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountsUpdated").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountsUpdated").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discountsUpdated").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("lines", projection);
    getInputArguments().computeIfAbsent("lines", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lines").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesAdded(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("linesAdded", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("linesAdded", projection);
    getInputArguments().computeIfAbsent("linesAdded", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("linesAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("linesAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("linesAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("linesAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("linesAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesAddedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("linesAdded", projection);
    getInputArguments().computeIfAbsent("linesAdded", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("linesAdded").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("linesAdded").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("linesAdded").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("linesAdded").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("linesAdded").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesRemoved(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("linesRemoved", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("linesRemoved", projection);
    getInputArguments().computeIfAbsent("linesRemoved", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("linesRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("linesRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("linesRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("linesRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("linesRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> linesRemovedWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionLineConnectionProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
    getFields().put("linesRemoved", projection);
    getInputArguments().computeIfAbsent("linesRemoved", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("linesRemoved").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("linesRemoved").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("linesRemoved").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("linesRemoved").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("linesRemoved").add(reverseArg);
    return projection;
  }

  public SubscriptionContractProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> originalContract(
      ) {
     SubscriptionContractProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("originalContract", projection);
     return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> shippingOptions(
      ) {
     SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionResultProjection<>(this, getRoot());
     getFields().put("shippingOptions", projection);
     return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> shippingOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionResultProjection<>(this, getRoot());    
    getFields().put("shippingOptions", projection);
    getInputArguments().computeIfAbsent("shippingOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress, false, null);
    getInputArguments().get("shippingOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> shippingOptionsWithVariableReferences(
      String deliveryAddressReference) {
    SubscriptionShippingOptionResultProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionResultProjection<>(this, getRoot());    
    getFields().put("shippingOptions", projection);
    getInputArguments().computeIfAbsent("shippingOptions", k -> new ArrayList<>());              
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddressReference, true, new graphql.language.TypeName("MailingAddressInput"));
    getInputArguments().get("shippingOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionDraftProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionDraftProjection<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionDraftProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
