package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizedFieldKeyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizedFieldKeyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizedFieldKey"));
  }

  public LocalizedFieldKeyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
