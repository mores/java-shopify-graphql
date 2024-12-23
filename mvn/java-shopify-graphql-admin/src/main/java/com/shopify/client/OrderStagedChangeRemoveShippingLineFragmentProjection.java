package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderStagedChangeRemoveShippingLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderStagedChangeRemoveShippingLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeRemoveShippingLine"));
  }

  public OrderStagedChangeRemoveShippingLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLineProjection<OrderStagedChangeRemoveShippingLineFragmentProjection<PARENT, ROOT>, ROOT> shippingLine(
      ) {
     ShippingLineProjection<OrderStagedChangeRemoveShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderStagedChangeRemoveShippingLine {");
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
