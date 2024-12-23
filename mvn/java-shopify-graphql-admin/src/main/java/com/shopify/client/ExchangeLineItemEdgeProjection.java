package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeLineItemEdge"));
  }

  public ExchangeLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeLineItemProjection<ExchangeLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ExchangeLineItemProjection<ExchangeLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ExchangeLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
