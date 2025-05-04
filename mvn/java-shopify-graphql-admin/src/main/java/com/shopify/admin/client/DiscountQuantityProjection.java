package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountQuantityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountQuantityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountQuantity"));
  }

  public DiscountQuantityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountQuantityProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
