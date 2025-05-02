package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Count"));
  }

  public CountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<CountProjection<PARENT, ROOT>, ROOT> precision() {
     CountPrecisionProjection<CountProjection<PARENT, ROOT>, ROOT> projection = new CountPrecisionProjection<>(this, getRoot());
     getFields().put("precision", projection);
     return projection;
  }

  public CountProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
