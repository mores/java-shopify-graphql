package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectEdge"));
  }

  public MetaobjectEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectProjection<MetaobjectEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MetaobjectProjection<MetaobjectEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetaobjectEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
