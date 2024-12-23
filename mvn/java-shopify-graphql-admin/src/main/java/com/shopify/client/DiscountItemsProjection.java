package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountItemsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountItemsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountItems"));
  }

  public DiscountItemsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AllDiscountItemsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> onAllDiscountItems(
      ) {
    AllDiscountItemsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> fragment = new AllDiscountItemsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCollectionsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> onDiscountCollections(
      ) {
    DiscountCollectionsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCollectionsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountProductsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> onDiscountProducts(
      ) {
    DiscountProductsFragmentProjection<DiscountItemsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountProductsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
