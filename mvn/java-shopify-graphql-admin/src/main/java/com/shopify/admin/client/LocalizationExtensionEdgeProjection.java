package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationExtensionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationExtensionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizationExtensionEdge"));
  }

  public LocalizationExtensionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocalizationExtensionProjection<LocalizationExtensionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     LocalizationExtensionProjection<LocalizationExtensionEdgeProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public LocalizationExtensionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
