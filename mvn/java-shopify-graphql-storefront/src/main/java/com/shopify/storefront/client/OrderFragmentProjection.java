package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Order"));
  }

  public OrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> billingAddress() {
     MailingAddressProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public OrderCancelReasonProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> cancelReason() {
     OrderCancelReasonProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelReasonProjection<>(this, getRoot());
     getFields().put("cancelReason", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currentSubtotalPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentSubtotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currentTotalDuties() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalDuties", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currentTotalPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currentTotalShippingPrice(
      ) {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalShippingPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> currentTotalTax() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalTax", projection);
     return projection;
  }

  public AttributeProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> discountApplications(
      ) {
     DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());
     getFields().put("discountApplications", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> discountApplications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("discountApplications", projection);
    getInputArguments().computeIfAbsent("discountApplications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discountApplications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discountApplications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discountApplications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discountApplications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discountApplications").add(reverseArg);
    return projection;
  }

  public DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> discountApplicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DiscountApplicationConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("discountApplications", projection);
    getInputArguments().computeIfAbsent("discountApplications", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountApplications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountApplications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discountApplications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discountApplications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discountApplications").add(reverseArg);
    return projection;
  }

  public OrderFinancialStatusProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> financialStatus(
      ) {
     OrderFinancialStatusProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderFinancialStatusProjection<>(this, getRoot());
     getFields().put("financialStatus", projection);
     return projection;
  }

  public OrderFulfillmentStatusProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentStatus(
      ) {
     OrderFulfillmentStatusProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderFulfillmentStatusProjection<>(this, getRoot());
     getFields().put("fulfillmentStatus", projection);
     return projection;
  }

  public OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> lineItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    OrderLineItemConnectionProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> originalTotalDuties() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotalDuties", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> originalTotalPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotalPrice", projection);
     return projection;
  }

  public MailingAddressProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> shippingAddress() {
     MailingAddressProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public DiscountAllocationProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> shippingDiscountAllocations(
      ) {
     DiscountAllocationProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("shippingDiscountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> subtotalPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> subtotalPriceV2() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalPriceV2", projection);
     return projection;
  }

  public FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> successfulFulfillments(
      ) {
     FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("successfulFulfillments", projection);
     return projection;
  }

  public FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> successfulFulfillments(
      Integer first) {
    FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("successfulFulfillments", projection);
    getInputArguments().computeIfAbsent("successfulFulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("successfulFulfillments").add(firstArg);
    return projection;
  }

  public FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> successfulFulfillmentsWithVariableReferences(
      String firstReference) {
    FulfillmentProjection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("successfulFulfillments", projection);
    getInputArguments().computeIfAbsent("successfulFulfillments", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("successfulFulfillments").add(firstArg);
    return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalPriceV2() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalPriceV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalRefunded() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunded", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalRefundedV2() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefundedV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalShippingPrice() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalShippingPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalShippingPriceV2() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalShippingPriceV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalTax() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }

  public MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> totalTaxV2() {
     MoneyV2Projection<OrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTaxV2", projection);
     return projection;
  }

  public OrderFragmentProjection<PARENT, ROOT> canceledAt() {
    getFields().put("canceledAt", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> customerLocale() {
    getFields().put("customerLocale", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> customerUrl() {
    getFields().put("customerUrl", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> orderNumber() {
    getFields().put("orderNumber", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderFragmentProjection<PARENT, ROOT> statusUrl() {
    getFields().put("statusUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Order {");
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
