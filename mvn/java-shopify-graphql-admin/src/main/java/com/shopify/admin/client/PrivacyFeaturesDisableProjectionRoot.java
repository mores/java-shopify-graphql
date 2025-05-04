package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacyFeaturesDisableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacyFeaturesDisableProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivacyFeaturesDisablePayload"));
  }

  public PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyFeaturesEnumProjection<PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>, PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>> featuresDisabled(
      ) {
    PrivacyFeaturesEnumProjection<PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>, PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>> projection = new PrivacyFeaturesEnumProjection<>(this, this);    
    getFields().put("featuresDisabled", projection);
    return projection;
  }

  public PrivacyFeaturesDisableUserErrorProjection<PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>, PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PrivacyFeaturesDisableUserErrorProjection<PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>, PrivacyFeaturesDisableProjectionRoot<PARENT, ROOT>> projection = new PrivacyFeaturesDisableUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
