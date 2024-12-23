package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CombinedListingChildProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CombinedListingChildProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CombinedListingChild"));
  }

  public CombinedListingChildProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<CombinedListingChildProjection<PARENT, ROOT>, ROOT> parentVariant(
      ) {
     ProductVariantProjection<CombinedListingChildProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("parentVariant", projection);
     return projection;
  }

  public ProductProjection<CombinedListingChildProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<CombinedListingChildProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }
}
