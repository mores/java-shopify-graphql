package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ShopLocaleEnableGraphQLQuery extends GraphQLQuery {
  public ShopLocaleEnableGraphQLQuery(String locale, List<String> marketWebPresenceIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (marketWebPresenceIds != null || fieldsSet.contains("marketWebPresenceIds")) {
        getInput().put("marketWebPresenceIds", marketWebPresenceIds);
    }
  }

  public ShopLocaleEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopLocaleEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locale;

    private List<String> marketWebPresenceIds;

    private String queryName;

    public ShopLocaleEnableGraphQLQuery build() {
      return new ShopLocaleEnableGraphQLQuery(locale, marketWebPresenceIds, queryName, fieldsSet);
               
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      this.fieldsSet.add("locale");
      return this;
    }

    
    public Builder marketWebPresenceIds(List<String> marketWebPresenceIds) {
      this.marketWebPresenceIds = marketWebPresenceIds;
      this.fieldsSet.add("marketWebPresenceIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
