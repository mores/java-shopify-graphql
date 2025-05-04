package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderLineItemEdge"));
  }

  public ReverseFulfillmentOrderLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
