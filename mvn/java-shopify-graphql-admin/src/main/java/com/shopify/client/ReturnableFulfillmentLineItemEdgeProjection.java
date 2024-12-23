package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillmentLineItemEdge"));
  }

  public ReturnableFulfillmentLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnableFulfillmentLineItemProjection<ReturnableFulfillmentLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReturnableFulfillmentLineItemProjection<ReturnableFulfillmentLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
