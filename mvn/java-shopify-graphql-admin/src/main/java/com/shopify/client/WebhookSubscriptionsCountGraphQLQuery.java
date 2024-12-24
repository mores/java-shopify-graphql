package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class WebhookSubscriptionsCountGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionsCountGraphQLQuery(String query, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public WebhookSubscriptionsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscriptionsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String queryName;

    public WebhookSubscriptionsCountGraphQLQuery build() {
      return new WebhookSubscriptionsCountGraphQLQuery(query, queryName, fieldsSet);
               
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
