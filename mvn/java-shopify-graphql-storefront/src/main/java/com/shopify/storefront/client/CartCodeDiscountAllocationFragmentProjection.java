package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartCodeDiscountAllocationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartCodeDiscountAllocationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCodeDiscountAllocation"));
  }

  public CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDiscountApplicationProjection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     CartDiscountApplicationProjection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }

  public MoneyV2Projection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> discountedAmount(
      ) {
     MoneyV2Projection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedAmount", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public CartCodeDiscountAllocationFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartCodeDiscountAllocation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
