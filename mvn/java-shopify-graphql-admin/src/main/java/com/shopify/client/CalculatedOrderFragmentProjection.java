package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CalculatedOrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CalculatedOrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedOrder"));
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDiscountApplicationConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> addedDiscountApplications(
      ) {
     CalculatedDiscountApplicationConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationConnectionProjection<>(this, getRoot());
     getFields().put("addedDiscountApplications", projection);
     return projection;
  }

  public CalculatedDiscountApplicationConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> addedDiscountApplications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CalculatedDiscountApplicationConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("addedDiscountApplications", projection);
    getInputArguments().computeIfAbsent("addedDiscountApplications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addedDiscountApplications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addedDiscountApplications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addedDiscountApplications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addedDiscountApplications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addedDiscountApplications").add(reverseArg);
    return projection;
  }

  public CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> addedLineItems(
      ) {
     CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemConnectionProjection<>(this, getRoot());
     getFields().put("addedLineItems", projection);
     return projection;
  }

  public CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> addedLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("addedLineItems", projection);
    getInputArguments().computeIfAbsent("addedLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addedLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addedLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addedLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addedLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addedLineItems").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> cartDiscountAmountSet(
      ) {
     MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("cartDiscountAmountSet", projection);
     return projection;
  }

  public CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    CalculatedLineItemConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public OrderProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> originalOrder() {
     OrderProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("originalOrder", projection);
     return projection;
  }

  public CalculatedShippingLineProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> shippingLines(
      ) {
     CalculatedShippingLineProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLines", projection);
     return projection;
  }

  public OrderStagedChangeConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> stagedChanges(
      ) {
     OrderStagedChangeConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeConnectionProjection<>(this, getRoot());
     getFields().put("stagedChanges", projection);
     return projection;
  }

  public OrderStagedChangeConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> stagedChanges(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderStagedChangeConnectionProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeConnectionProjection<>(this, getRoot());    
    getFields().put("stagedChanges", projection);
    getInputArguments().computeIfAbsent("stagedChanges", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("stagedChanges").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("stagedChanges").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("stagedChanges").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("stagedChanges").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("stagedChanges").add(reverseArg);
    return projection;
  }

  public MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> subtotalPriceSet(
      ) {
     MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> totalOutstandingSet(
      ) {
     MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalOutstandingSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<CalculatedOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> committed() {
    getFields().put("committed", null);
    return this;
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> notificationPreviewHtml() {
    getFields().put("notificationPreviewHtml", null);
    return this;
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> notificationPreviewTitle() {
    getFields().put("notificationPreviewTitle", null);
    return this;
  }

  public CalculatedOrderFragmentProjection<PARENT, ROOT> subtotalLineItemsQuantity() {
    getFields().put("subtotalLineItemsQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CalculatedOrder {");
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
