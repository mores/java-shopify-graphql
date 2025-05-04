package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedLineItemConnection"));
  }

  public CalculatedLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedLineItemEdgeProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CalculatedLineItemEdgeProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CalculatedLineItemProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CalculatedLineItemProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CalculatedLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
