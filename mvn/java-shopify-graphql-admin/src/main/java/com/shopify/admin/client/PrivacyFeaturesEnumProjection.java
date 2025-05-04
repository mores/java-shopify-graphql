package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacyFeaturesEnumProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacyFeaturesEnumProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivacyFeaturesEnum"));
  }

  public PrivacyFeaturesEnumProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
