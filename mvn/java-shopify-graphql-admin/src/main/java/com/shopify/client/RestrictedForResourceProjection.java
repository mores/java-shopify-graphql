package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RestrictedForResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RestrictedForResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RestrictedForResource"));
  }

  public RestrictedForResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RestrictedForResourceProjection<PARENT, ROOT> restricted() {
    getFields().put("restricted", null);
    return this;
  }

  public RestrictedForResourceProjection<PARENT, ROOT> restrictedReason() {
    getFields().put("restrictedReason", null);
    return this;
  }
}
