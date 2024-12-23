package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionContractProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContract"));
  }

  public SubscriptionContractProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> billingAttempts(
      ) {
     SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());
     getFields().put("billingAttempts", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> billingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());    
    getFields().put("billingAttempts", projection);
    getInputArguments().computeIfAbsent("billingAttempts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("billingAttempts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("billingAttempts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("billingAttempts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("billingAttempts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("billingAttempts").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingPolicyProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SubscriptionBillingPolicyProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public CurrencyCodeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SubscriptionDeliveryPolicyProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> deliveryPrice() {
     MoneyV2Projection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> lastBillingAttemptErrorType(
      ) {
     SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractLastBillingErrorTypeProjection<>(this, getRoot());
     getFields().put("lastBillingAttemptErrorType", projection);
     return projection;
  }

  public SubscriptionContractLastPaymentStatusProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> lastPaymentStatus(
      ) {
     SubscriptionContractLastPaymentStatusProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractLastPaymentStatusProjection<>(this, getRoot());
     getFields().put("lastPaymentStatus", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public CountProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> linesCount() {
     CountProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("linesCount", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderConnectionProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    return projection;
  }

  public OrderProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> originOrder() {
     OrderProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("originOrder", projection);
     return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionContractSubscriptionStatusProjection<SubscriptionContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionContractProjection<PARENT, ROOT> appAdminUrl() {
    getFields().put("appAdminUrl", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> lineCount() {
    getFields().put("lineCount", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> revisionId() {
    getFields().put("revisionId", null);
    return this;
  }

  public SubscriptionContractProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
