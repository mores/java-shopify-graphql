package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivacyPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivacyPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivacyPolicy"));
  }

  public PrivacyPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyPolicyProjection<PARENT, ROOT> autoManaged() {
    getFields().put("autoManaged", null);
    return this;
  }

  public PrivacyPolicyProjection<PARENT, ROOT> supportedLocales() {
    getFields().put("supportedLocales", null);
    return this;
  }
}
