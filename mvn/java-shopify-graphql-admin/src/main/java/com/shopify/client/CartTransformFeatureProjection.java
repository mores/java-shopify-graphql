package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformFeatureProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformFeatureProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartTransformFeature"));
  }

  public CartTransformFeatureProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformEligibleOperationsProjection<CartTransformFeatureProjection<PARENT, ROOT>, ROOT> eligibleOperations(
      ) {
     CartTransformEligibleOperationsProjection<CartTransformFeatureProjection<PARENT, ROOT>, ROOT> projection = new CartTransformEligibleOperationsProjection<>(this, getRoot());
     getFields().put("eligibleOperations", projection);
     return projection;
  }
}
