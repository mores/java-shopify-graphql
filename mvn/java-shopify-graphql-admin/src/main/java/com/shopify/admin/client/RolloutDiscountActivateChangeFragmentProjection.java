package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RolloutDiscountActivateChangeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RolloutDiscountActivateChangeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutDiscountActivateChange"));
  }

  public RolloutDiscountActivateChangeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountNodeProjection<RolloutDiscountActivateChangeFragmentProjection<PARENT, ROOT>, ROOT> discount(
      ) {
     DiscountNodeProjection<RolloutDiscountActivateChangeFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("discount", projection);
     return projection;
  }

  public RolloutDiscountActivateChangeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RolloutDiscountActivateChange {");
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
