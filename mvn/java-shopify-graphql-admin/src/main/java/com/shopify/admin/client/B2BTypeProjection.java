package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class B2BTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public B2BTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("B2BType"));
  }

  public B2BTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public B2BTypeProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
