package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditConnection"));
  }

  public RequestedOrderEditConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditEdgeProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     RequestedOrderEditEdgeProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RequestedOrderEditProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     RequestedOrderEditProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RequestedOrderEditConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
