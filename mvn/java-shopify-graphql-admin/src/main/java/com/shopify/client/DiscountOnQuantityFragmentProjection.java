package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DiscountOnQuantityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountOnQuantityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountOnQuantity"));
  }

  public DiscountOnQuantityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountEffectProjection<DiscountOnQuantityFragmentProjection<PARENT, ROOT>, ROOT> effect(
      ) {
     DiscountEffectProjection<DiscountOnQuantityFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountEffectProjection<>(this, getRoot());
     getFields().put("effect", projection);
     return projection;
  }

  public DiscountQuantityProjection<DiscountOnQuantityFragmentProjection<PARENT, ROOT>, ROOT> quantity(
      ) {
     DiscountQuantityProjection<DiscountOnQuantityFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountQuantityProjection<>(this, getRoot());
     getFields().put("quantity", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountOnQuantity {");
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
