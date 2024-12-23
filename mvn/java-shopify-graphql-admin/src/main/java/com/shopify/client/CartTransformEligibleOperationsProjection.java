package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformEligibleOperationsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformEligibleOperationsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartTransformEligibleOperations"));
  }

  public CartTransformEligibleOperationsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformEligibleOperationsProjection<PARENT, ROOT> expandOperation() {
    getFields().put("expandOperation", null);
    return this;
  }

  public CartTransformEligibleOperationsProjection<PARENT, ROOT> mergeOperation() {
    getFields().put("mergeOperation", null);
    return this;
  }

  public CartTransformEligibleOperationsProjection<PARENT, ROOT> updateOperation() {
    getFields().put("updateOperation", null);
    return this;
  }
}
