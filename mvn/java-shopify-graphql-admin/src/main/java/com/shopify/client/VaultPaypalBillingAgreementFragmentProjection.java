package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class VaultPaypalBillingAgreementFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public VaultPaypalBillingAgreementFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("VaultPaypalBillingAgreement"));
  }

  public VaultPaypalBillingAgreementFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public VaultPaypalBillingAgreementFragmentProjection<PARENT, ROOT> inactive() {
    getFields().put("inactive", null);
    return this;
  }

  public VaultPaypalBillingAgreementFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public VaultPaypalBillingAgreementFragmentProjection<PARENT, ROOT> paypalAccountEmail() {
    getFields().put("paypalAccountEmail", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on VaultPaypalBillingAgreement {");
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
