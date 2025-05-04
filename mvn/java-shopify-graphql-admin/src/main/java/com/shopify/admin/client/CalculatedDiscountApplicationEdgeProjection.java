package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDiscountApplicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDiscountApplicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDiscountApplicationEdge"));
  }

  public CalculatedDiscountApplicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDiscountApplicationProjection<CalculatedDiscountApplicationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CalculatedDiscountApplicationProjection<CalculatedDiscountApplicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CalculatedDiscountApplicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
