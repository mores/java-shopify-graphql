package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestTotalShippingPriceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestTotalShippingPriceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestTotalShippingPrice"));
  }

  public ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDiscountProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> finalTotal(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("finalTotal", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> originalTotal(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestTotalShippingPriceProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotal", projection);
     return projection;
  }
}
