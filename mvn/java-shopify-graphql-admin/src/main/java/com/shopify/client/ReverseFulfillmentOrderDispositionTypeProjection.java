package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderDispositionTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderDispositionTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderDispositionType"));
  }

  public ReverseFulfillmentOrderDispositionTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
