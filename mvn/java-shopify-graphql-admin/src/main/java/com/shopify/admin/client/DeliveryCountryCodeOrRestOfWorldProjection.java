package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCountryCodeOrRestOfWorldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCountryCodeOrRestOfWorldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCountryCodeOrRestOfWorld"));
  }

  public DeliveryCountryCodeOrRestOfWorldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<DeliveryCountryCodeOrRestOfWorldProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<DeliveryCountryCodeOrRestOfWorldProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public DeliveryCountryCodeOrRestOfWorldProjection<PARENT, ROOT> restOfWorld() {
    getFields().put("restOfWorld", null);
    return this;
  }
}
