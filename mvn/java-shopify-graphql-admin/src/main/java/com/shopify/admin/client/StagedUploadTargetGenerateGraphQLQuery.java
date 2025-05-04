package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StagedUploadTargetGenerateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Generates the URL and signed paramaters needed to upload an asset to Shopify.
 */
public class StagedUploadTargetGenerateGraphQLQuery extends GraphQLQuery {
  public StagedUploadTargetGenerateGraphQLQuery(StagedUploadTargetGenerateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StagedUploadTargetGenerateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "stagedUploadTargetGenerate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private StagedUploadTargetGenerateInput input;

    private String queryName;

    public StagedUploadTargetGenerateGraphQLQuery build() {
      return new StagedUploadTargetGenerateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for generating a staged upload.
     */
    public Builder input(StagedUploadTargetGenerateInput input) {
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
