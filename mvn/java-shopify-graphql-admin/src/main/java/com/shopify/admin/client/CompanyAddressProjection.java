package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.util.ArrayList;

public class CompanyAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyAddress"));
  }

  public CompanyAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CompanyAddressProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<CompanyAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CompanyAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> formattedAddress() {
    getFields().put("formattedAddress", null);
    return this;
  }

  public CompanyAddressProjection formattedAddress(Boolean withName, Boolean withCompanyName) {
    getFields().put("formattedAddress", null);
    getInputArguments().computeIfAbsent("formattedAddress", k -> new ArrayList<>());
    InputArgument withNameArg = new InputArgument("withName", withName);
    getInputArguments().get("formattedAddress").add(withNameArg);
    InputArgument withCompanyNameArg = new InputArgument("withCompanyName", withCompanyName);
    getInputArguments().get("formattedAddress").add(withCompanyNameArg);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> recipient() {
    getFields().put("recipient", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  public CompanyAddressProjection<PARENT, ROOT> zoneCode() {
    getFields().put("zoneCode", null);
    return this;
  }
}
