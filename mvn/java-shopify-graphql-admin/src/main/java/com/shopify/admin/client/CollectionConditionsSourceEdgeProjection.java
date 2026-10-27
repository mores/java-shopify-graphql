package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSourceEdge"));
  }

  public CollectionConditionsSourceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourceProjection<CollectionConditionsSourceEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CollectionConditionsSourceProjection<CollectionConditionsSourceEdgeProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CollectionConditionsSourceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
