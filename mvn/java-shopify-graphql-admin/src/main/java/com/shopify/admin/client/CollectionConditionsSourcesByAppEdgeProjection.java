package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourcesByAppEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourcesByAppEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSourcesByAppEdge"));
  }

  public CollectionConditionsSourcesByAppEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CollectionConditionsSourcesByAppProjection<CollectionConditionsSourcesByAppEdgeProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourcesByAppProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CollectionConditionsSourcesByAppEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
