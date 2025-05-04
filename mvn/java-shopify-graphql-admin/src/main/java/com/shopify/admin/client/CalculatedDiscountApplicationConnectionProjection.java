package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDiscountApplicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDiscountApplicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDiscountApplicationConnection"));
  }

  public CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDiscountApplicationEdgeProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CalculatedDiscountApplicationEdgeProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CalculatedDiscountApplicationProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CalculatedDiscountApplicationProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CalculatedDiscountApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
