package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionSourceInclusionConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceInclusionConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceInclusionCondition"));
  }

  public CollectionSourceInclusionConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSourceInclusionConditionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionSourceInclusionConditionMetafieldBooleanFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldBoolean(
      ) {
    CollectionSourceInclusionConditionMetafieldBooleanFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldBooleanFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldDecimal(
      ) {
    CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldDecimalFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldIntFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldInt(
      ) {
    CollectionSourceInclusionConditionMetafieldIntFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldIntFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldInteger(
      ) {
    CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldIntegerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldMetaobject(
      ) {
    CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldMetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldMetaobjectList(
      ) {
    CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldMetaobjectListFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldStringFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldString(
      ) {
    CollectionSourceInclusionConditionMetafieldStringFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldStringFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionMetafieldStringList(
      ) {
    CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionMetafieldStringListFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductCategoryFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductCategory(
      ) {
    CollectionSourceInclusionConditionProductCategoryFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductCategoryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductStatusFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductStatus(
      ) {
    CollectionSourceInclusionConditionProductStatusFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductStatusFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductTagFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductTag(
      ) {
    CollectionSourceInclusionConditionProductTagFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductTagFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductTitleFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductTitle(
      ) {
    CollectionSourceInclusionConditionProductTitleFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductTitleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductTypeFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductType(
      ) {
    CollectionSourceInclusionConditionProductTypeFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductTypeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionProductVendorFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionProductVendor(
      ) {
    CollectionSourceInclusionConditionProductVendorFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionProductVendorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionUnknownFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionUnknown(
      ) {
    CollectionSourceInclusionConditionUnknownFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionUnknownFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionVariantCompareAtPrice(
      ) {
    CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionVariantCompareAtPriceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionVariantInventoryFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionVariantInventory(
      ) {
    CollectionSourceInclusionConditionVariantInventoryFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionVariantInventoryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionVariantPriceFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionVariantPrice(
      ) {
    CollectionSourceInclusionConditionVariantPriceFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionVariantPriceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionVariantTitleFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionVariantTitle(
      ) {
    CollectionSourceInclusionConditionVariantTitleFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionVariantTitleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionSourceInclusionConditionVariantWeightFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> onCollectionSourceInclusionConditionVariantWeight(
      ) {
    CollectionSourceInclusionConditionVariantWeightFragmentProjection<CollectionSourceInclusionConditionProjection<PARENT, ROOT>, ROOT> fragment = new CollectionSourceInclusionConditionVariantWeightFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
