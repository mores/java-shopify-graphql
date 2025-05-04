package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectsProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectConnection"));
  }

  public MetaobjectsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectEdgeProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MetaobjectEdgeProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> projection = new MetaobjectEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MetaobjectProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MetaobjectProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> projection = new MetaobjectProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MetaobjectsProjectionRoot<PARENT, ROOT>, MetaobjectsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
