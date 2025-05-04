package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedReturnProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedReturnProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedReturn"));
  }

  public CalculatedReturnProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedExchangeLineItemProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> exchangeLineItems(
      ) {
     CalculatedExchangeLineItemProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> projection = new CalculatedExchangeLineItemProjection<>(this, getRoot());
     getFields().put("exchangeLineItems", projection);
     return projection;
  }

  public CalculatedReturnLineItemProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> returnLineItems(
      ) {
     CalculatedReturnLineItemProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> projection = new CalculatedReturnLineItemProjection<>(this, getRoot());
     getFields().put("returnLineItems", projection);
     return projection;
  }

  public CalculatedReturnShippingFeeProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> returnShippingFee(
      ) {
     CalculatedReturnShippingFeeProjection<CalculatedReturnProjection<PARENT, ROOT>, ROOT> projection = new CalculatedReturnShippingFeeProjection<>(this, getRoot());
     getFields().put("returnShippingFee", projection);
     return projection;
  }

  public CalculatedReturnProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
