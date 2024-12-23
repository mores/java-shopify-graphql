package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderStagedChangeAddShippingLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderStagedChangeAddShippingLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeAddShippingLine"));
  }

  public OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT>, ROOT> price(
      ) {
     MoneyV2Projection<OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public OrderStagedChangeAddShippingLineFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderStagedChangeAddShippingLine {");
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
