package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizedFieldPurposeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizedFieldPurposeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizedFieldPurpose"));
  }

  public LocalizedFieldPurposeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
