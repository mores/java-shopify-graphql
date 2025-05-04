package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MailingAddressInput;
import com.shopify.admin.types.SubscriptionBillingCyclesSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionDraftFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionDraftFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDraft"));
  }

  public SubscriptionDraftFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> billingCycle(
      ) {
     SubscriptionBillingCycleProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("billingCycle", projection);
     return projection;
  }

  public SubscriptionBillingPolicyProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SubscriptionBillingPolicyProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> concatenatedBillingCycles(
      ) {
     SubscriptionBillingCycleConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("concatenatedBillingCycles", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> concatenatedBillingCycles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
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

  public CurrencyCodeProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      ) {
     SubscriptionDeliveryOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionResultProjection<>(this, getRoot());
     getFields().put("deliveryOptions", projection);
     return projection;
  }

  public SubscriptionDeliveryOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> deliveryOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionDeliveryOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryOptionResultProjection<>(this, getRoot());    
    getFields().put("deliveryOptions", projection);
    getInputArguments().computeIfAbsent("deliveryOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress);
    getInputArguments().get("deliveryOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SubscriptionDeliveryPolicyProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> deliveryPrice(
      ) {
     MoneyV2Projection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsAdded(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsAdded", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsRemoved(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsRemoved", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsUpdated(
      ) {
     SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discountsUpdated", projection);
     return projection;
  }

  public SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> discountsUpdated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionDiscountConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> linesAdded(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("linesAdded", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> linesAdded(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> linesRemoved(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("linesRemoved", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> linesRemoved(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionContractProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> originalContract(
      ) {
     SubscriptionContractProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("originalContract", projection);
     return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> shippingOptions(
      ) {
     SubscriptionShippingOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionResultProjection<>(this, getRoot());
     getFields().put("shippingOptions", projection);
     return projection;
  }

  public SubscriptionShippingOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> shippingOptions(
      MailingAddressInput deliveryAddress) {
    SubscriptionShippingOptionResultProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionShippingOptionResultProjection<>(this, getRoot());    
    getFields().put("shippingOptions", projection);
    getInputArguments().computeIfAbsent("shippingOptions", k -> new ArrayList<>());                      
    InputArgument deliveryAddressArg = new InputArgument("deliveryAddress", deliveryAddress);
    getInputArguments().get("shippingOptions").add(deliveryAddressArg);
    return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionContractSubscriptionStatusProjection<SubscriptionDraftFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionDraftFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionDraftFragmentProjection<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionDraftFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionDraft {");
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
