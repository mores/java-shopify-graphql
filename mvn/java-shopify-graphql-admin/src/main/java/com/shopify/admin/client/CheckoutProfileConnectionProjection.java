package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutProfileConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutProfileConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutProfileConnection"));
  }

  public CheckoutProfileConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileEdgeProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CheckoutProfileEdgeProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CheckoutProfileProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CheckoutProfileProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CheckoutProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
