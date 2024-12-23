package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAllocationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAllocationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAllocationConnection"));
  }

  public DiscountAllocationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAllocationEdgeProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountAllocationEdgeProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountAllocationProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountAllocationProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DiscountAllocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
