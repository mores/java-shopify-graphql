package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CardBrandProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CardBrandProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CardBrand"));
  }

  public CardBrandProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
