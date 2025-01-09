package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductResourceFeedbackInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates product feedback for multiple products.
 */
public class BulkProductResourceFeedbackCreateGraphQLQuery extends GraphQLQuery {
  public BulkProductResourceFeedbackCreateGraphQLQuery(
      List<ProductResourceFeedbackInput> feedbackInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (feedbackInput != null || fieldsSet.contains("feedbackInput")) {
        getInput().put("feedbackInput", feedbackInput);
    }
  }

  public BulkProductResourceFeedbackCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "bulkProductResourceFeedbackCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductResourceFeedbackInput> feedbackInput;

    private String queryName;

    public BulkProductResourceFeedbackCreateGraphQLQuery build() {
      return new BulkProductResourceFeedbackCreateGraphQLQuery(feedbackInput, queryName, fieldsSet);
               
    }

    /**
     * An array of inputs to create the feedback. Limited to 50.
     */
    public Builder feedbackInput(List<ProductResourceFeedbackInput> feedbackInput) {
      this.feedbackInput = feedbackInput;
      this.fieldsSet.add("feedbackInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
