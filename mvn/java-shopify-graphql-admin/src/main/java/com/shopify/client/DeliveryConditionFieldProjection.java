package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryConditionFieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryConditionFieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryConditionField"));
  }

  public DeliveryConditionFieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
