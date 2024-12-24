package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketingActivitiesDeleteAllExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivitiesDeleteAllExternalGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public MarketingActivitiesDeleteAllExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivitiesDeleteAllExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public MarketingActivitiesDeleteAllExternalGraphQLQuery build() {
      return new MarketingActivitiesDeleteAllExternalGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
