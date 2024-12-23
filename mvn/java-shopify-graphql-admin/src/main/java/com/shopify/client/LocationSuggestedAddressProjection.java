package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationSuggestedAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationSuggestedAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationSuggestedAddress"));
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<LocationSuggestedAddressProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<LocationSuggestedAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public LocationSuggestedAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
