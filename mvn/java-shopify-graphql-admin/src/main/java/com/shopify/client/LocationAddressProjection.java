package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationAddress"));
  }

  public LocationAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public LocationAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
