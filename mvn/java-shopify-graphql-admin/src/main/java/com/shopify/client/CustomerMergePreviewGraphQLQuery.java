package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerMergeOverrideFields;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a preview of a customer merge request.
 */
public class CustomerMergePreviewGraphQLQuery extends GraphQLQuery {
  public CustomerMergePreviewGraphQLQuery(String customerOneId, String customerTwoId,
      CustomerMergeOverrideFields overrideFields, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (customerOneId != null || fieldsSet.contains("customerOneId")) {
        getInput().put("customerOneId", customerOneId);
    }if (customerTwoId != null || fieldsSet.contains("customerTwoId")) {
        getInput().put("customerTwoId", customerTwoId);
    }if (overrideFields != null || fieldsSet.contains("overrideFields")) {
        getInput().put("overrideFields", overrideFields);
    }
  }

  public CustomerMergePreviewGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerMergePreview";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerOneId;

    private String customerTwoId;

    private CustomerMergeOverrideFields overrideFields;

    private String queryName;

    public CustomerMergePreviewGraphQLQuery build() {
      return new CustomerMergePreviewGraphQLQuery(customerOneId, customerTwoId, overrideFields, queryName, fieldsSet);
               
    }

    /**
     * The ID of the first customer that will be merged.
     */
    public Builder customerOneId(String customerOneId) {
      this.customerOneId = customerOneId;
      this.fieldsSet.add("customerOneId");
      return this;
    }

    /**
     * The ID of the second customer that will be merged.
     */
    public Builder customerTwoId(String customerTwoId) {
      this.customerTwoId = customerTwoId;
      this.fieldsSet.add("customerTwoId");
      return this;
    }

    /**
     * The fields to override the default customer merge rules.
     */
    public Builder overrideFields(CustomerMergeOverrideFields overrideFields) {
      this.overrideFields = overrideFields;
      this.fieldsSet.add("overrideFields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
