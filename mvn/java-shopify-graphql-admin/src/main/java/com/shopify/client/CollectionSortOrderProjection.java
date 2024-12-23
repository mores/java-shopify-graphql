package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSortOrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSortOrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSortOrder"));
  }

  public CollectionSortOrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
