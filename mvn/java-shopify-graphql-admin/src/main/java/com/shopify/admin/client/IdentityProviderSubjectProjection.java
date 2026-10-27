package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class IdentityProviderSubjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public IdentityProviderSubjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("IdentityProviderSubject"));
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> providerName() {
    getFields().put("providerName", null);
    return this;
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> subject() {
    getFields().put("subject", null);
    return this;
  }

  public IdentityProviderSubjectProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
