package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionCalculatedContractProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionCalculatedContractProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionCalculatedContract"));
  }

  public SubscriptionCalculatedContractProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingPolicyProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> billingPolicy(
      ) {
     SubscriptionBillingPolicyProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingPolicyProjection<>(this, getRoot());
     getFields().put("billingPolicy", projection);
     return projection;
  }

  public CurrencyCodeProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> customer(
      ) {
     CustomerProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked, false, null);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> customerPaymentMethodWithVariableReferences(
      String showRevokedReference) {
    CustomerPaymentMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());              
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevokedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public SubscriptionDeliveryPolicyProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> deliveryPolicy(
      ) {
     SubscriptionDeliveryPolicyProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryPolicyProjection<>(this, getRoot());
     getFields().put("deliveryPolicy", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> deliveryPrice(
      ) {
     MoneyV2Projection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> groupedLines(
      ) {
     SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());
     getFields().put("groupedLines", projection);
     return projection;
  }

  public SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> groupedLines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());    
    getFields().put("groupedLines", projection);
    getInputArguments().computeIfAbsent("groupedLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("groupedLines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("groupedLines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("groupedLines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("groupedLines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("groupedLines").add(reverseArg);
    return projection;
  }

  public SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> groupedLinesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionGroupedLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());    
    getFields().put("groupedLines", projection);
    getInputArguments().computeIfAbsent("groupedLines", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("groupedLines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("groupedLines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("groupedLines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("groupedLines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("groupedLines").add(reverseArg);
    return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> linesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionLineConnectionProjection<SubscriptionCalculatedContractProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionCalculatedContractProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
