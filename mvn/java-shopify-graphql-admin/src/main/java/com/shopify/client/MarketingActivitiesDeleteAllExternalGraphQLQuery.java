package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes all external marketing activities. Deletion is performed by a
 * background job, as it may take a bit of time to complete if a large number of
 * activities are to be deleted. Attempting to create or modify external
 * activities before the job has completed will result in the
 * create/update/upsert mutation returning an error.
 */
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
