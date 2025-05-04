package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillmentEdge"));
  }

  public ReturnableFulfillmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnableFulfillmentProjection<ReturnableFulfillmentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReturnableFulfillmentProjection<ReturnableFulfillmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnableFulfillmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
