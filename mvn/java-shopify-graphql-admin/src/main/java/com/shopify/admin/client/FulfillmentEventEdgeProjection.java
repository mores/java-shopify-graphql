package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentEventEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentEventEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentEventEdge"));
  }

  public FulfillmentEventEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEventProjection<FulfillmentEventEdgeProjection<PARENT, ROOT>, ROOT> node() {
     FulfillmentEventProjection<FulfillmentEventEdgeProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public FulfillmentEventEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
