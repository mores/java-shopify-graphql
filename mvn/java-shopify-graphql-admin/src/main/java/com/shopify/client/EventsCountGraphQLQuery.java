package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class EventsCountGraphQLQuery extends GraphQLQuery {
  public EventsCountGraphQLQuery(String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public EventsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "eventsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String queryName;

    public EventsCountGraphQLQuery build() {
      return new EventsCountGraphQLQuery(query, queryName, fieldsSet);
               
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
