package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemEdge"));
  }

  public FulfillmentOrderLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<FulfillmentOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     FulfillmentOrderLineItemProjection<FulfillmentOrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public FulfillmentOrderLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
