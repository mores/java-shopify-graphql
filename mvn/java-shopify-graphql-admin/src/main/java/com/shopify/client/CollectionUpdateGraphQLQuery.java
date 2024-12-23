package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CollectionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a collection.
 */
public class CollectionUpdateGraphQLQuery extends GraphQLQuery {
  public CollectionUpdateGraphQLQuery(CollectionInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CollectionInput input;

    private String queryName;

    public CollectionUpdateGraphQLQuery build() {
      return new CollectionUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The updated properties for the collection.
     */
    public Builder input(CollectionInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
