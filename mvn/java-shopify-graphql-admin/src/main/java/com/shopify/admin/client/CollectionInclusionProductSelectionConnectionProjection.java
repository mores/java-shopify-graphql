package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionInclusionProductSelectionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionInclusionProductSelectionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionInclusionProductSelectionConnection"));
  }

  public CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionInclusionProductSelectionEdgeProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CollectionInclusionProductSelectionEdgeProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionInclusionProductSelectionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionInclusionProductSelectionProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CollectionInclusionProductSelectionProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionInclusionProductSelectionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CollectionInclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
