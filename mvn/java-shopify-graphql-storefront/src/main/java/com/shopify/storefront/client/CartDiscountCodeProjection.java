package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDiscountCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDiscountCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDiscountCode"));
  }

  public CartDiscountCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDiscountCodeProjection<PARENT, ROOT> applicable() {
    getFields().put("applicable", null);
    return this;
  }

  public CartDiscountCodeProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }
}
