package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCountryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCountryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCountry"));
  }

  public DeliveryCountryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryCodeOrRestOfWorldProjection<DeliveryCountryProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DeliveryCountryCodeOrRestOfWorldProjection<DeliveryCountryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryCodeOrRestOfWorldProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DeliveryProvinceProjection<DeliveryCountryProjection<PARENT, ROOT>, ROOT> provinces() {
     DeliveryProvinceProjection<DeliveryCountryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProvinceProjection<>(this, getRoot());
     getFields().put("provinces", projection);
     return projection;
  }

  public DeliveryCountryProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryCountryProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryCountryProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }
}
