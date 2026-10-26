package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceExclusionConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceExclusionConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusionCondition"));
  }

  public CollectionSourceExclusionConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSourceExclusionConditionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceExclusionConditionCollectionFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionCollection(
      ) {
    CollectionSourceExclusionConditionCollectionFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionCollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceExclusionConditionProductCategoryFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionProductCategory(
      ) {
    CollectionSourceExclusionConditionProductCategoryFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionProductCategoryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceExclusionConditionProductTagFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionProductTag(
      ) {
    CollectionSourceExclusionConditionProductTagFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionProductTagFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceExclusionConditionProductTypeFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionProductType(
      ) {
    CollectionSourceExclusionConditionProductTypeFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionProductTypeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceExclusionConditionProductVendorFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionProductVendor(
      ) {
    CollectionSourceExclusionConditionProductVendorFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionProductVendorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceExclusionConditionUnknownFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceExclusionConditionUnknown(
      ) {
    CollectionSourceExclusionConditionUnknownFragmentProjection<CollectionSourceExclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceExclusionConditionUnknownFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
