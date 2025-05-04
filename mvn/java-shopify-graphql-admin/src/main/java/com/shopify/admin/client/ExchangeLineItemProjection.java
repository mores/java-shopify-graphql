package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeLineItem"));
  }

  public ExchangeLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<ExchangeLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<ExchangeLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public ExchangeLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
