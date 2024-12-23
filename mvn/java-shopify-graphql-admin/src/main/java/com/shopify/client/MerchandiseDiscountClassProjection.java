package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MerchandiseDiscountClassProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MerchandiseDiscountClassProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MerchandiseDiscountClass"));
  }

  public MerchandiseDiscountClassProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
