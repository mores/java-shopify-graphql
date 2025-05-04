package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ConsentPolicy"));
  }

  public ConsentPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyCountryCodeProjection<ConsentPolicyProjection<PARENT, ROOT>, ROOT> countryCode() {
     PrivacyCountryCodeProjection<ConsentPolicyProjection<PARENT, ROOT>, ROOT> projection = new PrivacyCountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public ConsentPolicyProjection<PARENT, ROOT> consentRequired() {
    getFields().put("consentRequired", null);
    return this;
  }

  public ConsentPolicyProjection<PARENT, ROOT> dataSaleOptOutRequired() {
    getFields().put("dataSaleOptOutRequired", null);
    return this;
  }

  public ConsentPolicyProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ConsentPolicyProjection<PARENT, ROOT> regionCode() {
    getFields().put("regionCode", null);
    return this;
  }

  public ConsentPolicyProjection<PARENT, ROOT> shopId() {
    getFields().put("shopId", null);
    return this;
  }
}
