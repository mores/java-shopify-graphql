package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionContractProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContract"));
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> billingAttempts(
      ) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, this);    
    getFields().put("billingAttempts", projection);
    return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> billingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, this);    
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

  public SubscriptionBillingPolicyProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> billingPolicy(
      ) {
    SubscriptionBillingPolicyProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingPolicyProjection<>(this, this);    
    getFields().put("billingPolicy", projection);
    return projection;
  }

  public CurrencyCodeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public AttributeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> customAttributes(
      ) {
    AttributeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new AttributeProjection<>(this, this);    
    getFields().put("customAttributes", projection);
    return projection;
  }

  public CustomerProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> deliveryMethod(
      ) {
    SubscriptionDeliveryMethodProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryMethodProjection<>(this, this);    
    getFields().put("deliveryMethod", projection);
    return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> deliveryPolicy(
      ) {
    SubscriptionDeliveryPolicyProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDeliveryPolicyProjection<>(this, this);    
    getFields().put("deliveryPolicy", projection);
    return projection;
  }

  public MoneyV2Projection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> deliveryPrice(
      ) {
    MoneyV2Projection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("deliveryPrice", projection);
    return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> discounts(
      ) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountConnectionProjection<>(this, this);    
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

  public SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> lastBillingAttemptErrorType(
      ) {
    SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractLastBillingErrorTypeProjection<>(this, this);    
    getFields().put("lastBillingAttemptErrorType", projection);
    return projection;
  }

  public SubscriptionContractLastPaymentStatusProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> lastPaymentStatus(
      ) {
    SubscriptionContractLastPaymentStatusProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractLastPaymentStatusProjection<>(this, this);    
    getFields().put("lastPaymentStatus", projection);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> lines(
      ) {
    SubscriptionLineConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
    getFields().put("lines", projection);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineConnectionProjection<>(this, this);    
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

  public CountProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> linesCount(
      ) {
    CountProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("linesCount", projection);
    return projection;
  }

  public OrderConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderConnectionProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
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

  public OrderProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> originOrder(
      ) {
    OrderProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("originOrder", projection);
    return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> status(
      ) {
    SubscriptionContractSubscriptionStatusProjection<SubscriptionContractProjectionRoot<PARENT, ROOT>, SubscriptionContractProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> appAdminUrl() {
    getFields().put("appAdminUrl", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> lineCount() {
    getFields().put("lineCount", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> revisionId() {
    getFields().put("revisionId", null);
    return this;
  }

  public SubscriptionContractProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
