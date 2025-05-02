package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PreferenceDeliveryMethodTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PreferenceDeliveryMethodTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PreferenceDeliveryMethodType"));
  }

  public PreferenceDeliveryMethodTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
