package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedLineItemEdge"));
  }

  public CalculatedLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemProjection<CalculatedLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CalculatedLineItemProjection<CalculatedLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CalculatedLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
