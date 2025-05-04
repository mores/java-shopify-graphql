package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderStagedChangeDecrementItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderStagedChangeDecrementItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeDecrementItem"));
  }

  public OrderStagedChangeDecrementItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<OrderStagedChangeDecrementItemFragmentProjection<PARENT, ROOT>, ROOT> lineItem(
      ) {
     LineItemProjection<OrderStagedChangeDecrementItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public OrderStagedChangeDecrementItemFragmentProjection<PARENT, ROOT> delta() {
    getFields().put("delta", null);
    return this;
  }

  public OrderStagedChangeDecrementItemFragmentProjection<PARENT, ROOT> restock() {
    getFields().put("restock", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderStagedChangeDecrementItem {");
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
