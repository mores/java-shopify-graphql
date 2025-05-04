package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderPlatformDiscountAllocationTargetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderPlatformDiscountAllocationTargetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderPlatformDiscountAllocationTarget"));
  }

  public DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> onCalculatedDraftOrderLineItem(
      ) {
    CalculatedDraftOrderLineItemFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedDraftOrderLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderLineItemFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> onDraftOrderLineItem(
      ) {
    DraftOrderLineItemFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShippingLineFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> onShippingLine(
      ) {
    ShippingLineFragmentProjection<DraftOrderPlatformDiscountAllocationTargetProjection<PARENT, ROOT>, ROOT> fragment = new ShippingLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
