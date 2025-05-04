package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderStagedChangeAddLineItemDiscountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeAddLineItemDiscount"));
  }

  public OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PricingValueProjection<OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public OrderStagedChangeAddLineItemDiscountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderStagedChangeAddLineItemDiscount {");
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
