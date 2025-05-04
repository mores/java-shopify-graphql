package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConnection"));
  }

  public CollectionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionEdgeProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CollectionEdgeProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> projection = new CollectionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CollectionProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CollectionProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CollectionsProjectionRoot<PARENT, ROOT>, CollectionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
