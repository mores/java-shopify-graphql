package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Fee"));
  }

  public FeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RestockingFeeFragmentProjection<FeeProjection<PARENT, ROOT>, ROOT> onRestockingFee() {
    RestockingFeeFragmentProjection<FeeProjection<PARENT, ROOT>, ROOT> fragment = new RestockingFeeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnShippingFeeFragmentProjection<FeeProjection<PARENT, ROOT>, ROOT> onReturnShippingFee(
      ) {
    ReturnShippingFeeFragmentProjection<FeeProjection<PARENT, ROOT>, ROOT> fragment = new ReturnShippingFeeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
