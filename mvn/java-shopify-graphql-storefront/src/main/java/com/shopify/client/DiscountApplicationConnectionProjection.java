package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplicationConnection"));
  }

  public DiscountApplicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationEdgeProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountApplicationEdgeProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountApplicationProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountApplicationProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
