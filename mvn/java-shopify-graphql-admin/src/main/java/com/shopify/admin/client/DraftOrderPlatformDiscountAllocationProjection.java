package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderPlatformDiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderPlatformDiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderPlatformDiscountAllocation"));
  }

  public DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> reductionAmount(
      ) {
     MoneyV2Projection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("reductionAmount", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> reductionAmountSet(
      ) {
     MoneyBagProjection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("reductionAmountSet", projection);
     return projection;
  }

  public DraftOrderPlatformDiscountAllocationTargetProjection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> target(
      ) {
     DraftOrderPlatformDiscountAllocationTargetProjection<DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderPlatformDiscountAllocationTargetProjection<>(this, getRoot());
     getFields().put("target", projection);
     return projection;
  }

  public DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderPlatformDiscountAllocationProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
