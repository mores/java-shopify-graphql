package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutProfileEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutProfileEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutProfileEdge"));
  }

  public CheckoutProfileEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileProjection<CheckoutProfileEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CheckoutProfileProjection<CheckoutProfileEdgeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CheckoutProfileEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
