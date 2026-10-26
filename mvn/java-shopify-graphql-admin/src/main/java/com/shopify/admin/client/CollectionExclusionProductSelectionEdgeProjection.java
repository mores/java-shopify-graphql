package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionExclusionProductSelectionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionExclusionProductSelectionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionExclusionProductSelectionEdge"));
  }

  public CollectionExclusionProductSelectionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionExclusionProductSelectionProjection<CollectionExclusionProductSelectionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CollectionExclusionProductSelectionProjection<CollectionExclusionProductSelectionEdgeProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CollectionExclusionProductSelectionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
