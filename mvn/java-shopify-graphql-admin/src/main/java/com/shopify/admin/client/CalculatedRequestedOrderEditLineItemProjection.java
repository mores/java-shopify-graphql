package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedRequestedOrderEditLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRequestedOrderEditLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRequestedOrderEditLineItem"));
  }

  public CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> lineItem(
      ) {
     LineItemProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> subtotalSet(
      ) {
     MoneyBagProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> totalTaxSet(
      ) {
     MoneyBagProjection<CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public CalculatedRequestedOrderEditLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
