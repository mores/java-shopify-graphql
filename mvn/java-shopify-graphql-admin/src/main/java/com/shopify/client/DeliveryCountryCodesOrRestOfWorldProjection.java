package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCountryCodesOrRestOfWorldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCountryCodesOrRestOfWorldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCountryCodesOrRestOfWorld"));
  }

  public DeliveryCountryCodesOrRestOfWorldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<DeliveryCountryCodesOrRestOfWorldProjection<PARENT, ROOT>, ROOT> countryCodes(
      ) {
     CountryCodeProjection<DeliveryCountryCodesOrRestOfWorldProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodes", projection);
     return projection;
  }

  public DeliveryCountryCodesOrRestOfWorldProjection<PARENT, ROOT> restOfWorld() {
    getFields().put("restOfWorld", null);
    return this;
  }
}
