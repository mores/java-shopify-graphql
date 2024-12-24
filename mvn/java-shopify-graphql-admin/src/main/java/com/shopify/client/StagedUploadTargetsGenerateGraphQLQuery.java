package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.StageImageInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StagedUploadTargetsGenerateGraphQLQuery extends GraphQLQuery {
  public StagedUploadTargetsGenerateGraphQLQuery(List<StageImageInput> input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StagedUploadTargetsGenerateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "stagedUploadTargetsGenerate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<StageImageInput> input;

    private String queryName;

    public StagedUploadTargetsGenerateGraphQLQuery build() {
      return new StagedUploadTargetsGenerateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(List<StageImageInput> input) {
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
