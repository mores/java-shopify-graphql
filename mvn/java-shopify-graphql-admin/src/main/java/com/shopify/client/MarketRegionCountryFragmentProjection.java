package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketRegionCountryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketRegionCountryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketRegionCountry"));
  }

  public MarketRegionCountryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<MarketRegionCountryFragmentProjection<PARENT, ROOT>, ROOT> code() {
     CountryCodeProjection<MarketRegionCountryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CurrencySettingProjection<MarketRegionCountryFragmentProjection<PARENT, ROOT>, ROOT> currency(
      ) {
     CurrencySettingProjection<MarketRegionCountryFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public MarketRegionCountryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketRegionCountryFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketRegionCountry {");
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
