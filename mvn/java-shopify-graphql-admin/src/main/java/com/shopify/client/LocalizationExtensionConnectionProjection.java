package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizationExtensionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizationExtensionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizationExtensionConnection"));
  }

  public LocalizationExtensionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocalizationExtensionEdgeProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     LocalizationExtensionEdgeProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public LocalizationExtensionProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     LocalizationExtensionProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocalizationExtensionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<LocalizationExtensionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
