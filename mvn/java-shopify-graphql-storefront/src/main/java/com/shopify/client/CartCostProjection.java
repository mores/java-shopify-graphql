package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartCostProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartCostProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCost"));
  }

  public CartCostProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> checkoutChargeAmount() {
     MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("checkoutChargeAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> subtotalAmount() {
     MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> totalAmount() {
     MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> totalDutyAmount() {
     MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDutyAmount", projection);
     return projection;
  }

  public MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> totalTaxAmount() {
     MoneyV2Projection<CartCostProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTaxAmount", projection);
     return projection;
  }

  public CartCostProjection<PARENT, ROOT> subtotalAmountEstimated() {
    getFields().put("subtotalAmountEstimated", null);
    return this;
  }

  public CartCostProjection<PARENT, ROOT> totalAmountEstimated() {
    getFields().put("totalAmountEstimated", null);
    return this;
  }

  public CartCostProjection<PARENT, ROOT> totalDutyAmountEstimated() {
    getFields().put("totalDutyAmountEstimated", null);
    return this;
  }

  public CartCostProjection<PARENT, ROOT> totalTaxAmountEstimated() {
    getFields().put("totalTaxAmountEstimated", null);
    return this;
  }
}
