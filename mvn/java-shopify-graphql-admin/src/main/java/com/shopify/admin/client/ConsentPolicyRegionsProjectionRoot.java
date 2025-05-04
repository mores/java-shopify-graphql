package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyRegionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyRegionsProjectionRoot() {
    super(null, null, java.util.Optional.of("ConsentPolicyRegion"));
  }

  public ConsentPolicyRegionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyCountryCodeProjection<ConsentPolicyRegionsProjectionRoot<PARENT, ROOT>, ConsentPolicyRegionsProjectionRoot<PARENT, ROOT>> countryCode(
      ) {
    PrivacyCountryCodeProjection<ConsentPolicyRegionsProjectionRoot<PARENT, ROOT>, ConsentPolicyRegionsProjectionRoot<PARENT, ROOT>> projection = new PrivacyCountryCodeProjection<>(this, this);    
    getFields().put("countryCode", projection);
    return projection;
  }

  public ConsentPolicyRegionsProjectionRoot<PARENT, ROOT> regionCode() {
    getFields().put("regionCode", null);
    return this;
  }
}
