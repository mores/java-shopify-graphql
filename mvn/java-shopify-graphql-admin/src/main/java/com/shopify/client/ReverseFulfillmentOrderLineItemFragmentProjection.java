package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReverseFulfillmentOrderLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderLineItem"));
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> dispositions(
      ) {
     ReverseFulfillmentOrderDispositionProjection<ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionProjection<>(this, getRoot());
     getFields().put("dispositions", projection);
     return projection;
  }

  public FulfillmentLineItemProjection<ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseFulfillmentOrderLineItem {");
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
