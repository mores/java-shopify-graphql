package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DutyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DutyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Duty"));
  }

  public DutyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<DutyProjection<PARENT, ROOT>, ROOT> countryCodeOfOrigin() {
     CountryCodeProjection<DutyProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodeOfOrigin", projection);
     return projection;
  }

  public MoneyBagProjection<DutyProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<DutyProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public TaxLineProjection<DutyProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<DutyProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public DutyProjection<PARENT, ROOT> harmonizedSystemCode() {
    getFields().put("harmonizedSystemCode", null);
    return this;
  }

  public DutyProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
