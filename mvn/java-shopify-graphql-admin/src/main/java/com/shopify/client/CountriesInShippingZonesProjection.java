package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CountriesInShippingZonesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CountriesInShippingZonesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CountriesInShippingZones"));
  }

  public CountriesInShippingZonesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CountriesInShippingZonesProjection<PARENT, ROOT>, ROOT> countryCodes(
      ) {
     CountryCodeProjection<CountriesInShippingZonesProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodes", projection);
     return projection;
  }

  public CountriesInShippingZonesProjection<PARENT, ROOT> includeRestOfWorld() {
    getFields().put("includeRestOfWorld", null);
    return this;
  }
}
