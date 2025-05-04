package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplicationEdge"));
  }

  public DiscountApplicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationProjection<DiscountApplicationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DiscountApplicationProjection<DiscountApplicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DiscountApplicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
