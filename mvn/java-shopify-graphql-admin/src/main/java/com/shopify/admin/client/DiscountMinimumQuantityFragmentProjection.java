package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountMinimumQuantityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountMinimumQuantityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountMinimumQuantity"));
  }

  public DiscountMinimumQuantityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountMinimumQuantityFragmentProjection<PARENT, ROOT> greaterThanOrEqualToQuantity() {
    getFields().put("greaterThanOrEqualToQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountMinimumQuantity {");
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
