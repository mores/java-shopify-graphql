package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionExclusionProductSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionExclusionProductSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionExclusionProductSelection"));
  }

  public CollectionExclusionProductSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<CollectionExclusionProductSelectionProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<CollectionExclusionProductSelectionProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }
}
