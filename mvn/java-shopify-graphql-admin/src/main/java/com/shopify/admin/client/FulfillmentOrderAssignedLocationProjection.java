package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderAssignedLocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderAssignedLocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderAssignedLocation"));
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<FulfillmentOrderAssignedLocationProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<FulfillmentOrderAssignedLocationProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocationProjection<FulfillmentOrderAssignedLocationProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<FulfillmentOrderAssignedLocationProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
