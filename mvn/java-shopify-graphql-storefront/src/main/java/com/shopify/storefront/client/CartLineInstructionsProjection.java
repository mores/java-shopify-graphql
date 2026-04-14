package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLineInstructionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLineInstructionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLineInstructions"));
  }

  public CartLineInstructionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartLineInstructionsProjection<PARENT, ROOT> canRemove() {
    getFields().put("canRemove", null);
    return this;
  }

  public CartLineInstructionsProjection<PARENT, ROOT> canUpdateQuantity() {
    getFields().put("canUpdateQuantity", null);
    return this;
  }
}
