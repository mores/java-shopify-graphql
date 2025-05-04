package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppDiscountTypeEdge"));
  }

  public AppDiscountTypeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<AppDiscountTypeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     AppDiscountTypeProjection<AppDiscountTypeEdgeProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public AppDiscountTypeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
