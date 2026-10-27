package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionExclusionProductSelectionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionExclusionProductSelectionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionExclusionProductSelectionConnection"));
  }

  public CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionExclusionProductSelectionEdgeProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CollectionExclusionProductSelectionEdgeProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionExclusionProductSelectionProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CollectionExclusionProductSelectionProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CollectionExclusionProductSelectionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
