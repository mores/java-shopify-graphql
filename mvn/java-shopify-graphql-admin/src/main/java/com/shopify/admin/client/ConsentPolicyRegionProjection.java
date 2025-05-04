package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ConsentPolicyRegionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ConsentPolicyRegionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ConsentPolicyRegion"));
  }

  public ConsentPolicyRegionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivacyCountryCodeProjection<ConsentPolicyRegionProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     PrivacyCountryCodeProjection<ConsentPolicyRegionProjection<PARENT, ROOT>, ROOT> projection = new PrivacyCountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public ConsentPolicyRegionProjection<PARENT, ROOT> regionCode() {
    getFields().put("regionCode", null);
    return this;
  }
}
