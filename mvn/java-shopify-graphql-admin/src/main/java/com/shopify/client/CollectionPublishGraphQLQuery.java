package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CollectionPublishInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CollectionPublishGraphQLQuery extends GraphQLQuery {
  public CollectionPublishGraphQLQuery(CollectionPublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionPublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionPublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CollectionPublishInput input;

    private String queryName;

    public CollectionPublishGraphQLQuery build() {
      return new CollectionPublishGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CollectionPublishInput input) {
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
