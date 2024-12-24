package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketWebPresenceDeleteGraphQLQuery extends GraphQLQuery {
  public MarketWebPresenceDeleteGraphQLQuery(String webPresenceId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (webPresenceId != null || fieldsSet.contains("webPresenceId")) {
        getInput().put("webPresenceId", webPresenceId);
    }
  }

  public MarketWebPresenceDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketWebPresenceDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String webPresenceId;

    private String queryName;

    public MarketWebPresenceDeleteGraphQLQuery build() {
      return new MarketWebPresenceDeleteGraphQLQuery(webPresenceId, queryName, fieldsSet);
               
    }

    
    public Builder webPresenceId(String webPresenceId) {
      this.webPresenceId = webPresenceId;
      this.fieldsSet.add("webPresenceId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
