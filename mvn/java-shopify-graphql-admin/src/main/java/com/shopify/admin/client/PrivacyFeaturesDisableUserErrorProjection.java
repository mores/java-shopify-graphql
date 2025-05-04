package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacyFeaturesDisableUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacyFeaturesDisableUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivacyFeaturesDisableUserError"));
  }

  public PrivacyFeaturesDisableUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyFeaturesDisableUserErrorCodeProjection<PrivacyFeaturesDisableUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PrivacyFeaturesDisableUserErrorCodeProjection<PrivacyFeaturesDisableUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PrivacyFeaturesDisableUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PrivacyFeaturesDisableUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PrivacyFeaturesDisableUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
