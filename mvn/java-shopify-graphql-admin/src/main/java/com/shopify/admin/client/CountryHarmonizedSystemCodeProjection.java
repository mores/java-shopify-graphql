package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountryHarmonizedSystemCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountryHarmonizedSystemCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CountryHarmonizedSystemCode"));
  }

  public CountryHarmonizedSystemCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CountryHarmonizedSystemCodeProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<CountryHarmonizedSystemCodeProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CountryHarmonizedSystemCodeProjection<PARENT, ROOT> harmonizedSystemCode() {
    getFields().put("harmonizedSystemCode", null);
    return this;
  }
}
