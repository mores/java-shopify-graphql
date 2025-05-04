package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationExtensionKeyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationExtensionKeyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizationExtensionKey"));
  }

  public LocalizationExtensionKeyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
