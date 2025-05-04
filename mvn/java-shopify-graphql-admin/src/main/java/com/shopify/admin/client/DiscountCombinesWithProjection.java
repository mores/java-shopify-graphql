package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCombinesWithProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCombinesWithProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCombinesWith"));
  }

  public DiscountCombinesWithProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCombinesWithProjection<PARENT, ROOT> orderDiscounts() {
    getFields().put("orderDiscounts", null);
    return this;
  }

  public DiscountCombinesWithProjection<PARENT, ROOT> productDiscounts() {
    getFields().put("productDiscounts", null);
    return this;
  }

  public DiscountCombinesWithProjection<PARENT, ROOT> shippingDiscounts() {
    getFields().put("shippingDiscounts", null);
    return this;
  }
}
