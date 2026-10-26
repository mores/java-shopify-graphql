package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionInclusionProductSelectionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionInclusionProductSelectionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionInclusionProductSelectionEdge"));
  }

  public CollectionInclusionProductSelectionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionInclusionProductSelectionProjection<CollectionInclusionProductSelectionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CollectionInclusionProductSelectionProjection<CollectionInclusionProductSelectionEdgeProjection<PARENT, ROOT>, ROOT> projection = new CollectionInclusionProductSelectionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CollectionInclusionProductSelectionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
