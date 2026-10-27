package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionInclusionProductSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionInclusionProductSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionInclusionProductSelection"));
  }

  public CollectionInclusionProductSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<CollectionInclusionProductSelectionProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<CollectionInclusionProductSelectionProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public CollectionInclusionProductSelectionProjection<PARENT, ROOT> variantIds() {
    getFields().put("variantIds", null);
    return this;
  }
}
