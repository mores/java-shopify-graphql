package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourcesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourcesProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionsSourceConnection"));
  }

  public CollectionConditionsSourcesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourceEdgeProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CollectionConditionsSourceEdgeProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CollectionConditionsSourceProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CollectionConditionsSourceProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>, CollectionConditionsSourcesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
