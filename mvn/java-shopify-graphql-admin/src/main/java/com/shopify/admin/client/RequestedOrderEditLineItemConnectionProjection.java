package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditLineItemConnection"));
  }

  public RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditLineItemEdgeProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     RequestedOrderEditLineItemEdgeProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RequestedOrderEditLineItemProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     RequestedOrderEditLineItemProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<RequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
