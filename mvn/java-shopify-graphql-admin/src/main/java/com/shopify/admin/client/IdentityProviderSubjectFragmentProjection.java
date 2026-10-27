package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class IdentityProviderSubjectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public IdentityProviderSubjectFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("IdentityProviderSubject"));
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> providerName() {
    getFields().put("providerName", null);
    return this;
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> subject() {
    getFields().put("subject", null);
    return this;
  }

  public IdentityProviderSubjectFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on IdentityProviderSubject {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
