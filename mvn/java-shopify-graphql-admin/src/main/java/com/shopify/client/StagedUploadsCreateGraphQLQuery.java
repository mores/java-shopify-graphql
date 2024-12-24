package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.StagedUploadInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StagedUploadsCreateGraphQLQuery extends GraphQLQuery {
  public StagedUploadsCreateGraphQLQuery(List<StagedUploadInput> input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StagedUploadsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "stagedUploadsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<StagedUploadInput> input;

    private String queryName;

    public StagedUploadsCreateGraphQLQuery build() {
      return new StagedUploadsCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(List<StagedUploadInput> input) {
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
