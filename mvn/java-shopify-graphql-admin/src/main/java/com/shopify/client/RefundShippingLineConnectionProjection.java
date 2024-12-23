package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundShippingLineConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundShippingLineConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundShippingLineConnection"));
  }

  public RefundShippingLineConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundShippingLineEdgeProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     RefundShippingLineEdgeProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RefundShippingLineProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     RefundShippingLineProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RefundShippingLineConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
