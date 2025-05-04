package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionContractFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionContractFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContract"));
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> billingAttempts(
      ) {
     SubscriptionBillingAttemptConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());
     getFields().put("billingAttempts", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> billingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());    
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

  public SubscriptionBillingPolicyProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SubscriptionBillingPolicyProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public CurrencyCodeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SubscriptionDeliveryPolicyProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> deliveryPrice(
      ) {
     MoneyV2Projection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionManualDiscountConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> lastBillingAttemptErrorType(
      ) {
     SubscriptionContractLastBillingErrorTypeProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractLastBillingErrorTypeProjection<>(this, getRoot());
     getFields().put("lastBillingAttemptErrorType", projection);
     return projection;
  }

  public SubscriptionContractLastPaymentStatusProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> lastPaymentStatus(
      ) {
     SubscriptionContractLastPaymentStatusProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractLastPaymentStatusProjection<>(this, getRoot());
     getFields().put("lastPaymentStatus", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public CountProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> linesCount() {
     CountProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("linesCount", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> orders(
      ) {
     OrderConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderConnectionProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
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

  public OrderProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> originOrder() {
     OrderProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("originOrder", projection);
     return projection;
  }

  public SubscriptionContractSubscriptionStatusProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     SubscriptionContractSubscriptionStatusProjection<SubscriptionContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractSubscriptionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> appAdminUrl() {
    getFields().put("appAdminUrl", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> lineCount() {
    getFields().put("lineCount", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> nextBillingDate() {
    getFields().put("nextBillingDate", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> revisionId() {
    getFields().put("revisionId", null);
    return this;
  }

  public SubscriptionContractFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionContract {");
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
