package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderStagedChangeRemoveDiscountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderStagedChangeRemoveDiscountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeRemoveDiscount"));
  }

  public OrderStagedChangeRemoveDiscountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationProjection<OrderStagedChangeRemoveDiscountFragmentProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     DiscountApplicationProjection<OrderStagedChangeRemoveDiscountFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderStagedChangeRemoveDiscount {");
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
