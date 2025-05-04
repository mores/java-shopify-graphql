package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationExtensionPurposeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationExtensionPurposeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizationExtensionPurpose"));
  }

  public LocalizationExtensionPurposeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
