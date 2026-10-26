package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BaseCartDiscountApplicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BaseCartDiscountApplicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BaseCartDiscountApplication"));
  }

  public BaseCartDiscountApplicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public MoneyV2Projection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> totalAllocatedAmount(
      ) {
     MoneyV2Projection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAllocatedAmount", projection);
     return projection;
  }

  public PricingValueProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> value() {
     PricingValueProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public CartAutomaticDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCartAutomaticDiscountApplication(
      ) {
    CartAutomaticDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CartAutomaticDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartCodeDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCartCodeDiscountApplication(
      ) {
    CartCodeDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CartCodeDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartCustomDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> onCartCustomDiscountApplication(
      ) {
    CartCustomDiscountApplicationFragmentProjection<BaseCartDiscountApplicationProjection<PARENT, ROOT>, ROOT> fragment = new CartCustomDiscountApplicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
