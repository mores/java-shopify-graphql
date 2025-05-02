package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Order"));
  }

  public OrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> billingAddress() {
     MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public OrderCancelReasonProjection<OrderProjection<PARENT, ROOT>, ROOT> cancelReason() {
     OrderCancelReasonProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderCancelReasonProjection<>(this, getRoot());
     getFields().put("cancelReason", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> currentSubtotalPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentSubtotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalDuties() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalDuties", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalShippingPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalShippingPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> currentTotalTax() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentTotalTax", projection);
     return projection;
  }

  public AttributeProjection<OrderProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> discountApplications(
      ) {
     DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());
     getFields().put("discountApplications", projection);
     return projection;
  }

  public DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> discountApplications(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    DiscountApplicationConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("discountApplications", projection);
    getInputArguments().computeIfAbsent("discountApplications", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountApplications").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountApplications").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountApplications").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountApplications").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountApplications").add(reverseArg);
    return projection;
  }

  public OrderFinancialStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> financialStatus() {
     OrderFinancialStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderFinancialStatusProjection<>(this, getRoot());
     getFields().put("financialStatus", projection);
     return projection;
  }

  public OrderFulfillmentStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> fulfillmentStatus() {
     OrderFulfillmentStatusProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderFulfillmentStatusProjection<>(this, getRoot());
     getFields().put("fulfillmentStatus", projection);
     return projection;
  }

  public OrderLineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> lineItems() {
     OrderLineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public OrderLineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> lineItems(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    OrderLineItemConnectionProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> originalTotalDuties() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotalDuties", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> originalTotalPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotalPrice", projection);
     return projection;
  }

  public MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingAddress() {
     MailingAddressProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public DiscountAllocationProjection<OrderProjection<PARENT, ROOT>, ROOT> shippingDiscountAllocations(
      ) {
     DiscountAllocationProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("shippingDiscountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> subtotalPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> subtotalPriceV2() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalPriceV2", projection);
     return projection;
  }

  public FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> successfulFulfillments() {
     FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("successfulFulfillments", projection);
     return projection;
  }

  public FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> successfulFulfillments(
      Integer first) {
    FulfillmentProjection<OrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("successfulFulfillments", projection);
    getInputArguments().computeIfAbsent("successfulFulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("successfulFulfillments").add(firstArg);
    return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalPriceV2() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalPriceV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalRefunded() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunded", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalRefundedV2() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefundedV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalShippingPrice() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalShippingPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalShippingPriceV2() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalShippingPriceV2", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalTax() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }

  public MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> totalTaxV2() {
     MoneyV2Projection<OrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTaxV2", projection);
     return projection;
  }

  public OrderProjection<PARENT, ROOT> canceledAt() {
    getFields().put("canceledAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> customerLocale() {
    getFields().put("customerLocale", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> customerUrl() {
    getFields().put("customerUrl", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> orderNumber() {
    getFields().put("orderNumber", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderProjection<PARENT, ROOT> statusUrl() {
    getFields().put("statusUrl", null);
    return this;
  }
}
