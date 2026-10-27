package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedRequestedOrderEditLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRequestedOrderEditLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRequestedOrderEditLineItemEdge"));
  }

  public CalculatedRequestedOrderEditLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedRequestedOrderEditLineItemProjection<CalculatedRequestedOrderEditLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CalculatedRequestedOrderEditLineItemProjection<CalculatedRequestedOrderEditLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CalculatedRequestedOrderEditLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
