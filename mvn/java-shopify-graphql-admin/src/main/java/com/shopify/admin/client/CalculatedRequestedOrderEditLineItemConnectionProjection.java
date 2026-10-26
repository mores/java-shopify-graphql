package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRequestedOrderEditLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRequestedOrderEditLineItemConnection"));
  }

  public CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedRequestedOrderEditLineItemEdgeProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CalculatedRequestedOrderEditLineItemEdgeProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CalculatedRequestedOrderEditLineItemProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CalculatedRequestedOrderEditLineItemProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CalculatedRequestedOrderEditLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
