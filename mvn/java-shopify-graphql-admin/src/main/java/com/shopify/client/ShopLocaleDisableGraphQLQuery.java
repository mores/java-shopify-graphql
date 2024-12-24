package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ShopLocaleDisableGraphQLQuery extends GraphQLQuery {
  public ShopLocaleDisableGraphQLQuery(String locale, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }
  }

  public ShopLocaleDisableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopLocaleDisable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locale;

    private String queryName;

    public ShopLocaleDisableGraphQLQuery build() {
      return new ShopLocaleDisableGraphQLQuery(locale, queryName, fieldsSet);
               
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      this.fieldsSet.add("locale");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
