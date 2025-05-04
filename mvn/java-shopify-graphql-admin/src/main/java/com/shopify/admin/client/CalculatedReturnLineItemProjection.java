package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedReturnLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedReturnLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedReturnLineItem"));
  }

  public CalculatedReturnLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentLineItemProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public CalculatedRestockingFeeProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> restockingFee(
      ) {
     CalculatedRestockingFeeProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRestockingFeeProjection<>(this, getRoot());
     getFields().put("restockingFee", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> subtotalBeforeOrderDiscountsSet(
      ) {
     MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalBeforeOrderDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> subtotalSet() {
     MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<CalculatedReturnLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public CalculatedReturnLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CalculatedReturnLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
