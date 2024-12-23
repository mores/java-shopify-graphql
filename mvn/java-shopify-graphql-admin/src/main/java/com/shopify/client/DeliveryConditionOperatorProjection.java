package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryConditionOperatorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryConditionOperatorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryConditionOperator"));
  }

  public DeliveryConditionOperatorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
