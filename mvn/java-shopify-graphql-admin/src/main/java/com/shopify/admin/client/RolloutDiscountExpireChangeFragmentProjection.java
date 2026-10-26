package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RolloutDiscountExpireChangeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RolloutDiscountExpireChangeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutDiscountExpireChange"));
  }

  public RolloutDiscountExpireChangeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountNodeProjection<RolloutDiscountExpireChangeFragmentProjection<PARENT, ROOT>, ROOT> discount(
      ) {
     DiscountNodeProjection<RolloutDiscountExpireChangeFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("discount", projection);
     return projection;
  }

  public RolloutDiscountExpireChangeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RolloutDiscountExpireChange {");
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
