package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CompanyAddressFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyAddressFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyAddress"));
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<CompanyAddressFragmentProjection<PARENT, ROOT>, ROOT> countryCode() {
     CountryCodeProjection<CompanyAddressFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCode", projection);
     return projection;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> formattedAddress() {
    getFields().put("formattedAddress", null);
    return this;
  }

  public CompanyAddressFragmentProjection formattedAddress(Boolean withName,
      Boolean withCompanyName) {
    getFields().put("formattedAddress", null);
    getInputArguments().computeIfAbsent("formattedAddress", k -> new ArrayList<>());
    InputArgument withNameArg = new InputArgument("withName", withName);
    getInputArguments().get("formattedAddress").add(withNameArg);
    InputArgument withCompanyNameArg = new InputArgument("withCompanyName", withCompanyName);
    getInputArguments().get("formattedAddress").add(withCompanyNameArg);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> recipient() {
    getFields().put("recipient", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  public CompanyAddressFragmentProjection<PARENT, ROOT> zoneCode() {
    getFields().put("zoneCode", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CompanyAddress {");
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
