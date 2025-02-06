package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizedFieldConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizedFieldConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizedFieldConnection"));
  }

  public LocalizedFieldConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocalizedFieldEdgeProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     LocalizedFieldEdgeProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public LocalizedFieldProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     LocalizedFieldProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<LocalizedFieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
