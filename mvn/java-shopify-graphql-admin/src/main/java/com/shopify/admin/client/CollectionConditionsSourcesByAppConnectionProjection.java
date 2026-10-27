package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourcesByAppConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourcesByAppConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSourcesByAppConnection"));
  }

  public CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourcesByAppEdgeProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CollectionConditionsSourcesByAppEdgeProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourcesByAppEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourcesByAppProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CollectionConditionsSourcesByAppConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
