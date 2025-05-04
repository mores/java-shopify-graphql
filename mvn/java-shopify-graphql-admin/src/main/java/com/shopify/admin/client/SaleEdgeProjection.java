package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SaleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SaleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SaleEdge"));
  }

  public SaleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleProjection<SaleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SaleProjection<SaleEdgeProjection<PARENT, ROOT>, ROOT> projection = new SaleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SaleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
