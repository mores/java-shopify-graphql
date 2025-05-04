package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RestockingFeeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RestockingFeeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RestockingFee"));
  }

  public RestockingFeeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<RestockingFeeFragmentProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<RestockingFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public RestockingFeeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RestockingFeeFragmentProjection<PARENT, ROOT> percentage() {
    getFields().put("percentage", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RestockingFee {");
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
