package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.SubscriptionBillingCyclesSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingCycleEditedContractFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleEditedContract"));
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> app(
      ) {
     AppProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> billingCycles(
      ) {
     SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("billingCycles", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> billingCycles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("billingCycles", projection);
    getInputArguments().computeIfAbsent("billingCycles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("billingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("billingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("billingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("billingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("billingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("billingCycles").add(sortKeyArg);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> billingCyclesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    SubscriptionBillingCycleConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("billingCycles", projection);
    getInputArguments().computeIfAbsent("billingCycles", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("billingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("billingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("billingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("billingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("billingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("SubscriptionBillingCyclesSortKeys"));
    getInputArguments().get("billingCycles").add(sortKeyArg);
    return projection;
  }

  public CurrencyCodeProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> currencyCode(
      ) {
     CurrencyCodeProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public CustomerProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> customer(
      ) {
     CustomerProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      Boolean showRevoked) {
    CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked, false, null);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> customerPaymentMethodWithVariableReferences(
      String showRevokedReference) {
    CustomerPaymentMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());              
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevokedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SubscriptionDeliveryMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     SubscriptionDeliveryMethodProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> deliveryPrice(
      ) {
     MoneyV2Projection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("deliveryPrice", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionManualDiscountConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> groupedLines(
      ) {
     SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());
     getFields().put("groupedLines", projection);
     return projection;
  }

  public SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> groupedLines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> groupedLinesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionGroupedLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionGroupedLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionContractCalculationProjectedOrderTotalsProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> latestCommittedProjectedOrderTotals(
      ) {
     SubscriptionContractCalculationProjectedOrderTotalsProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationProjectedOrderTotalsProjection<>(this, getRoot());
     getFields().put("latestCommittedProjectedOrderTotals", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> lines(
      ) {
     SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());
     getFields().put("lines", projection);
     return projection;
  }

  public SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> lines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> linesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionLineConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineConnectionProjection<>(this, getRoot());    
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

  public CountProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> linesCount(
      ) {
     CountProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("linesCount", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> orders(
      ) {
     OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("orders").add(reverseArg);
    return projection;
  }

  public OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> ordersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    OrderConnectionProjection<SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("orders").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> appAdminUrl() {
    getFields().put("appAdminUrl", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> lineCount() {
    getFields().put("lineCount", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionBillingCycleEditedContract {");
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
