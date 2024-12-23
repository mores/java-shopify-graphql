package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderDestinationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderDestinationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderDestination"));
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<FulfillmentOrderDestinationProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<FulfillmentOrderDestinationProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocationProjection<FulfillmentOrderDestinationProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<FulfillmentOrderDestinationProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public FulfillmentOrderDestinationProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
