package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShippingLabelPurchaseResultFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShippingLabelPurchaseResultFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabelPurchaseResult"));
  }

  public ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLabelPurchaseErrorProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     ShippingLabelPurchaseErrorProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public ShippingLabelProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> shippingLabels(
      ) {
     ShippingLabelProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelProjection<>(this, getRoot());
     getFields().put("shippingLabels", projection);
     return projection;
  }

  public ShippingLabelPurchaseResultStatusProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShippingLabelPurchaseResultStatusProjection<ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseResultStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public ShippingLabelPurchaseResultFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShippingLabelPurchaseResult {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
