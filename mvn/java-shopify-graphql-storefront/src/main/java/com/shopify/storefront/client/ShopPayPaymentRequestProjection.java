package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequest"));
  }

  public ShopPayPaymentRequestProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> deliveryMethods(
      ) {
     ShopPayPaymentRequestDeliveryMethodProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethods", projection);
     return projection;
  }

  public ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDiscountProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public ShopPayPaymentRequestLineItemProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     ShopPayPaymentRequestLineItemProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestLineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> presentmentCurrency(
      ) {
     CurrencyCodeProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("presentmentCurrency", projection);
     return projection;
  }

  public ShopPayPaymentRequestDeliveryMethodTypeProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> selectedDeliveryMethodType(
      ) {
     ShopPayPaymentRequestDeliveryMethodTypeProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("selectedDeliveryMethodType", projection);
     return projection;
  }

  public ShopPayPaymentRequestContactFieldProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> shippingAddress(
      ) {
     ShopPayPaymentRequestContactFieldProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestContactFieldProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public ShopPayPaymentRequestShippingLineProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> shippingLines(
      ) {
     ShopPayPaymentRequestShippingLineProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLines", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> subtotal() {
     MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotal", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> total() {
     MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("total", projection);
     return projection;
  }

  public ShopPayPaymentRequestTotalShippingPriceProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> totalShippingPrice(
      ) {
     ShopPayPaymentRequestTotalShippingPriceProjection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestTotalShippingPriceProjection<>(this, getRoot());
     getFields().put("totalShippingPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> totalTax() {
     MoneyV2Projection<ShopPayPaymentRequestProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }

  public ShopPayPaymentRequestProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public ShopPayPaymentRequestProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }
}
