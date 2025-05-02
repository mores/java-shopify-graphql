package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLineEstimatedCostProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLineEstimatedCostProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartLineEstimatedCost"));
  }

  public CartLineEstimatedCostProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> compareAtAmount() {
     MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> subtotalAmount() {
     MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyV2Projection<CartLineEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }
}
