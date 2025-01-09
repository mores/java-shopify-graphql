package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the product duplicate job.
 */
public class ProductDuplicateJobGraphQLQuery extends GraphQLQuery {
  public ProductDuplicateJobGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductDuplicateJobGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productDuplicateJob";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductDuplicateJobGraphQLQuery build() {
      return new ProductDuplicateJobGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * An ID of a product duplicate job to fetch.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
