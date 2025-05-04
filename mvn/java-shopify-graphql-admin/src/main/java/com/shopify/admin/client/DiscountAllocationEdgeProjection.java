package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAllocationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAllocationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAllocationEdge"));
  }

  public DiscountAllocationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAllocationProjection<DiscountAllocationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DiscountAllocationProjection<DiscountAllocationEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountAllocationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
