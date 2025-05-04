package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectConnection"));
  }

  public MetaobjectConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectEdgeProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MetaobjectEdgeProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetaobjectProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MetaobjectProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MetaobjectConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
