package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReverseDeliveryLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseDeliveryLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryLineItem"));
  }

  public ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT>, ROOT> dispositions(
      ) {
     ReverseFulfillmentOrderDispositionProjection<ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionProjection<>(this, getRoot());
     getFields().put("dispositions", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemProjection<ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrderLineItem(
      ) {
     ReverseFulfillmentOrderLineItemProjection<ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrderLineItem", projection);
     return projection;
  }

  public ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseDeliveryLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseDeliveryLineItem {");
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
