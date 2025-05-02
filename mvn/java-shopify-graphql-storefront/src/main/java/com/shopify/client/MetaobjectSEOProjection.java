package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectSEOProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectSEOProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectSEO"));
  }

  public MetaobjectSEOProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectFieldProjection<MetaobjectSEOProjection<PARENT, ROOT>, ROOT> description() {
     MetaobjectFieldProjection<MetaobjectSEOProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("description", projection);
     return projection;
  }

  public MetaobjectFieldProjection<MetaobjectSEOProjection<PARENT, ROOT>, ROOT> title() {
     MetaobjectFieldProjection<MetaobjectSEOProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectFieldProjection<>(this, getRoot());
     getFields().put("title", projection);
     return projection;
  }
}
