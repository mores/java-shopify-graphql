package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.util.ArrayList;

public class MailingAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MailingAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MailingAddress"));
  }

  public MailingAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<MailingAddressProjection<PARENT, ROOT>, ROOT> countryCodeV2() {
     CountryCodeProjection<MailingAddressProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodeV2", projection);
     return projection;
  }

  public MailingAddressProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public MailingAddressProjection formatted(Boolean withCompany, Boolean withName) {
    getFields().put("formatted", null);
    getInputArguments().computeIfAbsent("formatted", k -> new ArrayList<>());
    InputArgument withCompanyArg = new InputArgument("withCompany", withCompany);
    getInputArguments().get("formatted").add(withCompanyArg);
    InputArgument withNameArg = new InputArgument("withName", withName);
    getInputArguments().get("formatted").add(withNameArg);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> province() {
    getFields().put("province", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public MailingAddressProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }
}
