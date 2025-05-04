package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WeightProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WeightProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Weight"));
  }

  public WeightProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WeightUnitProjection<WeightProjection<PARENT, ROOT>, ROOT> unit() {
     WeightUnitProjection<WeightProjection<PARENT, ROOT>, ROOT> projection = new WeightUnitProjection<>(this, getRoot());
     getFields().put("unit", projection);
     return projection;
  }

  public WeightProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
