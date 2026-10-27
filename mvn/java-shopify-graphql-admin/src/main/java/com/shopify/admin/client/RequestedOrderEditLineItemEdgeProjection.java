package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditLineItemEdge"));
  }

  public RequestedOrderEditLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditLineItemProjection<RequestedOrderEditLineItemEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     RequestedOrderEditLineItemProjection<RequestedOrderEditLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RequestedOrderEditLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
