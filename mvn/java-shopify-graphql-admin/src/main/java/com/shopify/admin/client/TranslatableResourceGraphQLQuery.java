package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A resource that can have localized values for different languages.
 */
public class TranslatableResourceGraphQLQuery extends GraphQLQuery {
  public TranslatableResourceGraphQLQuery(String resourceId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }
  }

  public TranslatableResourceGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "translatableResource";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String resourceId;

    private String queryName;

    public TranslatableResourceGraphQLQuery build() {
      return new TranslatableResourceGraphQLQuery(resourceId, queryName, fieldsSet);
               
    }

    /**
     * Find a translatable resource by ID.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
