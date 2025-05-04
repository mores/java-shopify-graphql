package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class WeightFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public WeightFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Weight"));
  }

  public WeightFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WeightUnitProjection<WeightFragmentProjection<PARENT, ROOT>, ROOT> unit() {
     WeightUnitProjection<WeightFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightUnitProjection<>(this, getRoot());
     getFields().put("unit", projection);
     return projection;
  }

  public WeightFragmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Weight {");
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
