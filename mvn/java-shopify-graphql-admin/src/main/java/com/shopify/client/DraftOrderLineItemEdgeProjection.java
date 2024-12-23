package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderLineItemEdge"));
  }

  public DraftOrderLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderLineItemProjection<DraftOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DraftOrderLineItemProjection<DraftOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DraftOrderLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
