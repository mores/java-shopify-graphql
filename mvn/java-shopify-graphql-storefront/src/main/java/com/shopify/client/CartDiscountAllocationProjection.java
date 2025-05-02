package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDiscountAllocation"));
  }

  public CartDiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDiscountApplicationProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     CartDiscountApplicationProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }

  public MoneyV2Projection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> discountedAmount(
      ) {
     MoneyV2Projection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedAmount", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public CartAutomaticDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> onCartAutomaticDiscountAllocation(
      ) {
    CartAutomaticDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> fragment = new CartAutomaticDiscountAllocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartCodeDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> onCartCodeDiscountAllocation(
      ) {
    CartCodeDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> fragment = new CartCodeDiscountAllocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartCustomDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> onCartCustomDiscountAllocation(
      ) {
    CartCustomDiscountAllocationFragmentProjection<CartDiscountAllocationProjection<PARENT, ROOT>, ROOT> fragment = new CartCustomDiscountAllocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
