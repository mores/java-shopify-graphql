package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartEstimatedCostProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartEstimatedCostProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartEstimatedCost"));
  }

  public CartEstimatedCostProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> checkoutChargeAmount() {
     MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("checkoutChargeAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> subtotalAmount() {
     MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> totalDutyAmount() {
     MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDutyAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyV2Projection<CartEstimatedCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }
}
