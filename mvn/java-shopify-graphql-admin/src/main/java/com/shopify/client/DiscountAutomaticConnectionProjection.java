package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticConnection"));
  }

  public DiscountAutomaticConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticEdgeProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountAutomaticEdgeProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountAutomaticProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountAutomaticProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DiscountAutomaticConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
