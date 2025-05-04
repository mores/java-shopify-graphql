package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.util.ArrayList;

public class ShopAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopAddress"));
  }

  public ShopAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ShopAddressProjection<PARENT, ROOT>, ROOT> countryCodeV2() {
     CountryCodeProjection<ShopAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodeV2", projection);
     return projection;
  }

  public ShopAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> coordinatesValidated() {
    getFields().put("coordinatesValidated", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public ShopAddressProjection formatted(Boolean withCompany) {
    getFields().put("formatted", null);
    getInputArguments().computeIfAbsent("formatted", k -> new ArrayList<>());
    InputArgument withCompanyArg = new InputArgument("withCompany", withCompany);
    getInputArguments().get("formatted").add(withCompanyArg);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public ShopAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
