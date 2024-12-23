package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodDefinitionCountsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodDefinitionCountsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodDefinitionCounts"));
  }

  public DeliveryMethodDefinitionCountsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodDefinitionCountsProjection<PARENT, ROOT> participantDefinitionsCount() {
    getFields().put("participantDefinitionsCount", null);
    return this;
  }

  public DeliveryMethodDefinitionCountsProjection<PARENT, ROOT> rateDefinitionsCount() {
    getFields().put("rateDefinitionsCount", null);
    return this;
  }
}
