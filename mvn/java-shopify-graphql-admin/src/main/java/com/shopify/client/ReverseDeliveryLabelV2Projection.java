package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryLabelV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryLabelV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryLabelV2"));
  }

  public ReverseDeliveryLabelV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryLabelV2Projection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ReverseDeliveryLabelV2Projection<PARENT, ROOT> publicFileUrl() {
    getFields().put("publicFileUrl", null);
    return this;
  }

  public ReverseDeliveryLabelV2Projection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
