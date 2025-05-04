package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyProjectionRoot() {
    super(null, null, java.util.Optional.of("ConsentPolicy"));
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyCountryCodeProjection<ConsentPolicyProjectionRoot<PARENT, ROOT>, ConsentPolicyProjectionRoot<PARENT, ROOT>> countryCode(
      ) {
    PrivacyCountryCodeProjection<ConsentPolicyProjectionRoot<PARENT, ROOT>, ConsentPolicyProjectionRoot<PARENT, ROOT>> projection = new PrivacyCountryCodeProjection<>(this, this);    
    getFields().put("countryCode", projection);
    return projection;
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> consentRequired() {
    getFields().put("consentRequired", null);
    return this;
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> dataSaleOptOutRequired() {
    getFields().put("dataSaleOptOutRequired", null);
    return this;
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> regionCode() {
    getFields().put("regionCode", null);
    return this;
  }

  public ConsentPolicyProjectionRoot<PARENT, ROOT> shopId() {
    getFields().put("shopId", null);
    return this;
  }
}
