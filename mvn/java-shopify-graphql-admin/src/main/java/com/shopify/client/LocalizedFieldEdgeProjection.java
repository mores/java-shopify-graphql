package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocalizedFieldEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocalizedFieldEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocalizedFieldEdge"));
  }

  public LocalizedFieldEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocalizedFieldProjection<LocalizedFieldEdgeProjection<PARENT, ROOT>, ROOT> node() {
     LocalizedFieldProjection<LocalizedFieldEdgeProjection<PARENT, ROOT>, ROOT> projection = new LocalizedFieldProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public LocalizedFieldEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
