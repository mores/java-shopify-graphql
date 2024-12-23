package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldValueTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldValueTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivateMetafieldValueType"));
  }

  public PrivateMetafieldValueTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
