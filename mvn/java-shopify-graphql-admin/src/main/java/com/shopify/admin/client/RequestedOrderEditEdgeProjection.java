package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditEdge"));
  }

  public RequestedOrderEditEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditProjection<RequestedOrderEditEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RequestedOrderEditProjection<RequestedOrderEditEdgeProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RequestedOrderEditEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
