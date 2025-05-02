package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLineCostProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLineCostProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLineCost"));
  }

  public CartLineCostProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> amountPerQuantity() {
     MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountPerQuantity", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> compareAtAmountPerQuantity(
      ) {
     MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtAmountPerQuantity", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> subtotalAmount() {
     MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyV2Projection<CartLineCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }
}
