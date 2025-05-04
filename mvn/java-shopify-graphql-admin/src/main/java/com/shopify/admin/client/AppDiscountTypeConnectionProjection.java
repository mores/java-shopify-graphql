package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppDiscountTypeConnection"));
  }

  public AppDiscountTypeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeEdgeProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AppDiscountTypeEdgeProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppDiscountTypeProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AppDiscountTypeProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppDiscountTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
