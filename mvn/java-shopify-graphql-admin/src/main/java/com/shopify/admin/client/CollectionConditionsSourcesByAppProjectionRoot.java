package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourcesByAppProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourcesByAppProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionsSourcesByAppConnection"));
  }

  public CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourcesByAppEdgeProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CollectionConditionsSourcesByAppEdgeProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourcesByAppEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourcesByAppProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesByAppProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
