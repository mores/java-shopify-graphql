package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CollectionUnpublishInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CollectionUnpublishGraphQLQuery extends GraphQLQuery {
  public CollectionUnpublishGraphQLQuery(CollectionUnpublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionUnpublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionUnpublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CollectionUnpublishInput input;

    private String queryName;

    public CollectionUnpublishGraphQLQuery build() {
      return new CollectionUnpublishGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CollectionUnpublishInput input) {
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
