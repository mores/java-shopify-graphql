package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingRefundProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingRefundProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingRefund"));
  }

  public ShippingRefundProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> maximumRefundableSet() {
     MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundableSet", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> taxSet() {
     MoneyBagProjection<ShippingRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("taxSet", projection);
     return projection;
  }

  public ShippingRefundProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public ShippingRefundProjection<PARENT, ROOT> maximumRefundable() {
    getFields().put("maximumRefundable", null);
    return this;
  }

  public ShippingRefundProjection<PARENT, ROOT> tax() {
    getFields().put("tax", null);
    return this;
  }
}
