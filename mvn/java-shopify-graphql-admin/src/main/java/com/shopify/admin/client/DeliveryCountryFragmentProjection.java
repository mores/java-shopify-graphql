package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryCountryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryCountryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCountry"));
  }

  public DeliveryCountryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryCodeOrRestOfWorldProjection<DeliveryCountryFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DeliveryCountryCodeOrRestOfWorldProjection<DeliveryCountryFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryCodeOrRestOfWorldProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DeliveryProvinceProjection<DeliveryCountryFragmentProjection<PARENT, ROOT>, ROOT> provinces(
      ) {
     DeliveryProvinceProjection<DeliveryCountryFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProvinceProjection<>(this, getRoot());
     getFields().put("provinces", projection);
     return projection;
  }

  public DeliveryCountryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryCountryFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryCountryFragmentProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryCountry {");
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
