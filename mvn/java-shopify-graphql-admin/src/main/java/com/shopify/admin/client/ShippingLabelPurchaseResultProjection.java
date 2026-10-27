package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelPurchaseResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelPurchaseResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabelPurchaseResult"));
  }

  public ShippingLabelPurchaseResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLabelPurchaseErrorProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     ShippingLabelPurchaseErrorProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public ShippingLabelProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> shippingLabels(
      ) {
     ShippingLabelProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelProjection<>(this, getRoot());
     getFields().put("shippingLabels", projection);
     return projection;
  }

  public ShippingLabelPurchaseResultStatusProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShippingLabelPurchaseResultStatusProjection<ShippingLabelPurchaseResultProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseResultStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShippingLabelPurchaseResultProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public ShippingLabelPurchaseResultProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
