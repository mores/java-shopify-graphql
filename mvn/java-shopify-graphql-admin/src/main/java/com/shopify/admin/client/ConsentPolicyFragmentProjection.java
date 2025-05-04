package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ConsentPolicyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ConsentPolicyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ConsentPolicy"));
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyCountryCodeProjection<ConsentPolicyFragmentProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     PrivacyCountryCodeProjection<ConsentPolicyFragmentProjection<PARENT, ROOT>, ROOT> projection = new PrivacyCountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> consentRequired() {
    getFields().put("consentRequired", null);
    return this;
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> dataSaleOptOutRequired() {
    getFields().put("dataSaleOptOutRequired", null);
    return this;
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> regionCode() {
    getFields().put("regionCode", null);
    return this;
  }

  public ConsentPolicyFragmentProjection<PARENT, ROOT> shopId() {
    getFields().put("shopId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ConsentPolicy {");
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
