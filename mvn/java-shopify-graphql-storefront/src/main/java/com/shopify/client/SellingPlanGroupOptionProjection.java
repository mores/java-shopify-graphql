package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanGroupOption"));
  }

  public SellingPlanGroupOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SellingPlanGroupOptionProjection<PARENT, ROOT> values() {
    getFields().put("values", null);
    return this;
  }
}
