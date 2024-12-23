package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundShippingLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundShippingLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundShippingLine"));
  }

  public RefundShippingLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLineProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> shippingLine() {
     ShippingLineProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public MoneyBagProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> subtotalAmountSet() {
     MoneyBagProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> taxAmountSet() {
     MoneyBagProjection<RefundShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("taxAmountSet", projection);
     return projection;
  }

  public RefundShippingLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
