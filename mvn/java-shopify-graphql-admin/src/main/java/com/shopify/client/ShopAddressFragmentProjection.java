package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ShopAddressFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopAddressFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopAddress"));
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ShopAddressFragmentProjection<PARENT, ROOT>, ROOT> countryCodeV2() {
     CountryCodeProjection<ShopAddressFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodeV2", projection);
     return projection;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> coordinatesValidated() {
    getFields().put("coordinatesValidated", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public ShopAddressFragmentProjection formatted(Boolean withCompany) {
    getFields().put("formatted", null);
    getInputArguments().computeIfAbsent("formatted", k -> new ArrayList<>());
    InputArgument withCompanyArg = new InputArgument("withCompany", withCompany);
    getInputArguments().get("formatted").add(withCompanyArg);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public ShopAddressFragmentProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopAddress {");
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
