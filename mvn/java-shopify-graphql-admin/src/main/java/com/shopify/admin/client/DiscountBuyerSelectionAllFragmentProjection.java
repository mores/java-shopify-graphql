package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountBuyerSelectionAllFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountBuyerSelectionAllFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountBuyerSelectionAll"));
  }

  public DiscountBuyerSelectionAllFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountBuyerSelectionProjection<DiscountBuyerSelectionAllFragmentProjection<PARENT, ROOT>, ROOT> all(
      ) {
     DiscountBuyerSelectionProjection<DiscountBuyerSelectionAllFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountBuyerSelectionProjection<>(this, getRoot());
     getFields().put("all", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountBuyerSelectionAll {");
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
