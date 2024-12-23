package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FulfillmentOrderDestinationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentOrderDestinationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderDestination"));
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT>, ROOT> countryCode(
      ) {
     CountryCodeProjection<FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public LocationProjection<FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public FulfillmentOrderDestinationFragmentProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentOrderDestination {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
