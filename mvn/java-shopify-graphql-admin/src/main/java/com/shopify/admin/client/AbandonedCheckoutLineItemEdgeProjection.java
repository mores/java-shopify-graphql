package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItemEdge"));
  }

  public AbandonedCheckoutLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
