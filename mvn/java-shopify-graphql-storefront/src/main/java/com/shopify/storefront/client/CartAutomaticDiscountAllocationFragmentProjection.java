package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartAutomaticDiscountAllocationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartAutomaticDiscountAllocationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartAutomaticDiscountAllocation"));
  }

  public CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDiscountApplicationProjection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     CartDiscountApplicationProjection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }

  public MoneyV2Projection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> discountedAmount(
      ) {
     MoneyV2Projection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedAmount", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public CartAutomaticDiscountAllocationFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartAutomaticDiscountAllocation {");
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
