package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RefundShippingLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RefundShippingLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundShippingLine"));
  }

  public RefundShippingLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLineProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> shippingLine(
      ) {
     ShippingLineProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public MoneyBagProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> subtotalAmountSet(
      ) {
     MoneyBagProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> taxAmountSet(
      ) {
     MoneyBagProjection<RefundShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("taxAmountSet", projection);
     return projection;
  }

  public RefundShippingLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RefundShippingLine {");
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
